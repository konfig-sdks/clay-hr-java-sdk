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
 * JobProfilesGetJobProfilesResponseInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JobProfilesGetJobProfilesResponseInner {
  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profileId";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_PROFILE_NAME = "profileName";
  @SerializedName(SERIALIZED_NAME_PROFILE_NAME)
  private String profileName;

  public static final String SERIALIZED_NAME_PROFILE_DESCRIPTION = "profileDescription";
  @SerializedName(SERIALIZED_NAME_PROFILE_DESCRIPTION)
  private String profileDescription;

  public static final String SERIALIZED_NAME_ORG_ID = "orgId";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_PROFILE_RESPONSIBILITIES = "profileResponsibilities";
  @SerializedName(SERIALIZED_NAME_PROFILE_RESPONSIBILITIES)
  private String profileResponsibilities;

  public static final String SERIALIZED_NAME_PROFILE_REQUIREMENTS = "profileRequirements";
  @SerializedName(SERIALIZED_NAME_PROFILE_REQUIREMENTS)
  private String profileRequirements;

  public static final String SERIALIZED_NAME_SALARY_BAND_MIN = "salaryBandMin";
  @SerializedName(SERIALIZED_NAME_SALARY_BAND_MIN)
  private String salaryBandMin;

  public static final String SERIALIZED_NAME_SALARY_BAND_MAX = "salaryBandMax";
  @SerializedName(SERIALIZED_NAME_SALARY_BAND_MAX)
  private String salaryBandMax;

  public static final String SERIALIZED_NAME_SALARY_BAND_CURRENCY = "salaryBandCurrency";
  @SerializedName(SERIALIZED_NAME_SALARY_BAND_CURRENCY)
  private String salaryBandCurrency;

  public static final String SERIALIZED_NAME_MANAGER_PROFILE_ID = "managerProfileId";
  @SerializedName(SERIALIZED_NAME_MANAGER_PROFILE_ID)
  private String managerProfileId;

  public static final String SERIALIZED_NAME_MANAGER_PROFILE_NAME = "managerProfileName";
  @SerializedName(SERIALIZED_NAME_MANAGER_PROFILE_NAME)
  private String managerProfileName;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_VALUE_MODEL_LIST = "customFieldValueModelList";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_VALUE_MODEL_LIST)
  private String customFieldValueModelList;

  public static final String SERIALIZED_NAME_NUMBEROF_USERS = "numberofUsers";
  @SerializedName(SERIALIZED_NAME_NUMBEROF_USERS)
  private String numberofUsers;

  public static final String SERIALIZED_NAME_CREATEUSERID = "createuserid";
  @SerializedName(SERIALIZED_NAME_CREATEUSERID)
  private String createuserid;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CAREER_PATHWAY_MODEL_LIST = "careerPathwayModelList";
  @SerializedName(SERIALIZED_NAME_CAREER_PATHWAY_MODEL_LIST)
  private String careerPathwayModelList;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "objectType";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "objectName";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName;

  public static final String SERIALIZED_NAME_OBJECTID = "objectid";
  @SerializedName(SERIALIZED_NAME_OBJECTID)
  private String objectid;

  public JobProfilesGetJobProfilesResponseInner() {
  }

  public JobProfilesGetJobProfilesResponseInner cid(String cid) {
    
    
    
    
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


  public JobProfilesGetJobProfilesResponseInner profileId(String profileId) {
    
    
    
    
    this.profileId = profileId;
    return this;
  }

   /**
   * Get profileId
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    
    
    
    this.profileId = profileId;
  }


  public JobProfilesGetJobProfilesResponseInner profileName(String profileName) {
    
    
    
    
    this.profileName = profileName;
    return this;
  }

   /**
   * Get profileName
   * @return profileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getProfileName() {
    return profileName;
  }


  public void setProfileName(String profileName) {
    
    
    
    this.profileName = profileName;
  }


  public JobProfilesGetJobProfilesResponseInner profileDescription(String profileDescription) {
    
    
    
    
    this.profileDescription = profileDescription;
    return this;
  }

   /**
   * Get profileDescription
   * @return profileDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getProfileDescription() {
    return profileDescription;
  }


  public void setProfileDescription(String profileDescription) {
    
    
    
    this.profileDescription = profileDescription;
  }


  public JobProfilesGetJobProfilesResponseInner orgId(String orgId) {
    
    
    
    
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getOrgId() {
    return orgId;
  }


  public void setOrgId(String orgId) {
    
    
    
    this.orgId = orgId;
  }


  public JobProfilesGetJobProfilesResponseInner profileResponsibilities(String profileResponsibilities) {
    
    
    
    
    this.profileResponsibilities = profileResponsibilities;
    return this;
  }

   /**
   * Get profileResponsibilities
   * @return profileResponsibilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getProfileResponsibilities() {
    return profileResponsibilities;
  }


  public void setProfileResponsibilities(String profileResponsibilities) {
    
    
    
    this.profileResponsibilities = profileResponsibilities;
  }


  public JobProfilesGetJobProfilesResponseInner profileRequirements(String profileRequirements) {
    
    
    
    
    this.profileRequirements = profileRequirements;
    return this;
  }

   /**
   * Get profileRequirements
   * @return profileRequirements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getProfileRequirements() {
    return profileRequirements;
  }


  public void setProfileRequirements(String profileRequirements) {
    
    
    
    this.profileRequirements = profileRequirements;
  }


  public JobProfilesGetJobProfilesResponseInner salaryBandMin(String salaryBandMin) {
    
    
    
    
    this.salaryBandMin = salaryBandMin;
    return this;
  }

   /**
   * Get salaryBandMin
   * @return salaryBandMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getSalaryBandMin() {
    return salaryBandMin;
  }


  public void setSalaryBandMin(String salaryBandMin) {
    
    
    
    this.salaryBandMin = salaryBandMin;
  }


  public JobProfilesGetJobProfilesResponseInner salaryBandMax(String salaryBandMax) {
    
    
    
    
    this.salaryBandMax = salaryBandMax;
    return this;
  }

   /**
   * Get salaryBandMax
   * @return salaryBandMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getSalaryBandMax() {
    return salaryBandMax;
  }


  public void setSalaryBandMax(String salaryBandMax) {
    
    
    
    this.salaryBandMax = salaryBandMax;
  }


  public JobProfilesGetJobProfilesResponseInner salaryBandCurrency(String salaryBandCurrency) {
    
    
    
    
    this.salaryBandCurrency = salaryBandCurrency;
    return this;
  }

   /**
   * Get salaryBandCurrency
   * @return salaryBandCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getSalaryBandCurrency() {
    return salaryBandCurrency;
  }


  public void setSalaryBandCurrency(String salaryBandCurrency) {
    
    
    
    this.salaryBandCurrency = salaryBandCurrency;
  }


  public JobProfilesGetJobProfilesResponseInner managerProfileId(String managerProfileId) {
    
    
    
    
    this.managerProfileId = managerProfileId;
    return this;
  }

   /**
   * Get managerProfileId
   * @return managerProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getManagerProfileId() {
    return managerProfileId;
  }


  public void setManagerProfileId(String managerProfileId) {
    
    
    
    this.managerProfileId = managerProfileId;
  }


  public JobProfilesGetJobProfilesResponseInner managerProfileName(String managerProfileName) {
    
    
    
    
    this.managerProfileName = managerProfileName;
    return this;
  }

   /**
   * Get managerProfileName
   * @return managerProfileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getManagerProfileName() {
    return managerProfileName;
  }


  public void setManagerProfileName(String managerProfileName) {
    
    
    
    this.managerProfileName = managerProfileName;
  }


  public JobProfilesGetJobProfilesResponseInner customFieldValueModelList(String customFieldValueModelList) {
    
    
    
    
    this.customFieldValueModelList = customFieldValueModelList;
    return this;
  }

   /**
   * Get customFieldValueModelList
   * @return customFieldValueModelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getCustomFieldValueModelList() {
    return customFieldValueModelList;
  }


  public void setCustomFieldValueModelList(String customFieldValueModelList) {
    
    
    
    this.customFieldValueModelList = customFieldValueModelList;
  }


  public JobProfilesGetJobProfilesResponseInner numberofUsers(String numberofUsers) {
    
    
    
    
    this.numberofUsers = numberofUsers;
    return this;
  }

   /**
   * Get numberofUsers
   * @return numberofUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getNumberofUsers() {
    return numberofUsers;
  }


  public void setNumberofUsers(String numberofUsers) {
    
    
    
    this.numberofUsers = numberofUsers;
  }


  public JobProfilesGetJobProfilesResponseInner createuserid(String createuserid) {
    
    
    
    
    this.createuserid = createuserid;
    return this;
  }

   /**
   * Get createuserid
   * @return createuserid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getCreateuserid() {
    return createuserid;
  }


  public void setCreateuserid(String createuserid) {
    
    
    
    this.createuserid = createuserid;
  }


  public JobProfilesGetJobProfilesResponseInner status(String status) {
    
    
    
    
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


  public JobProfilesGetJobProfilesResponseInner careerPathwayModelList(String careerPathwayModelList) {
    
    
    
    
    this.careerPathwayModelList = careerPathwayModelList;
    return this;
  }

   /**
   * Get careerPathwayModelList
   * @return careerPathwayModelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getCareerPathwayModelList() {
    return careerPathwayModelList;
  }


  public void setCareerPathwayModelList(String careerPathwayModelList) {
    
    
    
    this.careerPathwayModelList = careerPathwayModelList;
  }


  public JobProfilesGetJobProfilesResponseInner objectType(String objectType) {
    
    
    
    
    this.objectType = objectType;
    return this;
  }

   /**
   * Get objectType
   * @return objectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    
    
    
    this.objectType = objectType;
  }


  public JobProfilesGetJobProfilesResponseInner objectName(String objectName) {
    
    
    
    
    this.objectName = objectName;
    return this;
  }

   /**
   * Get objectName
   * @return objectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getObjectName() {
    return objectName;
  }


  public void setObjectName(String objectName) {
    
    
    
    this.objectName = objectName;
  }


  public JobProfilesGetJobProfilesResponseInner objectid(String objectid) {
    
    
    
    
    this.objectid = objectid;
    return this;
  }

   /**
   * Get objectid
   * @return objectid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getObjectid() {
    return objectid;
  }


  public void setObjectid(String objectid) {
    
    
    
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
   * @return the JobProfilesGetJobProfilesResponseInner instance itself
   */
  public JobProfilesGetJobProfilesResponseInner putAdditionalProperty(String key, Object value) {
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
    JobProfilesGetJobProfilesResponseInner jobProfilesGetJobProfilesResponseInner = (JobProfilesGetJobProfilesResponseInner) o;
    return Objects.equals(this.cid, jobProfilesGetJobProfilesResponseInner.cid) &&
        Objects.equals(this.profileId, jobProfilesGetJobProfilesResponseInner.profileId) &&
        Objects.equals(this.profileName, jobProfilesGetJobProfilesResponseInner.profileName) &&
        Objects.equals(this.profileDescription, jobProfilesGetJobProfilesResponseInner.profileDescription) &&
        Objects.equals(this.orgId, jobProfilesGetJobProfilesResponseInner.orgId) &&
        Objects.equals(this.profileResponsibilities, jobProfilesGetJobProfilesResponseInner.profileResponsibilities) &&
        Objects.equals(this.profileRequirements, jobProfilesGetJobProfilesResponseInner.profileRequirements) &&
        Objects.equals(this.salaryBandMin, jobProfilesGetJobProfilesResponseInner.salaryBandMin) &&
        Objects.equals(this.salaryBandMax, jobProfilesGetJobProfilesResponseInner.salaryBandMax) &&
        Objects.equals(this.salaryBandCurrency, jobProfilesGetJobProfilesResponseInner.salaryBandCurrency) &&
        Objects.equals(this.managerProfileId, jobProfilesGetJobProfilesResponseInner.managerProfileId) &&
        Objects.equals(this.managerProfileName, jobProfilesGetJobProfilesResponseInner.managerProfileName) &&
        Objects.equals(this.customFieldValueModelList, jobProfilesGetJobProfilesResponseInner.customFieldValueModelList) &&
        Objects.equals(this.numberofUsers, jobProfilesGetJobProfilesResponseInner.numberofUsers) &&
        Objects.equals(this.createuserid, jobProfilesGetJobProfilesResponseInner.createuserid) &&
        Objects.equals(this.status, jobProfilesGetJobProfilesResponseInner.status) &&
        Objects.equals(this.careerPathwayModelList, jobProfilesGetJobProfilesResponseInner.careerPathwayModelList) &&
        Objects.equals(this.objectType, jobProfilesGetJobProfilesResponseInner.objectType) &&
        Objects.equals(this.objectName, jobProfilesGetJobProfilesResponseInner.objectName) &&
        Objects.equals(this.objectid, jobProfilesGetJobProfilesResponseInner.objectid)&&
        Objects.equals(this.additionalProperties, jobProfilesGetJobProfilesResponseInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, profileId, profileName, profileDescription, orgId, profileResponsibilities, profileRequirements, salaryBandMin, salaryBandMax, salaryBandCurrency, managerProfileId, managerProfileName, customFieldValueModelList, numberofUsers, createuserid, status, careerPathwayModelList, objectType, objectName, objectid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobProfilesGetJobProfilesResponseInner {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    profileName: ").append(toIndentedString(profileName)).append("\n");
    sb.append("    profileDescription: ").append(toIndentedString(profileDescription)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    profileResponsibilities: ").append(toIndentedString(profileResponsibilities)).append("\n");
    sb.append("    profileRequirements: ").append(toIndentedString(profileRequirements)).append("\n");
    sb.append("    salaryBandMin: ").append(toIndentedString(salaryBandMin)).append("\n");
    sb.append("    salaryBandMax: ").append(toIndentedString(salaryBandMax)).append("\n");
    sb.append("    salaryBandCurrency: ").append(toIndentedString(salaryBandCurrency)).append("\n");
    sb.append("    managerProfileId: ").append(toIndentedString(managerProfileId)).append("\n");
    sb.append("    managerProfileName: ").append(toIndentedString(managerProfileName)).append("\n");
    sb.append("    customFieldValueModelList: ").append(toIndentedString(customFieldValueModelList)).append("\n");
    sb.append("    numberofUsers: ").append(toIndentedString(numberofUsers)).append("\n");
    sb.append("    createuserid: ").append(toIndentedString(createuserid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    careerPathwayModelList: ").append(toIndentedString(careerPathwayModelList)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
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
    openapiFields.add("profileId");
    openapiFields.add("profileName");
    openapiFields.add("profileDescription");
    openapiFields.add("orgId");
    openapiFields.add("profileResponsibilities");
    openapiFields.add("profileRequirements");
    openapiFields.add("salaryBandMin");
    openapiFields.add("salaryBandMax");
    openapiFields.add("salaryBandCurrency");
    openapiFields.add("managerProfileId");
    openapiFields.add("managerProfileName");
    openapiFields.add("customFieldValueModelList");
    openapiFields.add("numberofUsers");
    openapiFields.add("createuserid");
    openapiFields.add("status");
    openapiFields.add("careerPathwayModelList");
    openapiFields.add("objectType");
    openapiFields.add("objectName");
    openapiFields.add("objectid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JobProfilesGetJobProfilesResponseInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JobProfilesGetJobProfilesResponseInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JobProfilesGetJobProfilesResponseInner is not found in the empty JSON string", JobProfilesGetJobProfilesResponseInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
      if ((jsonObj.get("profileId") != null && !jsonObj.get("profileId").isJsonNull()) && !jsonObj.get("profileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileId").toString()));
      }
      if ((jsonObj.get("profileName") != null && !jsonObj.get("profileName").isJsonNull()) && !jsonObj.get("profileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileName").toString()));
      }
      if ((jsonObj.get("profileDescription") != null && !jsonObj.get("profileDescription").isJsonNull()) && !jsonObj.get("profileDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileDescription").toString()));
      }
      if ((jsonObj.get("orgId") != null && !jsonObj.get("orgId").isJsonNull()) && !jsonObj.get("orgId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orgId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orgId").toString()));
      }
      if ((jsonObj.get("profileResponsibilities") != null && !jsonObj.get("profileResponsibilities").isJsonNull()) && !jsonObj.get("profileResponsibilities").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileResponsibilities` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileResponsibilities").toString()));
      }
      if ((jsonObj.get("profileRequirements") != null && !jsonObj.get("profileRequirements").isJsonNull()) && !jsonObj.get("profileRequirements").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profileRequirements` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profileRequirements").toString()));
      }
      if ((jsonObj.get("salaryBandMin") != null && !jsonObj.get("salaryBandMin").isJsonNull()) && !jsonObj.get("salaryBandMin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salaryBandMin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salaryBandMin").toString()));
      }
      if ((jsonObj.get("salaryBandMax") != null && !jsonObj.get("salaryBandMax").isJsonNull()) && !jsonObj.get("salaryBandMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salaryBandMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salaryBandMax").toString()));
      }
      if ((jsonObj.get("salaryBandCurrency") != null && !jsonObj.get("salaryBandCurrency").isJsonNull()) && !jsonObj.get("salaryBandCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `salaryBandCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("salaryBandCurrency").toString()));
      }
      if ((jsonObj.get("managerProfileId") != null && !jsonObj.get("managerProfileId").isJsonNull()) && !jsonObj.get("managerProfileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerProfileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerProfileId").toString()));
      }
      if ((jsonObj.get("managerProfileName") != null && !jsonObj.get("managerProfileName").isJsonNull()) && !jsonObj.get("managerProfileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerProfileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerProfileName").toString()));
      }
      if ((jsonObj.get("customFieldValueModelList") != null && !jsonObj.get("customFieldValueModelList").isJsonNull()) && !jsonObj.get("customFieldValueModelList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customFieldValueModelList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customFieldValueModelList").toString()));
      }
      if ((jsonObj.get("numberofUsers") != null && !jsonObj.get("numberofUsers").isJsonNull()) && !jsonObj.get("numberofUsers").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberofUsers` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberofUsers").toString()));
      }
      if ((jsonObj.get("createuserid") != null && !jsonObj.get("createuserid").isJsonNull()) && !jsonObj.get("createuserid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createuserid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createuserid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("careerPathwayModelList") != null && !jsonObj.get("careerPathwayModelList").isJsonNull()) && !jsonObj.get("careerPathwayModelList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `careerPathwayModelList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("careerPathwayModelList").toString()));
      }
      if ((jsonObj.get("objectType") != null && !jsonObj.get("objectType").isJsonNull()) && !jsonObj.get("objectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectType").toString()));
      }
      if ((jsonObj.get("objectName") != null && !jsonObj.get("objectName").isJsonNull()) && !jsonObj.get("objectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectName").toString()));
      }
      if ((jsonObj.get("objectid") != null && !jsonObj.get("objectid").isJsonNull()) && !jsonObj.get("objectid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `objectid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("objectid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JobProfilesGetJobProfilesResponseInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JobProfilesGetJobProfilesResponseInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JobProfilesGetJobProfilesResponseInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JobProfilesGetJobProfilesResponseInner.class));

       return (TypeAdapter<T>) new TypeAdapter<JobProfilesGetJobProfilesResponseInner>() {
           @Override
           public void write(JsonWriter out, JobProfilesGetJobProfilesResponseInner value) throws IOException {
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
           public JobProfilesGetJobProfilesResponseInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JobProfilesGetJobProfilesResponseInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JobProfilesGetJobProfilesResponseInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JobProfilesGetJobProfilesResponseInner
  * @throws IOException if the JSON string is invalid with respect to JobProfilesGetJobProfilesResponseInner
  */
  public static JobProfilesGetJobProfilesResponseInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JobProfilesGetJobProfilesResponseInner.class);
  }

 /**
  * Convert an instance of JobProfilesGetJobProfilesResponseInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

