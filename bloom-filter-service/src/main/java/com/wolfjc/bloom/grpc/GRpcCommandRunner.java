package com.wolfjc.bloom.grpc;

import com.wolfjc.bloom.config.ApplicationContextUtil;
import com.wolfjc.bloom.config.GRpcConfig;
import io.grpc.BindableService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 启动GRpc服务
 */
@Component
@Order(value = 5)
public class GRpcCommandRunner implements CommandLineRunner {

    @Resource
    private GRpcConfig gRpcConfig;

    @Override
    public void run(String... args) throws Exception {
        List<BindableService> bindableServices = ApplicationContextUtil.getBeansOfType(BindableService.class);
        GRpcServer gRpcServer = new GRpcServer(gRpcConfig.getPort() ,bindableServices);
        gRpcServer.start();
        gRpcServer.blockUntilShutdown();
    }
}
