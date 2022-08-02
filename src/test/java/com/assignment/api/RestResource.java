package com.assignment.api;

import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RestResource {
    public static Response get(String path){
        return given(SpecBuilder.getRequestSpec()).
                queryParams(getQueryParameters()).
        when().get(path).
        then().spec(SpecBuilder.getResponseSpec()).
                extract().
                response();
    }

    public static HashMap<String, String> getQueryParameters(){
        HashMap<String, String> params = new HashMap<String, String>() {{
             put("catalogue", "false");
        }};
        return params;
    }
}
