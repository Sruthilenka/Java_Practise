package RestAssureTesting;

import io.restassured.RestAssured;

import java.io.File;

import static io.restassured.RestAssured.given;

public class FileUpload {
    public static void main(String[] args){
        RestAssured.baseURI = "https://api.example.com";
        RestAssured.basePath = "/v1/upload";

        File file = new File("path_to_your_file.txt");

        given().multiPart(file).when().post().then().statusCode(200);

    }
}
