package com.ideal.pojo.payloads.Compilance.Certificate;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class CertificateCitizenNote {

	public String referenceId;

}
