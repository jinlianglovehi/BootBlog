package com.huadou.cn.traincenter.test;

import com.huadou.cn.traincenter.traincenterdata.DayTrainPlan;
import com.huadou.cn.traincenter.traincenterdata.DayTrainPlanRoot;
import com.huadou.cn.utils.JaxbUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliang on 16/11/11.
 *
 *  全马拉松
 *
 *  每天训练的模板数据
 */
public class TestQuanMaDayTrainPlan {


    private static String[] xinshouProjects = {

            "休息日", "基础跑 9.7km", "节奏跑 9.7km", "基础跑 9.7km", "休息日", "法特莱克跑 24.1km", "恢复跑 4.8km", // 第一周

            "休息日", "基础跑 9.7km", "坡度跑 9.7km", "基础跑 9.7km", "基础跑 8km", "休息日", "完成一个10km",// 第二周

            "休息日", "基础跑 9.7km", "坡度跑 9.7km", "基础跑 9.7km", "休息日", "法特莱克跑 28.9km", "恢复跑 4.8km",// 第三周

            "休息日", "基础跑 9.7km", "间歇跑（长） 9.6km", "基础跑 8km", "基础跑 6.5km", "休息日", "完成一个半马21.2km",// 第四周

            "休息日", "基础跑 9.7km", "间歇跑（长） 9.6km", "基础跑 8km", "休息日", "法特莱克跑 32.1km", "恢复跑 4.8km",// 第5周

            "休息日", "基础跑 9.7km", "节奏跑 9.7km", "基础跑 9.7km", "基础跑 8km", "休息日", "完成一个13.2km",// 第6周

            "休息日", "基础跑 8km", "节奏跑 8km", "基础跑 6.5km", "休息日", "法特莱克跑 16km", "恢复跑 4.8km",// 第7周

            "休息日", "基础跑 4.8km", "休息日", "恢复跑 4.8km", "休息日", "基础跑 3.2km", "完成一个全马42.5km",// 第8周


    };

    // 注意参数中的100 定义的是没有类型 就是基础的跑步的类型

    // 注: 其中的 第8周的第四位: 是训练项
    private static int[] reminds = {

            9, 2, 6,  2, 9,  4, 1, // 第一周
            9, 2, 5,  2, 2,  9, 100, // 第2周
            9, 2, 5,  2, 9,  4, 1, // 第3周
            9, 2, 8,  2, 2,  9, 100, // 第4周
            9, 2, 8,  2, 9,  4, 1, // 第5周
            9, 2, 6,  2, 2,  9, 100, // 第6周
            9, 2, 6,  2, 9,  4, 1, // 第7周
            9, 2, 9,  1, 9,  2, 100  // 第8周


    };


    private static double[] xinshouDistance = {
            0, 9.7, 9.7, 9.7, 0, 24.1, 4.8,// 第一周

            0, 9.7, 9.7, 9.7, 8,  0, 10,// 第2周

            0, 9.7, 9.7, 9.7, 0, 28.9, 4.8,// 第3 周

            0, 9.7, 9.6, 8, 6.5, 0, 21.2,// 第4周

            0, 9.7, 9.6, 8, 0, 32.1, 4.8,// 第5周

            0, 9.7, 9.7, 9.7, 8, 0, 13.2,// 第6周

            0, 8, 8, 4.8, 0, 16, 4.8,//  7 周

            0, 4.8,  0, 4.8, 0, 3.2, 42.5// 第8周


    };

    private static int[] rateStarts = {

            1, 60, 85, 60, 1, 70, 50,// 第一周

            1, 60, 85, 60, 60, 1, 0,// 第2周

            1, 60, 85, 60, 1, 70, 50,// 第3 周

            1, 60, 85, 60, 60, 1, 0,// 第4周

            1, 60, 85, 60, 1, 70, 50,// 第5周

            1, 60, 85, 60, 60, 1, 0,// 第6周

            1, 60, 85, 60, 1, 70, 50,//  7 周

            1, 60, 1, 50, 1, 60, 0 // 第8周
    };

    private static int[] rateEnds = {


            0, 70, 95, 70, 0, 85, 60,// 第一周

            0, 70, 95, 70, 70, 0, 0,// 第2周

            0, 70, 95, 70, 0, 85, 60,// 第3 周

            0, 70, 100, 70, 70, 0, 0,// 第4周

            0, 70, 100, 70, 0, 85, 60,// 第5周

            0, 70, 95, 70, 70, 0, 0,// 第6周

            0, 70, 95, 70, 0, 85, 60,//  7 周

            0, 70, 0, 60, 0, 70, 0 // 第8周

    };

    public static void main(String[] args) {


        DayTrainPlanRoot root = new DayTrainPlanRoot();

        List<DayTrainPlan> rootList = new ArrayList();
        DayTrainPlan dayTrainPlan = null;
        for (int i = 0; i < 56; i++) {

            dayTrainPlan = new DayTrainPlan();
            dayTrainPlan.setId(i);
            if (i < 42) {
                dayTrainPlan.setStageDesc("基础锻炼");
            } else if (i < 42) {
                dayTrainPlan.setStageDesc("针对性阶段");
            } else if (i < 56) {
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
