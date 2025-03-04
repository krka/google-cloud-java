// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/asset.proto

package com.google.cloud.securitycenter.v1;

public final class AssetOuterClass {
  private AssetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Asset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Asset_SecurityCenterProperties_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Asset_SecurityCenterProperties_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Asset_IamPolicy_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Asset_IamPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_Asset_ResourcePropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Asset_ResourcePropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/securitycenter/v1/asset.p"
          + "roto\022\036google.cloud.securitycenter.v1\032\034go"
          + "ogle/api/annotations.proto\0323google/cloud"
          + "/securitycenter/v1/security_marks.proto\032"
          + "\034google/protobuf/struct.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\317\005\n\005Asset\022\014\n\004name"
          + "\030\001 \001(\t\022b\n\032security_center_properties\030\002 \001"
          + "(\0132>.google.cloud.securitycenter.v1.Asse"
          + "t.SecurityCenterProperties\022Z\n\023resource_p"
          + "roperties\030\007 \003(\0132=.google.cloud.securityc"
          + "enter.v1.Asset.ResourcePropertiesEntry\022E"
          + "\n\016security_marks\030\010 \001(\0132-.google.cloud.se"
          + "curitycenter.v1.SecurityMarks\022/\n\013create_"
          + "time\030\t \001(\0132\032.google.protobuf.Timestamp\022/"
          + "\n\013update_time\030\n \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022C\n\niam_policy\030\013 \001(\0132/.google.clo"
          + "ud.securitycenter.v1.Asset.IamPolicy\032\224\001\n"
          + "\030SecurityCenterProperties\022\025\n\rresource_na"
          + "me\030\001 \001(\t\022\025\n\rresource_type\030\002 \001(\t\022\027\n\017resou"
          + "rce_parent\030\003 \001(\t\022\030\n\020resource_project\030\004 \001"
          + "(\t\022\027\n\017resource_owners\030\005 \003(\t\032 \n\tIamPolicy"
          + "\022\023\n\013policy_blob\030\001 \001(\t\032Q\n\027ResourcePropert"
          + "iesEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.g"
          + "oogle.protobuf.Value:\0028\001B\225\001\n\"com.google."
          + "cloud.securitycenter.v1P\001ZLgoogle.golang"
          + ".org/genproto/googleapis/cloud/securityc"
          + "enter/v1;securitycenter\252\002\036Google.Cloud.S"
          + "ecurityCenter.V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_securitycenter_v1_Asset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Asset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Asset_descriptor,
            new java.lang.String[] {
              "Name",
              "SecurityCenterProperties",
              "ResourceProperties",
              "SecurityMarks",
              "CreateTime",
              "UpdateTime",
              "IamPolicy",
            });
    internal_static_google_cloud_securitycenter_v1_Asset_SecurityCenterProperties_descriptor =
        internal_static_google_cloud_securitycenter_v1_Asset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Asset_SecurityCenterProperties_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Asset_SecurityCenterProperties_descriptor,
            new java.lang.String[] {
              "ResourceName", "ResourceType", "ResourceParent", "ResourceProject", "ResourceOwners",
            });
    internal_static_google_cloud_securitycenter_v1_Asset_IamPolicy_descriptor =
        internal_static_google_cloud_securitycenter_v1_Asset_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_securitycenter_v1_Asset_IamPolicy_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Asset_IamPolicy_descriptor,
            new java.lang.String[] {
              "PolicyBlob",
            });
    internal_static_google_cloud_securitycenter_v1_Asset_ResourcePropertiesEntry_descriptor =
        internal_static_google_cloud_securitycenter_v1_Asset_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_securitycenter_v1_Asset_ResourcePropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_Asset_ResourcePropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityMarksOuterClass.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
