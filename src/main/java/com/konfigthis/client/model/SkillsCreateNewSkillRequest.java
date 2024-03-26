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
import com.konfigthis.client.model.SkillsCreateNewSkillRequestAssessmentModel;
import com.konfigthis.client.model.SkillsCreateNewSkillRequestSkillTypeModel;
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
 * SkillsCreateNewSkillRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillsCreateNewSkillRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SKILL_CODE = "skillCode";
  @SerializedName(SERIALIZED_NAME_SKILL_CODE)
  private String skillCode;

  public static final String SERIALIZED_NAME_ASSESSMENT_MODEL = "assessmentModel";
  @SerializedName(SERIALIZED_NAME_ASSESSMENT_MODEL)
  private SkillsCreateNewSkillRequestAssessmentModel assessmentModel;

  public static final String SERIALIZED_NAME_SKILL_TYPE_MODEL = "skillTypeModel";
  @SerializedName(SERIALIZED_NAME_SKILL_TYPE_MODEL)
  private SkillsCreateNewSkillRequestSkillTypeModel skillTypeModel;

  public SkillsCreateNewSkillRequest() {
  }

  public SkillsCreateNewSkillRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Description of the skill.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Description of the skill.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public SkillsCreateNewSkillRequest skillCode(String skillCode) {
    
    
    
    
    this.skillCode = skillCode;
    return this;
  }

   /**
   * The title of the skill.
   * @return skillCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The title of the skill.")

  public String getSkillCode() {
    return skillCode;
  }


  public void setSkillCode(String skillCode) {
    
    
    
    this.skillCode = skillCode;
  }


  public SkillsCreateNewSkillRequest assessmentModel(SkillsCreateNewSkillRequestAssessmentModel assessmentModel) {
    
    
    
    
    this.assessmentModel = assessmentModel;
    return this;
  }

   /**
   * Get assessmentModel
   * @return assessmentModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkillsCreateNewSkillRequestAssessmentModel getAssessmentModel() {
    return assessmentModel;
  }


  public void setAssessmentModel(SkillsCreateNewSkillRequestAssessmentModel assessmentModel) {
    
    
    
    this.assessmentModel = assessmentModel;
  }


  public SkillsCreateNewSkillRequest skillTypeModel(SkillsCreateNewSkillRequestSkillTypeModel skillTypeModel) {
    
    
    
    
    this.skillTypeModel = skillTypeModel;
    return this;
  }

   /**
   * Get skillTypeModel
   * @return skillTypeModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkillsCreateNewSkillRequestSkillTypeModel getSkillTypeModel() {
    return skillTypeModel;
  }


  public void setSkillTypeModel(SkillsCreateNewSkillRequestSkillTypeModel skillTypeModel) {
    
    
    
    this.skillTypeModel = skillTypeModel;
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
   * @return the SkillsCreateNewSkillRequest instance itself
   */
  public SkillsCreateNewSkillRequest putAdditionalProperty(String key, Object value) {
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
    SkillsCreateNewSkillRequest skillsCreateNewSkillRequest = (SkillsCreateNewSkillRequest) o;
    return Objects.equals(this.description, skillsCreateNewSkillRequest.description) &&
        Objects.equals(this.skillCode, skillsCreateNewSkillRequest.skillCode) &&
        Objects.equals(this.assessmentModel, skillsCreateNewSkillRequest.assessmentModel) &&
        Objects.equals(this.skillTypeModel, skillsCreateNewSkillRequest.skillTypeModel)&&
        Objects.equals(this.additionalProperties, skillsCreateNewSkillRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, skillCode, assessmentModel, skillTypeModel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsCreateNewSkillRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    skillCode: ").append(toIndentedString(skillCode)).append("\n");
    sb.append("    assessmentModel: ").append(toIndentedString(assessmentModel)).append("\n");
    sb.append("    skillTypeModel: ").append(toIndentedString(skillTypeModel)).append("\n");
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
    openapiFields.add("skillCode");
    openapiFields.add("assessmentModel");
    openapiFields.add("skillTypeModel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("skillCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillsCreateNewSkillRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillsCreateNewSkillRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillsCreateNewSkillRequest is not found in the empty JSON string", SkillsCreateNewSkillRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SkillsCreateNewSkillRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("skillCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillCode").toString()));
      }
      // validate the optional field `assessmentModel`
      if (jsonObj.get("assessmentModel") != null && !jsonObj.get("assessmentModel").isJsonNull()) {
        SkillsCreateNewSkillRequestAssessmentModel.validateJsonObject(jsonObj.getAsJsonObject("assessmentModel"));
      }
      // validate the optional field `skillTypeModel`
      if (jsonObj.get("skillTypeModel") != null && !jsonObj.get("skillTypeModel").isJsonNull()) {
        SkillsCreateNewSkillRequestSkillTypeModel.validateJsonObject(jsonObj.getAsJsonObject("skillTypeModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillsCreateNewSkillRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillsCreateNewSkillRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillsCreateNewSkillRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillsCreateNewSkillRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillsCreateNewSkillRequest>() {
           @Override
           public void write(JsonWriter out, SkillsCreateNewSkillRequest value) throws IOException {
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
           public SkillsCreateNewSkillRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillsCreateNewSkillRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillsCreateNewSkillRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillsCreateNewSkillRequest
  * @throws IOException if the JSON string is invalid with respect to SkillsCreateNewSkillRequest
  */
  public static SkillsCreateNewSkillRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillsCreateNewSkillRequest.class);
  }

 /**
  * Convert an instance of SkillsCreateNewSkillRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
