package abc.RestAssuredBasics1.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_005_BDDStyle_GET {
   //Positive test case
    @Test
    public void test_GET_Req(){
        String pin_code = "560037";
        RestAssured
                .given()
                  .baseUri("https://api.zippopotam.us")
                  .basePath("/IN/" +pin_code)
                .when()
                   .log().all().get()
                .then()
                    .log().all()
                    .statusCode(200);


    }


    public class APITesting_005_BDDStyle_GET_Negative_TC {

        @Test
        public void test_GET_Req() {
            String pin_code = "-1";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pin_code)
                    .when()
                    .log().all().get()
                    .then()
                    .log().all()
                    .statusCode(200);


        }


    }
}



