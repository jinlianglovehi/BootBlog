package com.huadou.cn.plateform.controller;

import com.huadou.cn.utils.PrintUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinliang on 16/11/19.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    private static final String TAG = "LoginController";
    @RequestMapping(value="index")
    public String index()

    {
        PrintUtils.printData(TAG,"index","");
        return "login/index";
    }

}
