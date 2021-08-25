package com.ideal.pojo.payloads.asume;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class GetPatronoToken 
{

	public String grant_type;
	public String username;
	public String Password;
	public String client_id;
	public String client_secret;
	
		
}

