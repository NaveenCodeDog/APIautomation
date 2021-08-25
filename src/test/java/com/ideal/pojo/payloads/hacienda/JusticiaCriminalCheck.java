package com.ideal.pojo.payloads.hacienda;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class JusticiaCriminalCheck {

	public String ssn;
		
	
}
