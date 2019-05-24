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
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.PendingConfiguration;
import java.io.IOException;
import java.util.UUID;

/**
 * Beacon
 */

public class Beacon {
  @SerializedName("batteryLevel")
  private Integer batteryLevel = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("eddystoneEid")
  private Boolean eddystoneEid = null;

  @SerializedName("eddystoneEtlm")
  private Boolean eddystoneEtlm = null;

  @SerializedName("eddystoneTlm")
  private Boolean eddystoneTlm = null;

  @SerializedName("eddystoneUid")
  private Boolean eddystoneUid = null;

  @SerializedName("eddystoneUrl")
  private Boolean eddystoneUrl = null;

  @SerializedName("iBeacon")
  private Boolean iBeacon = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("instanceId")
  private String instanceId = null;

  @SerializedName("internalName")
  private String internalName = null;

  @SerializedName("interval")
  private Integer interval = null;

  @SerializedName("lastSeen")
  private Long lastSeen = null;

  @SerializedName("lat")
  private Float lat = null;

  @SerializedName("lng")
  private Float lng = null;

  @SerializedName("locationDescription")
  private String locationDescription = null;

  /**
   * Gets or Sets locationType
   */
  @JsonAdapter(LocationTypeEnum.Adapter.class)
  public enum LocationTypeEnum {
    OUTDOOR("OUTDOOR"),
    
    INDOOR("INDOOR");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocationTypeEnum fromValue(String text) {
      for (LocationTypeEnum b : LocationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LocationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LocationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("locationType")
  private LocationTypeEnum locationType = null;

  @SerializedName("major")
  private Integer major = null;

  /**
   * Gets or Sets manufacturer
   */
  @JsonAdapter(ManufacturerEnum.Adapter.class)
  public enum ManufacturerEnum {
    IO("KONTAKT_IO");

    private String value;

    ManufacturerEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ManufacturerEnum fromValue(String text) {
      for (ManufacturerEnum b : ManufacturerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ManufacturerEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ManufacturerEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ManufacturerEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ManufacturerEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("manufacturer")
  private ManufacturerEnum manufacturer = null;

  @SerializedName("manufacturerId")
  private String manufacturerId = null;

  @SerializedName("minor")
  private Integer minor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("pendingConfiguration")
  private PendingConfiguration pendingConfiguration = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    OK("OK"),
    
    BATTERY_LOW("BATTERY_LOW"),
    
    CONFIGURATION_PENDING("CONFIGURATION_PENDING"),
    
    NO_SIGNAL("NO_SIGNAL"),
    
    ISSUE("ISSUE");

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

  @SerializedName("telemetry")
  private Boolean telemetry = null;

  @SerializedName("txPower")
  private Integer txPower = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("uuid")
  private UUID uuid = null;

  public Beacon batteryLevel(Integer batteryLevel) {
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

  public Beacon description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Beacon eddystoneEid(Boolean eddystoneEid) {
    this.eddystoneEid = eddystoneEid;
    return this;
  }

   /**
   * Get eddystoneEid
   * @return eddystoneEid
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneEid() {
    return eddystoneEid;
  }

  public void setEddystoneEid(Boolean eddystoneEid) {
    this.eddystoneEid = eddystoneEid;
  }

  public Beacon eddystoneEtlm(Boolean eddystoneEtlm) {
    this.eddystoneEtlm = eddystoneEtlm;
    return this;
  }

   /**
   * Get eddystoneEtlm
   * @return eddystoneEtlm
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneEtlm() {
    return eddystoneEtlm;
  }

  public void setEddystoneEtlm(Boolean eddystoneEtlm) {
    this.eddystoneEtlm = eddystoneEtlm;
  }

  public Beacon eddystoneTlm(Boolean eddystoneTlm) {
    this.eddystoneTlm = eddystoneTlm;
    return this;
  }

   /**
   * Get eddystoneTlm
   * @return eddystoneTlm
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneTlm() {
    return eddystoneTlm;
  }

  public void setEddystoneTlm(Boolean eddystoneTlm) {
    this.eddystoneTlm = eddystoneTlm;
  }

  public Beacon eddystoneUid(Boolean eddystoneUid) {
    this.eddystoneUid = eddystoneUid;
    return this;
  }

   /**
   * Get eddystoneUid
   * @return eddystoneUid
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneUid() {
    return eddystoneUid;
  }

  public void setEddystoneUid(Boolean eddystoneUid) {
    this.eddystoneUid = eddystoneUid;
  }

  public Beacon eddystoneUrl(Boolean eddystoneUrl) {
    this.eddystoneUrl = eddystoneUrl;
    return this;
  }

   /**
   * Get eddystoneUrl
   * @return eddystoneUrl
  **/
  @ApiModelProperty(value = "")
  public Boolean isEddystoneUrl() {
    return eddystoneUrl;
  }

  public void setEddystoneUrl(Boolean eddystoneUrl) {
    this.eddystoneUrl = eddystoneUrl;
  }

  public Beacon iBeacon(Boolean iBeacon) {
    this.iBeacon = iBeacon;
    return this;
  }

   /**
   * Get iBeacon
   * @return iBeacon
  **/
  @ApiModelProperty(value = "")
  public Boolean isIBeacon() {
    return iBeacon;
  }

  public void setIBeacon(Boolean iBeacon) {
    this.iBeacon = iBeacon;
  }

  public Beacon id(String id) {
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

  public Beacon instanceId(String instanceId) {
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

  public Beacon internalName(String internalName) {
    this.internalName = internalName;
    return this;
  }

   /**
   * Get internalName
   * @return internalName
  **/
  @ApiModelProperty(value = "")
  public String getInternalName() {
    return internalName;
  }

  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }

  public Beacon interval(Integer interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @ApiModelProperty(value = "")
  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public Beacon lastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @ApiModelProperty(value = "")
  public Long getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
  }

  public Beacon lat(Float lat) {
    this.lat = lat;
    return this;
  }

   /**
   * Get lat
   * @return lat
  **/
  @ApiModelProperty(value = "")
  public Float getLat() {
    return lat;
  }

  public void setLat(Float lat) {
    this.lat = lat;
  }

  public Beacon lng(Float lng) {
    this.lng = lng;
    return this;
  }

   /**
   * Get lng
   * @return lng
  **/
  @ApiModelProperty(value = "")
  public Float getLng() {
    return lng;
  }

  public void setLng(Float lng) {
    this.lng = lng;
  }

  public Beacon locationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
    return this;
  }

   /**
   * Get locationDescription
   * @return locationDescription
  **/
  @ApiModelProperty(value = "")
  public String getLocationDescription() {
    return locationDescription;
  }

  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  public Beacon locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @ApiModelProperty(value = "")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  public Beacon major(Integer major) {
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

  public Beacon manufacturer(ManufacturerEnum manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @ApiModelProperty(value = "")
  public ManufacturerEnum getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(ManufacturerEnum manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Beacon manufacturerId(String manufacturerId) {
    this.manufacturerId = manufacturerId;
    return this;
  }

   /**
   * Get manufacturerId
   * @return manufacturerId
  **/
  @ApiModelProperty(value = "")
  public String getManufacturerId() {
    return manufacturerId;
  }

  public void setManufacturerId(String manufacturerId) {
    this.manufacturerId = manufacturerId;
  }

  public Beacon minor(Integer minor) {
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

  public Beacon name(String name) {
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

  public Beacon namespace(String namespace) {
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

  public Beacon pendingConfiguration(PendingConfiguration pendingConfiguration) {
    this.pendingConfiguration = pendingConfiguration;
    return this;
  }

   /**
   * Get pendingConfiguration
   * @return pendingConfiguration
  **/
  @ApiModelProperty(value = "")
  public PendingConfiguration getPendingConfiguration() {
    return pendingConfiguration;
  }

  public void setPendingConfiguration(PendingConfiguration pendingConfiguration) {
    this.pendingConfiguration = pendingConfiguration;
  }

  public Beacon status(StatusEnum status) {
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

  public Beacon telemetry(Boolean telemetry) {
    this.telemetry = telemetry;
    return this;
  }

   /**
   * Get telemetry
   * @return telemetry
  **/
  @ApiModelProperty(value = "")
  public Boolean isTelemetry() {
    return telemetry;
  }

  public void setTelemetry(Boolean telemetry) {
    this.telemetry = telemetry;
  }

  public Beacon txPower(Integer txPower) {
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

  public Beacon url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Beacon uuid(UUID uuid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beacon beacon = (Beacon) o;
    return Objects.equals(this.batteryLevel, beacon.batteryLevel) &&
        Objects.equals(this.description, beacon.description) &&
        Objects.equals(this.eddystoneEid, beacon.eddystoneEid) &&
        Objects.equals(this.eddystoneEtlm, beacon.eddystoneEtlm) &&
        Objects.equals(this.eddystoneTlm, beacon.eddystoneTlm) &&
        Objects.equals(this.eddystoneUid, beacon.eddystoneUid) &&
        Objects.equals(this.eddystoneUrl, beacon.eddystoneUrl) &&
        Objects.equals(this.iBeacon, beacon.iBeacon) &&
        Objects.equals(this.id, beacon.id) &&
        Objects.equals(this.instanceId, beacon.instanceId) &&
        Objects.equals(this.internalName, beacon.internalName) &&
        Objects.equals(this.interval, beacon.interval) &&
        Objects.equals(this.lastSeen, beacon.lastSeen) &&
        Objects.equals(this.lat, beacon.lat) &&
        Objects.equals(this.lng, beacon.lng) &&
        Objects.equals(this.locationDescription, beacon.locationDescription) &&
        Objects.equals(this.locationType, beacon.locationType) &&
        Objects.equals(this.major, beacon.major) &&
        Objects.equals(this.manufacturer, beacon.manufacturer) &&
        Objects.equals(this.manufacturerId, beacon.manufacturerId) &&
        Objects.equals(this.minor, beacon.minor) &&
        Objects.equals(this.name, beacon.name) &&
        Objects.equals(this.namespace, beacon.namespace) &&
        Objects.equals(this.pendingConfiguration, beacon.pendingConfiguration) &&
        Objects.equals(this.status, beacon.status) &&
        Objects.equals(this.telemetry, beacon.telemetry) &&
        Objects.equals(this.txPower, beacon.txPower) &&
        Objects.equals(this.url, beacon.url) &&
        Objects.equals(this.uuid, beacon.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batteryLevel, description, eddystoneEid, eddystoneEtlm, eddystoneTlm, eddystoneUid, eddystoneUrl, iBeacon, id, instanceId, internalName, interval, lastSeen, lat, lng, locationDescription, locationType, major, manufacturer, manufacturerId, minor, name, namespace, pendingConfiguration, status, telemetry, txPower, url, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beacon {\n");
    
    sb.append("    batteryLevel: ").append(toIndentedString(batteryLevel)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eddystoneEid: ").append(toIndentedString(eddystoneEid)).append("\n");
    sb.append("    eddystoneEtlm: ").append(toIndentedString(eddystoneEtlm)).append("\n");
    sb.append("    eddystoneTlm: ").append(toIndentedString(eddystoneTlm)).append("\n");
    sb.append("    eddystoneUid: ").append(toIndentedString(eddystoneUid)).append("\n");
    sb.append("    eddystoneUrl: ").append(toIndentedString(eddystoneUrl)).append("\n");
    sb.append("    iBeacon: ").append(toIndentedString(iBeacon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    locationDescription: ").append(toIndentedString(locationDescription)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    manufacturerId: ").append(toIndentedString(manufacturerId)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    pendingConfiguration: ").append(toIndentedString(pendingConfiguration)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    telemetry: ").append(toIndentedString(telemetry)).append("\n");
    sb.append("    txPower: ").append(toIndentedString(txPower)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

