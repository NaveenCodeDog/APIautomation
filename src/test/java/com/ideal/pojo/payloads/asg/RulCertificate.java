package com.ideal.pojo.payloads.asg;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class RulCertificate {
	public String id;
}




