package com.API_Section;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static  io.restassured.RestAssured.*;
import static    io.restassured.matcher.RestAssuredMatchers.*;
import static   org.hamcrest.Matchers.*;
public class API_Task {
    @Test
    public void Get_all_posts(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .when().get("posts")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("title",hasItems("qui est esse","eum et est occaecati","magnam facilis autem"),
                        "id",is(not(empty())));
    }
    @Test
    public void Get_post_by_id(){
        given().baseUri("https://jsonplaceholder.typicode.com/")
                .when().get("posts/1")
                .then().log().all().statusCode(200)
                        .assertThat().body("title",is(equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")),
                        "userId",equalTo(1),"id",equalTo(1)
                ,"body",is(not(empty())));

    }
    @Test
    public void createPost()
    {

baseURI = "https://jsonplaceholder.typicode.com/";
        JSONObject requst = new JSONObject();
        requst.put("userid",20);
        requst.put("id",2135);
        requst.put("title","tjrkiruhs");
        requst.put("body","nmfbjkdf");
        System.out.println(requst);
        given().body(requst.toString()).
                when().post("posts").
                then().statusCode(201).log().all();

    }


}
