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



public class CrimAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	public static String crimtokenGen;
		
	@Test
	public void crimPing() throws IOException {
		log.info("CrimPing Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("crimPing");
					
		givenReq = given().spec(setBaseUriBasePath(getGlobalValue("crimurl1"), resourceAPI.getResource()));
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.TEXT).build();
		response = givenReq.when().get();
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void crimGenToken() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CrimGenToken Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("crimgenToken");
		givenReq = given().spec(setBaseUriBasePath(getGlobalValue("crimurl2"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CrimGenTokenPayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		 crimtokenGen= getJsonPath(response, "token");
		System.out.println(crimtokenGen);
	}
	
	
	@Test
	public void crimCompliance() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CrimCompliance Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("crimCompliance");
		givenReq = given().header("Authorization",
	              "Bearer " + crimtokenGen).spec(setBaseUriBasePath(getGlobalValue("crimurl2"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CrimCompPayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void crimCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CrimCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("crimCertificate");
		givenReq = given().header("Authorization",
	              "Bearer " + crimtokenGen).spec(setBaseUriBasePath(getGlobalValue("crimurl2"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CrimCertPayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	
	
	
		
}
