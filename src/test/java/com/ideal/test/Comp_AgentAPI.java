package com.ideal.test;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.ideal.base.CommonBase;
import com.ideal.pojo.payloads.APIEndPoints;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class Comp_AgentAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		
		
		@Test
		public void compDashBoardIdealApi() throws IOException
		{
			log.info("compDashBoardIdealApi  Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("CompDashKPI");
						String token= getGlobalValue("token");
			givenReq = given().header("Authorization",
		              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compAgenturl"), resourceAPI.getResource()));
			
			//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
			response = givenReq.when().get();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		}
		
		
		@Test
		public void compDashBoardSearchIdealApi() throws IOException
		{
			log.info("compDashBoardSearchIdealApi  Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("CompDashBoardSearch");
			String token= getGlobalValue("token");			
			givenReq = given().header("Authorization",
		              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compAgenturl"), resourceAPI.getResource()));
			
			resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.TEXT).build();
			response = givenReq.when().get();
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		}
		
}
