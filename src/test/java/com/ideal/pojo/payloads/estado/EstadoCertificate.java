package com.ideal.pojo.payloads.estado;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class EstadoCertificate 
{

	public String registerNumber;
	public String corpClass;
	public String corpType;
	public String jurisdiction;
	public String IDEALId;
	
		
}

