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
 * PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner {
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_EMP_ID = "empId";
  @SerializedName(SERIALIZED_NAME_EMP_ID)
  private String empId;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_DISPLAY_FULL_NAME = "displayFullName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_FULL_NAME)
  private String displayFullName;

  public static final String SERIALIZED_NAME_USER_START_DATE = "userStartDate";
  @SerializedName(SERIALIZED_NAME_USER_START_DATE)
  private String userStartDate;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_DEPARTMENT_I_D = "departmentID";
  @SerializedName(SERIALIZED_NAME_DEPARTMENT_I_D)
  private String departmentID;

  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner() {
  }

  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner userId(String userId) {
    
    
    
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    
    
    
    this.userId = userId;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner empId(String empId) {
    
    
    
    
    this.empId = empId;
    return this;
  }

   /**
   * The unique identity of the employee. 
   * @return empId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "The unique identity of the employee. ")

  public String getEmpId() {
    return empId;
  }


  public void setEmpId(String empId) {
    
    
    
    this.empId = empId;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner displayFullName(String displayFullName) {
    
    
    
    
    this.displayFullName = displayFullName;
    return this;
  }

   /**
   * Get displayFullName
   * @return displayFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getDisplayFullName() {
    return displayFullName;
  }


  public void setDisplayFullName(String displayFullName) {
    
    
    
    this.displayFullName = displayFullName;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner userStartDate(String userStartDate) {
    
    
    
    
    this.userStartDate = userStartDate;
    return this;
  }

   /**
   * Get userStartDate
   * @return userStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "date", value = "")

  public String getUserStartDate() {
    return userStartDate;
  }


  public void setUserStartDate(String userStartDate) {
    
    
    
    this.userStartDate = userStartDate;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner locationId(String locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getLocationId() {
    return locationId;
  }


  public void setLocationId(String locationId) {
    
    
    
    this.locationId = locationId;
  }


  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner departmentID(String departmentID) {
    
    
    
    
    this.departmentID = departmentID;
    return this;
  }

   /**
   * Get departmentID
   * @return departmentID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getDepartmentID() {
    return departmentID;
  }


  public void setDepartmentID(String departmentID) {
    
    
    
    this.departmentID = departmentID;
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
   * @return the PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner instance itself
   */
  public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner putAdditionalProperty(String key, Object value) {
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
    PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner = (PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner) o;
    return Objects.equals(this.userId, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.userId) &&
        Objects.equals(this.firstName, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.firstName) &&
        Objects.equals(this.empId, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.empId) &&
        Objects.equals(this.lastName, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.lastName) &&
        Objects.equals(this.middleName, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.middleName) &&
        Objects.equals(this.email, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.email) &&
        Objects.equals(this.displayFullName, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.displayFullName) &&
        Objects.equals(this.userStartDate, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.userStartDate) &&
        Objects.equals(this.locationId, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.locationId) &&
        Objects.equals(this.departmentID, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.departmentID)&&
        Objects.equals(this.additionalProperties, peopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, empId, lastName, middleName, email, displayFullName, userStartDate, locationId, departmentID, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    empId: ").append(toIndentedString(empId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    displayFullName: ").append(toIndentedString(displayFullName)).append("\n");
    sb.append("    userStartDate: ").append(toIndentedString(userStartDate)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    departmentID: ").append(toIndentedString(departmentID)).append("\n");
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
    openapiFields.add("userId");
    openapiFields.add("firstName");
    openapiFields.add("empId");
    openapiFields.add("lastName");
    openapiFields.add("middleName");
    openapiFields.add("email");
    openapiFields.add("displayFullName");
    openapiFields.add("userStartDate");
    openapiFields.add("locationId");
    openapiFields.add("departmentID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner is not found in the empty JSON string", PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("empId") != null && !jsonObj.get("empId").isJsonNull()) && !jsonObj.get("empId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `empId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("empId").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("middleName") != null && !jsonObj.get("middleName").isJsonNull()) && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("displayFullName") != null && !jsonObj.get("displayFullName").isJsonNull()) && !jsonObj.get("displayFullName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayFullName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayFullName").toString()));
      }
      if ((jsonObj.get("userStartDate") != null && !jsonObj.get("userStartDate").isJsonNull()) && !jsonObj.get("userStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userStartDate").toString()));
      }
      if ((jsonObj.get("locationId") != null && !jsonObj.get("locationId").isJsonNull()) && !jsonObj.get("locationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationId").toString()));
      }
      if ((jsonObj.get("departmentID") != null && !jsonObj.get("departmentID").isJsonNull()) && !jsonObj.get("departmentID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `departmentID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("departmentID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner>() {
           @Override
           public void write(JsonWriter out, PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner value) throws IOException {
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
           public PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner
  * @throws IOException if the JSON string is invalid with respect to PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner
  */
  public static PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner.class);
  }

 /**
  * Convert an instance of PeopleAndPermissionsGetAllUsersDetailsResponseInnerSupervisorModelListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

