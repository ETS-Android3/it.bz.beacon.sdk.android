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

package it.bz.beacon.beaconsuedtirolsdk.swagger.client.api;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.Beacon;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.BeaconBatteryLevelUpdate;

public class TrustedBeaconControllerApi {
  String basePath = "https://api.beacon.bz.it";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Update battery level of beacon
  * 
   * @param batteryLevelUpdate batteryLevelUpdate
   * @param id id
   * @return Beacon
  */
  public Beacon updateUsingPATCH1 (BeaconBatteryLevelUpdate batteryLevelUpdate, String id) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = batteryLevelUpdate;
    // verify the required parameter 'batteryLevelUpdate' is set
    if (batteryLevelUpdate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'batteryLevelUpdate' when calling updateUsingPATCH1",
        new ApiException(400, "Missing the required parameter 'batteryLevelUpdate' when calling updateUsingPATCH1"));
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling updateUsingPATCH1",
        new ApiException(400, "Missing the required parameter 'id' when calling updateUsingPATCH1"));
    }

    // create path and map variables
    String path = "/v1/trusted/beacons/{id}/batteryLevel".replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "TrustedAuth" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return (Beacon) ApiInvoker.deserialize(localVarResponse, "", Beacon.class);
      } else {
         return null;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
      if (ex.getCause() instanceof VolleyError) {
        VolleyError volleyError = (VolleyError)ex.getCause();
        if (volleyError.networkResponse != null) {
          throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
        }
      }
      throw ex;
    } catch (TimeoutException ex) {
      throw ex;
    }
  }

      /**
   * Update battery level of beacon
   * 
   * @param batteryLevelUpdate batteryLevelUpdate   * @param id id
  */
  public void updateUsingPATCH1 (BeaconBatteryLevelUpdate batteryLevelUpdate, String id, final Response.Listener<Beacon> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = batteryLevelUpdate;

    // verify the required parameter 'batteryLevelUpdate' is set
    if (batteryLevelUpdate == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'batteryLevelUpdate' when calling updateUsingPATCH1",
        new ApiException(400, "Missing the required parameter 'batteryLevelUpdate' when calling updateUsingPATCH1"));
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'id' when calling updateUsingPATCH1",
        new ApiException(400, "Missing the required parameter 'id' when calling updateUsingPATCH1"));
    }

    // create path and map variables
    String path = "/v1/trusted/beacons/{id}/batteryLevel".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

    String[] authNames = new String[] { "TrustedAuth" };

    try {
      apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((Beacon) ApiInvoker.deserialize(localVarResponse,  "", Beacon.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
