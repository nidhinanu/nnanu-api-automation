package com.nidhinananu.automation.model.apimethods.helpers;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import org.json.JSONObject;

public final class Utils {

    public static String baseUrl = "https://api.weatherbit.io/v2.0/current";
    public static String apiKey="289c3b7a50764fe1a0748c08dba06f97";    
    public static String content_type= "application/json";
    public static String bookingDetailsExpectedfile="";
    public static String createBookingRequestfile="";
    public static String createBookingExpectedResponseFile="";
    public static String updateBookingRequestFile="";
    public static String updateBookingExpectedResponseFile="";
    public static String bookingDetailsPath="";
    public static String createBookingPath="";
    public static String updateBookingPath="";


    public static JSONObject convertToJson(String responseString)
    {
        JSONObject responseJson = new JSONObject(responseString);
        return responseJson;
    }

    public static String readJson(String path, String fileName) throws IOException, ParseException
    {

        String jsonFromFile = new String(Files.readAllBytes(Paths.get(path, fileName)));
        return jsonFromFile;
    }
    
}
