// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p4beta1/text_annotation.proto

package com.google.cloud.vision.v1p4beta1;

public interface PageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.Page)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty property = 1;</code>
   */
  boolean hasProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty getProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * Page width. For PDFs the unit is points. For images (including
   * TIFFs) the unit is pixels.
   * </pre>
   *
   * <code>int32 width = 2;</code>
   */
  int getWidth();

  /**
   *
   *
   * <pre>
   * Page height. For PDFs the unit is points. For images (including
   * TIFFs) the unit is pixels.
   * </pre>
   *
   * <code>int32 height = 3;</code>
   */
  int getHeight();

  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.Block> getBlocksList();
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  com.google.cloud.vision.v1p4beta1.Block getBlocks(int index);
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  int getBlocksCount();
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.BlockOrBuilder>
      getBlocksOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  com.google.cloud.vision.v1p4beta1.BlockOrBuilder getBlocksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Confidence of the OCR results on the page. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 5;</code>
   */
  float getConfidence();
}
