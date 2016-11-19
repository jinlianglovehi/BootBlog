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
public class Test5kmDayTrainPlan {


    private static String[] xinshouProjects  = {
            "休息日","基础跑 3.2km","法特莱克跑 3.2km" ,"休息日" ,"训练项 游泳 23-30分钟","进阶跑 4.8km" ,"休息日" , // 第一周

            "休息日","基础跑 4.8km","进阶跑 3.2km" ,"骑车20-30分钟" ,"休息日","基础跑 3.2km" ,"恢复跑 3.2km",// 第二周

            "休息日","基础跑 4.8km","节奏跑 4.8km" ,"游泳 20-30分钟" ,"休息日","基础跑 4.8km" ,"恢复跑 3.2km",// 第三周

            "休息日","基础跑 6.5km","坡度跑 4.8km" ,"骑车20-30分钟" ,"休息日","基础跑 6.5km" ,"恢复跑 3.2km",// 第四周

            "休息日","基础跑 6.5km","坡度跑 4.8km" ,"游泳 20-30分钟" ,"休息日","基础跑 6.5km" ,"恢复跑 4.8km",// 第5周

            "休息日","基础跑 8km","间歇跑（短） 6.4km" ,"游泳 20-30分钟" ,"休息日","基础跑 8km" ,"恢复跑 4.8km",// 第6周

            "休息日","基础跑 6.5km","间歇跑（短） 4.8km" ,"游泳 20-30分钟" ,"休息日","基础跑 6.5km" ,"恢复跑 3.2km",// 第7周

            "休息日","基础跑 4.8km","休息日" ,"恢复跑 3.2km","休息日" ,"完成一个5km" ,"休息日",// 第8周



    };

    // 注意参数中的100 定义的是没有类型 就是基础的跑步的类型
    private static int[] reminds = {

            9, 1, 4, 9,10 , 3 , 9 , // 第一周
            9, 1, 3, 11,9 , 2 , 1 , // 第2周
            9, 1, 6, 10,9 , 2 , 1 , // 第3周
            9, 1, 5, 11,9 , 2 , 1 , // 第4周
            9, 1, 5, 10,9 , 2 , 1 , // 第5周
            9, 1, 7, 10,9 , 2 , 1 , // 第6周
            9, 1, 7, 10,9 , 2 , 1 , // 第7周
            9, 1, 9, 1,9 , 100 , 9  // 第8周


    };


    private static double[] xinshouDistance = {
            0 , 3.2 ,3.2, 0, 0, 4.8, 0 ,// 第一周

            0 , 4.8,3.2, 0, 0, 3.2, 3.2 ,// 第2周

            0 , 4.8,4.8, 0, 0, 4.8, 3.2 ,// 第3 周

            0 , 6.5 ,4.8, 0, 0, 6.5, 3.2 ,// 第4周

            0 , 6.5 ,4.8, 0, 0, 6.5, 4.8 ,// 第5周

            0 , 8 ,6.4, 0, 0, 8, 4.8 ,// 第6周

            0 , 6.5 ,4.8, 0, 0, 6.5, 3.2 ,//  7 周

            0 , 4.8, 0 , 3.2, 0, 5, 0// 第8周



    };

    private static int[] rateStarts = {

            1 , 60 ,70, 1, 0, 60, 0 ,// 第一周

            1 , 60 ,60, 50, 1, 60, 50 ,// 第2周

            1 , 60 ,85, 50, 1, 60, 50 ,// 第3 周

            1 , 60 ,85, 50, 1, 60, 50 ,// 第4周

            1 , 60 ,85, 0, 1, 60, 50 ,// 第5周

            1 , 60 ,85, 0, 1, 60, 50 ,// 第6周

            1 , 60 ,85, 0, 1, 60, 50 ,//  7 周

            1 , 60 ,1, 50, 1, 0, 1 // 第8周
    };

    private static int[] rateEnds  ={


            0 , 70 ,80, 0, 0, 80, 0 ,// 第一周

            0 , 70 ,80, 60, 0, 70, 60 ,// 第2周

            0 , 70 ,95, 60, 0, 70, 60 ,// 第3 周

            0 , 70 ,95, 60, 0, 70, 60 ,// 第4周

            0 , 70 ,95, 0, 0, 70, 60 ,// 第5周

            0 , 70 ,95, 0, 0, 70, 60 ,// 第6周

            0 , 70 ,95, 0, 0, 70, 60 ,//  7 周

            0 , 70 ,0, 60, 0, 0, 0 // 第8周

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
            }else if(i < 42){
                dayTrainPlan.setStageDesc("针对性阶段");
            }else if(i< 56){
                dayTrainPlan.setStageDesc("减量阶段");
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
