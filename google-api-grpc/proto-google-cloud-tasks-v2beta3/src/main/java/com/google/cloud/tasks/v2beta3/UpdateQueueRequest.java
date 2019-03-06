// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta3/cloudtasks.proto

package com.google.cloud.tasks.v2beta3;

/**
 *
 *
 * <pre>
 * Request message for
 * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue].
 * </pre>
 *
 * Protobuf type {@code google.cloud.tasks.v2beta3.UpdateQueueRequest}
 */
public final class UpdateQueueRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.tasks.v2beta3.UpdateQueueRequest)
    UpdateQueueRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateQueueRequest.newBuilder() to construct.
  private UpdateQueueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateQueueRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateQueueRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.tasks.v2beta3.Queue.Builder subBuilder = null;
              if (queue_ != null) {
                subBuilder = queue_.toBuilder();
              }
              queue_ =
                  input.readMessage(
                      com.google.cloud.tasks.v2beta3.Queue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(queue_);
                queue_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.tasks.v2beta3.CloudTasksProto
        .internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.tasks.v2beta3.UpdateQueueRequest.class,
            com.google.cloud.tasks.v2beta3.UpdateQueueRequest.Builder.class);
  }

  public static final int QUEUE_FIELD_NUMBER = 1;
  private com.google.cloud.tasks.v2beta3.Queue queue_;
  /**
   *
   *
   * <pre>
   * Required.
   * The queue to create or update.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
   * specified.
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
   * changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
   */
  public boolean hasQueue() {
    return queue_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The queue to create or update.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
   * specified.
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
   * changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
   */
  public com.google.cloud.tasks.v2beta3.Queue getQueue() {
    return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * The queue to create or update.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
   * specified.
   * Output only fields cannot be modified using UpdateQueue.
   * Any value specified for an output only field will be ignored.
   * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
   * changed.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
   */
  public com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueueOrBuilder() {
    return getQueue();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * A mask used to specify which fields of the queue are being updated.
   * If empty, then all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (queue_ != null) {
      output.writeMessage(1, getQueue());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (queue_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getQueue());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.tasks.v2beta3.UpdateQueueRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.tasks.v2beta3.UpdateQueueRequest other =
        (com.google.cloud.tasks.v2beta3.UpdateQueueRequest) obj;

    boolean result = true;
    result = result && (hasQueue() == other.hasQueue());
    if (hasQueue()) {
      result = result && getQueue().equals(other.getQueue());
    }
    result = result && (hasUpdateMask() == other.hasUpdateMask());
    if (hasUpdateMask()) {
      result = result && getUpdateMask().equals(other.getUpdateMask());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasQueue()) {
      hash = (37 * hash) + QUEUE_FIELD_NUMBER;
      hash = (53 * hash) + getQueue().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.tasks.v2beta3.UpdateQueueRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for
   * [UpdateQueue][google.cloud.tasks.v2beta3.CloudTasks.UpdateQueue].
   * </pre>
   *
   * Protobuf type {@code google.cloud.tasks.v2beta3.UpdateQueueRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.tasks.v2beta3.UpdateQueueRequest)
      com.google.cloud.tasks.v2beta3.UpdateQueueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.tasks.v2beta3.UpdateQueueRequest.class,
              com.google.cloud.tasks.v2beta3.UpdateQueueRequest.Builder.class);
    }

    // Construct using com.google.cloud.tasks.v2beta3.UpdateQueueRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (queueBuilder_ == null) {
        queue_ = null;
      } else {
        queue_ = null;
        queueBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.tasks.v2beta3.CloudTasksProto
          .internal_static_google_cloud_tasks_v2beta3_UpdateQueueRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.UpdateQueueRequest getDefaultInstanceForType() {
      return com.google.cloud.tasks.v2beta3.UpdateQueueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.UpdateQueueRequest build() {
      com.google.cloud.tasks.v2beta3.UpdateQueueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.tasks.v2beta3.UpdateQueueRequest buildPartial() {
      com.google.cloud.tasks.v2beta3.UpdateQueueRequest result =
          new com.google.cloud.tasks.v2beta3.UpdateQueueRequest(this);
      if (queueBuilder_ == null) {
        result.queue_ = queue_;
      } else {
        result.queue_ = queueBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.tasks.v2beta3.UpdateQueueRequest) {
        return mergeFrom((com.google.cloud.tasks.v2beta3.UpdateQueueRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.tasks.v2beta3.UpdateQueueRequest other) {
      if (other == com.google.cloud.tasks.v2beta3.UpdateQueueRequest.getDefaultInstance())
        return this;
      if (other.hasQueue()) {
        mergeQueue(other.getQueue());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.tasks.v2beta3.UpdateQueueRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.tasks.v2beta3.UpdateQueueRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.tasks.v2beta3.Queue queue_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tasks.v2beta3.Queue,
            com.google.cloud.tasks.v2beta3.Queue.Builder,
            com.google.cloud.tasks.v2beta3.QueueOrBuilder>
        queueBuilder_;
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public boolean hasQueue() {
      return queueBuilder_ != null || queue_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.Queue getQueue() {
      if (queueBuilder_ == null) {
        return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
      } else {
        return queueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public Builder setQueue(com.google.cloud.tasks.v2beta3.Queue value) {
      if (queueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queue_ = value;
        onChanged();
      } else {
        queueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public Builder setQueue(com.google.cloud.tasks.v2beta3.Queue.Builder builderForValue) {
      if (queueBuilder_ == null) {
        queue_ = builderForValue.build();
        onChanged();
      } else {
        queueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public Builder mergeQueue(com.google.cloud.tasks.v2beta3.Queue value) {
      if (queueBuilder_ == null) {
        if (queue_ != null) {
          queue_ =
              com.google.cloud.tasks.v2beta3.Queue.newBuilder(queue_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          queue_ = value;
        }
        onChanged();
      } else {
        queueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public Builder clearQueue() {
      if (queueBuilder_ == null) {
        queue_ = null;
        onChanged();
      } else {
        queue_ = null;
        queueBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.Queue.Builder getQueueBuilder() {

      onChanged();
      return getQueueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    public com.google.cloud.tasks.v2beta3.QueueOrBuilder getQueueOrBuilder() {
      if (queueBuilder_ != null) {
        return queueBuilder_.getMessageOrBuilder();
      } else {
        return queue_ == null ? com.google.cloud.tasks.v2beta3.Queue.getDefaultInstance() : queue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required.
     * The queue to create or update.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] must be
     * specified.
     * Output only fields cannot be modified using UpdateQueue.
     * Any value specified for an output only field will be ignored.
     * The queue's [name][google.cloud.tasks.v2beta3.Queue.name] cannot be
     * changed.
     * </pre>
     *
     * <code>.google.cloud.tasks.v2beta3.Queue queue = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.tasks.v2beta3.Queue,
            com.google.cloud.tasks.v2beta3.Queue.Builder,
            com.google.cloud.tasks.v2beta3.QueueOrBuilder>
        getQueueFieldBuilder() {
      if (queueBuilder_ == null) {
        queueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.tasks.v2beta3.Queue,
                com.google.cloud.tasks.v2beta3.Queue.Builder,
                com.google.cloud.tasks.v2beta3.QueueOrBuilder>(
                getQueue(), getParentForChildren(), isClean());
        queue_ = null;
      }
      return queueBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * A mask used to specify which fields of the queue are being updated.
     * If empty, then all fields will be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.tasks.v2beta3.UpdateQueueRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.tasks.v2beta3.UpdateQueueRequest)
  private static final com.google.cloud.tasks.v2beta3.UpdateQueueRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.tasks.v2beta3.UpdateQueueRequest();
  }

  public static com.google.cloud.tasks.v2beta3.UpdateQueueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateQueueRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateQueueRequest>() {
        @java.lang.Override
        public UpdateQueueRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateQueueRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateQueueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateQueueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.tasks.v2beta3.UpdateQueueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
