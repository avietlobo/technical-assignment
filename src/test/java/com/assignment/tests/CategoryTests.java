package com.assignment.tests;

import com.assignment.api.StatusCode;
import com.assignment.api.applicationApi.CategoriesApi;
import com.assignment.pojo.Category;
import com.assignment.pojo.Promotion;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.assignment.constants.CategoriesConstants.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class CategoryTests {

    @Test
    public void ShouldBeAbleToGetCategoryDetails(){
        Response response = CategoriesApi.get(CATEGORY_ID);
        assertStatusCode(response.statusCode(), StatusCode.CODE_200);
        assertCategoryName(NAME,response.jsonPath().getString(KEY_NAME));
        assertCanReList(CAN_RELIST,response.jsonPath().getBoolean(KEY_CAN_RELIST));
        assertPromotionDescription(response.as(Category.class));
    }

    public void assertPromotionDescription(Category category){
        for(Promotion promotion : category.getPromotions()){
            if(promotion.getName().equals(PROMOTION_NAME)){
                assertThat(PROMOTION_DESCRIPTION, equalTo(promotion.getDescription()));
            }
        }
    }
    public void assertCanReList(boolean expected, boolean actual){
        assertThat(expected, equalTo(actual));
    }

    public void assertCategoryName(String expectedName, String actualName){
        assertThat(expectedName, equalTo(actualName));
    }

    public void assertStatusCode(int actualStatusCode, StatusCode statusCode){
        assertThat(actualStatusCode, equalTo(statusCode.code));
    }

}
