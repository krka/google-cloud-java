// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

package io.grafeas.v1beta1.image;

public interface DetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.image.Details)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  boolean hasDerivedImage();
  /**
   *
   *
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  io.grafeas.v1beta1.image.Derived getDerivedImage();
  /**
   *
   *
   * <pre>
   * The child image derived from the base image.
   * </pre>
   *
   * <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
   */
  io.grafeas.v1beta1.image.DerivedOrBuilder getDerivedImageOrBuilder();
}
