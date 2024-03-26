/*
 * Expense Reports
 * API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.SkillsGetUserAssignedSkillsResponseDataInnerSkillModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * SkillsGetUserAssignedSkillsResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillsGetUserAssignedSkillsResponseDataInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SKILL_USER_ID = "skillUserId";
  @SerializedName(SERIALIZED_NAME_SKILL_USER_ID)
  private String skillUserId;

  public static final String SERIALIZED_NAME_SKILL_ID = "skillId";
  @SerializedName(SERIALIZED_NAME_SKILL_ID)
  private String skillId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public static final String SERIALIZED_NAME_LAST_UPDATE_USER_MODEL = "lastUpdateUserModel";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_USER_MODEL)
  private String lastUpdateUserModel;

  public static final String SERIALIZED_NAME_CREATE_USER_ID = "createUserId";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_ID)
  private String createUserId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATETS = "createts";
  @SerializedName(SERIALIZED_NAME_CREATETS)
  private String createts;

  public static final String SERIALIZED_NAME_PERFORMANCELEVEL = "performancelevel";
  @SerializedName(SERIALIZED_NAME_PERFORMANCELEVEL)
  private String performancelevel;

  public static final String SERIALIZED_NAME_CANDIDATEID = "candidateid";
  @SerializedName(SERIALIZED_NAME_CANDIDATEID)
  private String candidateid;

  public static final String SERIALIZED_NAME_WEIGHTAGE = "weightage";
  @SerializedName(SERIALIZED_NAME_WEIGHTAGE)
  private String weightage;

  public static final String SERIALIZED_NAME_TARGET_LEVEL = "targetLevel";
  @SerializedName(SERIALIZED_NAME_TARGET_LEVEL)
  private String targetLevel;

  public static final String SERIALIZED_NAME_TARGET_LEVEL_CREATETS = "targetLevelCreatets";
  @SerializedName(SERIALIZED_NAME_TARGET_LEVEL_CREATETS)
  private String targetLevelCreatets;

  public static final String SERIALIZED_NAME_TARGET_LEVEL_CREATE_USER_ID = "targetLevelCreateUserId";
  @SerializedName(SERIALIZED_NAME_TARGET_LEVEL_CREATE_USER_ID)
  private String targetLevelCreateUserId;

  public static final String SERIALIZED_NAME_SKILL_COUNSELLOR = "skillCounsellor";
  @SerializedName(SERIALIZED_NAME_SKILL_COUNSELLOR)
  private String skillCounsellor;

  public static final String SERIALIZED_NAME_YEARS_OF_EXPERIENCE = "yearsOfExperience";
  @SerializedName(SERIALIZED_NAME_YEARS_OF_EXPERIENCE)
  private String yearsOfExperience;

  public static final String SERIALIZED_NAME_DATE_OF_LAST_USE = "dateOfLastUse";
  @SerializedName(SERIALIZED_NAME_DATE_OF_LAST_USE)
  private String dateOfLastUse;

  public static final String SERIALIZED_NAME_SKILL_ACQUIRE_DATE = "skillAcquireDate";
  @SerializedName(SERIALIZED_NAME_SKILL_ACQUIRE_DATE)
  private String skillAcquireDate;

  public static final String SERIALIZED_NAME_SKILL_MODEL = "skillModel";
  @SerializedName(SERIALIZED_NAME_SKILL_MODEL)
  private SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillModel;

  public SkillsGetUserAssignedSkillsResponseDataInner() {
  }

  public SkillsGetUserAssignedSkillsResponseDataInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner skillUserId(String skillUserId) {
    
    
    
    
    this.skillUserId = skillUserId;
    return this;
  }

   /**
   * Get skillUserId
   * @return skillUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getSkillUserId() {
    return skillUserId;
  }


  public void setSkillUserId(String skillUserId) {
    
    
    
    this.skillUserId = skillUserId;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner skillId(String skillId) {
    
    
    
    
    this.skillId = skillId;
    return this;
  }

   /**
   * Get skillId
   * @return skillId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getSkillId() {
    return skillId;
  }


  public void setSkillId(String skillId) {
    
    
    
    this.skillId = skillId;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner level(String level) {
    
    
    
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    
    
    
    this.level = level;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner cid(String cid) {
    
    
    
    
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getCid() {
    return cid;
  }


  public void setCid(String cid) {
    
    
    
    this.cid = cid;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner lastUpdateUserModel(String lastUpdateUserModel) {
    
    
    
    
    this.lastUpdateUserModel = lastUpdateUserModel;
    return this;
  }

   /**
   * Get lastUpdateUserModel
   * @return lastUpdateUserModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getLastUpdateUserModel() {
    return lastUpdateUserModel;
  }


  public void setLastUpdateUserModel(String lastUpdateUserModel) {
    
    
    
    this.lastUpdateUserModel = lastUpdateUserModel;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner createUserId(String createUserId) {
    
    
    
    
    this.createUserId = createUserId;
    return this;
  }

   /**
   * Get createUserId
   * @return createUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getCreateUserId() {
    return createUserId;
  }


  public void setCreateUserId(String createUserId) {
    
    
    
    this.createUserId = createUserId;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner createts(String createts) {
    
    
    
    
    this.createts = createts;
    return this;
  }

   /**
   * Get createts
   * @return createts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getCreatets() {
    return createts;
  }


  public void setCreatets(String createts) {
    
    
    
    this.createts = createts;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner performancelevel(String performancelevel) {
    
    
    
    
    this.performancelevel = performancelevel;
    return this;
  }

   /**
   * Get performancelevel
   * @return performancelevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getPerformancelevel() {
    return performancelevel;
  }


  public void setPerformancelevel(String performancelevel) {
    
    
    
    this.performancelevel = performancelevel;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner candidateid(String candidateid) {
    
    
    
    
    this.candidateid = candidateid;
    return this;
  }

   /**
   * Get candidateid
   * @return candidateid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getCandidateid() {
    return candidateid;
  }


  public void setCandidateid(String candidateid) {
    
    
    
    this.candidateid = candidateid;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner weightage(String weightage) {
    
    
    
    
    this.weightage = weightage;
    return this;
  }

   /**
   * Get weightage
   * @return weightage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getWeightage() {
    return weightage;
  }


  public void setWeightage(String weightage) {
    
    
    
    this.weightage = weightage;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner targetLevel(String targetLevel) {
    
    
    
    
    this.targetLevel = targetLevel;
    return this;
  }

   /**
   * Get targetLevel
   * @return targetLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getTargetLevel() {
    return targetLevel;
  }


  public void setTargetLevel(String targetLevel) {
    
    
    
    this.targetLevel = targetLevel;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner targetLevelCreatets(String targetLevelCreatets) {
    
    
    
    
    this.targetLevelCreatets = targetLevelCreatets;
    return this;
  }

   /**
   * Get targetLevelCreatets
   * @return targetLevelCreatets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getTargetLevelCreatets() {
    return targetLevelCreatets;
  }


  public void setTargetLevelCreatets(String targetLevelCreatets) {
    
    
    
    this.targetLevelCreatets = targetLevelCreatets;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner targetLevelCreateUserId(String targetLevelCreateUserId) {
    
    
    
    
    this.targetLevelCreateUserId = targetLevelCreateUserId;
    return this;
  }

   /**
   * Get targetLevelCreateUserId
   * @return targetLevelCreateUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getTargetLevelCreateUserId() {
    return targetLevelCreateUserId;
  }


  public void setTargetLevelCreateUserId(String targetLevelCreateUserId) {
    
    
    
    this.targetLevelCreateUserId = targetLevelCreateUserId;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner skillCounsellor(String skillCounsellor) {
    
    
    
    
    this.skillCounsellor = skillCounsellor;
    return this;
  }

   /**
   * Get skillCounsellor
   * @return skillCounsellor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSkillCounsellor() {
    return skillCounsellor;
  }


  public void setSkillCounsellor(String skillCounsellor) {
    
    
    
    this.skillCounsellor = skillCounsellor;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner yearsOfExperience(String yearsOfExperience) {
    
    
    
    
    this.yearsOfExperience = yearsOfExperience;
    return this;
  }

   /**
   * Get yearsOfExperience
   * @return yearsOfExperience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getYearsOfExperience() {
    return yearsOfExperience;
  }


  public void setYearsOfExperience(String yearsOfExperience) {
    
    
    
    this.yearsOfExperience = yearsOfExperience;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner dateOfLastUse(String dateOfLastUse) {
    
    
    
    
    this.dateOfLastUse = dateOfLastUse;
    return this;
  }

   /**
   * Get dateOfLastUse
   * @return dateOfLastUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getDateOfLastUse() {
    return dateOfLastUse;
  }


  public void setDateOfLastUse(String dateOfLastUse) {
    
    
    
    this.dateOfLastUse = dateOfLastUse;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner skillAcquireDate(String skillAcquireDate) {
    
    
    
    
    this.skillAcquireDate = skillAcquireDate;
    return this;
  }

   /**
   * Get skillAcquireDate
   * @return skillAcquireDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getSkillAcquireDate() {
    return skillAcquireDate;
  }


  public void setSkillAcquireDate(String skillAcquireDate) {
    
    
    
    this.skillAcquireDate = skillAcquireDate;
  }


  public SkillsGetUserAssignedSkillsResponseDataInner skillModel(SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillModel) {
    
    
    
    
    this.skillModel = skillModel;
    return this;
  }

   /**
   * Get skillModel
   * @return skillModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel getSkillModel() {
    return skillModel;
  }


  public void setSkillModel(SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillModel) {
    
    
    
    this.skillModel = skillModel;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SkillsGetUserAssignedSkillsResponseDataInner instance itself
   */
  public SkillsGetUserAssignedSkillsResponseDataInner putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillsGetUserAssignedSkillsResponseDataInner skillsGetUserAssignedSkillsResponseDataInner = (SkillsGetUserAssignedSkillsResponseDataInner) o;
    return Objects.equals(this.description, skillsGetUserAssignedSkillsResponseDataInner.description) &&
        Objects.equals(this.skillUserId, skillsGetUserAssignedSkillsResponseDataInner.skillUserId) &&
        Objects.equals(this.skillId, skillsGetUserAssignedSkillsResponseDataInner.skillId) &&
        Objects.equals(this.userId, skillsGetUserAssignedSkillsResponseDataInner.userId) &&
        Objects.equals(this.level, skillsGetUserAssignedSkillsResponseDataInner.level) &&
        Objects.equals(this.cid, skillsGetUserAssignedSkillsResponseDataInner.cid) &&
        Objects.equals(this.lastUpdateUserModel, skillsGetUserAssignedSkillsResponseDataInner.lastUpdateUserModel) &&
        Objects.equals(this.createUserId, skillsGetUserAssignedSkillsResponseDataInner.createUserId) &&
        Objects.equals(this.status, skillsGetUserAssignedSkillsResponseDataInner.status) &&
        Objects.equals(this.createts, skillsGetUserAssignedSkillsResponseDataInner.createts) &&
        Objects.equals(this.performancelevel, skillsGetUserAssignedSkillsResponseDataInner.performancelevel) &&
        Objects.equals(this.candidateid, skillsGetUserAssignedSkillsResponseDataInner.candidateid) &&
        Objects.equals(this.weightage, skillsGetUserAssignedSkillsResponseDataInner.weightage) &&
        Objects.equals(this.targetLevel, skillsGetUserAssignedSkillsResponseDataInner.targetLevel) &&
        Objects.equals(this.targetLevelCreatets, skillsGetUserAssignedSkillsResponseDataInner.targetLevelCreatets) &&
        Objects.equals(this.targetLevelCreateUserId, skillsGetUserAssignedSkillsResponseDataInner.targetLevelCreateUserId) &&
        Objects.equals(this.skillCounsellor, skillsGetUserAssignedSkillsResponseDataInner.skillCounsellor) &&
        Objects.equals(this.yearsOfExperience, skillsGetUserAssignedSkillsResponseDataInner.yearsOfExperience) &&
        Objects.equals(this.dateOfLastUse, skillsGetUserAssignedSkillsResponseDataInner.dateOfLastUse) &&
        Objects.equals(this.skillAcquireDate, skillsGetUserAssignedSkillsResponseDataInner.skillAcquireDate) &&
        Objects.equals(this.skillModel, skillsGetUserAssignedSkillsResponseDataInner.skillModel)&&
        Objects.equals(this.additionalProperties, skillsGetUserAssignedSkillsResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, skillUserId, skillId, userId, level, cid, lastUpdateUserModel, createUserId, status, createts, performancelevel, candidateid, weightage, targetLevel, targetLevelCreatets, targetLevelCreateUserId, skillCounsellor, yearsOfExperience, dateOfLastUse, skillAcquireDate, skillModel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsGetUserAssignedSkillsResponseDataInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skillUserId: ").append(toIndentedString(skillUserId)).append("\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    lastUpdateUserModel: ").append(toIndentedString(lastUpdateUserModel)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createts: ").append(toIndentedString(createts)).append("\n");
    sb.append("    performancelevel: ").append(toIndentedString(performancelevel)).append("\n");
    sb.append("    candidateid: ").append(toIndentedString(candidateid)).append("\n");
    sb.append("    weightage: ").append(toIndentedString(weightage)).append("\n");
    sb.append("    targetLevel: ").append(toIndentedString(targetLevel)).append("\n");
    sb.append("    targetLevelCreatets: ").append(toIndentedString(targetLevelCreatets)).append("\n");
    sb.append("    targetLevelCreateUserId: ").append(toIndentedString(targetLevelCreateUserId)).append("\n");
    sb.append("    skillCounsellor: ").append(toIndentedString(skillCounsellor)).append("\n");
    sb.append("    yearsOfExperience: ").append(toIndentedString(yearsOfExperience)).append("\n");
    sb.append("    dateOfLastUse: ").append(toIndentedString(dateOfLastUse)).append("\n");
    sb.append("    skillAcquireDate: ").append(toIndentedString(skillAcquireDate)).append("\n");
    sb.append("    skillModel: ").append(toIndentedString(skillModel)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("skillUserId");
    openapiFields.add("skillId");
    openapiFields.add("userId");
    openapiFields.add("level");
    openapiFields.add("cid");
    openapiFields.add("lastUpdateUserModel");
    openapiFields.add("createUserId");
    openapiFields.add("status");
    openapiFields.add("createts");
    openapiFields.add("performancelevel");
    openapiFields.add("candidateid");
    openapiFields.add("weightage");
    openapiFields.add("targetLevel");
    openapiFields.add("targetLevelCreatets");
    openapiFields.add("targetLevelCreateUserId");
    openapiFields.add("skillCounsellor");
    openapiFields.add("yearsOfExperience");
    openapiFields.add("dateOfLastUse");
    openapiFields.add("skillAcquireDate");
    openapiFields.add("skillModel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillsGetUserAssignedSkillsResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillsGetUserAssignedSkillsResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillsGetUserAssignedSkillsResponseDataInner is not found in the empty JSON string", SkillsGetUserAssignedSkillsResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("skillUserId") != null && !jsonObj.get("skillUserId").isJsonNull()) && !jsonObj.get("skillUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillUserId").toString()));
      }
      if ((jsonObj.get("skillId") != null && !jsonObj.get("skillId").isJsonNull()) && !jsonObj.get("skillId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillId").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
      if ((jsonObj.get("lastUpdateUserModel") != null && !jsonObj.get("lastUpdateUserModel").isJsonNull()) && !jsonObj.get("lastUpdateUserModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdateUserModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdateUserModel").toString()));
      }
      if ((jsonObj.get("createUserId") != null && !jsonObj.get("createUserId").isJsonNull()) && !jsonObj.get("createUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createUserId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("createts") != null && !jsonObj.get("createts").isJsonNull()) && !jsonObj.get("createts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createts").toString()));
      }
      if ((jsonObj.get("performancelevel") != null && !jsonObj.get("performancelevel").isJsonNull()) && !jsonObj.get("performancelevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `performancelevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("performancelevel").toString()));
      }
      if ((jsonObj.get("candidateid") != null && !jsonObj.get("candidateid").isJsonNull()) && !jsonObj.get("candidateid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `candidateid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("candidateid").toString()));
      }
      if ((jsonObj.get("weightage") != null && !jsonObj.get("weightage").isJsonNull()) && !jsonObj.get("weightage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weightage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weightage").toString()));
      }
      if ((jsonObj.get("targetLevel") != null && !jsonObj.get("targetLevel").isJsonNull()) && !jsonObj.get("targetLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetLevel").toString()));
      }
      if ((jsonObj.get("targetLevelCreatets") != null && !jsonObj.get("targetLevelCreatets").isJsonNull()) && !jsonObj.get("targetLevelCreatets").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetLevelCreatets` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetLevelCreatets").toString()));
      }
      if ((jsonObj.get("targetLevelCreateUserId") != null && !jsonObj.get("targetLevelCreateUserId").isJsonNull()) && !jsonObj.get("targetLevelCreateUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `targetLevelCreateUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("targetLevelCreateUserId").toString()));
      }
      if ((jsonObj.get("skillCounsellor") != null && !jsonObj.get("skillCounsellor").isJsonNull()) && !jsonObj.get("skillCounsellor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillCounsellor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillCounsellor").toString()));
      }
      if ((jsonObj.get("yearsOfExperience") != null && !jsonObj.get("yearsOfExperience").isJsonNull()) && !jsonObj.get("yearsOfExperience").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `yearsOfExperience` to be a primitive type in the JSON string but got `%s`", jsonObj.get("yearsOfExperience").toString()));
      }
      if ((jsonObj.get("dateOfLastUse") != null && !jsonObj.get("dateOfLastUse").isJsonNull()) && !jsonObj.get("dateOfLastUse").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfLastUse` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfLastUse").toString()));
      }
      if ((jsonObj.get("skillAcquireDate") != null && !jsonObj.get("skillAcquireDate").isJsonNull()) && !jsonObj.get("skillAcquireDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillAcquireDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillAcquireDate").toString()));
      }
      // validate the optional field `skillModel`
      if (jsonObj.get("skillModel") != null && !jsonObj.get("skillModel").isJsonNull()) {
        SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.validateJsonObject(jsonObj.getAsJsonObject("skillModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillsGetUserAssignedSkillsResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillsGetUserAssignedSkillsResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillsGetUserAssignedSkillsResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillsGetUserAssignedSkillsResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillsGetUserAssignedSkillsResponseDataInner>() {
           @Override
           public void write(JsonWriter out, SkillsGetUserAssignedSkillsResponseDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SkillsGetUserAssignedSkillsResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillsGetUserAssignedSkillsResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SkillsGetUserAssignedSkillsResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillsGetUserAssignedSkillsResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to SkillsGetUserAssignedSkillsResponseDataInner
  */
  public static SkillsGetUserAssignedSkillsResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillsGetUserAssignedSkillsResponseDataInner.class);
  }

 /**
  * Convert an instance of SkillsGetUserAssignedSkillsResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
