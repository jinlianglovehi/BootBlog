package com.huadou.cn.plateform.controller;

import com.huadou.cn.plateform.model.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jinliang on 16/10/17.
 */
@Api(value = "用户相接口")
@Controller
@RequestMapping("/userinfo")
public class UserInfoController {


    @RequestMapping("test")
    public String test(Model model){
        model.addAttribute("username","jinliang");
        return "userinfo/user_add" ;
    }

    @RequestMapping("json")
    @ResponseBody
    public UserInfo getJson(){

        return new UserInfo("jinliang","123");

    }

    @ApiOperation(notes="添加用户",value="添加一个用户",httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",paramType="query",dataType="string"),
            @ApiImplicitParam(name="password",paramType="query",dataType="string")
    })
    @RequestMapping("add")
    @ResponseBody
    public UserInfo add(UserInfo userInfo){

        return userInfo;
    }
}
