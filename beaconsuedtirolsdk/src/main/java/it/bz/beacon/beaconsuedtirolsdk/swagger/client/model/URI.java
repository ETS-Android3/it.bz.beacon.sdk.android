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
public class URI {
  
  @SerializedName("absolute")
  private Boolean absolute = null;
  @SerializedName("authority")
  private String authority = null;
  @SerializedName("fragment")
  private String fragment = null;
  @SerializedName("host")
  private String host = null;
  @SerializedName("opaque")
  private Boolean opaque = null;
  @SerializedName("path")
  private String path = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("query")
  private String query = null;
  @SerializedName("rawAuthority")
  private String rawAuthority = null;
  @SerializedName("rawFragment")
  private String rawFragment = null;
  @SerializedName("rawPath")
  private String rawPath = null;
  @SerializedName("rawQuery")
  private String rawQuery = null;
  @SerializedName("rawSchemeSpecificPart")
  private String rawSchemeSpecificPart = null;
  @SerializedName("rawUserInfo")
  private String rawUserInfo = null;
  @SerializedName("scheme")
  private String scheme = null;
  @SerializedName("schemeSpecificPart")
  private String schemeSpecificPart = null;
  @SerializedName("userInfo")
  private String userInfo = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getAbsolute() {
    return absolute;
  }
  public void setAbsolute(Boolean absolute) {
    this.absolute = absolute;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAuthority() {
    return authority;
  }
  public void setAuthority(String authority) {
    this.authority = authority;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFragment() {
    return fragment;
  }
  public void setFragment(String fragment) {
    this.fragment = fragment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getOpaque() {
    return opaque;
  }
  public void setOpaque(Boolean opaque) {
    this.opaque = opaque;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQuery() {
    return query;
  }
  public void setQuery(String query) {
    this.query = query;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRawAuthority() {
    return rawAuthority;
  }
  public void setRawAuthority(String rawAuthority) {
    this.rawAuthority = rawAuthority;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRawFragment() {
    return rawFragment;
  }
  public void setRawFragment(String rawFragment) {
    this.rawFragment = rawFragment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRawPath() {
    return rawPath;
  }
  public void setRawPath(String rawPath) {
    this.rawPath = rawPath;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRawQuery() {
    return rawQuery;
  }
  public void setRawQuery(String rawQuery) {
    this.rawQuery = rawQuery;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRawSchemeSpecificPart() {
    return rawSchemeSpecificPart;
  }
  public void setRawSchemeSpecificPart(String rawSchemeSpecificPart) {
    this.rawSchemeSpecificPart = rawSchemeSpecificPart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRawUserInfo() {
    return rawUserInfo;
  }
  public void setRawUserInfo(String rawUserInfo) {
    this.rawUserInfo = rawUserInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScheme() {
    return scheme;
  }
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSchemeSpecificPart() {
    return schemeSpecificPart;
  }
  public void setSchemeSpecificPart(String schemeSpecificPart) {
    this.schemeSpecificPart = schemeSpecificPart;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserInfo() {
    return userInfo;
  }
  public void setUserInfo(String userInfo) {
    this.userInfo = userInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    URI URI = (URI) o;
    return (this.absolute == null ? URI.absolute == null : this.absolute.equals(URI.absolute)) &&
        (this.authority == null ? URI.authority == null : this.authority.equals(URI.authority)) &&
        (this.fragment == null ? URI.fragment == null : this.fragment.equals(URI.fragment)) &&
        (this.host == null ? URI.host == null : this.host.equals(URI.host)) &&
        (this.opaque == null ? URI.opaque == null : this.opaque.equals(URI.opaque)) &&
        (this.path == null ? URI.path == null : this.path.equals(URI.path)) &&
        (this.port == null ? URI.port == null : this.port.equals(URI.port)) &&
        (this.query == null ? URI.query == null : this.query.equals(URI.query)) &&
        (this.rawAuthority == null ? URI.rawAuthority == null : this.rawAuthority.equals(URI.rawAuthority)) &&
        (this.rawFragment == null ? URI.rawFragment == null : this.rawFragment.equals(URI.rawFragment)) &&
        (this.rawPath == null ? URI.rawPath == null : this.rawPath.equals(URI.rawPath)) &&
        (this.rawQuery == null ? URI.rawQuery == null : this.rawQuery.equals(URI.rawQuery)) &&
        (this.rawSchemeSpecificPart == null ? URI.rawSchemeSpecificPart == null : this.rawSchemeSpecificPart.equals(URI.rawSchemeSpecificPart)) &&
        (this.rawUserInfo == null ? URI.rawUserInfo == null : this.rawUserInfo.equals(URI.rawUserInfo)) &&
        (this.scheme == null ? URI.scheme == null : this.scheme.equals(URI.scheme)) &&
        (this.schemeSpecificPart == null ? URI.schemeSpecificPart == null : this.schemeSpecificPart.equals(URI.schemeSpecificPart)) &&
        (this.userInfo == null ? URI.userInfo == null : this.userInfo.equals(URI.userInfo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.absolute == null ? 0: this.absolute.hashCode());
    result = 31 * result + (this.authority == null ? 0: this.authority.hashCode());
    result = 31 * result + (this.fragment == null ? 0: this.fragment.hashCode());
    result = 31 * result + (this.host == null ? 0: this.host.hashCode());
    result = 31 * result + (this.opaque == null ? 0: this.opaque.hashCode());
    result = 31 * result + (this.path == null ? 0: this.path.hashCode());
    result = 31 * result + (this.port == null ? 0: this.port.hashCode());
    result = 31 * result + (this.query == null ? 0: this.query.hashCode());
    result = 31 * result + (this.rawAuthority == null ? 0: this.rawAuthority.hashCode());
    result = 31 * result + (this.rawFragment == null ? 0: this.rawFragment.hashCode());
    result = 31 * result + (this.rawPath == null ? 0: this.rawPath.hashCode());
    result = 31 * result + (this.rawQuery == null ? 0: this.rawQuery.hashCode());
    result = 31 * result + (this.rawSchemeSpecificPart == null ? 0: this.rawSchemeSpecificPart.hashCode());
    result = 31 * result + (this.rawUserInfo == null ? 0: this.rawUserInfo.hashCode());
    result = 31 * result + (this.scheme == null ? 0: this.scheme.hashCode());
    result = 31 * result + (this.schemeSpecificPart == null ? 0: this.schemeSpecificPart.hashCode());
    result = 31 * result + (this.userInfo == null ? 0: this.userInfo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class URI {\n");
    
    sb.append("  absolute: ").append(absolute).append("\n");
    sb.append("  authority: ").append(authority).append("\n");
    sb.append("  fragment: ").append(fragment).append("\n");
    sb.append("  host: ").append(host).append("\n");
    sb.append("  opaque: ").append(opaque).append("\n");
    sb.append("  path: ").append(path).append("\n");
    sb.append("  port: ").append(port).append("\n");
    sb.append("  query: ").append(query).append("\n");
    sb.append("  rawAuthority: ").append(rawAuthority).append("\n");
    sb.append("  rawFragment: ").append(rawFragment).append("\n");
    sb.append("  rawPath: ").append(rawPath).append("\n");
    sb.append("  rawQuery: ").append(rawQuery).append("\n");
    sb.append("  rawSchemeSpecificPart: ").append(rawSchemeSpecificPart).append("\n");
    sb.append("  rawUserInfo: ").append(rawUserInfo).append("\n");
    sb.append("  scheme: ").append(scheme).append("\n");
    sb.append("  schemeSpecificPart: ").append(schemeSpecificPart).append("\n");
    sb.append("  userInfo: ").append(userInfo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
