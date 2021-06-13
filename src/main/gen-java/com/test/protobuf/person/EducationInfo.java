// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person/person.proto

package com.test.protobuf.person;

/**
 * Protobuf type {@code person.EducationInfo}
 */
public  final class EducationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:person.EducationInfo)
    EducationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EducationInfo.newBuilder() to construct.
  private EducationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EducationInfo() {
    school_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EducationInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EducationInfo(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            school_ = s;
            break;
          }
          case 16: {

            year_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.test.protobuf.person.PersonProto.internal_static_person_EducationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.test.protobuf.person.PersonProto.internal_static_person_EducationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.test.protobuf.person.EducationInfo.class, com.test.protobuf.person.EducationInfo.Builder.class);
  }

  public static final int SCHOOL_FIELD_NUMBER = 1;
  private volatile java.lang.Object school_;
  /**
   * <code>string school = 1;</code>
   * @return The school.
   */
  public java.lang.String getSchool() {
    java.lang.Object ref = school_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      school_ = s;
      return s;
    }
  }
  /**
   * <code>string school = 1;</code>
   * @return The bytes for school.
   */
  public com.google.protobuf.ByteString
      getSchoolBytes() {
    java.lang.Object ref = school_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      school_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int YEAR_FIELD_NUMBER = 2;
  private int year_;
  /**
   * <code>int32 year = 2;</code>
   * @return The year.
   */
  public int getYear() {
    return year_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSchoolBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, school_);
    }
    if (year_ != 0) {
      output.writeInt32(2, year_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSchoolBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, school_);
    }
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, year_);
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
    if (!(obj instanceof com.test.protobuf.person.EducationInfo)) {
      return super.equals(obj);
    }
    com.test.protobuf.person.EducationInfo other = (com.test.protobuf.person.EducationInfo) obj;

    if (!getSchool()
        .equals(other.getSchool())) return false;
    if (getYear()
        != other.getYear()) return false;
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
    hash = (37 * hash) + SCHOOL_FIELD_NUMBER;
    hash = (53 * hash) + getSchool().hashCode();
    hash = (37 * hash) + YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getYear();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.test.protobuf.person.EducationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.protobuf.person.EducationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.test.protobuf.person.EducationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.test.protobuf.person.EducationInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.test.protobuf.person.EducationInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code person.EducationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:person.EducationInfo)
      com.test.protobuf.person.EducationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.test.protobuf.person.PersonProto.internal_static_person_EducationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.test.protobuf.person.PersonProto.internal_static_person_EducationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.test.protobuf.person.EducationInfo.class, com.test.protobuf.person.EducationInfo.Builder.class);
    }

    // Construct using com.test.protobuf.person.EducationInfo.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      school_ = "";

      year_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.test.protobuf.person.PersonProto.internal_static_person_EducationInfo_descriptor;
    }

    @java.lang.Override
    public com.test.protobuf.person.EducationInfo getDefaultInstanceForType() {
      return com.test.protobuf.person.EducationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.test.protobuf.person.EducationInfo build() {
      com.test.protobuf.person.EducationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.test.protobuf.person.EducationInfo buildPartial() {
      com.test.protobuf.person.EducationInfo result = new com.test.protobuf.person.EducationInfo(this);
      result.school_ = school_;
      result.year_ = year_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.test.protobuf.person.EducationInfo) {
        return mergeFrom((com.test.protobuf.person.EducationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.test.protobuf.person.EducationInfo other) {
      if (other == com.test.protobuf.person.EducationInfo.getDefaultInstance()) return this;
      if (!other.getSchool().isEmpty()) {
        school_ = other.school_;
        onChanged();
      }
      if (other.getYear() != 0) {
        setYear(other.getYear());
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
      com.test.protobuf.person.EducationInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.test.protobuf.person.EducationInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object school_ = "";
    /**
     * <code>string school = 1;</code>
     * @return The school.
     */
    public java.lang.String getSchool() {
      java.lang.Object ref = school_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        school_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string school = 1;</code>
     * @return The bytes for school.
     */
    public com.google.protobuf.ByteString
        getSchoolBytes() {
      java.lang.Object ref = school_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        school_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string school = 1;</code>
     * @param value The school to set.
     * @return This builder for chaining.
     */
    public Builder setSchool(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      school_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string school = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSchool() {
      
      school_ = getDefaultInstance().getSchool();
      onChanged();
      return this;
    }
    /**
     * <code>string school = 1;</code>
     * @param value The bytes for school to set.
     * @return This builder for chaining.
     */
    public Builder setSchoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      school_ = value;
      onChanged();
      return this;
    }

    private int year_ ;
    /**
     * <code>int32 year = 2;</code>
     * @return The year.
     */
    public int getYear() {
      return year_;
    }
    /**
     * <code>int32 year = 2;</code>
     * @param value The year to set.
     * @return This builder for chaining.
     */
    public Builder setYear(int value) {
      
      year_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 year = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearYear() {
      
      year_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:person.EducationInfo)
  }

  // @@protoc_insertion_point(class_scope:person.EducationInfo)
  private static final com.test.protobuf.person.EducationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.test.protobuf.person.EducationInfo();
  }

  public static com.test.protobuf.person.EducationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EducationInfo>
      PARSER = new com.google.protobuf.AbstractParser<EducationInfo>() {
    @java.lang.Override
    public EducationInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EducationInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EducationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EducationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.test.protobuf.person.EducationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

