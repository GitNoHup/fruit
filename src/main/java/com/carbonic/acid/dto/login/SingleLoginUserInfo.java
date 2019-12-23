package com.carbonic.acid.dto.login;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(UpperCamelCaseStrategy.class)
public class SingleLoginUserInfo {

	private String Id;
	private String ServiceUserName;
	private String ServicePassword;
	private String OpenId;
	private String UserName;
	private String RealName;
	private String NickName;
	private String Code;
	private String CompanyId;
	private String CompanyCode;
	private String CompanyName;
	private String DepartmentId;
	private String DepartmentCode;
	private String DepartmentName;
	private String IsAdministrator;
	private String IdentityAuthentication;
	private String Password;
	private String IPAddress;
	private String MACAddress;
	private String SystemCode;
	private String Signature;
	private String Constraint;
	private String Permission;
	private String Message;

}
