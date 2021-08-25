
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



public class DtopAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	public static String accessToken;
		
		
	@Test
	public void GetPhoto() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("GetPhoto Api is starting");
		//APIEndPoints resourceAPI = APIEndPoints.valueOf("getPhoto");
		
		response = given().auth().preemptive().basic(getGlobalValue("dtopClientID"),getGlobalValue("dtopClientSecret"))   
                                              .formParam("scope", getGlobalValue("dtopScope"))
                                              .formParam("grant_type", getGlobalValue("dtopGrantType"))
                        .when()
                        .post(getGlobalValue("dtopAccessTokenURL"));
		
		System.out.println(response.getBody().asString());
		accessToken= getJsonPath(response, "access_token");
		System.out.println(accessToken);
		givenReq = given().header("Authorization",
		        "Bearer " + accessToken).spec(setBaseUri(getGlobalValue("dtopurl1")));		
		
		 //Object payloadBody = getPayloadBody("GetPhotoPayload");
		 
		 //bodyReq = givenReq.header("Content-Type","application/json");
		 response = givenReq.when().get();
		// System.out.println(response.getBody().asString());
		 response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L)
		 , TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void GetLicence() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("GetLicence Api is starting");
		//APIEndPoints resourceAPI = APIEndPoints.valueOf("getPhoto");
		
		response = given().auth().preemptive().basic(getGlobalValue("dtopClientID"),getGlobalValue("dtopClientSecret"))   
                                              .formParam("scope", getGlobalValue("dtopScope"))
                                              .formParam("grant_type", getGlobalValue("dtopGrantType"))
                        .when()
                        .post(getGlobalValue("dtopAccessTokenURL"));
		
		System.out.println(response.getBody().asString());
		accessToken= getJsonPath(response, "access_token");
		System.out.println(accessToken);
		givenReq = given().header("Authorization",
		        "Bearer " + accessToken).spec(setBaseUri(getGlobalValue("dtopurl2")));		
		
		 //Object payloadBody = getPayloadBody("GetPhotoPayload");
		 
		 //bodyReq = givenReq.header("Content-Type","application/json");
		 response = givenReq.when().get();
		// System.out.println(response.getBody().asString());
		 response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L)
		 , TimeUnit.SECONDS).log().all();
		
	}
	
		
}
