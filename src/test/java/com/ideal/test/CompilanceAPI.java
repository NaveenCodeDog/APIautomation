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



public class CompilanceAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		@Test
		public void CompilancePing() throws IOException {
			log.info("CompilancePing Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("CompilancePing");
						
			givenReq = given().auth().preemptive().basic(getGlobalValue("haciendaPingUN"),getGlobalValue("haciendaPingPW"))
					.spec(setBaseUriBasePath(getGlobalValue("Compurl"), resourceAPI.getResource()));
			
			resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.TEXT).build();
			response = givenReq.when().get();
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(5L), TimeUnit.SECONDS).log().all();
		}
		

		
		
}
