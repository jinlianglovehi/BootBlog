package com.huadou.cn;

import com.huadou.cn.traincenter.traincenterdata.TrainPlan;
import com.huadou.cn.traincenter.traincenterdata.TrainPlanRoot;
import com.huadou.cn.utils.JaxbUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliang on 16/11/10.
 */
public class TestTemplateData {

    public static void main(String[] args) {


        TrainPlanRoot trainPlanRoot = new TrainPlanRoot();

        System.out.println(TrainPlan.class.getSimpleName().toLowerCase());

        List<TrainPlan> trainPlanList = new ArrayList<TrainPlan>();

        TrainPlan xinshou = new TrainPlan(1,"新手上路",1,1);
        trainPlanList.add(xinshou);

        TrainPlan train_5km = new TrainPlan(2,"5km",2,2);

        trainPlanList.add(train_5km);


        TrainPlan train_10km = new TrainPlan(3,"10km",3,3);

        trainPlanList.add(train_10km);


        TrainPlan train_banma = new TrainPlan(4,"半马",4,4);

        trainPlanList.add(train_banma);

        TrainPlan train_quanma =new TrainPlan(5,"全马",5,5);

        trainPlanList.add(train_quanma);

        trainPlanRoot.setTrainPlanList(trainPlanList);
        String result = JaxbUtil.convertToXml(trainPlanRoot);


        System.out.println(result);

        // data set

        TrainPlanRoot revortRoot = JaxbUtil.converyToJavaBean(result,TrainPlanRoot.class);
        for (TrainPlan trainPlan: revortRoot.getTrainPlanList()
             ) {
            System.out.println("" + trainPlan.getTitle());
        }

    }




}
