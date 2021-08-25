package com.ideal.test;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.ideal.base.CommonBase;
import com.ideal.pojo.payloads.APIEndPoints;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class JusticiaAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
	
	
	
		@Test
		public void capRequestApi() throws IOException {
			log.info("capRequestApi Api is starting");
			RestAssured.useRelaxedHTTPSValidation();
			response = given().auth().preemptive().basic(getGlobalValue("justiciaUN"),getGlobalValue("justiciaPW")).when().post(getGlobalValue("justurl1"));
			
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		}
		
		
		@Test
		public void retrieveApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("retrieveApi Api is starting");
		
			RestAssured.useRelaxedHTTPSValidation();
			response = given().auth().preemptive().basic(getGlobalValue("justiciaUN"),getGlobalValue("justiciaPW")).when().post(getGlobalValue("justurl2"));
			
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
			
		}

		@Test
		public void validateApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("validateApi Api is starting");
			
			RestAssured.useRelaxedHTTPSValidation();
			response = given().auth().preemptive().basic(getGlobalValue("justiciaUN"),getGlobalValue("justiciaPW")).when().post(getGlobalValue("justurl3"));
			
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		}
		
		@Test
		public void criminalRecordApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("criminalRecordApi Api is starting");
			
			APIEndPoints resourceAPI = APIEndPoints.valueOf("justiciaCriminalRecord");
			givenReq = given().auth().preemptive().basic(getGlobalValue("justiciacrimialUN"),getGlobalValue("justiciacrimialPW")).	
					   spec(setBaseUriBasePath(getGlobalValue("justiciaIdealUrl2"),resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("criminalCheckPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		
}
