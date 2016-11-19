package com.huadou.cn.traincenter.test;

import com.huadou.cn.traincenter.traincenterdata.DayTrainPlan;
import com.huadou.cn.traincenter.traincenterdata.DayTrainPlanRoot;
import com.huadou.cn.utils.JaxbUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliang on 16/11/11.
 *
 *   新手模板数据
 */
public class TestXinShouDayTrainPlan {


    private static String[] xinshouProjects  = {
            "休息日","休息日","慢跑 2km" ,"休息日" ,"休息日","慢跑 2km" ,"慢跑 2km" , // 第一周

            "休息日","休息日","慢跑 2.4km" ,"休息日" ,"休息日","慢跑 2.4km" ,"慢跑 2.4km",// 第二周

            "休息日","休息日","慢跑 2.8km" ,"休息日" ,"休息日","慢跑 2.8km" ,"慢跑 2.8km",// 第三周

            "休息日","休息日","慢跑 3.2km" ,"休息日" ,"休息日","慢跑 3.2km" ,"慢跑 3.2km",// 第四周

            "休息日","休息日","慢跑 4km" ,"休息日" ,"休息日","慢跑 4km" ,"慢跑 4km",// 第5周

            "休息日","休息日","慢跑 4.4km" ,"休息日" ,"休息日","慢跑 4.4km" ,"慢跑 4.4km",// 第6周

            "休息日","休息日","慢跑 5km" ,"休息日" ,"休息日","慢跑 5km" ,"慢跑 5km",// 第7周

            "休息日","休息日","慢跑 5km" ,"休息日" ,"休息日","慢跑 5km" ,"慢跑 5km",// 第8周



    };

    private static int[] reminds = {

            9, 9, 0, 9,9 , 0 , 0 , // 第一周
            9, 9, 0, 9,9 , 0 , 0 , // 第2周
            9, 9, 0, 9,9 , 0 , 0 , // 第3周
            9, 9, 0, 9,9 , 0 , 0 , // 第4周
            9, 9, 0, 9,9 , 0 , 0 , // 第5周
            9, 9, 0, 9,9 , 0 , 0 , // 第6周
            9, 9, 0, 9,9 , 0 , 0 , // 第7周
            9, 9, 0, 9,9 , 0 , 0  // 第8周





    };


    private static double[] xinshouDistance = {
            0 , 0 ,2, 0, 0, 2, 2 ,// 第一周

            0 , 0 ,2.4, 0, 0, 2.4, 2.4 ,// 第2周

            0 , 0 ,2.8, 0, 0, 2.8, 2.8 ,// 第3 周

            0 , 0 ,3.2, 0, 0, 3.2, 3.2 ,// 第4周

            0 , 0 ,4, 0, 0, 4, 4 ,// 第5周

            0 , 0 ,4.4, 0, 0, 4.4, 4.4 ,// 第6周

            0 , 0 ,5, 0, 0, 5, 5 ,//  7 周

            0 , 0 ,5, 0, 0, 5, 5 // 第8周



    };

    private static int[] rateStarts = {

            2 , 1 ,70, 2, 1, 70, 70 ,// 第一周

            2 , 1 ,70, 2, 1, 70, 70 ,// 第2周

            2 , 1 ,70, 2, 1, 70, 70 ,// 第3 周

            2 , 1 ,70, 2, 1, 70, 70 ,// 第4周

            2 , 1 ,70, 2, 1, 70, 70 ,// 第5周

            2 , 1 ,70, 2, 1, 70, 70 ,// 第6周

            2 , 1 ,70, 2, 1, 70, 70 ,//  7 周

            2 , 1 ,70, 2, 1, 70, 70 // 第8周




    };

    private static int[] rateEnds  ={

            0 , 0 ,80, 0, 0, 80, 80 ,// 第一周

            0 , 0 ,80, 0, 0, 80, 80 ,// 第2周

            0 , 0 ,80, 0, 0, 80, 80 ,// 第3 周

            0 , 0 ,80, 0, 0, 80, 80 ,// 第4周

            0 , 0 ,80, 0, 0, 80, 80 ,// 第5周

            0 , 0 ,80, 0, 0, 80, 80 ,// 第6周

            0 , 0 ,80, 0, 0, 80, 80 ,//  7 周

            0 , 0 ,80, 0, 0, 80, 80 // 第8周

    };
    public static void main(String[] args) {



        DayTrainPlanRoot root = new DayTrainPlanRoot();

        List<DayTrainPlan> rootList = new ArrayList();
        DayTrainPlan dayTrainPlan = null ;
        for (int i = 0; i < 56; i++) {

            dayTrainPlan = new DayTrainPlan();
            dayTrainPlan.setId(i);
            if(i<42){
               dayTrainPlan.setStageDesc("基础锻炼");
            }else if(i < 56){
                dayTrainPlan.setStageDesc("针对性阶段");
            }
            dayTrainPlan.setOffsetTotal(i);
            dayTrainPlan.setDesc(xinshouProjects[i]);

            dayTrainPlan.setDistance(xinshouDistance[i]);

            dayTrainPlan.setRunremindId(reminds[i]);
            dayTrainPlan.setRateStart(rateStarts[i]);
            dayTrainPlan.setRateEnd(rateEnds[i]);
            rootList.add(dayTrainPlan);


        }


        root.setDayTrainPlanList(rootList);

        String result = JaxbUtil.convertToXml(root);

        System.out.println("" + result);


    }
}
