package com.huadou.cn.traincenter.traincenterdata;

import javax.xml.bind.annotation.*;

/**
 * Created by jinliang on 16/11/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "runmind", propOrder = {})

public class RunRemind {

    @XmlAttribute
    private int id ;

    private String runType ; // 跑步， 休息， 游泳 ，

    private String trainContent;//训练内容太

    private String copyWrite;// 对应文案

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRunType() {
        return runType;
    }

    public void setRunType(String runType) {
        this.runType = runType;
    }

    public String getTrainContent() {
        return trainContent;
    }

    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent;
    }

    public String getCopyWrite() {
        return copyWrite;
    }

    public void setCopyWrite(String copyWrite) {
        this.copyWrite = copyWrite;
    }
}
