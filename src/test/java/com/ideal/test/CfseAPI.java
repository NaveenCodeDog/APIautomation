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

import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class CfseAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	public static String cfseTokenGen;
	String cfseReqIDGen;
	
	
	@Test
	public void cfsePing() throws IOException {
		log.info("CFSEPing Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("cfsePing");
					
		givenReq = given().spec(setBaseUriBasePath(getGlobalValue("cfseurl"), resourceAPI.getResource()));
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.TEXT).build();
		response = givenReq.when().get();
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
	}	
	
	@Test
	public void cfseAToken() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CfseToken Api is starting");
		response = RestAssured.given()
				.baseUri("https://idealapi.fondopr.com/api/account/")
				.contentType(ContentType.URLENC.withCharset("UTF-8"))
				.formParam("Username", "pritsuser")
				.formParam("Password", "1qaz@wsX")
			    .post("/login");
		
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
			
			cfseTokenGen= getJsonPath(response, "token");
			System.out.println(cfseTokenGen);
	
		
	}
	
	
	
	@Test
	public void cfseDebt() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CfseDebt Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("cfseDebt");
		givenReq = given().header("Authorization",
	              "Bearer " +cfseTokenGen).spec(setBaseUriBasePath(getGlobalValue("cfseurl"), resourceAPI.getResource()));
			System.out.println("token in cfsedebt:   "+cfseTokenGen);	
		//Object payloadBody = getPayloadBody("RulCompPayload");
		//bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		//bodyReq = givenReq.header("Content-Type","application/json");
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
		cfseReqIDGen = getJsonPath(response, "requestId");
		System.out.println(cfseReqIDGen);
	
		
	}
	
	
	@Test
	public void cfseDebtcerts() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CfseDebtcerts Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("cfseDebtcerts");
		givenReq = given().header("Authorization",
	              "Bearer " + cfseTokenGen).spec(setBaseUriBasePath(getGlobalValue("cfseurl"), resourceAPI.getResource()));
				
		//Object payloadBody = getPayloadBody("RulCompPayload");
		//bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		//bodyReq = givenReq.header("Content-Type","application/json");
		System.out.println("cfseCerts requestId:"+cfseReqIDGen);
		response = givenReq.when().get(cfseReqIDGen);
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(50L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	@Test
	public void cfsePolicycerts() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CfsePolicycerts Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("cfsePolicycerts");
		givenReq = given().header("Authorization",
	              "Bearer " + cfseTokenGen).spec(setBaseUriBasePath(getGlobalValue("cfseurl"), resourceAPI.getResource()));
		//String ssnid = "1618000099";		
		//Object payloadBody = getPayloadBody("RulCompPayload");
		//bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
	    		
		response = givenReq.when().get(cfseReqIDGen+"/9815000022");
		System.out.println(response.getBody().asString());
		
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(50L), TimeUnit.SECONDS).log().all();
		
	}	
	
	

	
}
