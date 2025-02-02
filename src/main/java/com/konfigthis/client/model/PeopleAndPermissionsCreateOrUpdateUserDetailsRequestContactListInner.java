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
 * PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  /**
   * Gets or Sets relationToUser
   */
  @JsonAdapter(RelationToUserEnum.Adapter.class)
 public enum RelationToUserEnum {
    SPOUSE("Spouse"),
    
    PARENT("Parent"),
    
    CHILD("Child"),
    
    OTHER("Other");

    private String value;

    RelationToUserEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RelationToUserEnum fromValue(String value) {
      for (RelationToUserEnum b : RelationToUserEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RelationToUserEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelationToUserEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelationToUserEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RelationToUserEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RELATION_TO_USER = "relationToUser";
  @SerializedName(SERIALIZED_NAME_RELATION_TO_USER)
  private RelationToUserEnum relationToUser;

  /**
   * Gets or Sets contactType
   */
  @JsonAdapter(ContactTypeEnum.Adapter.class)
 public enum ContactTypeEnum {
    DEP("DEP"),
    
    ECON("ECON"),
    
    ACCT("ACCT");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContactTypeEnum fromValue(String value) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContactTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContactTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContactTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ContactTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONTACT_TYPE = "contactType";
  @SerializedName(SERIALIZED_NAME_CONTACT_TYPE)
  private ContactTypeEnum contactType;

  /**
   * Gets or Sets gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
 public enum GenderEnum {
    M("M"),
    
    F("F"),
    
    H("H");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;

  public static final String SERIALIZED_NAME_TAX_NUMBER = "taxNumber";
  @SerializedName(SERIALIZED_NAME_TAX_NUMBER)
  private String taxNumber;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private String dateOfBirth;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    AP("AP"),
    
    WA("WA");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_EXT_APP_U_I_D = "extAppUID";
  @SerializedName(SERIALIZED_NAME_EXT_APP_U_I_D)
  private String extAppUID;

  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner() {
  }

  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner name(String name) {
    
    
    
    
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


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner relationToUser(RelationToUserEnum relationToUser) {
    
    
    
    
    this.relationToUser = relationToUser;
    return this;
  }

   /**
   * Get relationToUser
   * @return relationToUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RelationToUserEnum getRelationToUser() {
    return relationToUser;
  }


  public void setRelationToUser(RelationToUserEnum relationToUser) {
    
    
    
    this.relationToUser = relationToUser;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner contactType(ContactTypeEnum contactType) {
    
    
    
    
    this.contactType = contactType;
    return this;
  }

   /**
   * Get contactType
   * @return contactType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactTypeEnum getContactType() {
    return contactType;
  }


  public void setContactType(ContactTypeEnum contactType) {
    
    
    
    this.contactType = contactType;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner gender(GenderEnum gender) {
    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    
    
    
    this.gender = gender;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner taxNumber(String taxNumber) {
    
    
    
    
    this.taxNumber = taxNumber;
    return this;
  }

   /**
   * Get taxNumber
   * @return taxNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaxNumber() {
    return taxNumber;
  }


  public void setTaxNumber(String taxNumber) {
    
    
    
    this.taxNumber = taxNumber;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner dateOfBirth(String dateOfBirth) {
    
    
    
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    
    
    
    this.dateOfBirth = dateOfBirth;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
  }


  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner extAppUID(String extAppUID) {
    
    
    
    
    this.extAppUID = extAppUID;
    return this;
  }

   /**
   * Get extAppUID
   * @return extAppUID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExtAppUID() {
    return extAppUID;
  }


  public void setExtAppUID(String extAppUID) {
    
    
    
    this.extAppUID = extAppUID;
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
   * @return the PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner instance itself
   */
  public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner putAdditionalProperty(String key, Object value) {
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
    PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner = (PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner) o;
    return Objects.equals(this.name, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.name) &&
        Objects.equals(this.lastName, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.lastName) &&
        Objects.equals(this.relationToUser, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.relationToUser) &&
        Objects.equals(this.contactType, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.contactType) &&
        Objects.equals(this.gender, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.gender) &&
        Objects.equals(this.taxNumber, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.taxNumber) &&
        Objects.equals(this.dateOfBirth, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.dateOfBirth) &&
        Objects.equals(this.status, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.status) &&
        Objects.equals(this.extAppUID, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.extAppUID)&&
        Objects.equals(this.additionalProperties, peopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, lastName, relationToUser, contactType, gender, taxNumber, dateOfBirth, status, extAppUID, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    relationToUser: ").append(toIndentedString(relationToUser)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    taxNumber: ").append(toIndentedString(taxNumber)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    extAppUID: ").append(toIndentedString(extAppUID)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("lastName");
    openapiFields.add("relationToUser");
    openapiFields.add("contactType");
    openapiFields.add("gender");
    openapiFields.add("taxNumber");
    openapiFields.add("dateOfBirth");
    openapiFields.add("status");
    openapiFields.add("extAppUID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner is not found in the empty JSON string", PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("relationToUser") != null && !jsonObj.get("relationToUser").isJsonNull()) && !jsonObj.get("relationToUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationToUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationToUser").toString()));
      }
      if ((jsonObj.get("contactType") != null && !jsonObj.get("contactType").isJsonNull()) && !jsonObj.get("contactType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contactType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contactType").toString()));
      }
      if ((jsonObj.get("gender") != null && !jsonObj.get("gender").isJsonNull()) && !jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if ((jsonObj.get("taxNumber") != null && !jsonObj.get("taxNumber").isJsonNull()) && !jsonObj.get("taxNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxNumber").toString()));
      }
      if ((jsonObj.get("dateOfBirth") != null && !jsonObj.get("dateOfBirth").isJsonNull()) && !jsonObj.get("dateOfBirth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfBirth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfBirth").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("extAppUID") != null && !jsonObj.get("extAppUID").isJsonNull()) && !jsonObj.get("extAppUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extAppUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extAppUID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner>() {
           @Override
           public void write(JsonWriter out, PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner value) throws IOException {
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
           public PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner
  * @throws IOException if the JSON string is invalid with respect to PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner
  */
  public static PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner.class);
  }

 /**
  * Convert an instance of PeopleAndPermissionsCreateOrUpdateUserDetailsRequestContactListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

