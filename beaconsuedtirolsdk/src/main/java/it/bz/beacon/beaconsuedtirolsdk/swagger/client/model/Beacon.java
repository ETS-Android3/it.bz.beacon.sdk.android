/**
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

import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.Group;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.PendingConfiguration;
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
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
  @SerializedName("group")
  private Group group = null;
  @SerializedName("iBeacon")
  private Boolean iBeacon = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("info_lat")
  private Double infoLat = null;
  @SerializedName("info_lng")
  private Double infoLng = null;
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
  public enum LocationTypeEnum {
     OUTDOOR,  INDOOR, 
  };
  @SerializedName("locationType")
  private LocationTypeEnum locationType = null;
  @SerializedName("major")
  private Integer major = null;
  public enum ManufacturerEnum {
     KONTAKT_IO, 
  };
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
  public enum StatusEnum {
     OK,  BATTERY_LOW,  CONFIGURATION_PENDING,  UNKNOWN_STATUS,  ISSUE,  NOT_ACCESSIBLE, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("telemetry")
  private Boolean telemetry = null;
  @SerializedName("trustedUpdatedAt")
  private Long trustedUpdatedAt = null;
  @SerializedName("txPower")
  private Integer txPower = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("uuid")
  private UUID uuid = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getBatteryLevel() {
    return batteryLevel;
  }
  public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEddystoneEid() {
    return eddystoneEid;
  }
  public void setEddystoneEid(Boolean eddystoneEid) {
    this.eddystoneEid = eddystoneEid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEddystoneEtlm() {
    return eddystoneEtlm;
  }
  public void setEddystoneEtlm(Boolean eddystoneEtlm) {
    this.eddystoneEtlm = eddystoneEtlm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEddystoneTlm() {
    return eddystoneTlm;
  }
  public void setEddystoneTlm(Boolean eddystoneTlm) {
    this.eddystoneTlm = eddystoneTlm;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEddystoneUid() {
    return eddystoneUid;
  }
  public void setEddystoneUid(Boolean eddystoneUid) {
    this.eddystoneUid = eddystoneUid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getEddystoneUrl() {
    return eddystoneUrl;
  }
  public void setEddystoneUrl(Boolean eddystoneUrl) {
    this.eddystoneUrl = eddystoneUrl;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Group getGroup() {
    return group;
  }
  public void setGroup(Group group) {
    this.group = group;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getIBeacon() {
    return iBeacon;
  }
  public void setIBeacon(Boolean iBeacon) {
    this.iBeacon = iBeacon;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getInfoLat() {
    return infoLat;
  }
  public void setInfoLat(Double infoLat) {
    this.infoLat = infoLat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getInfoLng() {
    return infoLng;
  }
  public void setInfoLng(Double infoLng) {
    this.infoLng = infoLng;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInstanceId() {
    return instanceId;
  }
  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getInternalName() {
    return internalName;
  }
  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getInterval() {
    return interval;
  }
  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLastSeen() {
    return lastSeen;
  }
  public void setLastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getLat() {
    return lat;
  }
  public void setLat(Float lat) {
    this.lat = lat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Float getLng() {
    return lng;
  }
  public void setLng(Float lng) {
    this.lng = lng;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocationDescription() {
    return locationDescription;
  }
  public void setLocationDescription(String locationDescription) {
    this.locationDescription = locationDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }
  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMajor() {
    return major;
  }
  public void setMajor(Integer major) {
    this.major = major;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ManufacturerEnum getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(ManufacturerEnum manufacturer) {
    this.manufacturer = manufacturer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getManufacturerId() {
    return manufacturerId;
  }
  public void setManufacturerId(String manufacturerId) {
    this.manufacturerId = manufacturerId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMinor() {
    return minor;
  }
  public void setMinor(Integer minor) {
    this.minor = minor;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PendingConfiguration getPendingConfiguration() {
    return pendingConfiguration;
  }
  public void setPendingConfiguration(PendingConfiguration pendingConfiguration) {
    this.pendingConfiguration = pendingConfiguration;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getTelemetry() {
    return telemetry;
  }
  public void setTelemetry(Boolean telemetry) {
    this.telemetry = telemetry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getTrustedUpdatedAt() {
    return trustedUpdatedAt;
  }
  public void setTrustedUpdatedAt(Long trustedUpdatedAt) {
    this.trustedUpdatedAt = trustedUpdatedAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTxPower() {
    return txPower;
  }
  public void setTxPower(Integer txPower) {
    this.txPower = txPower;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beacon beacon = (Beacon) o;
    return (this.batteryLevel == null ? beacon.batteryLevel == null : this.batteryLevel.equals(beacon.batteryLevel)) &&
        (this.description == null ? beacon.description == null : this.description.equals(beacon.description)) &&
        (this.eddystoneEid == null ? beacon.eddystoneEid == null : this.eddystoneEid.equals(beacon.eddystoneEid)) &&
        (this.eddystoneEtlm == null ? beacon.eddystoneEtlm == null : this.eddystoneEtlm.equals(beacon.eddystoneEtlm)) &&
        (this.eddystoneTlm == null ? beacon.eddystoneTlm == null : this.eddystoneTlm.equals(beacon.eddystoneTlm)) &&
        (this.eddystoneUid == null ? beacon.eddystoneUid == null : this.eddystoneUid.equals(beacon.eddystoneUid)) &&
        (this.eddystoneUrl == null ? beacon.eddystoneUrl == null : this.eddystoneUrl.equals(beacon.eddystoneUrl)) &&
        (this.group == null ? beacon.group == null : this.group.equals(beacon.group)) &&
        (this.iBeacon == null ? beacon.iBeacon == null : this.iBeacon.equals(beacon.iBeacon)) &&
        (this.id == null ? beacon.id == null : this.id.equals(beacon.id)) &&
        (this.infoLat == null ? beacon.infoLat == null : this.infoLat.equals(beacon.infoLat)) &&
        (this.infoLng == null ? beacon.infoLng == null : this.infoLng.equals(beacon.infoLng)) &&
        (this.instanceId == null ? beacon.instanceId == null : this.instanceId.equals(beacon.instanceId)) &&
        (this.internalName == null ? beacon.internalName == null : this.internalName.equals(beacon.internalName)) &&
        (this.interval == null ? beacon.interval == null : this.interval.equals(beacon.interval)) &&
        (this.lastSeen == null ? beacon.lastSeen == null : this.lastSeen.equals(beacon.lastSeen)) &&
        (this.lat == null ? beacon.lat == null : this.lat.equals(beacon.lat)) &&
        (this.lng == null ? beacon.lng == null : this.lng.equals(beacon.lng)) &&
        (this.locationDescription == null ? beacon.locationDescription == null : this.locationDescription.equals(beacon.locationDescription)) &&
        (this.locationType == null ? beacon.locationType == null : this.locationType.equals(beacon.locationType)) &&
        (this.major == null ? beacon.major == null : this.major.equals(beacon.major)) &&
        (this.manufacturer == null ? beacon.manufacturer == null : this.manufacturer.equals(beacon.manufacturer)) &&
        (this.manufacturerId == null ? beacon.manufacturerId == null : this.manufacturerId.equals(beacon.manufacturerId)) &&
        (this.minor == null ? beacon.minor == null : this.minor.equals(beacon.minor)) &&
        (this.name == null ? beacon.name == null : this.name.equals(beacon.name)) &&
        (this.namespace == null ? beacon.namespace == null : this.namespace.equals(beacon.namespace)) &&
        (this.pendingConfiguration == null ? beacon.pendingConfiguration == null : this.pendingConfiguration.equals(beacon.pendingConfiguration)) &&
        (this.status == null ? beacon.status == null : this.status.equals(beacon.status)) &&
        (this.telemetry == null ? beacon.telemetry == null : this.telemetry.equals(beacon.telemetry)) &&
        (this.trustedUpdatedAt == null ? beacon.trustedUpdatedAt == null : this.trustedUpdatedAt.equals(beacon.trustedUpdatedAt)) &&
        (this.txPower == null ? beacon.txPower == null : this.txPower.equals(beacon.txPower)) &&
        (this.url == null ? beacon.url == null : this.url.equals(beacon.url)) &&
        (this.uuid == null ? beacon.uuid == null : this.uuid.equals(beacon.uuid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.batteryLevel == null ? 0: this.batteryLevel.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.eddystoneEid == null ? 0: this.eddystoneEid.hashCode());
    result = 31 * result + (this.eddystoneEtlm == null ? 0: this.eddystoneEtlm.hashCode());
    result = 31 * result + (this.eddystoneTlm == null ? 0: this.eddystoneTlm.hashCode());
    result = 31 * result + (this.eddystoneUid == null ? 0: this.eddystoneUid.hashCode());
    result = 31 * result + (this.eddystoneUrl == null ? 0: this.eddystoneUrl.hashCode());
    result = 31 * result + (this.group == null ? 0: this.group.hashCode());
    result = 31 * result + (this.iBeacon == null ? 0: this.iBeacon.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.infoLat == null ? 0: this.infoLat.hashCode());
    result = 31 * result + (this.infoLng == null ? 0: this.infoLng.hashCode());
    result = 31 * result + (this.instanceId == null ? 0: this.instanceId.hashCode());
    result = 31 * result + (this.internalName == null ? 0: this.internalName.hashCode());
    result = 31 * result + (this.interval == null ? 0: this.interval.hashCode());
    result = 31 * result + (this.lastSeen == null ? 0: this.lastSeen.hashCode());
    result = 31 * result + (this.lat == null ? 0: this.lat.hashCode());
    result = 31 * result + (this.lng == null ? 0: this.lng.hashCode());
    result = 31 * result + (this.locationDescription == null ? 0: this.locationDescription.hashCode());
    result = 31 * result + (this.locationType == null ? 0: this.locationType.hashCode());
    result = 31 * result + (this.major == null ? 0: this.major.hashCode());
    result = 31 * result + (this.manufacturer == null ? 0: this.manufacturer.hashCode());
    result = 31 * result + (this.manufacturerId == null ? 0: this.manufacturerId.hashCode());
    result = 31 * result + (this.minor == null ? 0: this.minor.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.namespace == null ? 0: this.namespace.hashCode());
    result = 31 * result + (this.pendingConfiguration == null ? 0: this.pendingConfiguration.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.telemetry == null ? 0: this.telemetry.hashCode());
    result = 31 * result + (this.trustedUpdatedAt == null ? 0: this.trustedUpdatedAt.hashCode());
    result = 31 * result + (this.txPower == null ? 0: this.txPower.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beacon {\n");
    
    sb.append("  batteryLevel: ").append(batteryLevel).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  eddystoneEid: ").append(eddystoneEid).append("\n");
    sb.append("  eddystoneEtlm: ").append(eddystoneEtlm).append("\n");
    sb.append("  eddystoneTlm: ").append(eddystoneTlm).append("\n");
    sb.append("  eddystoneUid: ").append(eddystoneUid).append("\n");
    sb.append("  eddystoneUrl: ").append(eddystoneUrl).append("\n");
    sb.append("  group: ").append(group).append("\n");
    sb.append("  iBeacon: ").append(iBeacon).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  infoLat: ").append(infoLat).append("\n");
    sb.append("  infoLng: ").append(infoLng).append("\n");
    sb.append("  instanceId: ").append(instanceId).append("\n");
    sb.append("  internalName: ").append(internalName).append("\n");
    sb.append("  interval: ").append(interval).append("\n");
    sb.append("  lastSeen: ").append(lastSeen).append("\n");
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lng: ").append(lng).append("\n");
    sb.append("  locationDescription: ").append(locationDescription).append("\n");
    sb.append("  locationType: ").append(locationType).append("\n");
    sb.append("  major: ").append(major).append("\n");
    sb.append("  manufacturer: ").append(manufacturer).append("\n");
    sb.append("  manufacturerId: ").append(manufacturerId).append("\n");
    sb.append("  minor: ").append(minor).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  namespace: ").append(namespace).append("\n");
    sb.append("  pendingConfiguration: ").append(pendingConfiguration).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  telemetry: ").append(telemetry).append("\n");
    sb.append("  trustedUpdatedAt: ").append(trustedUpdatedAt).append("\n");
    sb.append("  txPower: ").append(txPower).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
