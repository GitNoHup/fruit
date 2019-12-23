package com.carbonic.acid.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonNaming(UpperCamelCaseStrategy.class)
public class SingleLoginResult {

	private SingleLoginUserInfo UserInfo;
	private String StatusCode;
	private String StatusMessage;

	private List<SingleLoginRole> Roles;
	private List<SingleLoginModule> Modules;

	private String Message;
	
}
