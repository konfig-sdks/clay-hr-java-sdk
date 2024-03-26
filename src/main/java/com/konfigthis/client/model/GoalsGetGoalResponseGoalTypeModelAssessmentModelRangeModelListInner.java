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
 * GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_STRANGEID = "strangeid";
  @SerializedName(SERIALIZED_NAME_STRANGEID)
  private String strangeid;

  public static final String SERIALIZED_NAME_SCORE_TEMP_ID = "scoreTempId";
  @SerializedName(SERIALIZED_NAME_SCORE_TEMP_ID)
  private String scoreTempId;

  public static final String SERIALIZED_NAME_RANGE_MIN = "rangeMin";
  @SerializedName(SERIALIZED_NAME_RANGE_MIN)
  private String rangeMin;

  public static final String SERIALIZED_NAME_RANGE_MAX = "rangeMax";
  @SerializedName(SERIALIZED_NAME_RANGE_MAX)
  private String rangeMax;

  public static final String SERIALIZED_NAME_INTERPRETATION = "interpretation";
  @SerializedName(SERIALIZED_NAME_INTERPRETATION)
  private String interpretation;

  public static final String SERIALIZED_NAME_COLOR_CODE = "colorCode";
  @SerializedName(SERIALIZED_NAME_COLOR_CODE)
  private String colorCode;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private String cid;

  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner() {
  }

  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner strangeid(String strangeid) {
    
    
    
    
    this.strangeid = strangeid;
    return this;
  }

   /**
   * Get strangeid
   * @return strangeid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getStrangeid() {
    return strangeid;
  }


  public void setStrangeid(String strangeid) {
    
    
    
    this.strangeid = strangeid;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner scoreTempId(String scoreTempId) {
    
    
    
    
    this.scoreTempId = scoreTempId;
    return this;
  }

   /**
   * Get scoreTempId
   * @return scoreTempId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "int", value = "")

  public String getScoreTempId() {
    return scoreTempId;
  }


  public void setScoreTempId(String scoreTempId) {
    
    
    
    this.scoreTempId = scoreTempId;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner rangeMin(String rangeMin) {
    
    
    
    
    this.rangeMin = rangeMin;
    return this;
  }

   /**
   * Get rangeMin
   * @return rangeMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "float", value = "")

  public String getRangeMin() {
    return rangeMin;
  }


  public void setRangeMin(String rangeMin) {
    
    
    
    this.rangeMin = rangeMin;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner rangeMax(String rangeMax) {
    
    
    
    
    this.rangeMax = rangeMax;
    return this;
  }

   /**
   * Get rangeMax
   * @return rangeMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "float", value = "")

  public String getRangeMax() {
    return rangeMax;
  }


  public void setRangeMax(String rangeMax) {
    
    
    
    this.rangeMax = rangeMax;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner interpretation(String interpretation) {
    
    
    
    
    this.interpretation = interpretation;
    return this;
  }

   /**
   * Get interpretation
   * @return interpretation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getInterpretation() {
    return interpretation;
  }


  public void setInterpretation(String interpretation) {
    
    
    
    this.interpretation = interpretation;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner colorCode(String colorCode) {
    
    
    
    
    this.colorCode = colorCode;
    return this;
  }

   /**
   * Get colorCode
   * @return colorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "string", value = "")

  public String getColorCode() {
    return colorCode;
  }


  public void setColorCode(String colorCode) {
    
    
    
    this.colorCode = colorCode;
  }


  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner cid(String cid) {
    
    
    
    
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
   * @return the GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner instance itself
   */
  public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner putAdditionalProperty(String key, Object value) {
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
    GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner = (GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner) o;
    return Objects.equals(this.description, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.description) &&
        Objects.equals(this.strangeid, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.strangeid) &&
        Objects.equals(this.scoreTempId, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.scoreTempId) &&
        Objects.equals(this.rangeMin, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.rangeMin) &&
        Objects.equals(this.rangeMax, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.rangeMax) &&
        Objects.equals(this.interpretation, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.interpretation) &&
        Objects.equals(this.colorCode, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.colorCode) &&
        Objects.equals(this.cid, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.cid)&&
        Objects.equals(this.additionalProperties, goalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, strangeid, scoreTempId, rangeMin, rangeMax, interpretation, colorCode, cid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    strangeid: ").append(toIndentedString(strangeid)).append("\n");
    sb.append("    scoreTempId: ").append(toIndentedString(scoreTempId)).append("\n");
    sb.append("    rangeMin: ").append(toIndentedString(rangeMin)).append("\n");
    sb.append("    rangeMax: ").append(toIndentedString(rangeMax)).append("\n");
    sb.append("    interpretation: ").append(toIndentedString(interpretation)).append("\n");
    sb.append("    colorCode: ").append(toIndentedString(colorCode)).append("\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
    openapiFields.add("strangeid");
    openapiFields.add("scoreTempId");
    openapiFields.add("rangeMin");
    openapiFields.add("rangeMax");
    openapiFields.add("interpretation");
    openapiFields.add("colorCode");
    openapiFields.add("cid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner is not found in the empty JSON string", GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("strangeid") != null && !jsonObj.get("strangeid").isJsonNull()) && !jsonObj.get("strangeid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `strangeid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("strangeid").toString()));
      }
      if ((jsonObj.get("scoreTempId") != null && !jsonObj.get("scoreTempId").isJsonNull()) && !jsonObj.get("scoreTempId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scoreTempId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scoreTempId").toString()));
      }
      if ((jsonObj.get("rangeMin") != null && !jsonObj.get("rangeMin").isJsonNull()) && !jsonObj.get("rangeMin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rangeMin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rangeMin").toString()));
      }
      if ((jsonObj.get("rangeMax") != null && !jsonObj.get("rangeMax").isJsonNull()) && !jsonObj.get("rangeMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rangeMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rangeMax").toString()));
      }
      if ((jsonObj.get("interpretation") != null && !jsonObj.get("interpretation").isJsonNull()) && !jsonObj.get("interpretation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interpretation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interpretation").toString()));
      }
      if ((jsonObj.get("colorCode") != null && !jsonObj.get("colorCode").isJsonNull()) && !jsonObj.get("colorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colorCode").toString()));
      }
      if ((jsonObj.get("cid") != null && !jsonObj.get("cid").isJsonNull()) && !jsonObj.get("cid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner>() {
           @Override
           public void write(JsonWriter out, GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner value) throws IOException {
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
           public GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner
  * @throws IOException if the JSON string is invalid with respect to GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner
  */
  public static GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner.class);
  }

 /**
  * Convert an instance of GoalsGetGoalResponseGoalTypeModelAssessmentModelRangeModelListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

