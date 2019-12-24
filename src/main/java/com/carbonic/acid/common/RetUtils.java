package com.carbonic.acid.common;

import com.carbonic.acid.common.enums.ResultEnum;

public class RetUtils {
    /**
     * 无data数据正确返回
     * @return
     */
    public static Result succRet(){
        Result ret = new Result();
        ret.setSuccess(true);
        ret.setErrorCode(ResultEnum.SERVICE_OK.getCode());
        ret.setErrorMsg(ResultEnum.SERVICE_OK.getMessage());
        return ret;
    }

    /**
     * 有data数据正确返回
     * @param data
     * @return
     */
    public static Result succRet(Object data){
        Result ret = new Result();
        ret.setSuccess(true);
        ret.setErrorCode(ResultEnum.SERVICE_OK.getCode());
        ret.setErrorMsg(ResultEnum.SERVICE_OK.getMessage());
        ret.setData(data);
        return ret;
    }

    /**
     * 异常返回
     * @param errCode
     * @param errMsg
     * @return
     */
    public static Result failRet(Integer errCode,String errMsg){
        Result ret = new Result();
        ret.setSuccess(false);
        ret.setErrorCode(errCode);
        ret.setErrorMsg(errMsg);
        return ret;
    }
    /**
     * 异常返回
     * @param resultEnum
     * @return
     */
    public static Result failRet(ResultEnum resultEnum){
        Result ret = new Result();
        ret.setSuccess(false);
        ret.setErrorCode(resultEnum.getCode());
        ret.setErrorMsg(resultEnum.getMessage());
        return ret;
    }
    /**
     * 异常返回
     * @param resultEnum
     * @return
     */
    public static Result failRet(ResultEnum resultEnum,String msg){
        Result ret = new Result();
        ret.setSuccess(false);
        ret.setErrorCode(resultEnum.getCode());
        ret.setErrorMsg(msg);
        return ret;
    }
}
