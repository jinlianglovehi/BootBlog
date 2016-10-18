package com.huadou.cn.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by jinliang on 16-10-14.
 */

/**
 * Druid的Servlet
 *  设置的是druid 后台监控的界面
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/druid/*",
        initParams={
                @WebInitParam(name="allow",value="127.0.0.1,192.168.1.126"),// IP白名单 (没有配置或者为空，则允许所有访问)
                @WebInitParam(name="loginUsername",value="Raye"),// 用户名
                @WebInitParam(name="loginPassword",value="123456"),// 密码
                @WebInitParam(name="resetEnable",value="false")// 禁用HTML页面上的“Reset All”功能
        })
public class DruidStatViewServlet extends StatViewServlet {
}
