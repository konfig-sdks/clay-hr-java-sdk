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
import com.konfigthis.client.model.AddressModel;
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
 * LocationModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LocationModel {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ADDRESS_MODEL_LIST = "addressModelList";
  @SerializedName(SERIALIZED_NAME_ADDRESS_MODEL_LIST)
  private List<AddressModel> addressModelList = null;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Integer cid;

  public static final String SERIALIZED_NAME_CREATEUSERID = "createuserid";
  @SerializedName(SERIALIZED_NAME_CREATEUSERID)
  private Integer createuserid;

  public static final String SERIALIZED_NAME_LATTITUDE = "lattitude";
  @SerializedName(SERIALIZED_NAME_LATTITUDE)
  private String lattitude;

  public static final String SERIALIZED_NAME_LOCATION_CODE = "locationCode";
  @SerializedName(SERIALIZED_NAME_LOCATION_CODE)
  private String locationCode;

  public static final String SERIALIZED_NAME_LOCATION_DESCRIPTION = "locationDescription";
  @SerializedName(SERIALIZED_NAME_LOCATION_DESCRIPTION)
  private String locationDescription;

  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private Integer locationId;

  public static final String SERIALIZED_NAME_LOCATION_LABEL = "locationLabel";
  @SerializedName(SERIALIZED_NAME_LOCATION_LABEL)
  private String locationLabel;

  public static final String SERIALIZED_NAME_LOCATION_NAME = "locationName";
  @SerializedName(SERIALIZED_NAME_LOCATION_NAME)
  private String locationName;

  public static final String SERIALIZED_NAME_LOCATION_TYPE = "locationType";
  @SerializedName(SERIALIZED_NAME_LOCATION_TYPE)
  private String locationType;

  public static final String SERIALIZED_NAME_LOCATION_U_I_D = "locationUID";
  @SerializedName(SERIALIZED_NAME_LOCATION_U_I_D)
  private String locationUID;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_PARENT_LOCATION_ID = "parentLocationId";
  @SerializedName(SERIALIZED_NAME_PARENT_LOCATION_ID)
  private Integer parentLocationId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_WORKING_DAYS = "workingDays";
  @SerializedName(SERIALIZED_NAME_WORKING_DAYS)
  private String workingDays;

  public LocationModel() {
  }

  public LocationModel address(String address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    
    
    
    this.address = address;
  }


  public LocationModel addressModelList(List<AddressModel> addressModelList) {
    
    
    
    
    this.addressModelList = addressModelList;
    return this;
  }

  public LocationModel addAddressModelListItem(AddressModel addressModelListItem) {
    if (this.addressModelList == null) {
      this.addressModelList = new ArrayList<>();
    }
    this.addressModelList.add(addressModelListItem);
    return this;
  }

   /**
   * Get addressModelList
   * @return addressModelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AddressModel> getAddressModelList() {
    return addressModelList;
  }


  public void setAddressModelList(List<AddressModel> addressModelList) {
    
    
    
    this.addressModelList = addressModelList;
  }


  public LocationModel cid(Integer cid) {
    
    
    
    
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


  public LocationModel createuserid(Integer createuserid) {
    
    
    
    
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


  public LocationModel lattitude(String lattitude) {
    
    
    
    
    this.lattitude = lattitude;
    return this;
  }

   /**
   * Get lattitude
   * @return lattitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLattitude() {
    return lattitude;
  }


  public void setLattitude(String lattitude) {
    
    
    
    this.lattitude = lattitude;
  }


  public LocationModel locationCode(String locationCode) {
    
    
    
    
    this.locationCode = locationCode;
    return this;
  }

   /**
   * Get locationCode
   * @return locationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationCode() {
    return locationCode;
  }


  public void setLocationCode(String locationCode) {
    
    
    
    this.locationCode = locationCode;
  }


  public LocationModel locationDescription(String locationDescription) {
    
    
    
    
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationDescription() {
    return locationDescription;
  }


  public void setLocationDescription(String locationDescription) {
    
    
    
    this.locationDescription = locationDescription;
  }


  public LocationModel locationId(Integer locationId) {
    
    
    
    
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLocationId() {
    return locationId;
  }


  public void setLocationId(Integer locationId) {
    
    
    
    this.locationId = locationId;
  }


  public LocationModel locationLabel(String locationLabel) {
    
    
    
    
    this.locationLabel = locationLabel;
    return this;
  }

   /**
   * Get locationLabel
   * @return locationLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationLabel() {
    return locationLabel;
  }


  public void setLocationLabel(String locationLabel) {
    
    
    
    this.locationLabel = locationLabel;
  }


  public LocationModel locationName(String locationName) {
    
    
    
    
    this.locationName = locationName;
    return this;
  }

   /**
   * Get locationName
   * @return locationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationName() {
    return locationName;
  }


  public void setLocationName(String locationName) {
    
    
    
    this.locationName = locationName;
  }


  public LocationModel locationType(String locationType) {
    
    
    
    
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationType() {
    return locationType;
  }


  public void setLocationType(String locationType) {
    
    
    
    this.locationType = locationType;
  }


  public LocationModel locationUID(String locationUID) {
    
    
    
    
    this.locationUID = locationUID;
    return this;
  }

   /**
   * Get locationUID
   * @return locationUID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocationUID() {
    return locationUID;
  }


  public void setLocationUID(String locationUID) {
    
    
    
    this.locationUID = locationUID;
  }


  public LocationModel longitude(String longitude) {
    
    
    
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    
    
    
    this.longitude = longitude;
  }


  public LocationModel parentLocationId(Integer parentLocationId) {
    
    
    
    
    this.parentLocationId = parentLocationId;
    return this;
  }

   /**
   * Get parentLocationId
   * @return parentLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getParentLocationId() {
    return parentLocationId;
  }


  public void setParentLocationId(Integer parentLocationId) {
    
    
    
    this.parentLocationId = parentLocationId;
  }


  public LocationModel status(String status) {
    
    
    
    
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


  public LocationModel workingDays(String workingDays) {
    
    
    
    
    this.workingDays = workingDays;
    return this;
  }

   /**
   * Get workingDays
   * @return workingDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkingDays() {
    return workingDays;
  }


  public void setWorkingDays(String workingDays) {
    
    
    
    this.workingDays = workingDays;
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
   * @return the LocationModel instance itself
   */
  public LocationModel putAdditionalProperty(String key, Object value) {
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
    LocationModel locationModel = (LocationModel) o;
    return Objects.equals(this.address, locationModel.address) &&
        Objects.equals(this.addressModelList, locationModel.addressModelList) &&
        Objects.equals(this.cid, locationModel.cid) &&
        Objects.equals(this.createuserid, locationModel.createuserid) &&
        Objects.equals(this.lattitude, locationModel.lattitude) &&
        Objects.equals(this.locationCode, locationModel.locationCode) &&
        Objects.equals(this.locationDescription, locationModel.locationDescription) &&
        Objects.equals(this.locationId, locationModel.locationId) &&
        Objects.equals(this.locationLabel, locationModel.locationLabel) &&
        Objects.equals(this.locationName, locationModel.locationName) &&
        Objects.equals(this.locationType, locationModel.locationType) &&
        Objects.equals(this.locationUID, locationModel.locationUID) &&
        Objects.equals(this.longitude, locationModel.longitude) &&
        Objects.equals(this.parentLocationId, locationModel.parentLocationId) &&
        Objects.equals(this.status, locationModel.status) &&
        Objects.equals(this.workingDays, locationModel.workingDays)&&
        Objects.equals(this.additionalProperties, locationModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressModelList, cid, createuserid, lattitude, locationCode, locationDescription, locationId, locationLabel, locationName, locationType, locationUID, longitude, parentLocationId, status, workingDays, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressModelList: ").append(toIndentedString(addressModelList)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    createuserid: ").append(toIndentedString(createuserid)).append("\n");
    sb.append("    lattitude: ").append(toIndentedString(lattitude)).append("\n");
    sb.append("    locationCode: ").append(toIndentedString(locationCode)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationLabel: ").append(toIndentedString(locationLabel)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    locationUID: ").append(toIndentedString(locationUID)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    parentLocationId: ").append(toIndentedString(parentLocationId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    workingDays: ").append(toIndentedString(workingDays)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("addressModelList");
    openapiFields.add("cid");
    openapiFields.add("createuserid");
    openapiFields.add("lattitude");
    openapiFields.add("locationCode");
    openapiFields.add("locationDescription");
    openapiFields.add("locationId");
    openapiFields.add("locationLabel");
    openapiFields.add("locationName");
    openapiFields.add("locationType");
    openapiFields.add("locationUID");
    openapiFields.add("longitude");
    openapiFields.add("parentLocationId");
    openapiFields.add("status");
    openapiFields.add("workingDays");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LocationModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LocationModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LocationModel is not found in the empty JSON string", LocationModel.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("addressModelList") != null && !jsonObj.get("addressModelList").isJsonNull()) {
        JsonArray jsonArrayaddressModelList = jsonObj.getAsJsonArray("addressModelList");
        if (jsonArrayaddressModelList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addressModelList").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addressModelList` to be an array in the JSON string but got `%s`", jsonObj.get("addressModelList").toString()));
          }

          // validate the optional field `addressModelList` (array)
          for (int i = 0; i < jsonArrayaddressModelList.size(); i++) {
            AddressModel.validateJsonObject(jsonArrayaddressModelList.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("lattitude") != null && !jsonObj.get("lattitude").isJsonNull()) && !jsonObj.get("lattitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lattitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lattitude").toString()));
      }
      if ((jsonObj.get("locationCode") != null && !jsonObj.get("locationCode").isJsonNull()) && !jsonObj.get("locationCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationCode").toString()));
      }
      if ((jsonObj.get("locationDescription") != null && !jsonObj.get("locationDescription").isJsonNull()) && !jsonObj.get("locationDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationDescription").toString()));
      }
      if ((jsonObj.get("locationLabel") != null && !jsonObj.get("locationLabel").isJsonNull()) && !jsonObj.get("locationLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationLabel").toString()));
      }
      if ((jsonObj.get("locationName") != null && !jsonObj.get("locationName").isJsonNull()) && !jsonObj.get("locationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationName").toString()));
      }
      if ((jsonObj.get("locationType") != null && !jsonObj.get("locationType").isJsonNull()) && !jsonObj.get("locationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationType").toString()));
      }
      if ((jsonObj.get("locationUID") != null && !jsonObj.get("locationUID").isJsonNull()) && !jsonObj.get("locationUID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locationUID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locationUID").toString()));
      }
      if ((jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonNull()) && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("workingDays") != null && !jsonObj.get("workingDays").isJsonNull()) && !jsonObj.get("workingDays").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workingDays` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workingDays").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocationModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocationModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocationModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocationModel.class));

       return (TypeAdapter<T>) new TypeAdapter<LocationModel>() {
           @Override
           public void write(JsonWriter out, LocationModel value) throws IOException {
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
           public LocationModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LocationModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LocationModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocationModel
  * @throws IOException if the JSON string is invalid with respect to LocationModel
  */
  public static LocationModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocationModel.class);
  }

 /**
  * Convert an instance of LocationModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

