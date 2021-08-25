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



public class Comp_AgencyAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		
		
	@Test
	public void AgencySaveIdealApi() throws IOException
	{
		log.info("AgencySaveIdealApi  Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompAgentSave");
		String token= getGlobalValue("token");			
		givenReq = given().header("Authorization",
	              "Bearer " + token).spec(setBaseUriBasePath(getGlobalValue("compAgencyurl"), resourceAPI.getResource()));
		
		Object payloadBody = getPayloadBody("AgencySavePayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
				System.out.println();
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
	}
		
		
				
}
