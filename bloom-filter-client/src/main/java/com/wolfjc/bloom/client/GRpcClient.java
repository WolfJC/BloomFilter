package com.wolfjc.bloom.client;

import com.wolfjc.bloom.pb.BloomFilterReq;
import com.wolfjc.bloom.pb.BloomFilterResp;
import com.wolfjc.bloom.pb.BloomFilterServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;

public class GRpcClient {

    private final BloomFilterServiceGrpc.BloomFilterServiceBlockingStub blockingStub;


    public GRpcClient(Channel channel) {
        blockingStub = BloomFilterServiceGrpc.newBlockingStub(channel);
    }

    public void saveKey(){
        BloomFilterReq req =BloomFilterReq.newBuilder()
                .setKey("https://www.baidu.com.54545/")
                .build();
        BloomFilterResp bloomFilterResp = blockingStub.saveKey(req);
        System.out.println(bloomFilterResp.getIsExist());
    }


    public static void main(String[] args) throws Exception {

//        String target = "localhost:9000";

//        ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();

        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 13000)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();
        GRpcClient gRpcClient = new GRpcClient(channel);
        gRpcClient.saveKey();


    }


}
