package com.ideal.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.ideal.report.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CommonBase {
	
	static List<String> servicelist = Arrays.asList("haciendaPayload");
	static String payloadClassName="com.ideal.pojo.payloads.Payloads";

	public static RequestSpecification req;
	protected static Logger log = Logger.getLogger(CommonBase.class);

	public RequestSpecification requestSpecification() throws IOException {
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key", "qaclick123")
				.setContentType(ContentType.JSON).build();
		return req;

	}

		
	@SuppressWarnings("deprecation")
	public RequestSpecification reqSpecQueryParam(String url, Map<String,String> queryParam) throws IOException {
		req = new RequestSpecBuilder().setBaseUri(getGlobalValue(url)).addQueryParameters(queryParam).build();
		return req;
	}
	

	public static String getGlobalValue(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

	public String getJsonPath(Response response, String key) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		return js.get(key).toString();
	}

	public String getReportConfigPath() throws IOException {
		String reportConfigPath = getGlobalValue("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}

	/*
	 * public static void initReport() { Reporter.loadXMLConfig(new
	 * File(System.getProperty("user.dir") +
	 * "/src/test/resources/extent-config.xml")); Reporter.setSystemInfo("user",
	 * System.getProperty("user.name")); Reporter.setSystemInfo("Project",
	 * " IDEAL API Automation"); Reporter.setSystemInfo("OS", "Windows OSX");
	 * 
	 * }
	 */

	public static ResponseSpecification statusCode() {
		ResponseSpecBuilder status = new ResponseSpecBuilder();
		status.expectStatusCode(200);
		ResponseSpecification responseSpec = status.build();
		return responseSpec;
	}

	public static RequestSpecification setBaseUriBasePath(String BaseURI, String BasePath) {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(BaseURI);
		builder.setBasePath(BasePath);

		RequestSpecification requestSpec = builder.build();

		return requestSpec;

	}
	
	public static RequestSpecification setBaseUri(String BaseURI) {
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri(BaseURI);
		//String BasePath="request/";
		//builder.setBasePath(BasePath);
		//System.out.println(builder.toString());
		RequestSpecification requestSpec = builder.build();

		return requestSpec;

	}
	
	public static Object getPayloadBody(String requestedPayload) {
		Class<?> dogClass;
		Object dog;
		Method menthodName;
		Object payloadBody = null;
		try {
			dogClass=Class.forName(payloadClassName);
			dog = dogClass.newInstance();
			menthodName=dog.getClass().getMethod(requestedPayload);
			payloadBody=menthodName.invoke(dog);
		} catch (ClassNotFoundException e){
			System.out.println("Error: Payload class not found");
			e.printStackTrace();
		} catch(InstantiationException e) {
			System.out.println("Error: Cannot create instance of payload");
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			System.out.println("Error: Cannot create instance of payload");
			e.printStackTrace();
		}catch(NoSuchMethodException e) {
			System.out.println("Error:Method "+requestedPayload+ " Not Available in class payload");
			e.printStackTrace();
		}catch(SecurityException e) {
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return payloadBody;
	}

	

}
