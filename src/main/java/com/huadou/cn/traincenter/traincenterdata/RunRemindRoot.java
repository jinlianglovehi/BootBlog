package com.huadou.cn.traincenter.traincenterdata;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by jinliang on 16/11/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "root", propOrder = {})
public class RunRemindRoot {

    @XmlElementWrapper(name = "runreminds")//标注集合
    @XmlElement(name = "runremind")
    private List<RunRemind> list ;

    public List<RunRemind> getList() {
        return list;
    }

    public void setList(List<RunRemind> list) {
        this.list = list;
    }
}
