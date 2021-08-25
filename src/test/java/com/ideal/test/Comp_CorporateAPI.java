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



public class Comp_CorporateAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		
		
	@Test
	public void CorporateSearch() throws IOException
	{
		log.info("CorporateSearch  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CorporateSearch");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl2"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CorporateConsent() throws IOException
	{
		log.info("CorporateConsent  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CorporateConsent");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl2"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CorporateResendConsent() throws IOException
	{
		log.info("CorporateResendConsent  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CorporateResendConsent");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl2"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CorporateManualConsent() throws IOException
	{
		log.info("CorporateManualConsent  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CorporateManualConsent");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl2"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
	
	@Test
	public void CorporateRetryAgency() throws IOException
	{
		log.info("CorporateRetryAgency  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CorporateRetryAgency");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compcitizenurl2"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
	}
		
}
