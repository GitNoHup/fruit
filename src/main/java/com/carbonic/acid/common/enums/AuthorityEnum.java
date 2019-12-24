package com.carbonic.acid.common.enums;

/**
 * 权限枚举
 */
public enum AuthorityEnum {
    ADMIN("1", "管理员"),
    CUNSUMER("2", "用户");

    String code;
    String message;

    private AuthorityEnum(String code, String message) {
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
