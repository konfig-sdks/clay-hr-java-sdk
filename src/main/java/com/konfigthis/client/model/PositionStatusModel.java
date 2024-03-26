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
 * PositionStatusModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PositionStatusModel {
  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_DEFAULT_STATUS = "defaultStatus";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STATUS)
  private Boolean defaultStatus;

  public static final String SERIALIZED_NAME_INTERNAL_STATUS = "internalStatus";
  @SerializedName(SERIALIZED_NAME_INTERNAL_STATUS)
  private String internalStatus;

  public static final String SERIALIZED_NAME_STATUS_ID = "statusId";
  @SerializedName(SERIALIZED_NAME_STATUS_ID)
  private Integer statusId;

  public static final String SERIALIZED_NAME_STATUS_NAME = "statusName";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName;

  public PositionStatusModel() {
  }

  public PositionStatusModel cid(Integer cid) {
    
    
    
    
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


  public PositionStatusModel defaultStatus(Boolean defaultStatus) {
    
    
    
    
    this.defaultStatus = defaultStatus;
    return this;
  }

   /**
   * Get defaultStatus
   * @return defaultStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDefaultStatus() {
    return defaultStatus;
  }


  public void setDefaultStatus(Boolean defaultStatus) {
    
    
    
    this.defaultStatus = defaultStatus;
  }


  public PositionStatusModel internalStatus(String internalStatus) {
    
    
    
    
    this.internalStatus = internalStatus;
    return this;
  }

   /**
   * Get internalStatus
   * @return internalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInternalStatus() {
    return internalStatus;
  }


  public void setInternalStatus(String internalStatus) {
    
    
    
    this.internalStatus = internalStatus;
  }


  public PositionStatusModel statusId(Integer statusId) {
    
    
    
    
    this.statusId = statusId;
    return this;
  }

   /**
   * Get statusId
   * @return statusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatusId() {
    return statusId;
  }


  public void setStatusId(Integer statusId) {
    
    
    
    this.statusId = statusId;
  }


  public PositionStatusModel statusName(String statusName) {
    
    
    
    
    this.statusName = statusName;
    return this;
  }

   /**
   * Get statusName
   * @return statusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    
    
    
    this.statusName = statusName;
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
   * @return the PositionStatusModel instance itself
   */
  public PositionStatusModel putAdditionalProperty(String key, Object value) {
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
    PositionStatusModel positionStatusModel = (PositionStatusModel) o;
    return Objects.equals(this.cid, positionStatusModel.cid) &&
        Objects.equals(this.defaultStatus, positionStatusModel.defaultStatus) &&
        Objects.equals(this.internalStatus, positionStatusModel.internalStatus) &&
        Objects.equals(this.statusId, positionStatusModel.statusId) &&
        Objects.equals(this.statusName, positionStatusModel.statusName)&&
        Objects.equals(this.additionalProperties, positionStatusModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, defaultStatus, internalStatus, statusId, statusName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionStatusModel {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    defaultStatus: ").append(toIndentedString(defaultStatus)).append("\n");
    sb.append("    internalStatus: ").append(toIndentedString(internalStatus)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
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
    openapiFields.add("cid");
    openapiFields.add("defaultStatus");
    openapiFields.add("internalStatus");
    openapiFields.add("statusId");
    openapiFields.add("statusName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PositionStatusModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PositionStatusModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PositionStatusModel is not found in the empty JSON string", PositionStatusModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("internalStatus") != null && !jsonObj.get("internalStatus").isJsonNull()) && !jsonObj.get("internalStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalStatus").toString()));
      }
      if ((jsonObj.get("statusName") != null && !jsonObj.get("statusName").isJsonNull()) && !jsonObj.get("statusName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PositionStatusModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PositionStatusModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PositionStatusModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PositionStatusModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PositionStatusModel>() {
           @Override
           public void write(JsonWriter out, PositionStatusModel value) throws IOException {
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
           public PositionStatusModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PositionStatusModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PositionStatusModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PositionStatusModel
  * @throws IOException if the JSON string is invalid with respect to PositionStatusModel
  */
  public static PositionStatusModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PositionStatusModel.class);
  }

 /**
  * Convert an instance of PositionStatusModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

