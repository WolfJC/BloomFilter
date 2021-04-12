package com.wolfjc.bloom.service;

import com.wolfjc.bloom.RedisBloomFilter;

import com.wolfjc.bloom.pb.BloomFilterReq;
import com.wolfjc.bloom.pb.BloomFilterResp;
import com.wolfjc.bloom.pb.BloomFilterServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * grpc Service 实现层
 */
@Service
public class BloomFilterService extends BloomFilterServiceGrpc.BloomFilterServiceImplBase {

    @Resource
    private RedisBloomFilter redisBloomFilter;

    @Override
    public void saveKey(BloomFilterReq request, StreamObserver<BloomFilterResp> responseObserver) {

        Boolean put = redisBloomFilter.put(request.getKey());

        BloomFilterResp bloomFilterResp = BloomFilterResp.newBuilder()
                .setIsExist(put)
                .build();
        responseObserver.onNext(bloomFilterResp);
        responseObserver.onCompleted();
        super.saveKey(request, responseObserver);
    }

    @Override
    public void isExist(BloomFilterReq request, StreamObserver<BloomFilterResp> responseObserver) {
        Boolean mightContain = redisBloomFilter.mightContain(request.getKey());
        BloomFilterResp bloomFilterResp = BloomFilterResp.newBuilder()
                .setIsExist(mightContain)
                .build();
        responseObserver.onNext(bloomFilterResp);
        responseObserver.onCompleted();
        super.isExist(request, responseObserver);
    }
}
