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
 * Timestamp
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Timestamp {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Integer date;

  public static final String SERIALIZED_NAME_HOURS = "hours";
  @SerializedName(SERIALIZED_NAME_HOURS)
  private Integer hours;

  public static final String SERIALIZED_NAME_MINUTES = "minutes";
  @SerializedName(SERIALIZED_NAME_MINUTES)
  private Integer minutes;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private Integer month;

  public static final String SERIALIZED_NAME_NANOS = "nanos";
  @SerializedName(SERIALIZED_NAME_NANOS)
  private Integer nanos;

  public static final String SERIALIZED_NAME_SECONDS = "seconds";
  @SerializedName(SERIALIZED_NAME_SECONDS)
  private Integer seconds;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Long time;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Integer day;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "timezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private Integer timezoneOffset;

  public Timestamp() {
  }

  public Timestamp date(Integer date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    
    
    
    this.date = date;
  }


  public Timestamp hours(Integer hours) {
    
    
    
    
    this.hours = hours;
    return this;
  }

   /**
   * Get hours
   * @return hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHours() {
    return hours;
  }


  public void setHours(Integer hours) {
    
    
    
    this.hours = hours;
  }


  public Timestamp minutes(Integer minutes) {
    
    
    
    
    this.minutes = minutes;
    return this;
  }

   /**
   * Get minutes
   * @return minutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinutes() {
    return minutes;
  }


  public void setMinutes(Integer minutes) {
    
    
    
    this.minutes = minutes;
  }


  public Timestamp month(Integer month) {
    
    
    
    
    this.month = month;
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMonth() {
    return month;
  }


  public void setMonth(Integer month) {
    
    
    
    this.month = month;
  }


  public Timestamp nanos(Integer nanos) {
    
    
    
    
    this.nanos = nanos;
    return this;
  }

   /**
   * Get nanos
   * @return nanos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNanos() {
    return nanos;
  }


  public void setNanos(Integer nanos) {
    
    
    
    this.nanos = nanos;
  }


  public Timestamp seconds(Integer seconds) {
    
    
    
    
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeconds() {
    return seconds;
  }


  public void setSeconds(Integer seconds) {
    
    
    
    this.seconds = seconds;
  }


  public Timestamp time(Long time) {
    
    
    
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTime() {
    return time;
  }


  public void setTime(Long time) {
    
    
    
    this.time = time;
  }


  public Timestamp year(Integer year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    
    
    
    this.year = year;
  }


  public Timestamp day(Integer day) {
    
    
    
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    
    
    
    this.day = day;
  }


  public Timestamp timezoneOffset(Integer timezoneOffset) {
    
    
    
    
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * Get timezoneOffset
   * @return timezoneOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimezoneOffset() {
    return timezoneOffset;
  }


  public void setTimezoneOffset(Integer timezoneOffset) {
    
    
    
    this.timezoneOffset = timezoneOffset;
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
   * @return the Timestamp instance itself
   */
  public Timestamp putAdditionalProperty(String key, Object value) {
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
    Timestamp timestamp = (Timestamp) o;
    return Objects.equals(this.date, timestamp.date) &&
        Objects.equals(this.hours, timestamp.hours) &&
        Objects.equals(this.minutes, timestamp.minutes) &&
        Objects.equals(this.month, timestamp.month) &&
        Objects.equals(this.nanos, timestamp.nanos) &&
        Objects.equals(this.seconds, timestamp.seconds) &&
        Objects.equals(this.time, timestamp.time) &&
        Objects.equals(this.year, timestamp.year) &&
        Objects.equals(this.day, timestamp.day) &&
        Objects.equals(this.timezoneOffset, timestamp.timezoneOffset)&&
        Objects.equals(this.additionalProperties, timestamp.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hours, minutes, month, nanos, seconds, time, year, day, timezoneOffset, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timestamp {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    nanos: ").append(toIndentedString(nanos)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("hours");
    openapiFields.add("minutes");
    openapiFields.add("month");
    openapiFields.add("nanos");
    openapiFields.add("seconds");
    openapiFields.add("time");
    openapiFields.add("year");
    openapiFields.add("day");
    openapiFields.add("timezoneOffset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Timestamp
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Timestamp.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timestamp is not found in the empty JSON string", Timestamp.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Timestamp.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timestamp' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timestamp> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timestamp.class));

       return (TypeAdapter<T>) new TypeAdapter<Timestamp>() {
           @Override
           public void write(JsonWriter out, Timestamp value) throws IOException {
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
           public Timestamp read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Timestamp instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Timestamp given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Timestamp
  * @throws IOException if the JSON string is invalid with respect to Timestamp
  */
  public static Timestamp fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timestamp.class);
  }

 /**
  * Convert an instance of Timestamp to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
