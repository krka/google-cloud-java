// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

public interface BatchAnnotateImagesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.BatchAnnotateImagesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.AnnotateImageRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.AnnotateImageRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.AnnotateImageRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Individual image annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.AnnotateImageRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.AnnotateImageRequestOrBuilder getRequestsOrBuilder(int index);
}
