package com.ideal.pojo.payloads.crim;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CrimGenTokens 
{

	public String username;
	public String password;
	public String apiKey;
	public String client;
	
	
}

