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
 * FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRACTICE_ID = "practiceId";
  @SerializedName(SERIALIZED_NAME_PRACTICE_ID)
  private String practiceId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRACTICE_HEAD = "practiceHead";
  @SerializedName(SERIALIZED_NAME_PRACTICE_HEAD)
  private String practiceHead;

  public static final String SERIALIZED_NAME_USER_MODEL = "userModel";
  @SerializedName(SERIALIZED_NAME_USER_MODEL)
  private String userModel;

  public static final String SERIALIZED_NAME_CREATETS = "createts";
  @SerializedName(SERIALIZED_NAME_CREATETS)
  private String createts;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel() {
  }

  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel description(String description) {
    
    
    
    
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


  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel practiceId(String practiceId) {
    
    
    
    
    this.practiceId = practiceId;
    return this;
  }

   /**
   * Get practiceId
   * @return practiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getPracticeId() {
    return practiceId;
  }


  public void setPracticeId(String practiceId) {
    
    
    
    this.practiceId = practiceId;
  }


  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel practiceHead(String practiceHead) {
    
    
    
    
    this.practiceHead = practiceHead;
    return this;
  }

   /**
   * Get practiceHead
   * @return practiceHead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getPracticeHead() {
    return practiceHead;
  }


  public void setPracticeHead(String practiceHead) {
    
    
    
    this.practiceHead = practiceHead;
  }


  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel userModel(String userModel) {
    
    
    
    
    this.userModel = userModel;
    return this;
  }

   /**
   * Get userModel
   * @return userModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "object", value = "")

  public String getUserModel() {
    return userModel;
  }


  public void setUserModel(String userModel) {
    
    
    
    this.userModel = userModel;
  }


  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel createts(String createts) {
    
    
    
    
    this.createts = createts;
    return this;
  }

   /**
   * Get createts
   * @return createts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "object", value = "")

  public String getCreatets() {
    return createts;
  }


  public void setCreatets(String createts) {
    
    
    
    this.createts = createts;
  }


  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel cid(String cid) {
    
    
    
    
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
   * @return the FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel instance itself
   */
  public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel putAdditionalProperty(String key, Object value) {
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
    FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel = (FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel) o;
    return Objects.equals(this.description, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.description) &&
        Objects.equals(this.practiceId, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.practiceId) &&
        Objects.equals(this.name, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.name) &&
        Objects.equals(this.practiceHead, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.practiceHead) &&
        Objects.equals(this.userModel, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.userModel) &&
        Objects.equals(this.createts, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.createts) &&
        Objects.equals(this.cid, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.cid)&&
        Objects.equals(this.additionalProperties, feedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, practiceId, name, practiceHead, userModel, createts, cid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    practiceId: ").append(toIndentedString(practiceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    practiceHead: ").append(toIndentedString(practiceHead)).append("\n");
    sb.append("    userModel: ").append(toIndentedString(userModel)).append("\n");
    sb.append("    createts: ").append(toIndentedString(createts)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("practiceId");
    openapiFields.add("name");
    openapiFields.add("practiceHead");
    openapiFields.add("userModel");
    openapiFields.add("createts");
    openapiFields.add("cid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel is not found in the empty JSON string", FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("practiceId") != null && !jsonObj.get("practiceId").isJsonNull()) && !jsonObj.get("practiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `practiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("practiceId").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("practiceHead") != null && !jsonObj.get("practiceHead").isJsonNull()) && !jsonObj.get("practiceHead").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `practiceHead` to be a primitive type in the JSON string but got `%s`", jsonObj.get("practiceHead").toString()));
      }
      if ((jsonObj.get("userModel") != null && !jsonObj.get("userModel").isJsonNull()) && !jsonObj.get("userModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userModel").toString()));
      }
      if ((jsonObj.get("createts") != null && !jsonObj.get("createts").isJsonNull()) && !jsonObj.get("createts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createts").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel>() {
           @Override
           public void write(JsonWriter out, FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel value) throws IOException {
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
           public FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel
  * @throws IOException if the JSON string is invalid with respect to FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel
  */
  public static FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel.class);
  }

 /**
  * Convert an instance of FeedbackListFeedbackResponseFeedbackListInnerAssignedUserModelPracticeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

