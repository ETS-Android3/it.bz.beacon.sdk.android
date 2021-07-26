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


package it.bz.beacon.beaconsuedtirolsdk.swagger.client.api;

import it.bz.beacon.beaconsuedtirolsdk.swagger.client.ApiException;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.BeaconOrder;
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.Resource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderControllerApi
 */
@Ignore
public class OrderControllerApiTest {

    private final OrderControllerApi api = new OrderControllerApi();

    
    /**
     * Create an order for all unordered beacons
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUsingPOST3Test() throws ApiException {
        BeaconOrder response = api.createUsingPOST3();

        // TODO: test validations
    }
    
    /**
     * Search a order by order symbol
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadCsvUsingGETTest() throws ApiException {
        String orderSymbol = null;
        Resource response = api.downloadCsvUsingGET(orderSymbol);

        // TODO: test validations
    }
    
    /**
     * View a list of all orders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListUsingGET5Test() throws ApiException {
        List<BeaconOrder> response = api.getListUsingGET5();

        // TODO: test validations
    }
    
    /**
     * Search a order by order symbol
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsingGET3Test() throws ApiException {
        String orderSymbol = null;
        BeaconOrder response = api.getUsingGET3(orderSymbol);

        // TODO: test validations
    }
    
}
