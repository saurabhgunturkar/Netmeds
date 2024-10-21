package api;

import static com.jayway.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class ApiTesting {

    // ApiName: GorestAPI

    @Test
    public void getData() {
        try {
            Response response = when()
                    .get("https://gorest.co.in/public/v2/users");
            Assert.assertEquals(response.getStatusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUsersDetails() {
        try {
            Response response = when().get("https://gorest.co.in/public/v2/users");
            String responseBody = response.getBody().prettyPrint();
            System.out.println(responseBody);
            Assert.assertEquals(response.statusCode(), 200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getUsers_ID() {
        int userID = 7480808;
        try {
            Response response = when().get("https://gorest.co.in/public/v2/users/" + userID);
            int statusCode = response.getStatusCode();
            String responseBody = response.getBody().prettyPrint();
            System.out.println("Response Body: " + responseBody);
            Assert.assertEquals(statusCode, 200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addUser() {
        try {
            String requestBody = "{\n" +
                    "  \"name\": \"Saurabh Gunturkar\",\n" +
                    "  \"email\": \"saurabh123@example.com\",\n" +
                    "  \"gender\": \"male\",\n" +
                    "  \"status\": \"active\"\n" +
                    "}";
            Response response = given()
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer 6985a2d641d89725188ae2f65de1b79253266328c9b3b9428189410d43b542d5")
                    .body(requestBody)
                    .when()
                    .post("https://gorest.co.in/public/v2/users")
                    .then()
                    .log().all() // getting the RAW data
                    .extract().response();
            Assert.assertEquals(response.getStatusCode(), 201, "Expected status code is 201");
            System.out.println("Response Body: " + response.getBody().prettyPrint());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
