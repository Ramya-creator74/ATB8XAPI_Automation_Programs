package abc.RestAssuredBasics1.GET;

import io.restassured.RestAssured;

public class APITest_003_GET {
    public static void main(String[] args) {
        //negative testcase

        RestAssured
                .given()
                     .baseUri("\"https://restful-booker.herokuapp.com")
                      .basePath("/booking/1")
                .when()
                   .get()
                .then()
                    .statusCode(201);




    }
}
