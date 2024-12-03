package com.thetestingacademy.samplecheck.samplecheck1;

import io.restassured.RestAssured;

public class APITest_004_BuilderPatternDesign {
    public APITest_004_BuilderPatternDesign step1() {
        System.out.println("Step 1 : Started");
        System.out.println(" Step 1 : done");
        return this;
    }

    public APITest_004_BuilderPatternDesign step2() {
        System.out.println("Step 2 : Started");
        System.out.println("Step 2 : done");
        return this;
    }

    public  APITest_004_BuilderPatternDesign step3(String name){
        System.out.println("Step 3 : Started");
        System.out.println(" Step3 : done - " + name);
         return this;

    }

    public static void main(String[] args) {
        APITest_004_BuilderPatternDesign bp = new APITest_004_BuilderPatternDesign();
        bp.step1().step2().step3("Ramya");




    }

    public static class APITest_002 {
        public static void main(String[] args) {
            //Gherkin syntax
            // full url : https://restful-booker.herokuapp.com/booking/1
            // positive test case

            RestAssured
                    .given()
                         .baseUri( "https://restful-booker.herokuapp.com")
                         .basePath("/booking/1")
                    .when()
                         .get()
                    .then().log().all()
                         .statusCode(200);


        }
    }
}

