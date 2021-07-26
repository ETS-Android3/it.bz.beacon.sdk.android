/*
 * Beacon Suedtirol API
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.bz.beacon.beaconsuedtirolsdk.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * Info
 */

public class Info {
  @SerializedName("address")
  private String address = null;

  @SerializedName("batteryLevel")
  private Integer batteryLevel = null;

  @SerializedName("cap")
  private String cap = null;

  @SerializedName("floor")
  private String floor = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instanceId")
  private String instanceId = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("major")
  private Integer major = null;

  @SerializedName("minor")
  private Integer minor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("online")
  private Boolean online = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PLANNED("PLANNED"),
    
    INSTALLED("INSTALLED");

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

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("trustedUpdatedAt")
  private Long trustedUpdatedAt = null;

  @SerializedName("txPower")
  private Integer txPower = null;

  @SerializedName("updatedAt")
  private Long updatedAt = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  @SerializedName("website")
  private String website = null;

  public Info address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Info batteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

   /**
   * Get batteryLevel
   * @return batteryLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public Info cap(String cap) {
    this.cap = cap;
    return this;
  }

   /**
   * Get cap
   * @return cap
  **/
  @ApiModelProperty(value = "")
  public String getCap() {
    return cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }

  public Info floor(String floor) {
    this.floor = floor;
    return this;
  }

   /**
   * Get floor
   * @return floor
  **/
  @ApiModelProperty(value = "")
  public String getFloor() {
    return floor;
  }

  public void setFloor(String floor) {
    this.floor = floor;
  }

  public Info id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Info instanceId(String instanceId) {
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @ApiModelProperty(value = "")
  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public Info latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Info location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Info longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Info major(Integer major) {
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @ApiModelProperty(value = "")
  public Integer getMajor() {
    return major;
  }

  public void setMajor(Integer major) {
    this.major = major;
  }

  public Info minor(Integer minor) {
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @ApiModelProperty(value = "")
  public Integer getMinor() {
    return minor;
  }

  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  public Info name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Info namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public Info online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Get online
   * @return online
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public Info status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Info trustedUpdatedAt(Long trustedUpdatedAt) {
    this.trustedUpdatedAt = trustedUpdatedAt;
    return this;
  }

   /**
   * Get trustedUpdatedAt
   * @return trustedUpdatedAt
  **/
  @ApiModelProperty(value = "")
  public Long getTrustedUpdatedAt() {
    return trustedUpdatedAt;
  }

  public void setTrustedUpdatedAt(Long trustedUpdatedAt) {
    this.trustedUpdatedAt = trustedUpdatedAt;
  }

  public Info txPower(Integer txPower) {
    this.txPower = txPower;
    return this;
  }

   /**
   * Get txPower
   * @return txPower
  **/
  @ApiModelProperty(value = "")
  public Integer getTxPower() {
    return txPower;
  }

  public void setTxPower(Integer txPower) {
    this.txPower = txPower;
  }

  public Info updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Info uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public Info website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.address, info.address) &&
        Objects.equals(this.batteryLevel, info.batteryLevel) &&
        Objects.equals(this.cap, info.cap) &&
        Objects.equals(this.floor, info.floor) &&
        Objects.equals(this.id, info.id) &&
        Objects.equals(this.instanceId, info.instanceId) &&
        Objects.equals(this.latitude, info.latitude) &&
        Objects.equals(this.location, info.location) &&
        Objects.equals(this.longitude, info.longitude) &&
        Objects.equals(this.major, info.major) &&
        Objects.equals(this.minor, info.minor) &&
        Objects.equals(this.name, info.name) &&
        Objects.equals(this.namespace, info.namespace) &&
        Objects.equals(this.online, info.online) &&
        Objects.equals(this.status, info.status) &&
        Objects.equals(this.trustedUpdatedAt, info.trustedUpdatedAt) &&
        Objects.equals(this.txPower, info.txPower) &&
        Objects.equals(this.updatedAt, info.updatedAt) &&
        Objects.equals(this.uuid, info.uuid) &&
        Objects.equals(this.website, info.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, batteryLevel, cap, floor, id, instanceId, latitude, location, longitude, major, minor, name, namespace, online, status, trustedUpdatedAt, txPower, updatedAt, uuid, website);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    batteryLevel: ").append(toIndentedString(batteryLevel)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trustedUpdatedAt: ").append(toIndentedString(trustedUpdatedAt)).append("\n");
    sb.append("    txPower: ").append(toIndentedString(txPower)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

