package com.carbonic.acid.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.UpperCamelCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(UpperCamelCaseStrategy.class)
public class SingleLoginModule {

	private String Id;
//	private String ParentId;
	/*private String Code;
	private String FullName;
	private String CategoryCode;
	private String ImageIndex;
	private String SelectedImageIndex;*/
	private String NavigateUrl;
	/*private String ImagUrl;
	private String Target;
	private String FormName;
	private String AssemblyName;
	private String AuthorizedDays;
	private String SortCode;
	private String Enabled;
	private String DeletionStateCode;
	private String IsMenu;
	private String IsPublic;
	private String IsVisible;
	private String IsScope;
	private String LastCall;
	private String Expand;
	private String AllowEdit;
	private String AllowDelete;
	private String Description;
	private String CreateOn;
	private String CreateUserId;
	private String CreateBy;
	private String ModifiedOn;
	private String ModifiedUserId;
	private String ModifiedBy;*/

}
