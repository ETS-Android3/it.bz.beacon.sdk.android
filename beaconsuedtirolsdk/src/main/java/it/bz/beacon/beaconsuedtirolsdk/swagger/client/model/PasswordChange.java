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
public class PasswordChange {
  
  @SerializedName("newPassword")
  private String newPassword = null;
  @SerializedName("oldPassword")
  private String oldPassword = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOldPassword() {
    return oldPassword;
  }
  public void setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChange passwordChange = (PasswordChange) o;
    return (this.newPassword == null ? passwordChange.newPassword == null : this.newPassword.equals(passwordChange.newPassword)) &&
        (this.oldPassword == null ? passwordChange.oldPassword == null : this.oldPassword.equals(passwordChange.oldPassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.newPassword == null ? 0: this.newPassword.hashCode());
    result = 31 * result + (this.oldPassword == null ? 0: this.oldPassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChange {\n");
    
    sb.append("  newPassword: ").append(newPassword).append("\n");
    sb.append("  oldPassword: ").append(oldPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
