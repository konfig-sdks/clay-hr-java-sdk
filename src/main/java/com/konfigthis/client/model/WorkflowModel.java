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
import com.konfigthis.client.model.UserViewModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.sql.Timestamp;

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
 * WorkflowModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_CREATE_USER = "createUser";
  @SerializedName(SERIALIZED_NAME_CREATE_USER)
  private Integer createUser;

  public static final String SERIALIZED_NAME_CREATE_USER_MODEL = "createUserModel";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_MODEL)
  private UserViewModel createUserModel;

  public static final String SERIALIZED_NAME_CREATETS = "createts";
  @SerializedName(SERIALIZED_NAME_CREATETS)
  private Timestamp createts;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_SHORTCUT = "shortcut";
  @SerializedName(SERIALIZED_NAME_SHORTCUT)
  private Boolean shortcut;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private String visibility;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private Integer workflowId;

  public static final String SERIALIZED_NAME_WORKFLOW_NAME = "workflowName";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAME)
  private String workflowName;

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflowType";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private String workflowType;

  public WorkflowModel() {
  }

  public WorkflowModel description(String description) {
    
    
    
    
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


  public WorkflowModel cid(Integer cid) {
    
    
    
    
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


  public WorkflowModel createUser(Integer createUser) {
    
    
    
    
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateUser() {
    return createUser;
  }


  public void setCreateUser(Integer createUser) {
    
    
    
    this.createUser = createUser;
  }


  public WorkflowModel createUserModel(UserViewModel createUserModel) {
    
    
    
    
    this.createUserModel = createUserModel;
    return this;
  }

   /**
   * Get createUserModel
   * @return createUserModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserViewModel getCreateUserModel() {
    return createUserModel;
  }


  public void setCreateUserModel(UserViewModel createUserModel) {
    
    
    
    this.createUserModel = createUserModel;
  }


  public WorkflowModel createts(Timestamp createts) {
    
    
    
    
    this.createts = createts;
    return this;
  }

   /**
   * Get createts
   * @return createts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Timestamp getCreatets() {
    return createts;
  }


  public void setCreatets(Timestamp createts) {
    
    
    
    this.createts = createts;
  }


  public WorkflowModel duration(String duration) {
    
    
    
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    
    
    
    this.duration = duration;
  }


  public WorkflowModel objectType(String objectType) {
    
    
    
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    
    
    
    this.objectType = objectType;
  }


  public WorkflowModel shortcut(Boolean shortcut) {
    
    
    
    
    this.shortcut = shortcut;
    return this;
  }

   /**
   * Get shortcut
   * @return shortcut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShortcut() {
    return shortcut;
  }


  public void setShortcut(Boolean shortcut) {
    
    
    
    this.shortcut = shortcut;
  }


  public WorkflowModel status(String status) {
    
    
    
    
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


  public WorkflowModel visibility(String visibility) {
    
    
    
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVisibility() {
    return visibility;
  }


  public void setVisibility(String visibility) {
    
    
    
    this.visibility = visibility;
  }


  public WorkflowModel workflowId(Integer workflowId) {
    
    
    
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(Integer workflowId) {
    
    
    
    this.workflowId = workflowId;
  }


  public WorkflowModel workflowName(String workflowName) {
    
    
    
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * Get workflowName
   * @return workflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowName() {
    return workflowName;
  }


  public void setWorkflowName(String workflowName) {
    
    
    
    this.workflowName = workflowName;
  }


  public WorkflowModel workflowType(String workflowType) {
    
    
    
    
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Get workflowType
   * @return workflowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowType() {
    return workflowType;
  }


  public void setWorkflowType(String workflowType) {
    
    
    
    this.workflowType = workflowType;
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
   * @return the WorkflowModel instance itself
   */
  public WorkflowModel putAdditionalProperty(String key, Object value) {
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
    WorkflowModel workflowModel = (WorkflowModel) o;
    return Objects.equals(this.description, workflowModel.description) &&
        Objects.equals(this.cid, workflowModel.cid) &&
        Objects.equals(this.createUser, workflowModel.createUser) &&
        Objects.equals(this.createUserModel, workflowModel.createUserModel) &&
        Objects.equals(this.createts, workflowModel.createts) &&
        Objects.equals(this.duration, workflowModel.duration) &&
        Objects.equals(this.objectType, workflowModel.objectType) &&
        Objects.equals(this.shortcut, workflowModel.shortcut) &&
        Objects.equals(this.status, workflowModel.status) &&
        Objects.equals(this.visibility, workflowModel.visibility) &&
        Objects.equals(this.workflowId, workflowModel.workflowId) &&
        Objects.equals(this.workflowName, workflowModel.workflowName) &&
        Objects.equals(this.workflowType, workflowModel.workflowType)&&
        Objects.equals(this.additionalProperties, workflowModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, cid, createUser, createUserModel, createts, duration, objectType, shortcut, status, visibility, workflowId, workflowName, workflowType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    createUserModel: ").append(toIndentedString(createUserModel)).append("\n");
    sb.append("    createts: ").append(toIndentedString(createts)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    shortcut: ").append(toIndentedString(shortcut)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
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
    openapiFields.add("cid");
    openapiFields.add("createUser");
    openapiFields.add("createUserModel");
    openapiFields.add("createts");
    openapiFields.add("duration");
    openapiFields.add("objectType");
    openapiFields.add("shortcut");
    openapiFields.add("status");
    openapiFields.add("visibility");
    openapiFields.add("workflowId");
    openapiFields.add("workflowName");
    openapiFields.add("workflowType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowModel is not found in the empty JSON string", WorkflowModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `createUserModel`
      if (jsonObj.get("createUserModel") != null && !jsonObj.get("createUserModel").isJsonNull()) {
        UserViewModel.validateJsonObject(jsonObj.getAsJsonObject("createUserModel"));
      }
      // validate the optional field `createts`
      if (jsonObj.get("createts") != null && !jsonObj.get("createts").isJsonNull()) {
        Timestamp.validateJsonObject(jsonObj.getAsJsonObject("createts"));
      }
      if ((jsonObj.get("duration") != null && !jsonObj.get("duration").isJsonNull()) && !jsonObj.get("duration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `duration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("duration").toString()));
      }
      if ((jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonNull()) && !jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      if ((jsonObj.get("workflowName") != null && !jsonObj.get("workflowName").isJsonNull()) && !jsonObj.get("workflowName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowName").toString()));
      }
      if ((jsonObj.get("workflowType") != null && !jsonObj.get("workflowType").isJsonNull()) && !jsonObj.get("workflowType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowModel.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowModel>() {
           @Override
           public void write(JsonWriter out, WorkflowModel value) throws IOException {
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
           public WorkflowModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowModel
  * @throws IOException if the JSON string is invalid with respect to WorkflowModel
  */
  public static WorkflowModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowModel.class);
  }

 /**
  * Convert an instance of WorkflowModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

