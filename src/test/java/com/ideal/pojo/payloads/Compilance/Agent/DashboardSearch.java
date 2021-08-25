package com.ideal.pojo.payloads.Compilance.Agent;


import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data

public class DashboardSearch {

	public String userName;
	public String searchText;
	public String sortColumn;
	public String sortOrder;

}


