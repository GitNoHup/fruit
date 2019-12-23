(function(gloab){
	var valid = {
		//真实姓名（实名制）
		validRealname: function(value){
			return /^[\u4E00-\u9FA5A-Za-z]+$/.test(value)
		},
		//身份证
		validIdCard: function(value){
			return /^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/.test(value);
		},
		//港澳台居住证验证
		validResidenceCard: function(value){
			return /^[0-9]{17}[\d|\w]$/.test(value);
		},
		//手机号码
		validMobile: function(value){
			return  /^[1][3,4,5,6,7,8,9][0-9]{9}$/.test(value);
		},
		//固定电话或400电话
		validPhone: function(value){
			return  /^(0\d{2,3}-\d{7,8}(-\d{3,5}){0,1})$/.test(value) || /^400(-\d{3,4}){2}$/.test(value) ;
		},
		//税务登记证号
		validTaxRegNo: function(value){
			return  /^\d{15,20}$/.test(value) ;
		},
		//企业信用代码
		validUnifiedSocialCreditCode: function(value){
			return  /^[a-zA-Z\d]{18}$/.test(value) ;
		},
		//组织机构代码（实名制）
		validOrgCode: function(value){
			return  /^[A-Z0-9-]{9,10}$/.test(value) ;
		},
		//IP:PORT
		validIpAndPort: function(value){
			//var regex = /^(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9]):\d{0,5}$/;
			var regex = /^(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9]):\d{0,5}((,)(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9]):\d{0,5})*$/;
			return regex.test(value);
		},
		//IP地址
		validIp: function(value){
			var regex = /^(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])$/;
			return regex.test(value);
		}
	}
	gloab._valid = valid;
})(window);