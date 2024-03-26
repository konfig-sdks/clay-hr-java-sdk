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
import java.time.LocalDate;

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
 * PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner {
  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private String course;

  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private String degree;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public static final String SERIALIZED_NAME_GPA = "gpa";
  @SerializedName(SERIALIZED_NAME_GPA)
  private String gpa;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY_ID = "countryId";
  @SerializedName(SERIALIZED_NAME_COUNTRY_ID)
  private Integer countryId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner() {
  }

  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner course(String course) {
    
    
    
    
    this.course = course;
    return this;
  }

   /**
   * Name of the course.
   * @return course
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Business Administration and Management", value = "Name of the course.")

  public String getCourse() {
    return course;
  }


  public void setCourse(String course) {
    
    
    
    this.course = course;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner degree(String degree) {
    
    
    
    
    this.degree = degree;
    return this;
  }

   /**
   * Name of the degree.
   * @return degree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bachelor of Liberal Arts (A.L.B.)", value = "Name of the degree.")

  public String getDegree() {
    return degree;
  }


  public void setDegree(String degree) {
    
    
    
    this.degree = degree;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner institution(String institution) {
    
    
    
    
    this.institution = institution;
    return this;
  }

   /**
   * Name of the institution.
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Harvard University", value = "Name of the institution.")

  public String getInstitution() {
    return institution;
  }


  public void setInstitution(String institution) {
    
    
    
    this.institution = institution;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner gpa(String gpa) {
    
    
    
    
    this.gpa = gpa;
    return this;
  }

   /**
   * Get gpa
   * @return gpa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "98.5", value = "")

  public String getGpa() {
    return gpa;
  }


  public void setGpa(String gpa) {
    
    
    
    this.gpa = gpa;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner state(String state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Name of the state.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Massachusetts", value = "Name of the state.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    
    
    
    this.state = state;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner city(String city) {
    
    
    
    
    this.city = city;
    return this;
  }

   /**
   * Name of the city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cambridge", value = "Name of the city.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    
    
    
    this.city = city;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner countryId(Integer countryId) {
    
    
    
    
    this.countryId = countryId;
    return this;
  }

   /**
   * Country Idenifier (should be a number id).
   * @return countryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country Idenifier (should be a number id).")

  public Integer getCountryId() {
    return countryId;
  }


  public void setCountryId(Integer countryId) {
    
    
    
    this.countryId = countryId;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start Date of the course.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start Date of the course.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End Date of the course.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End Date of the course.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
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
   * @return the PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner instance itself
   */
  public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner putAdditionalProperty(String key, Object value) {
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
    PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner peopleAndPermissionsSaveUserEducationRequestRAWBODYInner = (PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner) o;
    return Objects.equals(this.course, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.course) &&
        Objects.equals(this.degree, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.degree) &&
        Objects.equals(this.institution, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.institution) &&
        Objects.equals(this.gpa, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.gpa) &&
        Objects.equals(this.state, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.state) &&
        Objects.equals(this.city, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.city) &&
        Objects.equals(this.countryId, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.countryId) &&
        Objects.equals(this.startDate, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.startDate) &&
        Objects.equals(this.endDate, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.endDate)&&
        Objects.equals(this.additionalProperties, peopleAndPermissionsSaveUserEducationRequestRAWBODYInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(course, degree, institution, gpa, state, city, countryId, startDate, endDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner {\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    gpa: ").append(toIndentedString(gpa)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryId: ").append(toIndentedString(countryId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("course");
    openapiFields.add("degree");
    openapiFields.add("institution");
    openapiFields.add("gpa");
    openapiFields.add("state");
    openapiFields.add("city");
    openapiFields.add("countryId");
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner is not found in the empty JSON string", PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("course") != null && !jsonObj.get("course").isJsonNull()) && !jsonObj.get("course").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `course` to be a primitive type in the JSON string but got `%s`", jsonObj.get("course").toString()));
      }
      if ((jsonObj.get("degree") != null && !jsonObj.get("degree").isJsonNull()) && !jsonObj.get("degree").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `degree` to be a primitive type in the JSON string but got `%s`", jsonObj.get("degree").toString()));
      }
      if ((jsonObj.get("institution") != null && !jsonObj.get("institution").isJsonNull()) && !jsonObj.get("institution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `institution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("institution").toString()));
      }
      if ((jsonObj.get("gpa") != null && !jsonObj.get("gpa").isJsonNull()) && !jsonObj.get("gpa").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gpa` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gpa").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner>() {
           @Override
           public void write(JsonWriter out, PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner value) throws IOException {
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
           public PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner
  * @throws IOException if the JSON string is invalid with respect to PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner
  */
  public static PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner.class);
  }

 /**
  * Convert an instance of PeopleAndPermissionsSaveUserEducationRequestRAWBODYInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

