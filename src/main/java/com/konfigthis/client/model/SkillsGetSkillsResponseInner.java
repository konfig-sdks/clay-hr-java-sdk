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
 * SkillsGetSkillsResponseInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SkillsGetSkillsResponseInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private String sequence;

  public static final String SERIALIZED_NAME_CREATE_USER_ID = "createUserId";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_ID)
  private String createUserId;

  public static final String SERIALIZED_NAME_SKILL_CODE = "skillCode";
  @SerializedName(SERIALIZED_NAME_SKILL_CODE)
  private String skillCode;

  public static final String SERIALIZED_NAME_CREATETS = "createts";
  @SerializedName(SERIALIZED_NAME_CREATETS)
  private String createts;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public SkillsGetSkillsResponseInner() {
  }

  public SkillsGetSkillsResponseInner description(String description) {
    
    
    
    
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


  public SkillsGetSkillsResponseInner sequence(String sequence) {
    
    
    
    
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


  public SkillsGetSkillsResponseInner createUserId(String createUserId) {
    
    
    
    
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


  public SkillsGetSkillsResponseInner skillCode(String skillCode) {
    
    
    
    
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


  public SkillsGetSkillsResponseInner createts(String createts) {
    
    
    
    
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


  public SkillsGetSkillsResponseInner id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public SkillsGetSkillsResponseInner status(String status) {
    
    
    
    
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
   * @return the SkillsGetSkillsResponseInner instance itself
   */
  public SkillsGetSkillsResponseInner putAdditionalProperty(String key, Object value) {
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
    SkillsGetSkillsResponseInner skillsGetSkillsResponseInner = (SkillsGetSkillsResponseInner) o;
    return Objects.equals(this.description, skillsGetSkillsResponseInner.description) &&
        Objects.equals(this.sequence, skillsGetSkillsResponseInner.sequence) &&
        Objects.equals(this.createUserId, skillsGetSkillsResponseInner.createUserId) &&
        Objects.equals(this.skillCode, skillsGetSkillsResponseInner.skillCode) &&
        Objects.equals(this.createts, skillsGetSkillsResponseInner.createts) &&
        Objects.equals(this.id, skillsGetSkillsResponseInner.id) &&
        Objects.equals(this.status, skillsGetSkillsResponseInner.status)&&
        Objects.equals(this.additionalProperties, skillsGetSkillsResponseInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, sequence, createUserId, skillCode, createts, id, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillsGetSkillsResponseInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    skillCode: ").append(toIndentedString(skillCode)).append("\n");
    sb.append("    createts: ").append(toIndentedString(createts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("sequence");
    openapiFields.add("createUserId");
    openapiFields.add("skillCode");
    openapiFields.add("createts");
    openapiFields.add("id");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SkillsGetSkillsResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SkillsGetSkillsResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SkillsGetSkillsResponseInner is not found in the empty JSON string", SkillsGetSkillsResponseInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("sequence") != null && !jsonObj.get("sequence").isJsonNull()) && !jsonObj.get("sequence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sequence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sequence").toString()));
      }
      if ((jsonObj.get("createUserId") != null && !jsonObj.get("createUserId").isJsonNull()) && !jsonObj.get("createUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createUserId").toString()));
      }
      if ((jsonObj.get("skillCode") != null && !jsonObj.get("skillCode").isJsonNull()) && !jsonObj.get("skillCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skillCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skillCode").toString()));
      }
      if ((jsonObj.get("createts") != null && !jsonObj.get("createts").isJsonNull()) && !jsonObj.get("createts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createts").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SkillsGetSkillsResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SkillsGetSkillsResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SkillsGetSkillsResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SkillsGetSkillsResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SkillsGetSkillsResponseInner>() {
           @Override
           public void write(JsonWriter out, SkillsGetSkillsResponseInner value) throws IOException {
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
           public SkillsGetSkillsResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SkillsGetSkillsResponseInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SkillsGetSkillsResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SkillsGetSkillsResponseInner
  * @throws IOException if the JSON string is invalid with respect to SkillsGetSkillsResponseInner
  */
  public static SkillsGetSkillsResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SkillsGetSkillsResponseInner.class);
  }

 /**
  * Convert an instance of SkillsGetSkillsResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
