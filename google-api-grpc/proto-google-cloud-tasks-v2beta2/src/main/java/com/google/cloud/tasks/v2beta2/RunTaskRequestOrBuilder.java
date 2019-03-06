// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

package com.google.cloud.tasks.v2beta2;

public interface RunTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.RunTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required.
   * The task name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
   */
  int getResponseViewValue();
  /**
   *
   *
   * <pre>
   * The response_view specifies which subset of the
   * [Task][google.cloud.tasks.v2beta2.Task] will be returned.
   * By default response_view is
   * [BASIC][google.cloud.tasks.v2beta2.Task.View.BASIC]; not all information is
   * retrieved by default because some data, such as payloads, might be
   * desirable to return only when needed because of its large size or because
   * of the sensitivity of data that it contains.
   * Authorization for [FULL][google.cloud.tasks.v2beta2.Task.View.FULL]
   * requires `cloudtasks.tasks.fullView` [Google
   * IAM](https://cloud.google.com/iam/) permission on the
   * [Task][google.cloud.tasks.v2beta2.Task] resource.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Task.View response_view = 2;</code>
   */
  com.google.cloud.tasks.v2beta2.Task.View getResponseView();
}
