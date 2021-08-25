package com.ideal.pojo.payloads.crim;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class CrimCompliance 
{
	public String id;
	
	
}
