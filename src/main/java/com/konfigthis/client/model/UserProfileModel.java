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
import com.konfigthis.client.model.CustomFieldValueModel;
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
 * UserProfileModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserProfileModel {
  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_CREATEUSERID = "createuserid";
  @SerializedName(SERIALIZED_NAME_CREATEUSERID)
  private Integer createuserid;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_VALUE_MODEL_LIST = "customFieldValueModelList";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_VALUE_MODEL_LIST)
  private List<CustomFieldValueModel> customFieldValueModelList = null;

  public static final String SERIALIZED_NAME_MANAGER_PROFILE_ID = "managerProfileId";
  @SerializedName(SERIALIZED_NAME_MANAGER_PROFILE_ID)
  private Integer managerProfileId;

  public static final String SERIALIZED_NAME_MANAGER_PROFILE_NAME = "managerProfileName";
  @SerializedName(SERIALIZED_NAME_MANAGER_PROFILE_NAME)
  private String managerProfileName;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private Integer orgId;

  public static final String SERIALIZED_NAME_PROFILE_DESCRIPTION = "profileDescription";
  @SerializedName(SERIALIZED_NAME_PROFILE_DESCRIPTION)
  private String profileDescription;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private Integer profileId;

  public static final String SERIALIZED_NAME_PROFILE_NAME = "profileName";
  @SerializedName(SERIALIZED_NAME_PROFILE_NAME)
  private String profileName;

  public static final String SERIALIZED_NAME_PROFILE_REQUIREMENTS = "profileRequirements";
  @SerializedName(SERIALIZED_NAME_PROFILE_REQUIREMENTS)
  private String profileRequirements;

  public static final String SERIALIZED_NAME_PROFILE_RESPONSIBILITIES = "profileResponsibilities";
  @SerializedName(SERIALIZED_NAME_PROFILE_RESPONSIBILITIES)
  private String profileResponsibilities;

  public static final String SERIALIZED_NAME_SALARY_BAND_CURRENCY = "salaryBandCurrency";
  @SerializedName(SERIALIZED_NAME_SALARY_BAND_CURRENCY)
  private String salaryBandCurrency;

  public static final String SERIALIZED_NAME_SALARY_BAND_MAX = "salaryBandMax";
  @SerializedName(SERIALIZED_NAME_SALARY_BAND_MAX)
  private Double salaryBandMax;

  public static final String SERIALIZED_NAME_SALARY_BAND_MIN = "salaryBandMin";
  @SerializedName(SERIALIZED_NAME_SALARY_BAND_MIN)
  private Double salaryBandMin;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "objectName";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_OBJECTID = "objectid";
  @SerializedName(SERIALIZED_NAME_OBJECTID)
  private Integer objectid;

  public UserProfileModel() {
  }

  public UserProfileModel cid(Integer cid) {
    
    
    
    
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


  public UserProfileModel createuserid(Integer createuserid) {
    
    
    
    
    this.createuserid = createuserid;
    return this;
  }

   /**
   * Get createuserid
   * @return createuserid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCreateuserid() {
    return createuserid;
  }


  public void setCreateuserid(Integer createuserid) {
    
    
    
    this.createuserid = createuserid;
  }


  public UserProfileModel customFieldValueModelList(List<CustomFieldValueModel> customFieldValueModelList) {
    
    
    
    
    this.customFieldValueModelList = customFieldValueModelList;
    return this;
  }

  public UserProfileModel addCustomFieldValueModelListItem(CustomFieldValueModel customFieldValueModelListItem) {
    if (this.customFieldValueModelList == null) {
      this.customFieldValueModelList = new ArrayList<>();
    }
    this.customFieldValueModelList.add(customFieldValueModelListItem);
    return this;
  }

   /**
   * Get customFieldValueModelList
   * @return customFieldValueModelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomFieldValueModel> getCustomFieldValueModelList() {
    return customFieldValueModelList;
  }


  public void setCustomFieldValueModelList(List<CustomFieldValueModel> customFieldValueModelList) {
    
    
    
    this.customFieldValueModelList = customFieldValueModelList;
  }


  public UserProfileModel managerProfileId(Integer managerProfileId) {
    
    
    
    
    this.managerProfileId = managerProfileId;
    return this;
  }

   /**
   * Get managerProfileId
   * @return managerProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getManagerProfileId() {
    return managerProfileId;
  }


  public void setManagerProfileId(Integer managerProfileId) {
    
    
    
    this.managerProfileId = managerProfileId;
  }


  public UserProfileModel managerProfileName(String managerProfileName) {
    
    
    
    
    this.managerProfileName = managerProfileName;
    return this;
  }

   /**
   * Get managerProfileName
   * @return managerProfileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagerProfileName() {
    return managerProfileName;
  }


  public void setManagerProfileName(String managerProfileName) {
    
    
    
    this.managerProfileName = managerProfileName;
  }


  public UserProfileModel orgId(Integer orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrgId() {
    return orgId;
  }


  public void setOrgId(Integer orgId) {
    
    
    
    this.orgId = orgId;
  }


  public UserProfileModel profileDescription(String profileDescription) {
    
    
    
    
    this.profileDescription = profileDescription;
    return this;
  }

   /**
   * Get profileDescription
   * @return profileDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileDescription() {
    return profileDescription;
  }


  public void setProfileDescription(String profileDescription) {
    
    
    
    this.profileDescription = profileDescription;
  }


  public UserProfileModel profileId(Integer profileId) {
    
    
    
    
    this.profileId = profileId;
    return this;
  }

   /**
   * Get profileId
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProfileId() {
    return profileId;
  }


  public void setProfileId(Integer profileId) {
    
    
    
    this.profileId = profileId;
  }


  public UserProfileModel profileName(String profileName) {
    
    
    
    
    this.profileName = profileName;
    return this;
  }

   /**
   * Get profileName
   * @return profileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileName() {
    return profileName;
  }


  public void setProfileName(String profileName) {
    
    
    
    this.profileName = profileName;
  }


  public UserProfileModel profileRequirements(String profileRequirements) {
    
    
    
    
    this.profileRequirements = profileRequirements;
    return this;
  }

   /**
   * Get profileRequirements
   * @return profileRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileRequirements() {
    return profileRequirements;
  }


  public void setProfileRequirements(String profileRequirements) {
    
    
    
    this.profileRequirements = profileRequirements;
  }


  public UserProfileModel profileResponsibilities(String profileResponsibilities) {
    
    
    
    
    this.profileResponsibilities = profileResponsibilities;
    return this;
  }

   /**
   * Get profileResponsibilities
   * @return profileResponsibilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfileResponsibilities() {
    return profileResponsibilities;
  }


  public void setProfileResponsibilities(String profileResponsibilities) {
    
    
    
    this.profileResponsibilities = profileResponsibilities;
  }


  public UserProfileModel salaryBandCurrency(String salaryBandCurrency) {
    
    
    
    
    this.salaryBandCurrency = salaryBandCurrency;
    return this;
  }

   /**
   * Get salaryBandCurrency
   * @return salaryBandCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSalaryBandCurrency() {
    return salaryBandCurrency;
  }


  public void setSalaryBandCurrency(String salaryBandCurrency) {
    
    
    
    this.salaryBandCurrency = salaryBandCurrency;
  }


  public UserProfileModel salaryBandMax(Double salaryBandMax) {
    
    
    
    
    this.salaryBandMax = salaryBandMax;
    return this;
  }

   /**
   * Get salaryBandMax
   * @return salaryBandMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSalaryBandMax() {
    return salaryBandMax;
  }


  public void setSalaryBandMax(Double salaryBandMax) {
    
    
    
    this.salaryBandMax = salaryBandMax;
  }


  public UserProfileModel salaryBandMin(Double salaryBandMin) {
    
    
    
    
    this.salaryBandMin = salaryBandMin;
    return this;
  }

   /**
   * Get salaryBandMin
   * @return salaryBandMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSalaryBandMin() {
    return salaryBandMin;
  }


  public void setSalaryBandMin(Double salaryBandMin) {
    
    
    
    this.salaryBandMin = salaryBandMin;
  }


  public UserProfileModel objectName(String objectName) {
    
    
    
    
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectName() {
    return objectName;
  }


  public void setObjectName(String objectName) {
    
    
    
    this.objectName = objectName;
  }


  public UserProfileModel objectType(String objectType) {
    
    
    
    
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


  public UserProfileModel objectid(Integer objectid) {
    
    
    
    
    this.objectid = objectid;
    return this;
  }

   /**
   * Get objectid
   * @return objectid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getObjectid() {
    return objectid;
  }


  public void setObjectid(Integer objectid) {
    
    
    
    this.objectid = objectid;
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
   * @return the UserProfileModel instance itself
   */
  public UserProfileModel putAdditionalProperty(String key, Object value) {
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
    UserProfileModel userProfileModel = (UserProfileModel) o;
    return Objects.equals(this.cid, userProfileModel.cid) &&
        Objects.equals(this.createuserid, userProfileModel.createuserid) &&
        Objects.equals(this.customFieldValueModelList, userProfileModel.customFieldValueModelList) &&
        Objects.equals(this.managerProfileId, userProfileModel.managerProfileId) &&
        Objects.equals(this.managerProfileName, userProfileModel.managerProfileName) &&
        Objects.equals(this.orgId, userProfileModel.orgId) &&
        Objects.equals(this.profileDescription, userProfileModel.profileDescription) &&
        Objects.equals(this.profileId, userProfileModel.profileId) &&
        Objects.equals(this.profileName, userProfileModel.profileName) &&
        Objects.equals(this.profileRequirements, userProfileModel.profileRequirements) &&
        Objects.equals(this.profileResponsibilities, userProfileModel.profileResponsibilities) &&
        Objects.equals(this.salaryBandCurrency, userProfileModel.salaryBandCurrency) &&
        Objects.equals(this.salaryBandMax, userProfileModel.salaryBandMax) &&
        Objects.equals(this.salaryBandMin, userProfileModel.salaryBandMin) &&
        Objects.equals(this.objectName, userProfileModel.objectName) &&
        Objects.equals(this.objectType, userProfileModel.objectType) &&
        Objects.equals(this.objectid, userProfileModel.objectid)&&
        Objects.equals(this.additionalProperties, userProfileModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, createuserid, customFieldValueModelList, managerProfileId, managerProfileName, orgId, profileDescription, profileId, profileName, profileRequirements, profileResponsibilities, salaryBandCurrency, salaryBandMax, salaryBandMin, objectName, objectType, objectid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileModel {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createuserid: ").append(toIndentedString(createuserid)).append("\n");
    sb.append("    customFieldValueModelList: ").append(toIndentedString(customFieldValueModelList)).append("\n");
    sb.append("    managerProfileId: ").append(toIndentedString(managerProfileId)).append("\n");
    sb.append("    managerProfileName: ").append(toIndentedString(managerProfileName)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    profileDescription: ").append(toIndentedString(profileDescription)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    profileRequirements: ").append(toIndentedString(profileRequirements)).append("\n");
    sb.append("    profileResponsibilities: ").append(toIndentedString(profileResponsibilities)).append("\n");
    sb.append("    salaryBandCurrency: ").append(toIndentedString(salaryBandCurrency)).append("\n");
    sb.append("    salaryBandMax: ").append(toIndentedString(salaryBandMax)).append("\n");
    sb.append("    salaryBandMin: ").append(toIndentedString(salaryBandMin)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectid: ").append(toIndentedString(objectid)).append("\n");
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
    openapiFields.add("createuserid");
    openapiFields.add("customFieldValueModelList");
    openapiFields.add("managerProfileId");
    openapiFields.add("managerProfileName");
    openapiFields.add("orgId");
    openapiFields.add("profileDescription");
    openapiFields.add("profileId");
    openapiFields.add("profileName");
    openapiFields.add("profileRequirements");
    openapiFields.add("profileResponsibilities");
    openapiFields.add("salaryBandCurrency");
    openapiFields.add("salaryBandMax");
    openapiFields.add("salaryBandMin");
    openapiFields.add("objectName");
    openapiFields.add("objectType");
    openapiFields.add("objectid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserProfileModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserProfileModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserProfileModel is not found in the empty JSON string", UserProfileModel.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("customFieldValueModelList") != null && !jsonObj.get("customFieldValueModelList").isJsonNull()) {
        JsonArray jsonArraycustomFieldValueModelList = jsonObj.getAsJsonArray("customFieldValueModelList");
        if (jsonArraycustomFieldValueModelList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customFieldValueModelList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customFieldValueModelList` to be an array in the JSON string but got `%s`", jsonObj.get("customFieldValueModelList").toString()));
          }

          // validate the optional field `customFieldValueModelList` (array)
          for (int i = 0; i < jsonArraycustomFieldValueModelList.size(); i++) {
            CustomFieldValueModel.validateJsonObject(jsonArraycustomFieldValueModelList.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("managerProfileName") != null && !jsonObj.get("managerProfileName").isJsonNull()) && !jsonObj.get("managerProfileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerProfileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerProfileName").toString()));
      }
      if ((jsonObj.get("profileDescription") != null && !jsonObj.get("profileDescription").isJsonNull()) && !jsonObj.get("profileDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileDescription").toString()));
      }
      if ((jsonObj.get("profileName") != null && !jsonObj.get("profileName").isJsonNull()) && !jsonObj.get("profileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileName").toString()));
      }
      if ((jsonObj.get("profileRequirements") != null && !jsonObj.get("profileRequirements").isJsonNull()) && !jsonObj.get("profileRequirements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileRequirements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileRequirements").toString()));
      }
      if ((jsonObj.get("profileResponsibilities") != null && !jsonObj.get("profileResponsibilities").isJsonNull()) && !jsonObj.get("profileResponsibilities").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileResponsibilities` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileResponsibilities").toString()));
      }
      if ((jsonObj.get("salaryBandCurrency") != null && !jsonObj.get("salaryBandCurrency").isJsonNull()) && !jsonObj.get("salaryBandCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salaryBandCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salaryBandCurrency").toString()));
      }
      if ((jsonObj.get("objectName") != null && !jsonObj.get("objectName").isJsonNull()) && !jsonObj.get("objectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectName").toString()));
      }
      if ((jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonNull()) && !jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserProfileModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserProfileModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserProfileModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserProfileModel.class));

       return (TypeAdapter<T>) new TypeAdapter<UserProfileModel>() {
           @Override
           public void write(JsonWriter out, UserProfileModel value) throws IOException {
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
           public UserProfileModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserProfileModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserProfileModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserProfileModel
  * @throws IOException if the JSON string is invalid with respect to UserProfileModel
  */
  public static UserProfileModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserProfileModel.class);
  }

 /**
  * Convert an instance of UserProfileModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

