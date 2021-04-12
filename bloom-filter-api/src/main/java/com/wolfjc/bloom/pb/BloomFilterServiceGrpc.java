package com.wolfjc.bloom.pb;

import io.grpc.stub.ClientCalls;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: bloom.proto")
public final class BloomFilterServiceGrpc {

  private BloomFilterServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.BloomFilterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getSaveKeyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq,
      com.wolfjc.bloom.pb.BloomFilterResp> METHOD_SAVE_KEY = getSaveKeyMethod();

  private static volatile io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq,
      com.wolfjc.bloom.pb.BloomFilterResp> getSaveKeyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq,
      com.wolfjc.bloom.pb.BloomFilterResp> getSaveKeyMethod() {
    io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq, com.wolfjc.bloom.pb.BloomFilterResp> getSaveKeyMethod;
    if ((getSaveKeyMethod = BloomFilterServiceGrpc.getSaveKeyMethod) == null) {
      synchronized (BloomFilterServiceGrpc.class) {
        if ((getSaveKeyMethod = BloomFilterServiceGrpc.getSaveKeyMethod) == null) {
          BloomFilterServiceGrpc.getSaveKeyMethod = getSaveKeyMethod = 
              io.grpc.MethodDescriptor.<com.wolfjc.bloom.pb.BloomFilterReq, com.wolfjc.bloom.pb.BloomFilterResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.BloomFilterService", "SaveKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wolfjc.bloom.pb.BloomFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wolfjc.bloom.pb.BloomFilterResp.getDefaultInstance()))
                  .setSchemaDescriptor(new BloomFilterServiceMethodDescriptorSupplier("SaveKey"))
                  .build();
          }
        }
     }
     return getSaveKeyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @Deprecated // Use {@link #getIsExistMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq,
      com.wolfjc.bloom.pb.BloomFilterResp> METHOD_IS_EXIST = getIsExistMethod();

  private static volatile io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq,
      com.wolfjc.bloom.pb.BloomFilterResp> getIsExistMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq,
      com.wolfjc.bloom.pb.BloomFilterResp> getIsExistMethod() {
    io.grpc.MethodDescriptor<com.wolfjc.bloom.pb.BloomFilterReq, com.wolfjc.bloom.pb.BloomFilterResp> getIsExistMethod;
    if ((getIsExistMethod = BloomFilterServiceGrpc.getIsExistMethod) == null) {
      synchronized (BloomFilterServiceGrpc.class) {
        if ((getIsExistMethod = BloomFilterServiceGrpc.getIsExistMethod) == null) {
          BloomFilterServiceGrpc.getIsExistMethod = getIsExistMethod = 
              io.grpc.MethodDescriptor.<com.wolfjc.bloom.pb.BloomFilterReq, com.wolfjc.bloom.pb.BloomFilterResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpc.BloomFilterService", "IsExist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wolfjc.bloom.pb.BloomFilterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wolfjc.bloom.pb.BloomFilterResp.getDefaultInstance()))
                  .setSchemaDescriptor(new BloomFilterServiceMethodDescriptorSupplier("IsExist"))
                  .build();
          }
        }
     }
     return getIsExistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BloomFilterServiceStub newStub(io.grpc.Channel channel) {
    return new BloomFilterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BloomFilterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BloomFilterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BloomFilterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BloomFilterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BloomFilterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *保存key
     * </pre>
     */
    public void saveKey(com.wolfjc.bloom.pb.BloomFilterReq request,
        io.grpc.stub.StreamObserver<com.wolfjc.bloom.pb.BloomFilterResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     *判断key是否存在
     * </pre>
     */
    public void isExist(com.wolfjc.bloom.pb.BloomFilterReq request,
        io.grpc.stub.StreamObserver<com.wolfjc.bloom.pb.BloomFilterResp> responseObserver) {
      asyncUnimplementedUnaryCall(getIsExistMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveKeyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wolfjc.bloom.pb.BloomFilterReq,
                com.wolfjc.bloom.pb.BloomFilterResp>(
                  this, METHODID_SAVE_KEY)))
          .addMethod(
            getIsExistMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wolfjc.bloom.pb.BloomFilterReq,
                com.wolfjc.bloom.pb.BloomFilterResp>(
                  this, METHODID_IS_EXIST)))
          .build();
    }
  }

  /**
   */
  public static final class BloomFilterServiceStub extends io.grpc.stub.AbstractStub<BloomFilterServiceStub> {
    private BloomFilterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BloomFilterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BloomFilterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BloomFilterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存key
     * </pre>
     */
    public void saveKey(com.wolfjc.bloom.pb.BloomFilterReq request,
        io.grpc.stub.StreamObserver<com.wolfjc.bloom.pb.BloomFilterResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *判断key是否存在
     * </pre>
     */
    public void isExist(com.wolfjc.bloom.pb.BloomFilterReq request,
        io.grpc.stub.StreamObserver<com.wolfjc.bloom.pb.BloomFilterResp> responseObserver) {
      ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsExistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BloomFilterServiceBlockingStub extends io.grpc.stub.AbstractStub<BloomFilterServiceBlockingStub> {
    private BloomFilterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BloomFilterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BloomFilterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BloomFilterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存key
     * </pre>
     */
    public com.wolfjc.bloom.pb.BloomFilterResp saveKey(com.wolfjc.bloom.pb.BloomFilterReq request) {
      return blockingUnaryCall(
          getChannel(), getSaveKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *判断key是否存在
     * </pre>
     */
    public com.wolfjc.bloom.pb.BloomFilterResp isExist(com.wolfjc.bloom.pb.BloomFilterReq request) {
      return blockingUnaryCall(
          getChannel(), getIsExistMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BloomFilterServiceFutureStub extends io.grpc.stub.AbstractStub<BloomFilterServiceFutureStub> {
    private BloomFilterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BloomFilterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BloomFilterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BloomFilterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *保存key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wolfjc.bloom.pb.BloomFilterResp> saveKey(
        com.wolfjc.bloom.pb.BloomFilterReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *判断key是否存在
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wolfjc.bloom.pb.BloomFilterResp> isExist(
        com.wolfjc.bloom.pb.BloomFilterReq request) {
      return futureUnaryCall(
          getChannel().newCall(getIsExistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_KEY = 0;
  private static final int METHODID_IS_EXIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BloomFilterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BloomFilterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_KEY:
          serviceImpl.saveKey((com.wolfjc.bloom.pb.BloomFilterReq) request,
              (io.grpc.stub.StreamObserver<com.wolfjc.bloom.pb.BloomFilterResp>) responseObserver);
          break;
        case METHODID_IS_EXIST:
          serviceImpl.isExist((com.wolfjc.bloom.pb.BloomFilterReq) request,
              (io.grpc.stub.StreamObserver<com.wolfjc.bloom.pb.BloomFilterResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BloomFilterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BloomFilterServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wolfjc.bloom.pb.BloomFilter.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BloomFilterService");
    }
  }

  private static final class BloomFilterServiceFileDescriptorSupplier
      extends BloomFilterServiceBaseDescriptorSupplier {
    BloomFilterServiceFileDescriptorSupplier() {}
  }

  private static final class BloomFilterServiceMethodDescriptorSupplier
      extends BloomFilterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BloomFilterServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BloomFilterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BloomFilterServiceFileDescriptorSupplier())
              .addMethod(getSaveKeyMethod())
              .addMethod(getIsExistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
