/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ArrayDefault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArrayDefault {
  public static final String SERIALIZED_NAME_WITH_DEFAULT_EMPTY_BRACKET = "WithDefaultEmptyBracket";
  @SerializedName(SERIALIZED_NAME_WITH_DEFAULT_EMPTY_BRACKET)
  private List<String> withDefaultEmptyBracket = new ArrayList<>();

  public static final String SERIALIZED_NAME_WITHOUT_DEFAULT = "WithoutDefault";
  @SerializedName(SERIALIZED_NAME_WITHOUT_DEFAULT)
  private List<String> withoutDefault;

  public ArrayDefault() {
  }

  public ArrayDefault withDefaultEmptyBracket(List<String> withDefaultEmptyBracket) {
    
    this.withDefaultEmptyBracket = withDefaultEmptyBracket;
    return this;
  }

  public ArrayDefault addWithDefaultEmptyBracketItem(String withDefaultEmptyBracketItem) {
    if (this.withDefaultEmptyBracket == null) {
      this.withDefaultEmptyBracket = new ArrayList<>();
    }
    this.withDefaultEmptyBracket.add(withDefaultEmptyBracketItem);
    return this;
  }

   /**
   * Get withDefaultEmptyBracket
   * @return withDefaultEmptyBracket
  **/
  @javax.annotation.Nullable
  public List<String> getWithDefaultEmptyBracket() {
    return withDefaultEmptyBracket;
  }


  public void setWithDefaultEmptyBracket(List<String> withDefaultEmptyBracket) {
    this.withDefaultEmptyBracket = withDefaultEmptyBracket;
  }


  public ArrayDefault withoutDefault(List<String> withoutDefault) {
    
    this.withoutDefault = withoutDefault;
    return this;
  }

  public ArrayDefault addWithoutDefaultItem(String withoutDefaultItem) {
    if (this.withoutDefault == null) {
      this.withoutDefault = new ArrayList<>();
    }
    this.withoutDefault.add(withoutDefaultItem);
    return this;
  }

   /**
   * Get withoutDefault
   * @return withoutDefault
  **/
  @javax.annotation.Nullable
  public List<String> getWithoutDefault() {
    return withoutDefault;
  }


  public void setWithoutDefault(List<String> withoutDefault) {
    this.withoutDefault = withoutDefault;
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
   * @return the ArrayDefault instance itself
   */
  public ArrayDefault putAdditionalProperty(String key, Object value) {
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
    ArrayDefault arrayDefault = (ArrayDefault) o;
    return Objects.equals(this.withDefaultEmptyBracket, arrayDefault.withDefaultEmptyBracket) &&
        Objects.equals(this.withoutDefault, arrayDefault.withoutDefault)&&
        Objects.equals(this.additionalProperties, arrayDefault.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withDefaultEmptyBracket, withoutDefault, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayDefault {\n");
    sb.append("    withDefaultEmptyBracket: ").append(toIndentedString(withDefaultEmptyBracket)).append("\n");
    sb.append("    withoutDefault: ").append(toIndentedString(withoutDefault)).append("\n");
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
    openapiFields.add("WithDefaultEmptyBracket");
    openapiFields.add("WithoutDefault");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ArrayDefault
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ArrayDefault.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArrayDefault is not found in the empty JSON string", ArrayDefault.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("WithDefaultEmptyBracket") != null && !jsonObj.get("WithDefaultEmptyBracket").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `WithDefaultEmptyBracket` to be an array in the JSON string but got `%s`", jsonObj.get("WithDefaultEmptyBracket").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("WithoutDefault") != null && !jsonObj.get("WithoutDefault").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `WithoutDefault` to be an array in the JSON string but got `%s`", jsonObj.get("WithoutDefault").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArrayDefault.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArrayDefault' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArrayDefault> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArrayDefault.class));

       return (TypeAdapter<T>) new TypeAdapter<ArrayDefault>() {
           @Override
           public void write(JsonWriter out, ArrayDefault value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
           public ArrayDefault read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ArrayDefault instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArrayDefault given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArrayDefault
  * @throws IOException if the JSON string is invalid with respect to ArrayDefault
  */
  public static ArrayDefault fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArrayDefault.class);
  }

 /**
  * Convert an instance of ArrayDefault to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
