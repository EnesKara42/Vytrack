package com.cybertek.Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {

    @Test
    public void test1(){
        String url="http://54.172.21.126:8000/api/spartans";
        Response response= RestAssured.get(url);
        System.out.println(response.statusCode());
        response.prettyPrint();
    }
}
