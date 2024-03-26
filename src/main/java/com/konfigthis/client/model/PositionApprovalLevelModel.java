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
import com.konfigthis.client.model.UserGroupModel;
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
 * PositionApprovalLevelModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PositionApprovalLevelModel {
  public static final String SERIALIZED_NAME_APPROVAL_ID = "approvalId";
  @SerializedName(SERIALIZED_NAME_APPROVAL_ID)
  private Integer approvalId;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_CREATE_USER_ID = "createUserId";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_ID)
  private Integer createUserId;

  public static final String SERIALIZED_NAME_FLOW_ID = "flowId";
  @SerializedName(SERIALIZED_NAME_FLOW_ID)
  private Integer flowId;

  public static final String SERIALIZED_NAME_LEVEL_SEQUENCE = "levelSequence";
  @SerializedName(SERIALIZED_NAME_LEVEL_SEQUENCE)
  private Integer levelSequence;

  public static final String SERIALIZED_NAME_RELATION_TYPE = "relationType";
  @SerializedName(SERIALIZED_NAME_RELATION_TYPE)
  private String relationType;

  public static final String SERIALIZED_NAME_USER_GROUP_MODEL = "userGroupModel";
  @SerializedName(SERIALIZED_NAME_USER_GROUP_MODEL)
  private UserGroupModel userGroupModel;

  public PositionApprovalLevelModel() {
  }

  public PositionApprovalLevelModel approvalId(Integer approvalId) {
    
    
    
    
    this.approvalId = approvalId;
    return this;
  }

   /**
   * Get approvalId
   * @return approvalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getApprovalId() {
    return approvalId;
  }


  public void setApprovalId(Integer approvalId) {
    
    
    
    this.approvalId = approvalId;
  }


  public PositionApprovalLevelModel cid(Integer cid) {
    
    
    
    
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


  public PositionApprovalLevelModel createUserId(Integer createUserId) {
    
    
    
    
    this.createUserId = createUserId;
    return this;
  }

   /**
   * Get createUserId
   * @return createUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateUserId() {
    return createUserId;
  }


  public void setCreateUserId(Integer createUserId) {
    
    
    
    this.createUserId = createUserId;
  }


  public PositionApprovalLevelModel flowId(Integer flowId) {
    
    
    
    
    this.flowId = flowId;
    return this;
  }

   /**
   * Get flowId
   * @return flowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFlowId() {
    return flowId;
  }


  public void setFlowId(Integer flowId) {
    
    
    
    this.flowId = flowId;
  }


  public PositionApprovalLevelModel levelSequence(Integer levelSequence) {
    
    
    
    
    this.levelSequence = levelSequence;
    return this;
  }

   /**
   * Get levelSequence
   * @return levelSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLevelSequence() {
    return levelSequence;
  }


  public void setLevelSequence(Integer levelSequence) {
    
    
    
    this.levelSequence = levelSequence;
  }


  public PositionApprovalLevelModel relationType(String relationType) {
    
    
    
    
    this.relationType = relationType;
    return this;
  }

   /**
   * Get relationType
   * @return relationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRelationType() {
    return relationType;
  }


  public void setRelationType(String relationType) {
    
    
    
    this.relationType = relationType;
  }


  public PositionApprovalLevelModel userGroupModel(UserGroupModel userGroupModel) {
    
    
    
    
    this.userGroupModel = userGroupModel;
    return this;
  }

   /**
   * Get userGroupModel
   * @return userGroupModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserGroupModel getUserGroupModel() {
    return userGroupModel;
  }


  public void setUserGroupModel(UserGroupModel userGroupModel) {
    
    
    
    this.userGroupModel = userGroupModel;
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
   * @return the PositionApprovalLevelModel instance itself
   */
  public PositionApprovalLevelModel putAdditionalProperty(String key, Object value) {
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
    PositionApprovalLevelModel positionApprovalLevelModel = (PositionApprovalLevelModel) o;
    return Objects.equals(this.approvalId, positionApprovalLevelModel.approvalId) &&
        Objects.equals(this.cid, positionApprovalLevelModel.cid) &&
        Objects.equals(this.createUserId, positionApprovalLevelModel.createUserId) &&
        Objects.equals(this.flowId, positionApprovalLevelModel.flowId) &&
        Objects.equals(this.levelSequence, positionApprovalLevelModel.levelSequence) &&
        Objects.equals(this.relationType, positionApprovalLevelModel.relationType) &&
        Objects.equals(this.userGroupModel, positionApprovalLevelModel.userGroupModel)&&
        Objects.equals(this.additionalProperties, positionApprovalLevelModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalId, cid, createUserId, flowId, levelSequence, relationType, userGroupModel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositionApprovalLevelModel {\n");
    sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    levelSequence: ").append(toIndentedString(levelSequence)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
    sb.append("    userGroupModel: ").append(toIndentedString(userGroupModel)).append("\n");
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
    openapiFields.add("approvalId");
    openapiFields.add("cid");
    openapiFields.add("createUserId");
    openapiFields.add("flowId");
    openapiFields.add("levelSequence");
    openapiFields.add("relationType");
    openapiFields.add("userGroupModel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PositionApprovalLevelModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PositionApprovalLevelModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PositionApprovalLevelModel is not found in the empty JSON string", PositionApprovalLevelModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("relationType") != null && !jsonObj.get("relationType").isJsonNull()) && !jsonObj.get("relationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationType").toString()));
      }
      // validate the optional field `userGroupModel`
      if (jsonObj.get("userGroupModel") != null && !jsonObj.get("userGroupModel").isJsonNull()) {
        UserGroupModel.validateJsonObject(jsonObj.getAsJsonObject("userGroupModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PositionApprovalLevelModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PositionApprovalLevelModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PositionApprovalLevelModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PositionApprovalLevelModel.class));

       return (TypeAdapter<T>) new TypeAdapter<PositionApprovalLevelModel>() {
           @Override
           public void write(JsonWriter out, PositionApprovalLevelModel value) throws IOException {
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
           public PositionApprovalLevelModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PositionApprovalLevelModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PositionApprovalLevelModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PositionApprovalLevelModel
  * @throws IOException if the JSON string is invalid with respect to PositionApprovalLevelModel
  */
  public static PositionApprovalLevelModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PositionApprovalLevelModel.class);
  }

 /**
  * Convert an instance of PositionApprovalLevelModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
