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
 * CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner {
  public static final String SERIALIZED_NAME_ENTRY_ID = "entryId";
  @SerializedName(SERIALIZED_NAME_ENTRY_ID)
  private String entryId;

  public static final String SERIALIZED_NAME_ENTRY_CODE = "entryCode";
  @SerializedName(SERIALIZED_NAME_ENTRY_CODE)
  private String entryCode;

  public static final String SERIALIZED_NAME_ENTRY_VALUE = "entryValue";
  @SerializedName(SERIALIZED_NAME_ENTRY_VALUE)
  private String entryValue;

  public static final String SERIALIZED_NAME_LIST_ID = "listId";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner() {
  }

  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner entryId(String entryId) {
    
    
    
    
    this.entryId = entryId;
    return this;
  }

   /**
   * Get entryId
   * @return entryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getEntryId() {
    return entryId;
  }


  public void setEntryId(String entryId) {
    
    
    
    this.entryId = entryId;
  }


  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner entryCode(String entryCode) {
    
    
    
    
    this.entryCode = entryCode;
    return this;
  }

   /**
   * Get entryCode
   * @return entryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "String", value = "")

  public String getEntryCode() {
    return entryCode;
  }


  public void setEntryCode(String entryCode) {
    
    
    
    this.entryCode = entryCode;
  }


  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner entryValue(String entryValue) {
    
    
    
    
    this.entryValue = entryValue;
    return this;
  }

   /**
   * Get entryValue
   * @return entryValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "String", value = "")

  public String getEntryValue() {
    return entryValue;
  }


  public void setEntryValue(String entryValue) {
    
    
    
    this.entryValue = entryValue;
  }


  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner listId(String listId) {
    
    
    
    
    this.listId = listId;
    return this;
  }

   /**
   * Get listId
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getListId() {
    return listId;
  }


  public void setListId(String listId) {
    
    
    
    this.listId = listId;
  }


  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner cid(String cid) {
    
    
    
    
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
   * @return the CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner instance itself
   */
  public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner putAdditionalProperty(String key, Object value) {
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
    CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner customFieldsGetCustomListsResponseInnerCustomListEntryModelInner = (CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner) o;
    return Objects.equals(this.entryId, customFieldsGetCustomListsResponseInnerCustomListEntryModelInner.entryId) &&
        Objects.equals(this.entryCode, customFieldsGetCustomListsResponseInnerCustomListEntryModelInner.entryCode) &&
        Objects.equals(this.entryValue, customFieldsGetCustomListsResponseInnerCustomListEntryModelInner.entryValue) &&
        Objects.equals(this.listId, customFieldsGetCustomListsResponseInnerCustomListEntryModelInner.listId) &&
        Objects.equals(this.cid, customFieldsGetCustomListsResponseInnerCustomListEntryModelInner.cid)&&
        Objects.equals(this.additionalProperties, customFieldsGetCustomListsResponseInnerCustomListEntryModelInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, entryCode, entryValue, listId, cid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner {\n");
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    entryCode: ").append(toIndentedString(entryCode)).append("\n");
    sb.append("    entryValue: ").append(toIndentedString(entryValue)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
    openapiFields.add("entryId");
    openapiFields.add("entryCode");
    openapiFields.add("entryValue");
    openapiFields.add("listId");
    openapiFields.add("cid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner is not found in the empty JSON string", CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("entryId") != null && !jsonObj.get("entryId").isJsonNull()) && !jsonObj.get("entryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entryId").toString()));
      }
      if ((jsonObj.get("entryCode") != null && !jsonObj.get("entryCode").isJsonNull()) && !jsonObj.get("entryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entryCode").toString()));
      }
      if ((jsonObj.get("entryValue") != null && !jsonObj.get("entryValue").isJsonNull()) && !jsonObj.get("entryValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entryValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entryValue").toString()));
      }
      if ((jsonObj.get("listId") != null && !jsonObj.get("listId").isJsonNull()) && !jsonObj.get("listId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listId").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner>() {
           @Override
           public void write(JsonWriter out, CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner value) throws IOException {
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
           public CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner
  * @throws IOException if the JSON string is invalid with respect to CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner
  */
  public static CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner.class);
  }

 /**
  * Convert an instance of CustomFieldsGetCustomListsResponseInnerCustomListEntryModelInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

