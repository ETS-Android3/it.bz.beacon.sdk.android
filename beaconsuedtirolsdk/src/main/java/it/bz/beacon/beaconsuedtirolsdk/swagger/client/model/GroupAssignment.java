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
public class GroupAssignment {
  
  @SerializedName("user")
  private Long user = null;
  public enum UserRoleEnum {
     MANAGER,  BEACON_EDITOR,  BEACON_VIEWER, 
  };
  @SerializedName("userRole")
  private UserRoleEnum userRole = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getUser() {
    return user;
  }
  public void setUser(Long user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UserRoleEnum getUserRole() {
    return userRole;
  }
  public void setUserRole(UserRoleEnum userRole) {
    this.userRole = userRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAssignment groupAssignment = (GroupAssignment) o;
    return (this.user == null ? groupAssignment.user == null : this.user.equals(groupAssignment.user)) &&
        (this.userRole == null ? groupAssignment.userRole == null : this.userRole.equals(groupAssignment.userRole));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.userRole == null ? 0: this.userRole.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAssignment {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  userRole: ").append(userRole).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
