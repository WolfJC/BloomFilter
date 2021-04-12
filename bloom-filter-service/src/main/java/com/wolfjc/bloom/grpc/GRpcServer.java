package com.wolfjc.bloom.grpc;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 封装GRpc Server
 */
public class GRpcServer {

    private Logger logger = LoggerFactory.getLogger(GRpcServer.class);
    /**
     * GRpc Server
     */
    private Server server;

    public GRpcServer(Integer port) {
        this.server = ServerBuilder.forPort(port)
                .build();
    }

    public GRpcServer(Integer port , List<BindableService> serviceDefinitions){
        ServerBuilder<?> serverBuilder = ServerBuilder.forPort(port);
        serviceDefinitions.forEach(serverBuilder::addService);
        this.server = serverBuilder.build();
    }


    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started, listening on {}" ,server.getPort());
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            logger.info("*** shutting down gRPC server since JVM is shutting down");
            try {
                GRpcServer.this.stop();
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
            logger.info("*** server shut down");
        }));
    }

    /** Stop serving requests and shutdown resources. */
    public void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
}
