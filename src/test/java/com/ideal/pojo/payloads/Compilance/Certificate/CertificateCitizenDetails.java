package com.ideal.pojo.payloads.Compilance.Certificate;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CertificateCitizenDetails {

	public String referenceId;

}
