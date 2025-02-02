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
 * StateCountryModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StateCountryModel {
  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private Integer countryId;

  public static final String SERIALIZED_NAME_STATE_CODE = "stateCode";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_STATE_ID = "stateId";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private Integer stateId;

  public static final String SERIALIZED_NAME_STATE_NAME = "stateName";
  @SerializedName(SERIALIZED_NAME_STATE_NAME)
  private String stateName;

  public StateCountryModel() {
  }

  public StateCountryModel countryId(Integer countryId) {
    
    
    
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Get countryId
   * @return countryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCountryId() {
    return countryId;
  }


  public void setCountryId(Integer countryId) {
    
    
    
    this.countryId = countryId;
  }


  public StateCountryModel stateCode(String stateCode) {
    
    
    
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    
    
    
    this.stateCode = stateCode;
  }


  public StateCountryModel stateId(Integer stateId) {
    
    
    
    
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStateId() {
    return stateId;
  }


  public void setStateId(Integer stateId) {
    
    
    
    this.stateId = stateId;
  }


  public StateCountryModel stateName(String stateName) {
    
    
    
    
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateName() {
    return stateName;
  }


  public void setStateName(String stateName) {
    
    
    
    this.stateName = stateName;
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
   * @return the StateCountryModel instance itself
   */
  public StateCountryModel putAdditionalProperty(String key, Object value) {
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
    StateCountryModel stateCountryModel = (StateCountryModel) o;
    return Objects.equals(this.countryId, stateCountryModel.countryId) &&
        Objects.equals(this.stateCode, stateCountryModel.stateCode) &&
        Objects.equals(this.stateId, stateCountryModel.stateId) &&
        Objects.equals(this.stateName, stateCountryModel.stateName)&&
        Objects.equals(this.additionalProperties, stateCountryModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryId, stateCode, stateId, stateName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateCountryModel {\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
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
    openapiFields.add("countryId");
    openapiFields.add("stateCode");
    openapiFields.add("stateId");
    openapiFields.add("stateName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StateCountryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StateCountryModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StateCountryModel is not found in the empty JSON string", StateCountryModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("stateCode") != null && !jsonObj.get("stateCode").isJsonNull()) && !jsonObj.get("stateCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateCode").toString()));
      }
      if ((jsonObj.get("stateName") != null && !jsonObj.get("stateName").isJsonNull()) && !jsonObj.get("stateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StateCountryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StateCountryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StateCountryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StateCountryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<StateCountryModel>() {
           @Override
           public void write(JsonWriter out, StateCountryModel value) throws IOException {
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
           public StateCountryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StateCountryModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StateCountryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StateCountryModel
  * @throws IOException if the JSON string is invalid with respect to StateCountryModel
  */
  public static StateCountryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StateCountryModel.class);
  }

 /**
  * Convert an instance of StateCountryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

