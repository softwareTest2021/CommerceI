package com.us.commerceI.controller;


import com.us.commerceI.entity.ApiResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author us
 * @since 2021-03-01
 */
@RestController
@Api(tags = "1.0.0-SNAPSHOT", value = "用户管理")
@RequestMapping("/commerceI/user")
public class UserController {
    @ApiOperation(value = "test operation",notes = "a test")
    @GetMapping("/test")
    public ApiResponse test(){
        return ApiResponse.ok().data("info","this is a test");
    }
}

