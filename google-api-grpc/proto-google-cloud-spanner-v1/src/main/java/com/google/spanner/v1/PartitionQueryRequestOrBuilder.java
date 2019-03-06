// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

public interface PartitionQueryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.v1.PartitionQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The session used to create the partitions.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Required. The session used to create the partitions.
   * </pre>
   *
   * <code>string session = 1;</code>
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Read only snapshot transactions are supported, read/write and single use
   * transactions are not.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  boolean hasTransaction();
  /**
   *
   *
   * <pre>
   * Read only snapshot transactions are supported, read/write and single use
   * transactions are not.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  com.google.spanner.v1.TransactionSelector getTransaction();
  /**
   *
   *
   * <pre>
   * Read only snapshot transactions are supported, read/write and single use
   * transactions are not.
   * </pre>
   *
   * <code>.google.spanner.v1.TransactionSelector transaction = 2;</code>
   */
  com.google.spanner.v1.TransactionSelectorOrBuilder getTransactionOrBuilder();

  /**
   *
   *
   * <pre>
   * The query request to generate partitions for. The request will fail if
   * the query is not root partitionable. The query plan of a root
   * partitionable query has a single distributed union operator. A distributed
   * union operator conceptually divides one or more tables into multiple
   * splits, remotely evaluates a subquery independently on each split, and
   * then unions all results.
   * This must not contain DML commands, such as INSERT, UPDATE, or
   * DELETE. Use
   * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] with a
   * PartitionedDml transaction for large, partition-friendly DML operations.
   * </pre>
   *
   * <code>string sql = 3;</code>
   */
  java.lang.String getSql();
  /**
   *
   *
   * <pre>
   * The query request to generate partitions for. The request will fail if
   * the query is not root partitionable. The query plan of a root
   * partitionable query has a single distributed union operator. A distributed
   * union operator conceptually divides one or more tables into multiple
   * splits, remotely evaluates a subquery independently on each split, and
   * then unions all results.
   * This must not contain DML commands, such as INSERT, UPDATE, or
   * DELETE. Use
   * [ExecuteStreamingSql][google.spanner.v1.Spanner.ExecuteStreamingSql] with a
   * PartitionedDml transaction for large, partition-friendly DML operations.
   * </pre>
   *
   * <code>string sql = 3;</code>
   */
  com.google.protobuf.ByteString getSqlBytes();

  /**
   *
   *
   * <pre>
   * The SQL query string can contain parameter placeholders. A parameter
   * placeholder consists of `'&#64;'` followed by the parameter
   * name. Parameter names consist of any combination of letters,
   * numbers, and underscores.
   * Parameters can appear anywhere that a literal value is expected.  The same
   * parameter name can be used more than once, for example:
   *   `"WHERE id &gt; &#64;msg_id AND id &lt; &#64;msg_id + 100"`
   * It is an error to execute an SQL query with unbound parameters.
   * Parameter values are specified using `params`, which is a JSON
   * object whose keys are parameter names, and whose values are the
   * corresponding parameter values.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 4;</code>
   */
  boolean hasParams();
  /**
   *
   *
   * <pre>
   * The SQL query string can contain parameter placeholders. A parameter
   * placeholder consists of `'&#64;'` followed by the parameter
   * name. Parameter names consist of any combination of letters,
   * numbers, and underscores.
   * Parameters can appear anywhere that a literal value is expected.  The same
   * parameter name can be used more than once, for example:
   *   `"WHERE id &gt; &#64;msg_id AND id &lt; &#64;msg_id + 100"`
   * It is an error to execute an SQL query with unbound parameters.
   * Parameter values are specified using `params`, which is a JSON
   * object whose keys are parameter names, and whose values are the
   * corresponding parameter values.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 4;</code>
   */
  com.google.protobuf.Struct getParams();
  /**
   *
   *
   * <pre>
   * The SQL query string can contain parameter placeholders. A parameter
   * placeholder consists of `'&#64;'` followed by the parameter
   * name. Parameter names consist of any combination of letters,
   * numbers, and underscores.
   * Parameters can appear anywhere that a literal value is expected.  The same
   * parameter name can be used more than once, for example:
   *   `"WHERE id &gt; &#64;msg_id AND id &lt; &#64;msg_id + 100"`
   * It is an error to execute an SQL query with unbound parameters.
   * Parameter values are specified using `params`, which is a JSON
   * object whose keys are parameter names, and whose values are the
   * corresponding parameter values.
   * </pre>
   *
   * <code>.google.protobuf.Struct params = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.PartitionQueryRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL query parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  int getParamTypesCount();
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.PartitionQueryRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL query parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  boolean containsParamTypes(java.lang.String key);
  /** Use {@link #getParamTypesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.spanner.v1.Type> getParamTypes();
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.PartitionQueryRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL query parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  java.util.Map<java.lang.String, com.google.spanner.v1.Type> getParamTypesMap();
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.PartitionQueryRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL query parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  com.google.spanner.v1.Type getParamTypesOrDefault(
      java.lang.String key, com.google.spanner.v1.Type defaultValue);
  /**
   *
   *
   * <pre>
   * It is not always possible for Cloud Spanner to infer the right SQL type
   * from a JSON value.  For example, values of type `BYTES` and values
   * of type `STRING` both appear in
   * [params][google.spanner.v1.PartitionQueryRequest.params] as JSON strings.
   * In these cases, `param_types` can be used to specify the exact
   * SQL type for some or all of the SQL query parameters. See the
   * definition of [Type][google.spanner.v1.Type] for more information
   * about SQL types.
   * </pre>
   *
   * <code>map&lt;string, .google.spanner.v1.Type&gt; param_types = 5;</code>
   */
  com.google.spanner.v1.Type getParamTypesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Additional options that affect how many partitions are created.
   * </pre>
   *
   * <code>.google.spanner.v1.PartitionOptions partition_options = 6;</code>
   */
  boolean hasPartitionOptions();
  /**
   *
   *
   * <pre>
   * Additional options that affect how many partitions are created.
   * </pre>
   *
   * <code>.google.spanner.v1.PartitionOptions partition_options = 6;</code>
   */
  com.google.spanner.v1.PartitionOptions getPartitionOptions();
  /**
   *
   *
   * <pre>
   * Additional options that affect how many partitions are created.
   * </pre>
   *
   * <code>.google.spanner.v1.PartitionOptions partition_options = 6;</code>
   */
  com.google.spanner.v1.PartitionOptionsOrBuilder getPartitionOptionsOrBuilder();
}
