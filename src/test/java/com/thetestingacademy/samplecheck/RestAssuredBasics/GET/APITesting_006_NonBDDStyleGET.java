package com.thetestingacademy.samplecheck.RestAssuredBasics.GET;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_006_NonBDDStyleGET {
    static RequestSpecification r = RestAssured.given();
    @Severity(SeverityLevel.CRITICAL)
    @Description("TC1 - NONBDDStyle - Postive TC")
    @Test

    public void test_NONBDDStyle_positive() {

        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/560037");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("TC2 - NONBDDStyle - Negative TC")
    @Test
    public void test_NONBDDStyle_negative() {

        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/-1");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);


    }




    }
