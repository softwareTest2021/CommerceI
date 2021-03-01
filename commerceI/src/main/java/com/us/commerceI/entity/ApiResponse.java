package com.us.commerceI.entity;

import com.us.commerceI.consts.StateCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author codeY
 * @version 1.0
 * @date 2021/3/1 20:56
 */
@Data
public class ApiResponse {
    @ApiModelProperty("是否请求成功，成功为true,失败为false")
    private Boolean success;
    @ApiModelProperty("状态码")
    private Integer code;
    @ApiModelProperty("返回消息")
    private String message;
    @ApiModelProperty("返回数据")
    private Map<String, Object> data = new HashMap<>();
    private ApiResponse(){}
    public static ApiResponse ok(){
        ApiResponse response = new ApiResponse();
        response.setCode(StateCode.OK);
        response.setSuccess(true);
        response.setMessage("成功");
        return response;
    }
    public static ApiResponse error(){
        ApiResponse response = new ApiResponse();
        response.setCode(StateCode.ERROR);
        response.setSuccess(false);
        response.setMessage("失败");
        return response;
    }
    public ApiResponse success(Boolean success){
        setSuccess(success);
        return this;
    }
    public ApiResponse code(Integer code){
        setCode(code);
        return this;
    }
    public ApiResponse message(String message){
        setMessage(message);
        return this;
    }
    public ApiResponse data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

}
