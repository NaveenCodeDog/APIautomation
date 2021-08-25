package com.ideal.pojo.payloads.hacienda;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class ComplianceDocuments {

	public String idType;
	public String id;
	public String firstName;
	public String lastName;
	public String secondLastName;
	public String businessName;	
	public String merchantId;
	public boolean filingCertificate;
	public boolean filingCertificateSUT;
	public boolean debtCertificate;
	public boolean merchantCertificate;
	public boolean waiver;
	public String requestorEmail;

}




