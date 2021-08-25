package com.ideal.pojo.payloads.cfse;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CFSETokenGen 
{

	public String Username;
	public String Password;
	
		
}

