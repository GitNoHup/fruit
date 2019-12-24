package com.carbonic.acid.common.enums;

public enum ResultEnum {
    SERVICE_OK(20100, "请求成功"),
    SERVICE_UNKNOWN_ERROR(20101, "未知异常"),
    SERVICE_NETWORK_ERROR(20102, "网络异常"),
    SERVICE_INVALID_PARAMETER(20103, "参数错误"),
    SERVICE_FUNCTION_NO_ACCESS(20104, "无访问权限"),
    SERVICE_BIZ_INVALID(20105, "业务校验异常");

    Integer code;
    String message;

    private ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
