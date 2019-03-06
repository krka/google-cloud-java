// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/dataset.proto

package com.google.cloud.automl.v1beta1;

public interface DatasetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.Dataset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for translation.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TranslationDatasetMetadata translation_dataset_metadata = 23;
   * </code>
   */
  boolean hasTranslationDatasetMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for translation.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TranslationDatasetMetadata translation_dataset_metadata = 23;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TranslationDatasetMetadata getTranslationDatasetMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for translation.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TranslationDatasetMetadata translation_dataset_metadata = 23;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TranslationDatasetMetadataOrBuilder
      getTranslationDatasetMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for image classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata image_classification_dataset_metadata = 24;
   * </code>
   */
  boolean hasImageClassificationDatasetMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for image classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata image_classification_dataset_metadata = 24;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata
      getImageClassificationDatasetMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for image classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ImageClassificationDatasetMetadata image_classification_dataset_metadata = 24;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ImageClassificationDatasetMetadataOrBuilder
      getImageClassificationDatasetMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for text classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextClassificationDatasetMetadata text_classification_dataset_metadata = 25;
   * </code>
   */
  boolean hasTextClassificationDatasetMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for text classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextClassificationDatasetMetadata text_classification_dataset_metadata = 25;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadata
      getTextClassificationDatasetMetadata();
  /**
   *
   *
   * <pre>
   * Metadata for a dataset used for text classification.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.TextClassificationDatasetMetadata text_classification_dataset_metadata = 25;
   * </code>
   */
  com.google.cloud.automl.v1beta1.TextClassificationDatasetMetadataOrBuilder
      getTextClassificationDatasetMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the dataset.
   * Form: `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the dataset.
   * Form: `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the dataset to show in the interface. The name can be
   * up to 32 characters
   * long and can consist only of ASCII Latin letters A-Z and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of the dataset to show in the interface. The name can be
   * up to 32 characters
   * long and can consist only of ASCII Latin letters A-Z and a-z, underscores
   * (_), and ASCII digits 0-9.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The number of examples in the dataset.
   * </pre>
   *
   * <code>int32 example_count = 21;</code>
   */
  int getExampleCount();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this dataset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 14;</code>
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this dataset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 14;</code>
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this dataset was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 14;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  public com.google.cloud.automl.v1beta1.Dataset.DatasetMetadataCase getDatasetMetadataCase();
}
