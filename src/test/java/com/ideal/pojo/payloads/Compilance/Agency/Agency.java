package com.ideal.pojo.payloads.Compilance.Agency;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Agency {
	public Request request;
	public Response response;

}
