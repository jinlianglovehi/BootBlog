package com.huadou.cn.editormd.model;

import java.util.Date;

/**
 * Created by jinliang on 16/10/22.
 *
 *  数据库中保存的markdown 文件的model
 */
public class EditorMdModel {

    private Long id ;
    private String markmd; // 保存的markdownd 实体对象

    private String markPath;// 将markdonw 文档保存到文件系统中
    private Date createDate ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarkmd() {
        return markmd;
    }

    public void setMarkmd(String markmd) {
        this.markmd = markmd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMarkPath() {
        return markPath;
    }

    public void setMarkPath(String markPath) {
        this.markPath = markPath;
    }
}
