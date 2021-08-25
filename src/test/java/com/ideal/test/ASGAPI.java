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
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class ASGAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	public static String tokenGen;
	
		
		
		@Test
		public void asgPing() throws IOException {
			log.info("ASGPing Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("asgPing");
						
			givenReq = given().spec(setBaseUriBasePath(getGlobalValue("asgurl1"), resourceAPI.getResource()));
			
			resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.TEXT).build();
			response = givenReq.when().get();
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		}
		
		@Test
		public void genToken() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("genToken Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("genToken");
			givenReq = given().spec(setBaseUriBasePath(getGlobalValue("asgurl1"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("GenTokenPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			 tokenGen= getJsonPath(response, "token");
			System.out.println(tokenGen);
		}

		@Test
		public void rulCompliance() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("rulCompliance Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("rulCompliance");
			givenReq = given().header("Authorization",
		              "Bearer " + tokenGen).spec(setBaseUriBasePath(getGlobalValue("asgurl1"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("RulCompPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		@Test
		public void rulCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("rulCertificate Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("rulCertificate");
			givenReq = given().header("Authorization",
		              "Bearer " + tokenGen).spec(setBaseUriBasePath(getGlobalValue("asgurl1"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("RulCertPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		@Test
		public void rupCompliance() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("rupCompliance Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("rupCompliance");
			givenReq = given().header("Authorization",
		              "Bearer " + tokenGen).spec(setBaseUriBasePath(getGlobalValue("asgurl1"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("RupCompPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		@Test
		public void rupCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("rupCertificate Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("rupCertificate");
			givenReq = given().header("Authorization",
		              "Bearer " + tokenGen).spec(setBaseUriBasePath(getGlobalValue("asgurl1"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("RupCertPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		
		
		
		
		
		
}
