package com.nidhinananu.automation.tests;

import static org.junit.Assert.assertEquals;

import com.nidhinananu.automation.model.apimethods.RestMethods;

import org.junit.Test;

import io.restassured.response.Response;


public class APITests {

    protected Response response;
    @Test
    public void verifyWhetherDataWithLatandLon(){

        response=RestMethods.getCurrentWeatherDataWithLatAndLon("38", "-78.25");
        assertEquals(200, response.statusCode());        

    }
    @Test
    public void verifyWhetherDataWithPostalCode(){

        response=RestMethods.getCurrentWeatherDataWithPostCode("28546");
        assertEquals(200, response.statusCode());        

    }
    
}
