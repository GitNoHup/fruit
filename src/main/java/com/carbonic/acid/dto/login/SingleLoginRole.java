package com.carbonic.acid.dto.login;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(UpperCamelCaseStrategy.class)
public class SingleLoginRole {

	private String Id;
	private String OrganizeId;
	private String Code;
	private String RealName;
	private String CategoryCode;
	private String AllowEdit;
	private String AllowDelete;
	private String IsVisible;
	private String SortCode;
	private String DeletionStateCode;
	private String Enabled;
	private String Description;
	private String CreateOn;
	private String CreateUserId;
	private String CreateBy;
	private String ModifiedOn;
	private String ModifiedUserId;
	private String ModifiedBy;

}
