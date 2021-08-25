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

public class Comp_ReferenceAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
	
	@Test
	public void CompRef_SearchStatus() throws IOException
	{
		log.info("CompRef_SearchStatus  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_SearchStatus");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
	
	
	

	@Test
	public void CompRef_CorporateSearchReasons() throws IOException
	{
		log.info("CompRef_CorporateSearchReasons  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_CorporateSearchReasons");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
		
	@Test
	public void CompRef_CitizenSearchReasons() throws IOException
	{
		log.info("CompRef_CitizenSearchReasons  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_CitizenSearchReasons");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
	
	@Test
	public void CompRef_Towns() throws IOException
	{
		log.info("CompRef_Towns  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_Towns");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
	
	@Test
	public void CompRef_CompanyClass() throws IOException
	{
		log.info("CompRef_CompanyClass  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_CompanyClass");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
	
	@Test
	public void CompRef_CompanyType() throws IOException
	{
		log.info("CompRef_CompanyType  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_CompanyType");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
	
	
	@Test
	public void CompRef_Jurisdiction() throws IOException
	{
		log.info("CompRef_Jurisdiction  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompRef_Jurisdiction");
					String token= getGlobalValue("token");
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("CompRefurl"), resourceAPI.getResource()));
		
		//resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		response = givenReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	
		
}