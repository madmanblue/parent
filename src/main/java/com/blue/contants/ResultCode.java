package com.blue.contants;

public enum ResultCode {

    SUCCESS(200, "请求成功"),
    FAIL(500, "请求失败");

    private Integer code;
    private String msg;


    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
