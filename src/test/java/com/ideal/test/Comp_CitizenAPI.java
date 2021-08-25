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



public class Comp_CitizenAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	

	@Test
	public void CitizenSearch() throws IOException
	{
		log.info("CitizenSearch  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CitizenSearch");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl1"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CitizenConsent() throws IOException
	{
		log.info("CitizenConsent  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CitizenConsent");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl1"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CitizenResendConsent() throws IOException
	{
		log.info("CitizenResendConsent  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CitizenResendConsent");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl1"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CitizenManualConsent() throws IOException
	{
		log.info("CitizenManualConsent  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CitizenManualConsent");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl1"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CitizenRetryAgency() throws IOException
	{
		log.info("CitizenRetryAgency  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CitizenRetryAgency");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl1"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
		
}
