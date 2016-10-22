package com.huadou.cn.editormd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinliang on 16/10/22.
 *
 * EditorMd 便捷controller 工具类s
 */

@Controller
@RequestMapping("/editor")
public class EditorMdController {


    /**
     * 添加将markdown 文件保存到数据库中
     * @return
     */
    @RequestMapping(value = "saveData")
    public String  insertMarkMdData(){

        return "" ;
    }



}
