// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

/**
 * <pre>
 * Response message for the `ListReferenceImages` method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.ListReferenceImagesResponse}
 */
public  final class ListReferenceImagesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.ListReferenceImagesResponse)
    ListReferenceImagesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListReferenceImagesResponse.newBuilder() to construct.
  private ListReferenceImagesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListReferenceImagesResponse() {
    referenceImages_ = java.util.Collections.emptyList();
    pageSize_ = 0;
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListReferenceImagesResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              referenceImages_ = new java.util.ArrayList<com.google.cloud.vision.v1p3beta1.ReferenceImage>();
              mutable_bitField0_ |= 0x00000001;
            }
            referenceImages_.add(
                input.readMessage(com.google.cloud.vision.v1p3beta1.ReferenceImage.parser(), extensionRegistry));
            break;
          }
          case 16: {

            pageSize_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        referenceImages_ = java.util.Collections.unmodifiableList(referenceImages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p3beta1_ListReferenceImagesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p3beta1_ListReferenceImagesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.class, com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int REFERENCE_IMAGES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.vision.v1p3beta1.ReferenceImage> referenceImages_;
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  public java.util.List<com.google.cloud.vision.v1p3beta1.ReferenceImage> getReferenceImagesList() {
    return referenceImages_;
  }
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder> 
      getReferenceImagesOrBuilderList() {
    return referenceImages_;
  }
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  public int getReferenceImagesCount() {
    return referenceImages_.size();
  }
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  public com.google.cloud.vision.v1p3beta1.ReferenceImage getReferenceImages(int index) {
    return referenceImages_.get(index);
  }
  /**
   * <pre>
   * The list of reference images.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  public com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder getReferenceImagesOrBuilder(
      int index) {
    return referenceImages_.get(index);
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * The maximum number of items to return. Default 10, maximum 100.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The next_page_token returned from a previous List request, if any.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < referenceImages_.size(); i++) {
      output.writeMessage(1, referenceImages_.get(i));
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < referenceImages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, referenceImages_.get(i));
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse other = (com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse) obj;

    boolean result = true;
    result = result && getReferenceImagesList()
        .equals(other.getReferenceImagesList());
    result = result && (getPageSize()
        == other.getPageSize());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
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
    if (getReferenceImagesCount() > 0) {
      hash = (37 * hash) + REFERENCE_IMAGES_FIELD_NUMBER;
      hash = (53 * hash) + getReferenceImagesList().hashCode();
    }
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse prototype) {
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
   * Response message for the `ListReferenceImages` method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.ListReferenceImagesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.ListReferenceImagesResponse)
      com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p3beta1_ListReferenceImagesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p3beta1_ListReferenceImagesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.class, com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.newBuilder()
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
        getReferenceImagesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (referenceImagesBuilder_ == null) {
        referenceImages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        referenceImagesBuilder_.clear();
      }
      pageSize_ = 0;

      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ProductSearchServiceProto.internal_static_google_cloud_vision_v1p3beta1_ListReferenceImagesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse build() {
      com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse buildPartial() {
      com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse result = new com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (referenceImagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          referenceImages_ = java.util.Collections.unmodifiableList(referenceImages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.referenceImages_ = referenceImages_;
      } else {
        result.referenceImages_ = referenceImagesBuilder_.build();
      }
      result.pageSize_ = pageSize_;
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse other) {
      if (other == com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse.getDefaultInstance()) return this;
      if (referenceImagesBuilder_ == null) {
        if (!other.referenceImages_.isEmpty()) {
          if (referenceImages_.isEmpty()) {
            referenceImages_ = other.referenceImages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReferenceImagesIsMutable();
            referenceImages_.addAll(other.referenceImages_);
          }
          onChanged();
        }
      } else {
        if (!other.referenceImages_.isEmpty()) {
          if (referenceImagesBuilder_.isEmpty()) {
            referenceImagesBuilder_.dispose();
            referenceImagesBuilder_ = null;
            referenceImages_ = other.referenceImages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            referenceImagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReferenceImagesFieldBuilder() : null;
          } else {
            referenceImagesBuilder_.addAllMessages(other.referenceImages_);
          }
        }
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.vision.v1p3beta1.ReferenceImage> referenceImages_ =
      java.util.Collections.emptyList();
    private void ensureReferenceImagesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        referenceImages_ = new java.util.ArrayList<com.google.cloud.vision.v1p3beta1.ReferenceImage>(referenceImages_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1p3beta1.ReferenceImage, com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder, com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder> referenceImagesBuilder_;

    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.ReferenceImage> getReferenceImagesList() {
      if (referenceImagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(referenceImages_);
      } else {
        return referenceImagesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public int getReferenceImagesCount() {
      if (referenceImagesBuilder_ == null) {
        return referenceImages_.size();
      } else {
        return referenceImagesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ReferenceImage getReferenceImages(int index) {
      if (referenceImagesBuilder_ == null) {
        return referenceImages_.get(index);
      } else {
        return referenceImagesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder setReferenceImages(
        int index, com.google.cloud.vision.v1p3beta1.ReferenceImage value) {
      if (referenceImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferenceImagesIsMutable();
        referenceImages_.set(index, value);
        onChanged();
      } else {
        referenceImagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder setReferenceImages(
        int index, com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder builderForValue) {
      if (referenceImagesBuilder_ == null) {
        ensureReferenceImagesIsMutable();
        referenceImages_.set(index, builderForValue.build());
        onChanged();
      } else {
        referenceImagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder addReferenceImages(com.google.cloud.vision.v1p3beta1.ReferenceImage value) {
      if (referenceImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferenceImagesIsMutable();
        referenceImages_.add(value);
        onChanged();
      } else {
        referenceImagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder addReferenceImages(
        int index, com.google.cloud.vision.v1p3beta1.ReferenceImage value) {
      if (referenceImagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferenceImagesIsMutable();
        referenceImages_.add(index, value);
        onChanged();
      } else {
        referenceImagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder addReferenceImages(
        com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder builderForValue) {
      if (referenceImagesBuilder_ == null) {
        ensureReferenceImagesIsMutable();
        referenceImages_.add(builderForValue.build());
        onChanged();
      } else {
        referenceImagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder addReferenceImages(
        int index, com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder builderForValue) {
      if (referenceImagesBuilder_ == null) {
        ensureReferenceImagesIsMutable();
        referenceImages_.add(index, builderForValue.build());
        onChanged();
      } else {
        referenceImagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder addAllReferenceImages(
        java.lang.Iterable<? extends com.google.cloud.vision.v1p3beta1.ReferenceImage> values) {
      if (referenceImagesBuilder_ == null) {
        ensureReferenceImagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, referenceImages_);
        onChanged();
      } else {
        referenceImagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder clearReferenceImages() {
      if (referenceImagesBuilder_ == null) {
        referenceImages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        referenceImagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public Builder removeReferenceImages(int index) {
      if (referenceImagesBuilder_ == null) {
        ensureReferenceImagesIsMutable();
        referenceImages_.remove(index);
        onChanged();
      } else {
        referenceImagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder getReferenceImagesBuilder(
        int index) {
      return getReferenceImagesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder getReferenceImagesOrBuilder(
        int index) {
      if (referenceImagesBuilder_ == null) {
        return referenceImages_.get(index);  } else {
        return referenceImagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder> 
         getReferenceImagesOrBuilderList() {
      if (referenceImagesBuilder_ != null) {
        return referenceImagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(referenceImages_);
      }
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder addReferenceImagesBuilder() {
      return getReferenceImagesFieldBuilder().addBuilder(
          com.google.cloud.vision.v1p3beta1.ReferenceImage.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder addReferenceImagesBuilder(
        int index) {
      return getReferenceImagesFieldBuilder().addBuilder(
          index, com.google.cloud.vision.v1p3beta1.ReferenceImage.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of reference images.
     * </pre>
     *
     * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
     */
    public java.util.List<com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder> 
         getReferenceImagesBuilderList() {
      return getReferenceImagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.vision.v1p3beta1.ReferenceImage, com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder, com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder> 
        getReferenceImagesFieldBuilder() {
      if (referenceImagesBuilder_ == null) {
        referenceImagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.vision.v1p3beta1.ReferenceImage, com.google.cloud.vision.v1p3beta1.ReferenceImage.Builder, com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder>(
                referenceImages_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        referenceImages_ = null;
      }
      return referenceImagesBuilder_;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * The maximum number of items to return. Default 10, maximum 100.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * The maximum number of items to return. Default 10, maximum 100.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      
      pageSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum number of items to return. Default 10, maximum 100.
     * </pre>
     *
     * <code>int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      
      pageSize_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * The next_page_token returned from a previous List request, if any.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The next_page_token returned from a previous List request, if any.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The next_page_token returned from a previous List request, if any.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The next_page_token returned from a previous List request, if any.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The next_page_token returned from a previous List request, if any.
     * </pre>
     *
     * <code>string next_page_token = 3;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.ListReferenceImagesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.ListReferenceImagesResponse)
  private static final com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse();
  }

  public static com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListReferenceImagesResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListReferenceImagesResponse>() {
    @java.lang.Override
    public ListReferenceImagesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListReferenceImagesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListReferenceImagesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListReferenceImagesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p3beta1.ListReferenceImagesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

