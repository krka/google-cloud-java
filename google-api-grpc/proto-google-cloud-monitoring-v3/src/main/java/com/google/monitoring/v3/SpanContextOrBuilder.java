// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/span_context.proto

package com.google.monitoring.v3;

public interface SpanContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.SpanContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the span in the following format:
   *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
   * [TRACE_ID] is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array.
   * [SPAN_ID] is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array.
   * </pre>
   *
   * <code>string span_name = 1;</code>
   */
  java.lang.String getSpanName();
  /**
   * <pre>
   * The resource name of the span in the following format:
   *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
   * [TRACE_ID] is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array.
   * [SPAN_ID] is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array.
   * </pre>
   *
   * <code>string span_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getSpanNameBytes();
}
