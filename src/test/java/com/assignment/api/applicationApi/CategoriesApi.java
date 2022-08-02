package com.assignment.api.applicationApi;

import com.assignment.api.RestResource;
import com.assignment.api.Route;
import io.restassured.response.Response;

public class CategoriesApi {

    public static Response get(String categoryId){
        return RestResource.get(Route.CATEGORIES + "/" + categoryId + Route.JSON_FILE);
    }

}
