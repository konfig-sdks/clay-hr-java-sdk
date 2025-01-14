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
import com.konfigthis.client.model.AttachmentModel;
import com.konfigthis.client.model.DynamicFormItemModel;
import com.konfigthis.client.model.UserGroupModel;
import com.konfigthis.client.model.UserModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DynamicFormSectionModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DynamicFormSectionModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private String assignee;

  public static final String SERIALIZED_NAME_ASSIGNEE_MODEL = "assigneeModel";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_MODEL)
  private UserModel assigneeModel;

  public static final String SERIALIZED_NAME_ATTACHMENT_MODEL = "attachmentModel";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_MODEL)
  private AttachmentModel attachmentModel;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_CREATE_USER_ID = "createUserId";
  @SerializedName(SERIALIZED_NAME_CREATE_USER_ID)
  private Integer createUserId;

  public static final String SERIALIZED_NAME_DYNAMIC_FORM_ID = "dynamicFormId";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_FORM_ID)
  private Integer dynamicFormId;

  public static final String SERIALIZED_NAME_DYNAMIC_FORM_ITEM_MODEL_LIST = "dynamicFormItemModelList";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_FORM_ITEM_MODEL_LIST)
  private List<DynamicFormItemModel> dynamicFormItemModelList = null;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SECTION_ID = "sectionId";
  @SerializedName(SERIALIZED_NAME_SECTION_ID)
  private Integer sectionId;

  public static final String SERIALIZED_NAME_SEQUENCE = "sequence";
  @SerializedName(SERIALIZED_NAME_SEQUENCE)
  private Integer sequence;

  public static final String SERIALIZED_NAME_TOTALWEIGHTAGE = "totalweightage";
  @SerializedName(SERIALIZED_NAME_TOTALWEIGHTAGE)
  private Double totalweightage;

  public static final String SERIALIZED_NAME_USER_GROUP_MODEL = "userGroupModel";
  @SerializedName(SERIALIZED_NAME_USER_GROUP_MODEL)
  private UserGroupModel userGroupModel;

  public DynamicFormSectionModel() {
  }

  public DynamicFormSectionModel description(String description) {
    
    
    
    
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


  public DynamicFormSectionModel assignee(String assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssignee() {
    return assignee;
  }


  public void setAssignee(String assignee) {
    
    
    
    this.assignee = assignee;
  }


  public DynamicFormSectionModel assigneeModel(UserModel assigneeModel) {
    
    
    
    
    this.assigneeModel = assigneeModel;
    return this;
  }

   /**
   * Get assigneeModel
   * @return assigneeModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserModel getAssigneeModel() {
    return assigneeModel;
  }


  public void setAssigneeModel(UserModel assigneeModel) {
    
    
    
    this.assigneeModel = assigneeModel;
  }


  public DynamicFormSectionModel attachmentModel(AttachmentModel attachmentModel) {
    
    
    
    
    this.attachmentModel = attachmentModel;
    return this;
  }

   /**
   * Get attachmentModel
   * @return attachmentModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttachmentModel getAttachmentModel() {
    return attachmentModel;
  }


  public void setAttachmentModel(AttachmentModel attachmentModel) {
    
    
    
    this.attachmentModel = attachmentModel;
  }


  public DynamicFormSectionModel cid(Integer cid) {
    
    
    
    
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


  public DynamicFormSectionModel createUserId(Integer createUserId) {
    
    
    
    
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


  public DynamicFormSectionModel dynamicFormId(Integer dynamicFormId) {
    
    
    
    
    this.dynamicFormId = dynamicFormId;
    return this;
  }

   /**
   * Get dynamicFormId
   * @return dynamicFormId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDynamicFormId() {
    return dynamicFormId;
  }


  public void setDynamicFormId(Integer dynamicFormId) {
    
    
    
    this.dynamicFormId = dynamicFormId;
  }


  public DynamicFormSectionModel dynamicFormItemModelList(List<DynamicFormItemModel> dynamicFormItemModelList) {
    
    
    
    
    this.dynamicFormItemModelList = dynamicFormItemModelList;
    return this;
  }

  public DynamicFormSectionModel addDynamicFormItemModelListItem(DynamicFormItemModel dynamicFormItemModelListItem) {
    if (this.dynamicFormItemModelList == null) {
      this.dynamicFormItemModelList = new ArrayList<>();
    }
    this.dynamicFormItemModelList.add(dynamicFormItemModelListItem);
    return this;
  }

   /**
   * Get dynamicFormItemModelList
   * @return dynamicFormItemModelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DynamicFormItemModel> getDynamicFormItemModelList() {
    return dynamicFormItemModelList;
  }


  public void setDynamicFormItemModelList(List<DynamicFormItemModel> dynamicFormItemModelList) {
    
    
    
    this.dynamicFormItemModelList = dynamicFormItemModelList;
  }


  public DynamicFormSectionModel hidden(Boolean hidden) {
    
    
    
    
    this.hidden = hidden;
    return this;
  }

   /**
   * Get hidden
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHidden() {
    return hidden;
  }


  public void setHidden(Boolean hidden) {
    
    
    
    this.hidden = hidden;
  }


  public DynamicFormSectionModel name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public DynamicFormSectionModel sectionId(Integer sectionId) {
    
    
    
    
    this.sectionId = sectionId;
    return this;
  }

   /**
   * Get sectionId
   * @return sectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSectionId() {
    return sectionId;
  }


  public void setSectionId(Integer sectionId) {
    
    
    
    this.sectionId = sectionId;
  }


  public DynamicFormSectionModel sequence(Integer sequence) {
    
    
    
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSequence() {
    return sequence;
  }


  public void setSequence(Integer sequence) {
    
    
    
    this.sequence = sequence;
  }


  public DynamicFormSectionModel totalweightage(Double totalweightage) {
    
    
    
    
    this.totalweightage = totalweightage;
    return this;
  }

   /**
   * Get totalweightage
   * @return totalweightage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTotalweightage() {
    return totalweightage;
  }


  public void setTotalweightage(Double totalweightage) {
    
    
    
    this.totalweightage = totalweightage;
  }


  public DynamicFormSectionModel userGroupModel(UserGroupModel userGroupModel) {
    
    
    
    
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
   * @return the DynamicFormSectionModel instance itself
   */
  public DynamicFormSectionModel putAdditionalProperty(String key, Object value) {
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
    DynamicFormSectionModel dynamicFormSectionModel = (DynamicFormSectionModel) o;
    return Objects.equals(this.description, dynamicFormSectionModel.description) &&
        Objects.equals(this.assignee, dynamicFormSectionModel.assignee) &&
        Objects.equals(this.assigneeModel, dynamicFormSectionModel.assigneeModel) &&
        Objects.equals(this.attachmentModel, dynamicFormSectionModel.attachmentModel) &&
        Objects.equals(this.cid, dynamicFormSectionModel.cid) &&
        Objects.equals(this.createUserId, dynamicFormSectionModel.createUserId) &&
        Objects.equals(this.dynamicFormId, dynamicFormSectionModel.dynamicFormId) &&
        Objects.equals(this.dynamicFormItemModelList, dynamicFormSectionModel.dynamicFormItemModelList) &&
        Objects.equals(this.hidden, dynamicFormSectionModel.hidden) &&
        Objects.equals(this.name, dynamicFormSectionModel.name) &&
        Objects.equals(this.sectionId, dynamicFormSectionModel.sectionId) &&
        Objects.equals(this.sequence, dynamicFormSectionModel.sequence) &&
        Objects.equals(this.totalweightage, dynamicFormSectionModel.totalweightage) &&
        Objects.equals(this.userGroupModel, dynamicFormSectionModel.userGroupModel)&&
        Objects.equals(this.additionalProperties, dynamicFormSectionModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, assignee, assigneeModel, attachmentModel, cid, createUserId, dynamicFormId, dynamicFormItemModelList, hidden, name, sectionId, sequence, totalweightage, userGroupModel, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicFormSectionModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    assigneeModel: ").append(toIndentedString(assigneeModel)).append("\n");
    sb.append("    attachmentModel: ").append(toIndentedString(attachmentModel)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
    sb.append("    dynamicFormId: ").append(toIndentedString(dynamicFormId)).append("\n");
    sb.append("    dynamicFormItemModelList: ").append(toIndentedString(dynamicFormItemModelList)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    totalweightage: ").append(toIndentedString(totalweightage)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("assignee");
    openapiFields.add("assigneeModel");
    openapiFields.add("attachmentModel");
    openapiFields.add("cid");
    openapiFields.add("createUserId");
    openapiFields.add("dynamicFormId");
    openapiFields.add("dynamicFormItemModelList");
    openapiFields.add("hidden");
    openapiFields.add("name");
    openapiFields.add("sectionId");
    openapiFields.add("sequence");
    openapiFields.add("totalweightage");
    openapiFields.add("userGroupModel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DynamicFormSectionModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DynamicFormSectionModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DynamicFormSectionModel is not found in the empty JSON string", DynamicFormSectionModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) && !jsonObj.get("assignee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assignee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assignee").toString()));
      }
      // validate the optional field `assigneeModel`
      if (jsonObj.get("assigneeModel") != null && !jsonObj.get("assigneeModel").isJsonNull()) {
        UserModel.validateJsonObject(jsonObj.getAsJsonObject("assigneeModel"));
      }
      // validate the optional field `attachmentModel`
      if (jsonObj.get("attachmentModel") != null && !jsonObj.get("attachmentModel").isJsonNull()) {
        AttachmentModel.validateJsonObject(jsonObj.getAsJsonObject("attachmentModel"));
      }
      if (jsonObj.get("dynamicFormItemModelList") != null && !jsonObj.get("dynamicFormItemModelList").isJsonNull()) {
        JsonArray jsonArraydynamicFormItemModelList = jsonObj.getAsJsonArray("dynamicFormItemModelList");
        if (jsonArraydynamicFormItemModelList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dynamicFormItemModelList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dynamicFormItemModelList` to be an array in the JSON string but got `%s`", jsonObj.get("dynamicFormItemModelList").toString()));
          }

          // validate the optional field `dynamicFormItemModelList` (array)
          for (int i = 0; i < jsonArraydynamicFormItemModelList.size(); i++) {
            DynamicFormItemModel.validateJsonObject(jsonArraydynamicFormItemModelList.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
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
       if (!DynamicFormSectionModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DynamicFormSectionModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DynamicFormSectionModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DynamicFormSectionModel.class));

       return (TypeAdapter<T>) new TypeAdapter<DynamicFormSectionModel>() {
           @Override
           public void write(JsonWriter out, DynamicFormSectionModel value) throws IOException {
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
           public DynamicFormSectionModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DynamicFormSectionModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DynamicFormSectionModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DynamicFormSectionModel
  * @throws IOException if the JSON string is invalid with respect to DynamicFormSectionModel
  */
  public static DynamicFormSectionModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DynamicFormSectionModel.class);
  }

 /**
  * Convert an instance of DynamicFormSectionModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

