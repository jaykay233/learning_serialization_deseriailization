// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person/person.proto

package com.test.protobuf.person;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:person.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>double height = 3;</code>
   * @return The height.
   */
  double getHeight();

  /**
   * <code>.person.Gender gender = 4;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.person.Gender gender = 4;</code>
   * @return The gender.
   */
  com.test.protobuf.common.Gender getGender();

  /**
   * <code>repeated .person.EducationInfo edu_infos = 5;</code>
   */
  java.util.List<com.test.protobuf.person.EducationInfo> 
      getEduInfosList();
  /**
   * <code>repeated .person.EducationInfo edu_infos = 5;</code>
   */
  com.test.protobuf.person.EducationInfo getEduInfos(int index);
  /**
   * <code>repeated .person.EducationInfo edu_infos = 5;</code>
   */
  int getEduInfosCount();
  /**
   * <code>repeated .person.EducationInfo edu_infos = 5;</code>
   */
  java.util.List<? extends com.test.protobuf.person.EducationInfoOrBuilder> 
      getEduInfosOrBuilderList();
  /**
   * <code>repeated .person.EducationInfo edu_infos = 5;</code>
   */
  com.test.protobuf.person.EducationInfoOrBuilder getEduInfosOrBuilder(
      int index);

  /**
   * <code>map&lt;string, string&gt; friend_infos = 6;</code>
   */
  int getFriendInfosCount();
  /**
   * <code>map&lt;string, string&gt; friend_infos = 6;</code>
   */
  boolean containsFriendInfos(
      java.lang.String key);
  /**
   * Use {@link #getFriendInfosMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getFriendInfos();
  /**
   * <code>map&lt;string, string&gt; friend_infos = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getFriendInfosMap();
  /**
   * <code>map&lt;string, string&gt; friend_infos = 6;</code>
   */

  java.lang.String getFriendInfosOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; friend_infos = 6;</code>
   */

  java.lang.String getFriendInfosOrThrow(
      java.lang.String key);
}