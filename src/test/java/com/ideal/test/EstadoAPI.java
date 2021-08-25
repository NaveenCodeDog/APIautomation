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



public class EstadoAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		
		
	@Test
	public void estadoPingIdealApi() throws IOException {
		log.info("estadoPingIdeal Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("estadoPing");
					
		givenReq = given().spec(setBaseUriBasePath(getGlobalValue("estadoIdealUrl"), resourceAPI.getResource()));
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void estadoCompIdealApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("estadoCompIdealApi Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("estadoCompliance");
		givenReq = given().spec(setBaseUriBasePath(getGlobalValue("estadoIdealUrl"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("EstadoCompPayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		
	}

	@Test
	public void estadoCertIdealApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("estadoCertIdealApi Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("estadoCertificate");
		givenReq = given().spec(setBaseUriBasePath(getGlobalValue("estadoIdealUrl"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("EstadoCertPayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(20L), TimeUnit.SECONDS).log().all();
		
	}
	
}
