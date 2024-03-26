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
import com.konfigthis.client.model.SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel;
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
 * SkillsGetUserAssignedSkillsResponseDataInnerSkillModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillsGetUserAssignedSkillsResponseDataInnerSkillModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SKILL_ID = "skillId";
  @SerializedName(SERIALIZED_NAME_SKILL_ID)
  private String skillId;

  public static final String SERIALIZED_NAME_SKILL_CODE = "skillCode";
  @SerializedName(SERIALIZED_NAME_SKILL_CODE)
  private String skillCode;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public static final String SERIALIZED_NAME_SKILL_TYPE_MODEL = "skillTypeModel";
  @SerializedName(SERIALIZED_NAME_SKILL_TYPE_MODEL)
  private String skillTypeModel;

  public static final String SERIALIZED_NAME_ASSESSMENT_MODEL = "assessmentModel";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_MODEL)
  private SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel assessmentModel;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_SKILL_TYPE_NAME = "skillTypeName";
  @SerializedName(SERIALIZED_NAME_SKILL_TYPE_NAME)
  private String skillTypeName;

  public static final String SERIALIZED_NAME_USER_SKILL_LEVEL = "userSkillLevel";
  @SerializedName(SERIALIZED_NAME_USER_SKILL_LEVEL)
  private String userSkillLevel;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATE_USER_ID = "createUserId";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_ID)
  private String createUserId;

  public static final String SERIALIZED_NAME_CREATETS = "createts";
  @SerializedName(SERIALIZED_NAME_CREATETS)
  private String createts;

  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel() {
  }

  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel description(String description) {
    
    
    
    
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


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillId(String skillId) {
    
    
    
    
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


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillCode(String skillCode) {
    
    
    
    
    this.skillCode = skillCode;
    return this;
  }

   /**
   * Get skillCode
   * @return skillCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSkillCode() {
    return skillCode;
  }


  public void setSkillCode(String skillCode) {
    
    
    
    this.skillCode = skillCode;
  }


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel cid(String cid) {
    
    
    
    
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


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillTypeModel(String skillTypeModel) {
    
    
    
    
    this.skillTypeModel = skillTypeModel;
    return this;
  }

   /**
   * Get skillTypeModel
   * @return skillTypeModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSkillTypeModel() {
    return skillTypeModel;
  }


  public void setSkillTypeModel(String skillTypeModel) {
    
    
    
    this.skillTypeModel = skillTypeModel;
  }


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel assessmentModel(SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel assessmentModel) {
    
    
    
    
    this.assessmentModel = assessmentModel;
    return this;
  }

   /**
   * Get assessmentModel
   * @return assessmentModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel getAssessmentModel() {
    return assessmentModel;
  }


  public void setAssessmentModel(SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel assessmentModel) {
    
    
    
    this.assessmentModel = assessmentModel;
  }


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel sequence(String sequence) {
    
    
    
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getSequence() {
    return sequence;
  }


  public void setSequence(String sequence) {
    
    
    
    this.sequence = sequence;
  }


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillTypeName(String skillTypeName) {
    
    
    
    
    this.skillTypeName = skillTypeName;
    return this;
  }

   /**
   * Get skillTypeName
   * @return skillTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSkillTypeName() {
    return skillTypeName;
  }


  public void setSkillTypeName(String skillTypeName) {
    
    
    
    this.skillTypeName = skillTypeName;
  }


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel userSkillLevel(String userSkillLevel) {
    
    
    
    
    this.userSkillLevel = userSkillLevel;
    return this;
  }

   /**
   * Get userSkillLevel
   * @return userSkillLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getUserSkillLevel() {
    return userSkillLevel;
  }


  public void setUserSkillLevel(String userSkillLevel) {
    
    
    
    this.userSkillLevel = userSkillLevel;
  }


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel status(String status) {
    
    
    
    
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


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel createUserId(String createUserId) {
    
    
    
    
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


  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel createts(String createts) {
    
    
    
    
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
   * @return the SkillsGetUserAssignedSkillsResponseDataInnerSkillModel instance itself
   */
  public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel putAdditionalProperty(String key, Object value) {
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
    SkillsGetUserAssignedSkillsResponseDataInnerSkillModel skillsGetUserAssignedSkillsResponseDataInnerSkillModel = (SkillsGetUserAssignedSkillsResponseDataInnerSkillModel) o;
    return Objects.equals(this.description, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.description) &&
        Objects.equals(this.skillId, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.skillId) &&
        Objects.equals(this.skillCode, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.skillCode) &&
        Objects.equals(this.cid, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.cid) &&
        Objects.equals(this.skillTypeModel, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.skillTypeModel) &&
        Objects.equals(this.assessmentModel, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.assessmentModel) &&
        Objects.equals(this.sequence, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.sequence) &&
        Objects.equals(this.skillTypeName, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.skillTypeName) &&
        Objects.equals(this.userSkillLevel, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.userSkillLevel) &&
        Objects.equals(this.status, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.status) &&
        Objects.equals(this.createUserId, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.createUserId) &&
        Objects.equals(this.createts, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.createts)&&
        Objects.equals(this.additionalProperties, skillsGetUserAssignedSkillsResponseDataInnerSkillModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, skillId, skillCode, cid, skillTypeModel, assessmentModel, sequence, skillTypeName, userSkillLevel, status, createUserId, createts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsGetUserAssignedSkillsResponseDataInnerSkillModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillCode: ").append(toIndentedString(skillCode)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    skillTypeModel: ").append(toIndentedString(skillTypeModel)).append("\n");
    sb.append("    assessmentModel: ").append(toIndentedString(assessmentModel)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    skillTypeName: ").append(toIndentedString(skillTypeName)).append("\n");
    sb.append("    userSkillLevel: ").append(toIndentedString(userSkillLevel)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    createts: ").append(toIndentedString(createts)).append("\n");
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
    openapiFields.add("skillId");
    openapiFields.add("skillCode");
    openapiFields.add("cid");
    openapiFields.add("skillTypeModel");
    openapiFields.add("assessmentModel");
    openapiFields.add("sequence");
    openapiFields.add("skillTypeName");
    openapiFields.add("userSkillLevel");
    openapiFields.add("status");
    openapiFields.add("createUserId");
    openapiFields.add("createts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillsGetUserAssignedSkillsResponseDataInnerSkillModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillsGetUserAssignedSkillsResponseDataInnerSkillModel is not found in the empty JSON string", SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("skillId") != null && !jsonObj.get("skillId").isJsonNull()) && !jsonObj.get("skillId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillId").toString()));
      }
      if ((jsonObj.get("skillCode") != null && !jsonObj.get("skillCode").isJsonNull()) && !jsonObj.get("skillCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillCode").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
      if ((jsonObj.get("skillTypeModel") != null && !jsonObj.get("skillTypeModel").isJsonNull()) && !jsonObj.get("skillTypeModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillTypeModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillTypeModel").toString()));
      }
      // validate the optional field `assessmentModel`
      if (jsonObj.get("assessmentModel") != null && !jsonObj.get("assessmentModel").isJsonNull()) {
        SkillsGetUserAssignedSkillsResponseDataInnerSkillModelAssessmentModel.validateJsonObject(jsonObj.getAsJsonObject("assessmentModel"));
      }
      if ((jsonObj.get("sequence") != null && !jsonObj.get("sequence").isJsonNull()) && !jsonObj.get("sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sequence").toString()));
      }
      if ((jsonObj.get("skillTypeName") != null && !jsonObj.get("skillTypeName").isJsonNull()) && !jsonObj.get("skillTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillTypeName").toString()));
      }
      if ((jsonObj.get("userSkillLevel") != null && !jsonObj.get("userSkillLevel").isJsonNull()) && !jsonObj.get("userSkillLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userSkillLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userSkillLevel").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("createUserId") != null && !jsonObj.get("createUserId").isJsonNull()) && !jsonObj.get("createUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createUserId").toString()));
      }
      if ((jsonObj.get("createts") != null && !jsonObj.get("createts").isJsonNull()) && !jsonObj.get("createts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillsGetUserAssignedSkillsResponseDataInnerSkillModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillsGetUserAssignedSkillsResponseDataInnerSkillModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillsGetUserAssignedSkillsResponseDataInnerSkillModel>() {
           @Override
           public void write(JsonWriter out, SkillsGetUserAssignedSkillsResponseDataInnerSkillModel value) throws IOException {
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
           public SkillsGetUserAssignedSkillsResponseDataInnerSkillModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillsGetUserAssignedSkillsResponseDataInnerSkillModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillsGetUserAssignedSkillsResponseDataInnerSkillModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillsGetUserAssignedSkillsResponseDataInnerSkillModel
  * @throws IOException if the JSON string is invalid with respect to SkillsGetUserAssignedSkillsResponseDataInnerSkillModel
  */
  public static SkillsGetUserAssignedSkillsResponseDataInnerSkillModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillsGetUserAssignedSkillsResponseDataInnerSkillModel.class);
  }

 /**
  * Convert an instance of SkillsGetUserAssignedSkillsResponseDataInnerSkillModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

