package com.ideal.pojo.payloads.Compilance.Citizen;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CitizenManualConsent {

	public String referenceId;
	public String smsCode;
}
