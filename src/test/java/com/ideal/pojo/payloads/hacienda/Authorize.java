package com.ideal.pojo.payloads.hacienda;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class Authorize {

	public String idType;
	public String id;
	public String firstName;
	public String lastName;
	public String secondLastName;
	public String businessName;
	public String email;
	public String agency;
	    
	
	
}
