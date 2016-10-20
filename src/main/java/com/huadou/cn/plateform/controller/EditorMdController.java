package com.huadou.cn.plateform.controller;

import com.huadou.cn.utils.PrintUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinliang on 16-10-19.
 */

@Controller
@RequestMapping("/editor")
public class EditorMdController {
   private static final String TAG = EditorMdController.class.getSimpleName();

    @RequestMapping("index")
    public String editorIndex(){
        PrintUtils.printData(TAG ,"editorIndex" ,"");
        return "demo01";
    }
}
