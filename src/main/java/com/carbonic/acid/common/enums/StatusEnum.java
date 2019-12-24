package com.carbonic.acid.common.enums;

/**
 * 状态枚举
 */
public enum StatusEnum {
    INVALID("0", "禁用"),
    EFFECTIVE("1", "启用");

    String code;
    String message;

    private StatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
