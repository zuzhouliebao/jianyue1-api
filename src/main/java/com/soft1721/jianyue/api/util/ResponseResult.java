package com.soft1721.jianyue.api.util;

import lombok.Data;
import lombok.Setter;

/**
 * 封装统一的响应体
 * 调用 ResponseResult.success() 或 ResponseResult.success(Object data),
 * 不需要返回数据时调用前者, 需要返回数据时调用后者
 */
@Data
public class ResponseResult {
    private int code;
    private String msg;
    private Object data;

    public static ResponseResult error(int code, String msg) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        return responseResult;
    }

    public static ResponseResult success() {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(StatusConst.SUCCESS);
        responseResult.setMsg(MsgConst.SUCCESS);
        return responseResult;
    }

    public static ResponseResult success(Object data) {
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(StatusConst.SUCCESS);
        responseResult.setMsg(MsgConst.SUCCESS);
        responseResult.setData(data);
        return responseResult;
    }
}