package com.ideal.pojo.payloads.Compilance.Citizen;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CitizenSearch {

	public String firstName;
	public String lastName;
	public String ssn;
	public String licenseNumber;
	public String dob;
	public String consentEmail;
	public String consentMobileNumber;
	public String searchReason;
	public String middleName;
	public String mothersLastName;	
	public String townOfBirth;
}


