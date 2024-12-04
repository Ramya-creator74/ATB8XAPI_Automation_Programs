package abc.RestAssuredBasics1.POST;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest_008_NONBDDStyle {

    @Description("Verify the POST Req by BDD Style")
    @Test
    public void test_NONBDDStyle_POST(){
        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);
        r.when().log().all().post();
        r.then().log().all().statusCode(200);






    }



}
