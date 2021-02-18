/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 *
 *
 * <pre>
 * The response for a single offline file annotation request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.AsyncAnnotateFileResponse}
 */
public final class AsyncAnnotateFileResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.AsyncAnnotateFileResponse)
    AsyncAnnotateFileResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AsyncAnnotateFileResponse.newBuilder() to construct.
  private AsyncAnnotateFileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AsyncAnnotateFileResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AsyncAnnotateFileResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AsyncAnnotateFileResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              com.google.cloud.vision.v1.OutputConfig.Builder subBuilder = null;
              if (outputConfig_ != null) {
                subBuilder = outputConfig_.toBuilder();
              }
              outputConfig_ =
                  input.readMessage(
                      com.google.cloud.vision.v1.OutputConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(outputConfig_);
                outputConfig_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_AsyncAnnotateFileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1_AsyncAnnotateFileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.AsyncAnnotateFileResponse.class,
            com.google.cloud.vision.v1.AsyncAnnotateFileResponse.Builder.class);
  }

  public static final int OUTPUT_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.vision.v1.OutputConfig outputConfig_;
  /**
   *
   *
   * <pre>
   * The output location and metadata from AsyncAnnotateFileRequest.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  @java.lang.Override
  public boolean hasOutputConfig() {
    return outputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * The output location and metadata from AsyncAnnotateFileRequest.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
   *
   * @return The outputConfig.
   */
  @java.lang.Override
  public com.google.cloud.vision.v1.OutputConfig getOutputConfig() {
    return outputConfig_ == null
        ? com.google.cloud.vision.v1.OutputConfig.getDefaultInstance()
        : outputConfig_;
  }
  /**
   *
   *
   * <pre>
   * The output location and metadata from AsyncAnnotateFileRequest.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.vision.v1.OutputConfigOrBuilder getOutputConfigOrBuilder() {
    return getOutputConfig();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (outputConfig_ != null) {
      output.writeMessage(1, getOutputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (outputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getOutputConfig());
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
    if (!(obj instanceof com.google.cloud.vision.v1.AsyncAnnotateFileResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.AsyncAnnotateFileResponse other =
        (com.google.cloud.vision.v1.AsyncAnnotateFileResponse) obj;

    if (hasOutputConfig() != other.hasOutputConfig()) return false;
    if (hasOutputConfig()) {
      if (!getOutputConfig().equals(other.getOutputConfig())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOutputConfig()) {
      hash = (37 * hash) + OUTPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getOutputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.vision.v1.AsyncAnnotateFileResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for a single offline file annotation request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.AsyncAnnotateFileResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.AsyncAnnotateFileResponse)
      com.google.cloud.vision.v1.AsyncAnnotateFileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_AsyncAnnotateFileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_AsyncAnnotateFileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.AsyncAnnotateFileResponse.class,
              com.google.cloud.vision.v1.AsyncAnnotateFileResponse.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.AsyncAnnotateFileResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1_AsyncAnnotateFileResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.AsyncAnnotateFileResponse getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.AsyncAnnotateFileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.AsyncAnnotateFileResponse build() {
      com.google.cloud.vision.v1.AsyncAnnotateFileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1.AsyncAnnotateFileResponse buildPartial() {
      com.google.cloud.vision.v1.AsyncAnnotateFileResponse result =
          new com.google.cloud.vision.v1.AsyncAnnotateFileResponse(this);
      if (outputConfigBuilder_ == null) {
        result.outputConfig_ = outputConfig_;
      } else {
        result.outputConfig_ = outputConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1.AsyncAnnotateFileResponse) {
        return mergeFrom((com.google.cloud.vision.v1.AsyncAnnotateFileResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.AsyncAnnotateFileResponse other) {
      if (other == com.google.cloud.vision.v1.AsyncAnnotateFileResponse.getDefaultInstance())
        return this;
      if (other.hasOutputConfig()) {
        mergeOutputConfig(other.getOutputConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1.AsyncAnnotateFileResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1.AsyncAnnotateFileResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.vision.v1.OutputConfig outputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.OutputConfig,
            com.google.cloud.vision.v1.OutputConfig.Builder,
            com.google.cloud.vision.v1.OutputConfigOrBuilder>
        outputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     *
     * @return Whether the outputConfig field is set.
     */
    public boolean hasOutputConfig() {
      return outputConfigBuilder_ != null || outputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     *
     * @return The outputConfig.
     */
    public com.google.cloud.vision.v1.OutputConfig getOutputConfig() {
      if (outputConfigBuilder_ == null) {
        return outputConfig_ == null
            ? com.google.cloud.vision.v1.OutputConfig.getDefaultInstance()
            : outputConfig_;
      } else {
        return outputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    public Builder setOutputConfig(com.google.cloud.vision.v1.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        outputConfig_ = value;
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    public Builder setOutputConfig(
        com.google.cloud.vision.v1.OutputConfig.Builder builderForValue) {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = builderForValue.build();
        onChanged();
      } else {
        outputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    public Builder mergeOutputConfig(com.google.cloud.vision.v1.OutputConfig value) {
      if (outputConfigBuilder_ == null) {
        if (outputConfig_ != null) {
          outputConfig_ =
              com.google.cloud.vision.v1.OutputConfig.newBuilder(outputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          outputConfig_ = value;
        }
        onChanged();
      } else {
        outputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    public Builder clearOutputConfig() {
      if (outputConfigBuilder_ == null) {
        outputConfig_ = null;
        onChanged();
      } else {
        outputConfig_ = null;
        outputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    public com.google.cloud.vision.v1.OutputConfig.Builder getOutputConfigBuilder() {

      onChanged();
      return getOutputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    public com.google.cloud.vision.v1.OutputConfigOrBuilder getOutputConfigOrBuilder() {
      if (outputConfigBuilder_ != null) {
        return outputConfigBuilder_.getMessageOrBuilder();
      } else {
        return outputConfig_ == null
            ? com.google.cloud.vision.v1.OutputConfig.getDefaultInstance()
            : outputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * The output location and metadata from AsyncAnnotateFileRequest.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.OutputConfig output_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.OutputConfig,
            com.google.cloud.vision.v1.OutputConfig.Builder,
            com.google.cloud.vision.v1.OutputConfigOrBuilder>
        getOutputConfigFieldBuilder() {
      if (outputConfigBuilder_ == null) {
        outputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vision.v1.OutputConfig,
                com.google.cloud.vision.v1.OutputConfig.Builder,
                com.google.cloud.vision.v1.OutputConfigOrBuilder>(
                getOutputConfig(), getParentForChildren(), isClean());
        outputConfig_ = null;
      }
      return outputConfigBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.AsyncAnnotateFileResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.AsyncAnnotateFileResponse)
  private static final com.google.cloud.vision.v1.AsyncAnnotateFileResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.AsyncAnnotateFileResponse();
  }

  public static com.google.cloud.vision.v1.AsyncAnnotateFileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AsyncAnnotateFileResponse> PARSER =
      new com.google.protobuf.AbstractParser<AsyncAnnotateFileResponse>() {
        @java.lang.Override
        public AsyncAnnotateFileResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AsyncAnnotateFileResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AsyncAnnotateFileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AsyncAnnotateFileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1.AsyncAnnotateFileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}