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
// source: google/cloud/vision/v1p1beta1/geometry.proto

package com.google.cloud.vision.v1p1beta1;

/**
 *
 *
 * <pre>
 * A 3D position in the image, used primarily for Face detection landmarks.
 * A valid Position must have both x and y coordinates.
 * The position coordinates are in the same scale as the original image.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p1beta1.Position}
 */
public final class Position extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p1beta1.Position)
    PositionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Position.newBuilder() to construct.
  private Position(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Position() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Position();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Position(
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
          case 13:
            {
              x_ = input.readFloat();
              break;
            }
          case 21:
            {
              y_ = input.readFloat();
              break;
            }
          case 29:
            {
              z_ = input.readFloat();
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
    return com.google.cloud.vision.v1p1beta1.GeometryProto
        .internal_static_google_cloud_vision_v1p1beta1_Position_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p1beta1.GeometryProto
        .internal_static_google_cloud_vision_v1p1beta1_Position_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p1beta1.Position.class,
            com.google.cloud.vision.v1p1beta1.Position.Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private float x_;
  /**
   *
   *
   * <pre>
   * X coordinate.
   * </pre>
   *
   * <code>float x = 1;</code>
   *
   * @return The x.
   */
  @java.lang.Override
  public float getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private float y_;
  /**
   *
   *
   * <pre>
   * Y coordinate.
   * </pre>
   *
   * <code>float y = 2;</code>
   *
   * @return The y.
   */
  @java.lang.Override
  public float getY() {
    return y_;
  }

  public static final int Z_FIELD_NUMBER = 3;
  private float z_;
  /**
   *
   *
   * <pre>
   * Z coordinate (or depth).
   * </pre>
   *
   * <code>float z = 3;</code>
   *
   * @return The z.
   */
  @java.lang.Override
  public float getZ() {
    return z_;
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
    if (x_ != 0F) {
      output.writeFloat(1, x_);
    }
    if (y_ != 0F) {
      output.writeFloat(2, y_);
    }
    if (z_ != 0F) {
      output.writeFloat(3, z_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (x_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, x_);
    }
    if (y_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, y_);
    }
    if (z_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, z_);
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
    if (!(obj instanceof com.google.cloud.vision.v1p1beta1.Position)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p1beta1.Position other =
        (com.google.cloud.vision.v1p1beta1.Position) obj;

    if (java.lang.Float.floatToIntBits(getX()) != java.lang.Float.floatToIntBits(other.getX()))
      return false;
    if (java.lang.Float.floatToIntBits(getY()) != java.lang.Float.floatToIntBits(other.getY()))
      return false;
    if (java.lang.Float.floatToIntBits(getZ()) != java.lang.Float.floatToIntBits(other.getZ()))
      return false;
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
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getX());
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getY());
    hash = (37 * hash) + Z_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getZ());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p1beta1.Position parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vision.v1p1beta1.Position prototype) {
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
   * A 3D position in the image, used primarily for Face detection landmarks.
   * A valid Position must have both x and y coordinates.
   * The position coordinates are in the same scale as the original image.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p1beta1.Position}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p1beta1.Position)
      com.google.cloud.vision.v1p1beta1.PositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p1beta1.GeometryProto
          .internal_static_google_cloud_vision_v1p1beta1_Position_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p1beta1.GeometryProto
          .internal_static_google_cloud_vision_v1p1beta1_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p1beta1.Position.class,
              com.google.cloud.vision.v1p1beta1.Position.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p1beta1.Position.newBuilder()
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
      x_ = 0F;

      y_ = 0F;

      z_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p1beta1.GeometryProto
          .internal_static_google_cloud_vision_v1p1beta1_Position_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.Position getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p1beta1.Position.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.Position build() {
      com.google.cloud.vision.v1p1beta1.Position result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p1beta1.Position buildPartial() {
      com.google.cloud.vision.v1p1beta1.Position result =
          new com.google.cloud.vision.v1p1beta1.Position(this);
      result.x_ = x_;
      result.y_ = y_;
      result.z_ = z_;
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
      if (other instanceof com.google.cloud.vision.v1p1beta1.Position) {
        return mergeFrom((com.google.cloud.vision.v1p1beta1.Position) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p1beta1.Position other) {
      if (other == com.google.cloud.vision.v1p1beta1.Position.getDefaultInstance()) return this;
      if (other.getX() != 0F) {
        setX(other.getX());
      }
      if (other.getY() != 0F) {
        setY(other.getY());
      }
      if (other.getZ() != 0F) {
        setZ(other.getZ());
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
      com.google.cloud.vision.v1p1beta1.Position parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p1beta1.Position) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float x_;
    /**
     *
     *
     * <pre>
     * X coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @return The x.
     */
    @java.lang.Override
    public float getX() {
      return x_;
    }
    /**
     *
     *
     * <pre>
     * X coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(float value) {

      x_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * X coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearX() {

      x_ = 0F;
      onChanged();
      return this;
    }

    private float y_;
    /**
     *
     *
     * <pre>
     * Y coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @return The y.
     */
    @java.lang.Override
    public float getY() {
      return y_;
    }
    /**
     *
     *
     * <pre>
     * Y coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(float value) {

      y_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Y coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearY() {

      y_ = 0F;
      onChanged();
      return this;
    }

    private float z_;
    /**
     *
     *
     * <pre>
     * Z coordinate (or depth).
     * </pre>
     *
     * <code>float z = 3;</code>
     *
     * @return The z.
     */
    @java.lang.Override
    public float getZ() {
      return z_;
    }
    /**
     *
     *
     * <pre>
     * Z coordinate (or depth).
     * </pre>
     *
     * <code>float z = 3;</code>
     *
     * @param value The z to set.
     * @return This builder for chaining.
     */
    public Builder setZ(float value) {

      z_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Z coordinate (or depth).
     * </pre>
     *
     * <code>float z = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZ() {

      z_ = 0F;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p1beta1.Position)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p1beta1.Position)
  private static final com.google.cloud.vision.v1p1beta1.Position DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p1beta1.Position();
  }

  public static com.google.cloud.vision.v1p1beta1.Position getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Position> PARSER =
      new com.google.protobuf.AbstractParser<Position>() {
        @java.lang.Override
        public Position parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Position(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Position> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Position> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p1beta1.Position getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}