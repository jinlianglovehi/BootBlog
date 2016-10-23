package com.huadou.cn.editormd.controller;

import com.huadou.cn.editormd.mapper.EditorMdMapper;
import com.huadou.cn.editormd.model.EditorMdModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jinliang on 16/10/22.
 *
 * EditorMd 便捷controller 工具类s
 */

@Controller
@RequestMapping("/editor")
public class EditorMdController {


    @Autowired
    private EditorMdMapper editorMdMapper;
    /**
     * 添加将markdown 文件保存到数据库中
     * @return
     */
    @RequestMapping(value = "saveData")
    @ResponseBody
    public String  insertMarkMdData(EditorMdModel editorMdModel){
        editorMdMapper.insert(editorMdModel.getMarkmd());
        return "success" ;
    }


}
