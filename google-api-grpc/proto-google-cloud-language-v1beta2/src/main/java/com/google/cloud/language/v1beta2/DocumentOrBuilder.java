// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
   * returns an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document.Type type = 1;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. If the type is not set or is `TYPE_UNSPECIFIED`,
   * returns an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document.Type type = 1;</code>
   */
  com.google.cloud.language.v1beta2.Document.Type getType();

  /**
   *
   *
   * <pre>
   * The content of the input in string format.
   * </pre>
   *
   * <code>string content = 2;</code>
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The content of the input in string format.
   * </pre>
   *
   * <code>string content = 2;</code>
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URI where the file content is located.
   * This URI must be of the form: gs://bucket_name/object_name. For more
   * details, see https://cloud.google.com/storage/docs/reference-uris.
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_content_uri = 3;</code>
   */
  java.lang.String getGcsContentUri();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage URI where the file content is located.
   * This URI must be of the form: gs://bucket_name/object_name. For more
   * details, see https://cloud.google.com/storage/docs/reference-uris.
   * NOTE: Cloud Storage object versioning is not supported.
   * </pre>
   *
   * <code>string gcs_content_uri = 3;</code>
   */
  com.google.protobuf.ByteString getGcsContentUriBytes();

  /**
   *
   *
   * <pre>
   * The language of the document (if not specified, the language is
   * automatically detected). Both ISO and BCP-47 language codes are
   * accepted.&lt;br&gt;
   * [Language Support](/natural-language/docs/languages)
   * lists currently supported languages for each API method.
   * If the language (either specified by the caller or automatically detected)
   * is not supported by the called API method, an `INVALID_ARGUMENT` error
   * is returned.
   * </pre>
   *
   * <code>string language = 4;</code>
   */
  java.lang.String getLanguage();
  /**
   *
   *
   * <pre>
   * The language of the document (if not specified, the language is
   * automatically detected). Both ISO and BCP-47 language codes are
   * accepted.&lt;br&gt;
   * [Language Support](/natural-language/docs/languages)
   * lists currently supported languages for each API method.
   * If the language (either specified by the caller or automatically detected)
   * is not supported by the called API method, an `INVALID_ARGUMENT` error
   * is returned.
   * </pre>
   *
   * <code>string language = 4;</code>
   */
  com.google.protobuf.ByteString getLanguageBytes();

  public com.google.cloud.language.v1beta2.Document.SourceCase getSourceCase();
}
