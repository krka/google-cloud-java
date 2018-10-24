// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

/**
 * <pre>
 * The result of fetching an entity from Datastore.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.EntityResult}
 */
public  final class EntityResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.EntityResult)
    EntityResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityResult.newBuilder() to construct.
  private EntityResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityResult() {
    version_ = 0L;
    cursor_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityResult(
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
          case 10: {
            com.google.datastore.v1.Entity.Builder subBuilder = null;
            if (entity_ != null) {
              subBuilder = entity_.toBuilder();
            }
            entity_ = input.readMessage(com.google.datastore.v1.Entity.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(entity_);
              entity_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {

            cursor_ = input.readBytes();
            break;
          }
          case 32: {

            version_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_EntityResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_EntityResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.EntityResult.class, com.google.datastore.v1.EntityResult.Builder.class);
  }

  /**
   * <pre>
   * Specifies what data the 'entity' field contains.
   * A `ResultType` is either implied (for example, in `LookupResponse.missing`
   * from `datastore.proto`, it is always `KEY_ONLY`) or specified by context
   * (for example, in message `QueryResultBatch`, field `entity_result_type`
   * specifies a `ResultType` for all the values in field `entity_results`).
   * </pre>
   *
   * Protobuf enum {@code google.datastore.v1.EntityResult.ResultType}
   */
  public enum ResultType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified. This value is never used.
     * </pre>
     *
     * <code>RESULT_TYPE_UNSPECIFIED = 0;</code>
     */
    RESULT_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * The key and properties.
     * </pre>
     *
     * <code>FULL = 1;</code>
     */
    FULL(1),
    /**
     * <pre>
     * A projected subset of properties. The entity may have no key.
     * </pre>
     *
     * <code>PROJECTION = 2;</code>
     */
    PROJECTION(2),
    /**
     * <pre>
     * Only the key.
     * </pre>
     *
     * <code>KEY_ONLY = 3;</code>
     */
    KEY_ONLY(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified. This value is never used.
     * </pre>
     *
     * <code>RESULT_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int RESULT_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The key and properties.
     * </pre>
     *
     * <code>FULL = 1;</code>
     */
    public static final int FULL_VALUE = 1;
    /**
     * <pre>
     * A projected subset of properties. The entity may have no key.
     * </pre>
     *
     * <code>PROJECTION = 2;</code>
     */
    public static final int PROJECTION_VALUE = 2;
    /**
     * <pre>
     * Only the key.
     * </pre>
     *
     * <code>KEY_ONLY = 3;</code>
     */
    public static final int KEY_ONLY_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultType valueOf(int value) {
      return forNumber(value);
    }

    public static ResultType forNumber(int value) {
      switch (value) {
        case 0: return RESULT_TYPE_UNSPECIFIED;
        case 1: return FULL;
        case 2: return PROJECTION;
        case 3: return KEY_ONLY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResultType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ResultType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResultType>() {
            public ResultType findValueByNumber(int number) {
              return ResultType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.datastore.v1.EntityResult.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResultType[] VALUES = values();

    public static ResultType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ResultType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.datastore.v1.EntityResult.ResultType)
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  private com.google.datastore.v1.Entity entity_;
  /**
   * <pre>
   * The resulting entity.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity = 1;</code>
   */
  public boolean hasEntity() {
    return entity_ != null;
  }
  /**
   * <pre>
   * The resulting entity.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity = 1;</code>
   */
  public com.google.datastore.v1.Entity getEntity() {
    return entity_ == null ? com.google.datastore.v1.Entity.getDefaultInstance() : entity_;
  }
  /**
   * <pre>
   * The resulting entity.
   * </pre>
   *
   * <code>.google.datastore.v1.Entity entity = 1;</code>
   */
  public com.google.datastore.v1.EntityOrBuilder getEntityOrBuilder() {
    return getEntity();
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private long version_;
  /**
   * <pre>
   * The version of the entity, a strictly positive number that monotonically
   * increases with changes to the entity.
   * This field is set for [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity
   * results.
   * For [missing][google.datastore.v1.LookupResponse.missing] entities in `LookupResponse`, this
   * is the version of the snapshot that was used to look up the entity, and it
   * is always set except for eventually consistent reads.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   */
  public long getVersion() {
    return version_;
  }

  public static final int CURSOR_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString cursor_;
  /**
   * <pre>
   * A cursor that points to the position after the result entity.
   * Set only when the `EntityResult` is part of a `QueryResultBatch` message.
   * </pre>
   *
   * <code>bytes cursor = 3;</code>
   */
  public com.google.protobuf.ByteString getCursor() {
    return cursor_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (entity_ != null) {
      output.writeMessage(1, getEntity());
    }
    if (!cursor_.isEmpty()) {
      output.writeBytes(3, cursor_);
    }
    if (version_ != 0L) {
      output.writeInt64(4, version_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEntity());
    }
    if (!cursor_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, cursor_);
    }
    if (version_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, version_);
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
    if (!(obj instanceof com.google.datastore.v1.EntityResult)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.EntityResult other = (com.google.datastore.v1.EntityResult) obj;

    boolean result = true;
    result = result && (hasEntity() == other.hasEntity());
    if (hasEntity()) {
      result = result && getEntity()
          .equals(other.getEntity());
    }
    result = result && (getVersion()
        == other.getVersion());
    result = result && getCursor()
        .equals(other.getCursor());
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getVersion());
    hash = (37 * hash) + CURSOR_FIELD_NUMBER;
    hash = (53 * hash) + getCursor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.EntityResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.EntityResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.EntityResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.datastore.v1.EntityResult parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.datastore.v1.EntityResult prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The result of fetching an entity from Datastore.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.EntityResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.EntityResult)
      com.google.datastore.v1.EntityResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_EntityResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_EntityResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.EntityResult.class, com.google.datastore.v1.EntityResult.Builder.class);
    }

    // Construct using com.google.datastore.v1.EntityResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entityBuilder_ == null) {
        entity_ = null;
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }
      version_ = 0L;

      cursor_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.datastore.v1.QueryProto.internal_static_google_datastore_v1_EntityResult_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.EntityResult getDefaultInstanceForType() {
      return com.google.datastore.v1.EntityResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.EntityResult build() {
      com.google.datastore.v1.EntityResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.EntityResult buildPartial() {
      com.google.datastore.v1.EntityResult result = new com.google.datastore.v1.EntityResult(this);
      if (entityBuilder_ == null) {
        result.entity_ = entity_;
      } else {
        result.entity_ = entityBuilder_.build();
      }
      result.version_ = version_;
      result.cursor_ = cursor_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.EntityResult) {
        return mergeFrom((com.google.datastore.v1.EntityResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.EntityResult other) {
      if (other == com.google.datastore.v1.EntityResult.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (other.getVersion() != 0L) {
        setVersion(other.getVersion());
      }
      if (other.getCursor() != com.google.protobuf.ByteString.EMPTY) {
        setCursor(other.getCursor());
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
      com.google.datastore.v1.EntityResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.datastore.v1.EntityResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.datastore.v1.Entity entity_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.Entity, com.google.datastore.v1.Entity.Builder, com.google.datastore.v1.EntityOrBuilder> entityBuilder_;
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public boolean hasEntity() {
      return entityBuilder_ != null || entity_ != null;
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public com.google.datastore.v1.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? com.google.datastore.v1.Entity.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public Builder setEntity(com.google.datastore.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
        onChanged();
      } else {
        entityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public Builder setEntity(
        com.google.datastore.v1.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
        onChanged();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public Builder mergeEntity(com.google.datastore.v1.Entity value) {
      if (entityBuilder_ == null) {
        if (entity_ != null) {
          entity_ =
            com.google.datastore.v1.Entity.newBuilder(entity_).mergeFrom(value).buildPartial();
        } else {
          entity_ = value;
        }
        onChanged();
      } else {
        entityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public Builder clearEntity() {
      if (entityBuilder_ == null) {
        entity_ = null;
        onChanged();
      } else {
        entity_ = null;
        entityBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public com.google.datastore.v1.Entity.Builder getEntityBuilder() {
      
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    public com.google.datastore.v1.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            com.google.datastore.v1.Entity.getDefaultInstance() : entity_;
      }
    }
    /**
     * <pre>
     * The resulting entity.
     * </pre>
     *
     * <code>.google.datastore.v1.Entity entity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.datastore.v1.Entity, com.google.datastore.v1.Entity.Builder, com.google.datastore.v1.EntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.datastore.v1.Entity, com.google.datastore.v1.Entity.Builder, com.google.datastore.v1.EntityOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private long version_ ;
    /**
     * <pre>
     * The version of the entity, a strictly positive number that monotonically
     * increases with changes to the entity.
     * This field is set for [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity
     * results.
     * For [missing][google.datastore.v1.LookupResponse.missing] entities in `LookupResponse`, this
     * is the version of the snapshot that was used to look up the entity, and it
     * is always set except for eventually consistent reads.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     */
    public long getVersion() {
      return version_;
    }
    /**
     * <pre>
     * The version of the entity, a strictly positive number that monotonically
     * increases with changes to the entity.
     * This field is set for [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity
     * results.
     * For [missing][google.datastore.v1.LookupResponse.missing] entities in `LookupResponse`, this
     * is the version of the snapshot that was used to look up the entity, and it
     * is always set except for eventually consistent reads.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     */
    public Builder setVersion(long value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The version of the entity, a strictly positive number that monotonically
     * increases with changes to the entity.
     * This field is set for [`FULL`][google.datastore.v1.EntityResult.ResultType.FULL] entity
     * results.
     * For [missing][google.datastore.v1.LookupResponse.missing] entities in `LookupResponse`, this
     * is the version of the snapshot that was used to look up the entity, and it
     * is always set except for eventually consistent reads.
     * </pre>
     *
     * <code>int64 version = 4;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString cursor_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * A cursor that points to the position after the result entity.
     * Set only when the `EntityResult` is part of a `QueryResultBatch` message.
     * </pre>
     *
     * <code>bytes cursor = 3;</code>
     */
    public com.google.protobuf.ByteString getCursor() {
      return cursor_;
    }
    /**
     * <pre>
     * A cursor that points to the position after the result entity.
     * Set only when the `EntityResult` is part of a `QueryResultBatch` message.
     * </pre>
     *
     * <code>bytes cursor = 3;</code>
     */
    public Builder setCursor(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cursor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A cursor that points to the position after the result entity.
     * Set only when the `EntityResult` is part of a `QueryResultBatch` message.
     * </pre>
     *
     * <code>bytes cursor = 3;</code>
     */
    public Builder clearCursor() {
      
      cursor_ = getDefaultInstance().getCursor();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.datastore.v1.EntityResult)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.EntityResult)
  private static final com.google.datastore.v1.EntityResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.EntityResult();
  }

  public static com.google.datastore.v1.EntityResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityResult>
      PARSER = new com.google.protobuf.AbstractParser<EntityResult>() {
    @java.lang.Override
    public EntityResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.EntityResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

