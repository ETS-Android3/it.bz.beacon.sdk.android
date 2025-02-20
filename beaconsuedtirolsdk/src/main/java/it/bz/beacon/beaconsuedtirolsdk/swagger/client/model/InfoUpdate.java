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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InfoUpdate {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("cap")
  private String cap = null;
  @SerializedName("floor")
  private String floor = null;
  @SerializedName("latitude")
  private Float latitude = null;
  @SerializedName("location")
  private String location = null;
  @SerializedName("longitude")
  private Float longitude = null;
  @SerializedName("name")
  private String name = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCap() {
    return cap;
  }
  public void setCap(String cap) {
    this.cap = cap;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFloor() {
    return floor;
  }
  public void setFloor(String floor) {
    this.floor = floor;
  }

  /**
   * minimum: -90.0
   * maximum: 90.0
   **/
  @ApiModelProperty(required = true, value = "")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * minimum: -180.0
   * maximum: 180.0
   **/
  @ApiModelProperty(required = true, value = "")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoUpdate infoUpdate = (InfoUpdate) o;
    return (this.address == null ? infoUpdate.address == null : this.address.equals(infoUpdate.address)) &&
        (this.cap == null ? infoUpdate.cap == null : this.cap.equals(infoUpdate.cap)) &&
        (this.floor == null ? infoUpdate.floor == null : this.floor.equals(infoUpdate.floor)) &&
        (this.latitude == null ? infoUpdate.latitude == null : this.latitude.equals(infoUpdate.latitude)) &&
        (this.location == null ? infoUpdate.location == null : this.location.equals(infoUpdate.location)) &&
        (this.longitude == null ? infoUpdate.longitude == null : this.longitude.equals(infoUpdate.longitude)) &&
        (this.name == null ? infoUpdate.name == null : this.name.equals(infoUpdate.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.cap == null ? 0: this.cap.hashCode());
    result = 31 * result + (this.floor == null ? 0: this.floor.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.location == null ? 0: this.location.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoUpdate {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  cap: ").append(cap).append("\n");
    sb.append("  floor: ").append(floor).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
