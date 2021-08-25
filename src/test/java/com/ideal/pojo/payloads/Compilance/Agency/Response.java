package com.ideal.pojo.payloads.Compilance.Agency;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Response {
	public boolean Success;
	public String Message;
	public boolean InCompliance;
	public String PaymentPlan;
	public String CertificationPDFBytes;
}
	    

