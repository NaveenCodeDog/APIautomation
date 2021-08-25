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
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;



public class AsumeAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	public static String PatronstokenGen;
	public static String indtokenGen;
	
	
	@Test(priority=1)
	public void patronosAToken() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("patronosToken Api is starting");
	
		response = RestAssured.given()
			.baseUri("https://serviciosenlinea.asume.pr.gov/asume.api/")
			.contentType(ContentType.URLENC.withCharset("UTF-8"))
			.formParam("grant_type", "password")
			.formParam("username", "dToplicencias")
			.formParam("Password", "aldf@23901FTOPasd23")
			.formParam("client_id", "OGP20180821&*990899XX")
			.formParam("client_secret","5&t%$xZHpr9800")
            .post("/token");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.body().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
		
		PatronstokenGen= getJsonPath(response, "access_token");
		System.out.println(PatronstokenGen);	
				
		
	}	
	
			
		@Test(priority=3)
		public void patronosCert() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			log.info("patronosCert Api is starting");
			APIEndPoints resourceAPI = APIEndPoints.valueOf("patronosCert");
			givenReq = given().header("Authorization",
		              "Bearer " + PatronstokenGen).spec(setBaseUriBasePath(getGlobalValue("asumePatronCerturl"), resourceAPI.getResource()));
					
			Object payloadBody = getPayloadBody("patronCertificatePayload");
			
			bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
			response = bodyReq.when().post();
			System.out.println(response.getBody().asString());
			response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
			
		}

	

	@Test(priority=2)
	public void indToken() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("IndToken Api is starting");
		response = RestAssured.given()
				.baseUri("https://serviciosenlinea.asume.pr.gov/asume.api/")
				.contentType(ContentType.URLENC.withCharset("UTF-8"))
				.formParam("grant_type", "password")
				.formParam("username", "dToplicencias")
				.formParam("Password", "aldf@23901FTOPasd23")
				.formParam("client_id", "OGP20180821&*990899XX")
				.formParam("client_secret","5&t%$xZHpr9800")
	            .post("/token");
			
			System.out.println(response);
		
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS);
		indtokenGen= getJsonPath(response, "access_token");
		System.out.println(indtokenGen);
	}	
	
	
	
	@Test(priority=4)
	public void indCert() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("IndCert Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("indCert");
		givenReq = given().header("Authorization",
	              "Bearer " + indtokenGen).spec(setBaseUriBasePath(getGlobalValue("asumeIndCerturl"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("indCertificatePayload");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().post();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	
	
	
	
		
}
