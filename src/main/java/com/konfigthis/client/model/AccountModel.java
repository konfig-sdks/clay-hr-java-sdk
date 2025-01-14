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
import com.konfigthis.client.model.ContactModel;
import com.konfigthis.client.model.UserViewModel;
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
 * AccountModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AccountModel {
  public static final String SERIALIZED_NAME_ACCOUNT_CREATE_USER_MODEL = "accountCreateUserModel";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_CREATE_USER_MODEL)
  private UserViewModel accountCreateUserModel;

  public static final String SERIALIZED_NAME_ACCOUNT_DESCRIPTION = "accountDescription";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DESCRIPTION)
  private String accountDescription;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_ACCOUNT_OWNER_MODEL = "accountOwnerModel";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNER_MODEL)
  private ContactModel accountOwnerModel;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public AccountModel() {
  }

  public AccountModel accountCreateUserModel(UserViewModel accountCreateUserModel) {
    
    
    
    
    this.accountCreateUserModel = accountCreateUserModel;
    return this;
  }

   /**
   * Get accountCreateUserModel
   * @return accountCreateUserModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserViewModel getAccountCreateUserModel() {
    return accountCreateUserModel;
  }


  public void setAccountCreateUserModel(UserViewModel accountCreateUserModel) {
    
    
    
    this.accountCreateUserModel = accountCreateUserModel;
  }


  public AccountModel accountDescription(String accountDescription) {
    
    
    
    
    this.accountDescription = accountDescription;
    return this;
  }

   /**
   * Get accountDescription
   * @return accountDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountDescription() {
    return accountDescription;
  }


  public void setAccountDescription(String accountDescription) {
    
    
    
    this.accountDescription = accountDescription;
  }


  public AccountModel accountId(Integer accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    
    
    
    this.accountId = accountId;
  }


  public AccountModel accountName(String accountName) {
    
    
    
    
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccountName() {
    return accountName;
  }


  public void setAccountName(String accountName) {
    
    
    
    this.accountName = accountName;
  }


  public AccountModel accountOwnerModel(ContactModel accountOwnerModel) {
    
    
    
    
    this.accountOwnerModel = accountOwnerModel;
    return this;
  }

   /**
   * Get accountOwnerModel
   * @return accountOwnerModel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactModel getAccountOwnerModel() {
    return accountOwnerModel;
  }


  public void setAccountOwnerModel(ContactModel accountOwnerModel) {
    
    
    
    this.accountOwnerModel = accountOwnerModel;
  }


  public AccountModel cid(Integer cid) {
    
    
    
    
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


  public AccountModel id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
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
   * @return the AccountModel instance itself
   */
  public AccountModel putAdditionalProperty(String key, Object value) {
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
    AccountModel accountModel = (AccountModel) o;
    return Objects.equals(this.accountCreateUserModel, accountModel.accountCreateUserModel) &&
        Objects.equals(this.accountDescription, accountModel.accountDescription) &&
        Objects.equals(this.accountId, accountModel.accountId) &&
        Objects.equals(this.accountName, accountModel.accountName) &&
        Objects.equals(this.accountOwnerModel, accountModel.accountOwnerModel) &&
        Objects.equals(this.cid, accountModel.cid) &&
        Objects.equals(this.id, accountModel.id)&&
        Objects.equals(this.additionalProperties, accountModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCreateUserModel, accountDescription, accountId, accountName, accountOwnerModel, cid, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountModel {\n");
    sb.append("    accountCreateUserModel: ").append(toIndentedString(accountCreateUserModel)).append("\n");
    sb.append("    accountDescription: ").append(toIndentedString(accountDescription)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountOwnerModel: ").append(toIndentedString(accountOwnerModel)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("accountCreateUserModel");
    openapiFields.add("accountDescription");
    openapiFields.add("accountId");
    openapiFields.add("accountName");
    openapiFields.add("accountOwnerModel");
    openapiFields.add("cid");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AccountModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountModel is not found in the empty JSON string", AccountModel.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `accountCreateUserModel`
      if (jsonObj.get("accountCreateUserModel") != null && !jsonObj.get("accountCreateUserModel").isJsonNull()) {
        UserViewModel.validateJsonObject(jsonObj.getAsJsonObject("accountCreateUserModel"));
      }
      if ((jsonObj.get("accountDescription") != null && !jsonObj.get("accountDescription").isJsonNull()) && !jsonObj.get("accountDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountDescription").toString()));
      }
      if ((jsonObj.get("accountName") != null && !jsonObj.get("accountName").isJsonNull()) && !jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      // validate the optional field `accountOwnerModel`
      if (jsonObj.get("accountOwnerModel") != null && !jsonObj.get("accountOwnerModel").isJsonNull()) {
        ContactModel.validateJsonObject(jsonObj.getAsJsonObject("accountOwnerModel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountModel>() {
           @Override
           public void write(JsonWriter out, AccountModel value) throws IOException {
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
           public AccountModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccountModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccountModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountModel
  * @throws IOException if the JSON string is invalid with respect to AccountModel
  */
  public static AccountModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountModel.class);
  }

 /**
  * Convert an instance of AccountModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

