package com.huadou.cn.traincenter.traincenterdata;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by jinliang on 16/11/10.
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "root", propOrder = {})
public class TrainPlanRoot {

    @XmlElementWrapper(name = "trainplanlist")//标注集合
    @XmlElement(name = "trainplan")
    private List<TrainPlan> trainPlanList ;

    public List<TrainPlan> getTrainPlanList() {
        return trainPlanList;
    }

    public void setTrainPlanList(List<TrainPlan> trainPlanList) {
        this.trainPlanList = trainPlanList;
    }
}
