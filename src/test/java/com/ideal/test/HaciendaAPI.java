package com.ideal.test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import com.ideal.base.CommonBase;
import com.ideal.pojo.payloads.APIEndPoints;
import com.mongodb.util.JSON;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class HaciendaAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		
		
		@Test
		public void haciendaPingIdealApi() throws IOException {
			log.info("Hacienda ping Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("haciendaPing");
						
			givenReq = given().auth().preemptive().basic(getGlobalValue("haciendaPingUN"),getGlobalValue("haciendaPingPW"))
					.spec(setBaseUriBasePath(getGlobalValue("HaciendaIdealUrl"), resourceAPI.getResource()));
			
			resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.TEXT).build();
			response = givenReq.when().get();
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		}
		
		@Test
		public void haciendaComplianceIdealApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("Hacienda Compliance Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("haciendaCompliance");
			givenReq = given().auth().preemptive().basic(getGlobalValue("haciendaPingUN"),getGlobalValue("haciendaPingPW"))
					.spec(setBaseUriBasePath(getGlobalValue("HaciendaIdealUrl"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("haciendaPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		@Test
		public void haciendaComplianceIdealApiInvalidID() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("Hacienda Compliance Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("haciendaCompliance");
			givenReq = given().auth().preemptive().basic(getGlobalValue("haciendaPingUN"),getGlobalValue("haciendaPingPW"))
					.spec(setBaseUriBasePath(getGlobalValue("HaciendaIdealUrl"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("haciendaPayloadInvalidID");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(400).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
			String expectedErrorMessage="Value exceeds the defined maximum length of 9";
			System.out.println(response.getBody().asString().contains("errorMessage"));
			String resp =response.getBody().asString();
			JsonPath a = new JsonPath(resp);
			String actualErrorMessage=a.get("errorMessage").toString();
			//System.out.println(actualErrorMessage);
			//System.out.println(actualErrorMessage.contains(actualErrorMessage));
			boolean booleanValue = actualErrorMessage.contains(expectedErrorMessage);
			assertTrue(booleanValue,"Invalid ID Error Message is not displayed, message displayed is :"+actualErrorMessage);
			
			
		}
		

		@Test
		public void haciendaAuthIdealApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("Hacienda Compliance Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("haciendaAuth");
			givenReq = given().auth().preemptive().basic(getGlobalValue("haciendaPingUN"),getGlobalValue("haciendaPingPW"))
					.spec(setBaseUriBasePath(getGlobalValue("HaciendaIdealUrl"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("haciendaAuthPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		@Test
		public void haciendaCompDocsIdealApi() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("Hacienda Compliance Documents Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("haciendaCompDocs");
			givenReq = given().auth().preemptive().basic(getGlobalValue("haciendaPingUN"),getGlobalValue("haciendaPingPW"))
					.spec(setBaseUriBasePath(getGlobalValue("HaciendaIdealUrl"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("haciendaCompDocsPayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}
		
		
}
