// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1beta1/cloud_speech.proto

package com.google.cloud.speech.v1beta1;

/**
 * <pre>
 * The only message returned to the client by `SyncRecognize`. method. It
 * contains the result as zero or more sequential `SpeechRecognitionResult`
 * messages.
 * </pre>
 *
 * Protobuf type {@code google.cloud.speech.v1beta1.SyncRecognizeResponse}
 */
public  final class SyncRecognizeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.speech.v1beta1.SyncRecognizeResponse)
    SyncRecognizeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SyncRecognizeResponse.newBuilder() to construct.
  private SyncRecognizeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SyncRecognizeResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SyncRecognizeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              results_ = new java.util.ArrayList<com.google.cloud.speech.v1beta1.SpeechRecognitionResult>();
              mutable_bitField0_ |= 0x00000001;
            }
            results_.add(
                input.readMessage(com.google.cloud.speech.v1beta1.SpeechRecognitionResult.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        results_ = java.util.Collections.unmodifiableList(results_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SyncRecognizeResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SyncRecognizeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.speech.v1beta1.SyncRecognizeResponse.class, com.google.cloud.speech.v1beta1.SyncRecognizeResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionResult> results_;
  /**
   * <pre>
   * *Output-only* Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
   */
  public java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * *Output-only* Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
   */
  public java.util.List<? extends com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * *Output-only* Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
   */
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * *Output-only* Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
   */
  public com.google.cloud.speech.v1beta1.SpeechRecognitionResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * *Output-only* Sequential list of transcription results corresponding to
   * sequential portions of audio.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
   */
  public com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(2, results_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, results_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.speech.v1beta1.SyncRecognizeResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.speech.v1beta1.SyncRecognizeResponse other = (com.google.cloud.speech.v1beta1.SyncRecognizeResponse) obj;

    boolean result = true;
    result = result && getResultsList()
        .equals(other.getResultsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.speech.v1beta1.SyncRecognizeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The only message returned to the client by `SyncRecognize`. method. It
   * contains the result as zero or more sequential `SpeechRecognitionResult`
   * messages.
   * </pre>
   *
   * Protobuf type {@code google.cloud.speech.v1beta1.SyncRecognizeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.speech.v1beta1.SyncRecognizeResponse)
      com.google.cloud.speech.v1beta1.SyncRecognizeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SyncRecognizeResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SyncRecognizeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.speech.v1beta1.SyncRecognizeResponse.class, com.google.cloud.speech.v1beta1.SyncRecognizeResponse.Builder.class);
    }

    // Construct using com.google.cloud.speech.v1beta1.SyncRecognizeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResultsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.speech.v1beta1.SpeechProto.internal_static_google_cloud_speech_v1beta1_SyncRecognizeResponse_descriptor;
    }

    public com.google.cloud.speech.v1beta1.SyncRecognizeResponse getDefaultInstanceForType() {
      return com.google.cloud.speech.v1beta1.SyncRecognizeResponse.getDefaultInstance();
    }

    public com.google.cloud.speech.v1beta1.SyncRecognizeResponse build() {
      com.google.cloud.speech.v1beta1.SyncRecognizeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.speech.v1beta1.SyncRecognizeResponse buildPartial() {
      com.google.cloud.speech.v1beta1.SyncRecognizeResponse result = new com.google.cloud.speech.v1beta1.SyncRecognizeResponse(this);
      int from_bitField0_ = bitField0_;
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.speech.v1beta1.SyncRecognizeResponse) {
        return mergeFrom((com.google.cloud.speech.v1beta1.SyncRecognizeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.speech.v1beta1.SyncRecognizeResponse other) {
      if (other == com.google.cloud.speech.v1beta1.SyncRecognizeResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.speech.v1beta1.SyncRecognizeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.speech.v1beta1.SyncRecognizeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        results_ = new java.util.ArrayList<com.google.cloud.speech.v1beta1.SpeechRecognitionResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1beta1.SpeechRecognitionResult, com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder, com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder setResults(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(com.google.cloud.speech.v1beta1.SpeechRecognitionResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(
        com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addResults(
        int index, com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.cloud.speech.v1beta1.SpeechRecognitionResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public java.util.List<? extends com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.cloud.speech.v1beta1.SpeechRecognitionResult.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.cloud.speech.v1beta1.SpeechRecognitionResult.getDefaultInstance());
    }
    /**
     * <pre>
     * *Output-only* Sequential list of transcription results corresponding to
     * sequential portions of audio.
     * </pre>
     *
     * <code>repeated .google.cloud.speech.v1beta1.SpeechRecognitionResult results = 2;</code>
     */
    public java.util.List<com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.speech.v1beta1.SpeechRecognitionResult, com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder, com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.speech.v1beta1.SpeechRecognitionResult, com.google.cloud.speech.v1beta1.SpeechRecognitionResult.Builder, com.google.cloud.speech.v1beta1.SpeechRecognitionResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.speech.v1beta1.SyncRecognizeResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.speech.v1beta1.SyncRecognizeResponse)
  private static final com.google.cloud.speech.v1beta1.SyncRecognizeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.speech.v1beta1.SyncRecognizeResponse();
  }

  public static com.google.cloud.speech.v1beta1.SyncRecognizeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SyncRecognizeResponse>
      PARSER = new com.google.protobuf.AbstractParser<SyncRecognizeResponse>() {
    public SyncRecognizeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SyncRecognizeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SyncRecognizeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SyncRecognizeResponse> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.speech.v1beta1.SyncRecognizeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
