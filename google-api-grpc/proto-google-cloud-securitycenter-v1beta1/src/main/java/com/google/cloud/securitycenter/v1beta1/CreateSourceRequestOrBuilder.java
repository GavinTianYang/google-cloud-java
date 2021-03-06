// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

public interface CreateSourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.CreateSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
   */
  boolean hasSource();
  /**
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
   */
  com.google.cloud.securitycenter.v1beta1.Source getSource();
  /**
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
   */
  com.google.cloud.securitycenter.v1beta1.SourceOrBuilder getSourceOrBuilder();
}
