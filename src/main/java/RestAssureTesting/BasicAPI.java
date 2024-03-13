package RestAssureTesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
//Given -- All input details
//When-- URl/resource and http method
public class BasicAPI {
    public static void main(String[] args){
        RestAssured.baseURI ="https://rahulshettyacademy.com";
        //The following given() statement needs an import which we have to ad manually at the top of the file.
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body("\t'{\\n  \"location\": {\\n    \"lat\": -38.383494,\\n    \"lng\": 33.427362\\n  },\\n  \"accuracy\": 50,\\n  \"name\": \"Frontline house\",\\n  \"phone_number\": \"(+91) 983 893 3937\",\\n  \"address\": \"29, side layout, cohen 09\",\\n  \"types\": [\\n    \"shoe park\",\\n    \"shop\"\\n  ],\\n  \"website\": \"http://google.com\",\\n  \"language\": \"French-IN\"\\n}'")
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200);
    //when() --> as we have already provided uri, we are giving only the resource id in the post method.
        //We can use log().all() with given to log all the process and with then() to see the logs on how the response is generated.
    }

}
