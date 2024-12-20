package com.thetestingacademy.samplecheck.RestAssuredBasics.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITest_007 {

// https://restful-booker.herokuapp.com/auth
// 'Content-Type: application/json'
    // {
    //    "username" : "admin",
    //    "password" : "password123"
    //  }
  @Description("Verify the POST Req by BDD Style")
  @Test
   public void test_BDDStyle_Post(){

      String payload = "{\n" +
              "                    \"username\" : \"admin\",\n" +
              "                    \"password\" : \"password123\"\n" +
              "                }";
      RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
              .when()
                 .log().all()
                  .post()
              .then()
                   .log().all().statusCode(200);




  }





}
