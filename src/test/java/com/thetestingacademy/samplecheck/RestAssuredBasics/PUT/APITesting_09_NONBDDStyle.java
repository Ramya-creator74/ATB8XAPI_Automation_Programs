package com.thetestingacademy.samplecheck.RestAssuredBasics.PUT;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_09_NONBDDStyle {


   @Description("Verify the PUT Request for RESTFUL booker APIs")
   @Test
    public void test_put_non_bdd(){
     RequestSpecification reqspe;

        // "token": "52a9b16e9913987"

        // "bookingid": 6813

        String token = "cf3a013ef4b6eb0";

        String bookingid = "4627";
        String payload_put = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        RequestSpecification reqSpe = RestAssured.given();
        reqSpe.baseUri("https://restful-booker.herokuapp.com");
        reqSpe.basePath("/booking/" +bookingid);
        reqSpe.contentType(ContentType.JSON);
        //reqSpe.auth().preemptive().basic("admin","password123");
        reqSpe.cookie("token",token);
        reqSpe.body(payload_put).log().all();

        Response response = reqSpe.when().log().all().put();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);







    }



}
