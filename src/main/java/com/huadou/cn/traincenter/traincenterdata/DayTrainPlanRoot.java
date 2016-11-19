package com.huadou.cn.traincenter.traincenterdata;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by jinliang on 16/11/11.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "root", propOrder = {})
public class DayTrainPlanRoot {

    @XmlElementWrapper(name = "daytrainplans")//标注集合
    @XmlElement(name = "daytrainplan")
    private List<DayTrainPlan> dayTrainPlanList;


    public List<DayTrainPlan> getDayTrainPlanList() {
        return dayTrainPlanList;
    }

    public void setDayTrainPlanList(List<DayTrainPlan> dayTrainPlanList) {
        this.dayTrainPlanList = dayTrainPlanList;
    }
}
