package com.ideal.pojo.payloads.Compilance.Corporate;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CorporateSearch {

	public String companyName;
	public String companyRepresentative;
	public String ssn;
	public String merchantRegistrationNumber;
	public String stateRegistrationNumber;
	public String companyClass;
	public String companyType;
	public String jurisdiction;
	public String consentEmail;
	public String consentMobileNumber;	
	public String searchReason;
	public String choferilSSNPatronal;
}

