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



public class Comp_CertificateAPI extends CommonBase{
	
	RequestSpecification givenReq, bodyReq;
	ResponseSpecification resspec;
	Response response;
	
		
		
	@Test
	public void CompCertificateCitizenDetails() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CompCertificateCitizenDetails Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CompCertificateCitizenDetails");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl1"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload1");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void CertificateCorporateDetails() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CertificateCorporateDetails Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CertificateCorporateDetails");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl2"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload2");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	

	
	@Test
	public void HaciendaCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("HaciendaCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("HaciendaCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload5");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void CRIMCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CRIMCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CRIMCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload6");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	@Test
	public void LaborCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("LaborCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("LaborCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload7");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void AsumeCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("AsumeCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("AsumeCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload8");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void JusticiaCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("JusticiaCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("JusticiaCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload9");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	@Test
	public void CFSECertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("CFSECertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("CFSECertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload10");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	@Test
	public void ASGCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("ASGCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("ASGCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload11");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	@Test
	public void DTOPCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("DTOPCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("DTOPCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload12");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	@Test
	public void StateCertificate() throws IOException, NoSuchMethodException, Throwable, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		log.info("StateCertificate Api is starting");
		APIEndPoints resourceAPI = APIEndPoints.valueOf("StateCertificate");
		String token= getGlobalValue("token");	
		givenReq = given().header("Authorization",
	              "Bearer " + token)
				.spec(setBaseUriBasePath(getGlobalValue("certurl3"), resourceAPI.getResource()));
				
		Object payloadBody = getPayloadBody("CertificatePayload13");
		
		bodyReq = givenReq.header("Content-Type","application/json").body(payloadBody);
		response = bodyReq.when().get();
		System.out.println(response.getBody().asString());
		response.then().assertThat().statusCode(200).and().time(Matchers.lessThan(10L), TimeUnit.SECONDS).log().all();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
