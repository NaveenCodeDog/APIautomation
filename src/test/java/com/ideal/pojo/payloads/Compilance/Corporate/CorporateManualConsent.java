package com.ideal.pojo.payloads.Compilance.Corporate;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CorporateManualConsent {

	public String referenceId;
	public String smsCode;

}
