package com.nidhinananu.automation.model.apimethods;

import java.util.List;

import com.nidhinananu.automation.model.apimethods.helpers.Utils;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestMethods {

    protected static RequestSpecification request;
    protected static Response response;
    protected static JSONObject requestParams;
    protected static  List<Header> list;    
    

        public static Response getCurrentWeatherDataWithLatAndLon(String lat, String lon)
        {
            RestAssured.baseURI=Utils.baseUrl;
            RequestSpecification request = RestAssured.given();
            Response response = request.queryParam("lat",lat)
            .queryParam("lon",lon)
            .queryParam("key", "289c3b7a50764fe1a0748c08dba06f97")
            .get(Utils.baseUrl);            
            return response;    
        }

        public static Response getCurrentWeatherDataWithPostCode(String postalCode)
        {
            RestAssured.baseURI=Utils.baseUrl;
            RequestSpecification request = RestAssured.given();
            Response response = request.queryParam("postal_code",postalCode)            
            .queryParam("key", Utils.apiKey)
            .get(Utils.baseUrl);            
            return response;    
        }
    
}
