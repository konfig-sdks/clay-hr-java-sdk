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
 * SkillViewModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillViewModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AVERAGE = "average";
  @SerializedName(SERIALIZED_NAME_AVERAGE)
  private Double average;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_SCORE_MAX = "scoreMax";
  @SerializedName(SERIALIZED_NAME_SCORE_MAX)
  private Double scoreMax;

  public static final String SERIALIZED_NAME_SCORE_NAME = "scoreName";
  @SerializedName(SERIALIZED_NAME_SCORE_NAME)
  private String scoreName;

  public static final String SERIALIZED_NAME_SCORE_TEMPLATE_ID = "scoreTemplateId";
  @SerializedName(SERIALIZED_NAME_SCORE_TEMPLATE_ID)
  private Integer scoreTemplateId;

  public static final String SERIALIZED_NAME_SKILL_CODE = "skillCode";
  @SerializedName(SERIALIZED_NAME_SKILL_CODE)
  private String skillCode;

  public static final String SERIALIZED_NAME_SKILL_ID = "skillId";
  @SerializedName(SERIALIZED_NAME_SKILL_ID)
  private Integer skillId;

  public static final String SERIALIZED_NAME_SKILL_TYPE_ID = "skillTypeId";
  @SerializedName(SERIALIZED_NAME_SKILL_TYPE_ID)
  private Integer skillTypeId;

  public static final String SERIALIZED_NAME_SKILL_TYPE_NAME = "skillTypeName";
  @SerializedName(SERIALIZED_NAME_SKILL_TYPE_NAME)
  private String skillTypeName;

  public static final String SERIALIZED_NAME_SOCRE_MIN = "socreMin";
  @SerializedName(SERIALIZED_NAME_SOCRE_MIN)
  private Double socreMin;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_USER_COUNT = "userCount";
  @SerializedName(SERIALIZED_NAME_USER_COUNT)
  private Integer userCount;

  public SkillViewModel() {
  }

  public SkillViewModel description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SkillViewModel average(Double average) {
    
    
    
    
    this.average = average;
    return this;
  }

   /**
   * Get average
   * @return average
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getAverage() {
    return average;
  }


  public void setAverage(Double average) {
    
    
    
    this.average = average;
  }


  public SkillViewModel cid(Integer cid) {
    
    
    
    
    this.cid = cid;
    return this;
  }

   /**
   * Get cid
   * @return cid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCid() {
    return cid;
  }


  public void setCid(Integer cid) {
    
    
    
    this.cid = cid;
  }


  public SkillViewModel scoreMax(Double scoreMax) {
    
    
    
    
    this.scoreMax = scoreMax;
    return this;
  }

   /**
   * Get scoreMax
   * @return scoreMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getScoreMax() {
    return scoreMax;
  }


  public void setScoreMax(Double scoreMax) {
    
    
    
    this.scoreMax = scoreMax;
  }


  public SkillViewModel scoreName(String scoreName) {
    
    
    
    
    this.scoreName = scoreName;
    return this;
  }

   /**
   * Get scoreName
   * @return scoreName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScoreName() {
    return scoreName;
  }


  public void setScoreName(String scoreName) {
    
    
    
    this.scoreName = scoreName;
  }


  public SkillViewModel scoreTemplateId(Integer scoreTemplateId) {
    
    
    
    
    this.scoreTemplateId = scoreTemplateId;
    return this;
  }

   /**
   * Get scoreTemplateId
   * @return scoreTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getScoreTemplateId() {
    return scoreTemplateId;
  }


  public void setScoreTemplateId(Integer scoreTemplateId) {
    
    
    
    this.scoreTemplateId = scoreTemplateId;
  }


  public SkillViewModel skillCode(String skillCode) {
    
    
    
    
    this.skillCode = skillCode;
    return this;
  }

   /**
   * Get skillCode
   * @return skillCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkillCode() {
    return skillCode;
  }


  public void setSkillCode(String skillCode) {
    
    
    
    this.skillCode = skillCode;
  }


  public SkillViewModel skillId(Integer skillId) {
    
    
    
    
    this.skillId = skillId;
    return this;
  }

   /**
   * Get skillId
   * @return skillId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSkillId() {
    return skillId;
  }


  public void setSkillId(Integer skillId) {
    
    
    
    this.skillId = skillId;
  }


  public SkillViewModel skillTypeId(Integer skillTypeId) {
    
    
    
    
    this.skillTypeId = skillTypeId;
    return this;
  }

   /**
   * Get skillTypeId
   * @return skillTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSkillTypeId() {
    return skillTypeId;
  }


  public void setSkillTypeId(Integer skillTypeId) {
    
    
    
    this.skillTypeId = skillTypeId;
  }


  public SkillViewModel skillTypeName(String skillTypeName) {
    
    
    
    
    this.skillTypeName = skillTypeName;
    return this;
  }

   /**
   * Get skillTypeName
   * @return skillTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSkillTypeName() {
    return skillTypeName;
  }


  public void setSkillTypeName(String skillTypeName) {
    
    
    
    this.skillTypeName = skillTypeName;
  }


  public SkillViewModel socreMin(Double socreMin) {
    
    
    
    
    this.socreMin = socreMin;
    return this;
  }

   /**
   * Get socreMin
   * @return socreMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSocreMin() {
    return socreMin;
  }


  public void setSocreMin(Double socreMin) {
    
    
    
    this.socreMin = socreMin;
  }


  public SkillViewModel status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public SkillViewModel userCount(Integer userCount) {
    
    
    
    
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserCount() {
    return userCount;
  }


  public void setUserCount(Integer userCount) {
    
    
    
    this.userCount = userCount;
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
   * @return the SkillViewModel instance itself
   */
  public SkillViewModel putAdditionalProperty(String key, Object value) {
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
    SkillViewModel skillViewModel = (SkillViewModel) o;
    return Objects.equals(this.description, skillViewModel.description) &&
        Objects.equals(this.average, skillViewModel.average) &&
        Objects.equals(this.cid, skillViewModel.cid) &&
        Objects.equals(this.scoreMax, skillViewModel.scoreMax) &&
        Objects.equals(this.scoreName, skillViewModel.scoreName) &&
        Objects.equals(this.scoreTemplateId, skillViewModel.scoreTemplateId) &&
        Objects.equals(this.skillCode, skillViewModel.skillCode) &&
        Objects.equals(this.skillId, skillViewModel.skillId) &&
        Objects.equals(this.skillTypeId, skillViewModel.skillTypeId) &&
        Objects.equals(this.skillTypeName, skillViewModel.skillTypeName) &&
        Objects.equals(this.socreMin, skillViewModel.socreMin) &&
        Objects.equals(this.status, skillViewModel.status) &&
        Objects.equals(this.userCount, skillViewModel.userCount)&&
        Objects.equals(this.additionalProperties, skillViewModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, average, cid, scoreMax, scoreName, scoreTemplateId, skillCode, skillId, skillTypeId, skillTypeName, socreMin, status, userCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillViewModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    scoreMax: ").append(toIndentedString(scoreMax)).append("\n");
    sb.append("    scoreName: ").append(toIndentedString(scoreName)).append("\n");
    sb.append("    scoreTemplateId: ").append(toIndentedString(scoreTemplateId)).append("\n");
    sb.append("    skillCode: ").append(toIndentedString(skillCode)).append("\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillTypeId: ").append(toIndentedString(skillTypeId)).append("\n");
    sb.append("    skillTypeName: ").append(toIndentedString(skillTypeName)).append("\n");
    sb.append("    socreMin: ").append(toIndentedString(socreMin)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
    openapiFields.add("average");
    openapiFields.add("cid");
    openapiFields.add("scoreMax");
    openapiFields.add("scoreName");
    openapiFields.add("scoreTemplateId");
    openapiFields.add("skillCode");
    openapiFields.add("skillId");
    openapiFields.add("skillTypeId");
    openapiFields.add("skillTypeName");
    openapiFields.add("socreMin");
    openapiFields.add("status");
    openapiFields.add("userCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillViewModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillViewModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillViewModel is not found in the empty JSON string", SkillViewModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("scoreName") != null && !jsonObj.get("scoreName").isJsonNull()) && !jsonObj.get("scoreName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreName").toString()));
      }
      if ((jsonObj.get("skillCode") != null && !jsonObj.get("skillCode").isJsonNull()) && !jsonObj.get("skillCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillCode").toString()));
      }
      if ((jsonObj.get("skillTypeName") != null && !jsonObj.get("skillTypeName").isJsonNull()) && !jsonObj.get("skillTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillTypeName").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillViewModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillViewModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillViewModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillViewModel.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillViewModel>() {
           @Override
           public void write(JsonWriter out, SkillViewModel value) throws IOException {
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
           public SkillViewModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillViewModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillViewModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillViewModel
  * @throws IOException if the JSON string is invalid with respect to SkillViewModel
  */
  public static SkillViewModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillViewModel.class);
  }

 /**
  * Convert an instance of SkillViewModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

