package com.huadou.cn.traincenter.test;

import com.huadou.cn.traincenter.traincenterdata.DayTrainPlan;
import com.huadou.cn.traincenter.traincenterdata.DayTrainPlanRoot;
import com.huadou.cn.utils.JaxbUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliang on 16/11/11.
 *
 *  半马拉松的每天训练的模板数据
 */
public class TestBanMaDayTrainPlan {


    private static String[] xinshouProjects = {

            "休息日", "基础跑 6.5km", "法特莱克跑 6.5km", "基础跑 3.2km", "休息日", "进阶跑 9.7km", "恢复跑 3.2km", // 第一周

            "休息日", "基础跑 4.8km", "节奏跑 8km", "基础跑 3.2km", "休息日", "法特莱克跑 14.5km", "恢复跑 3.2km",// 第二周

            "休息日", "基础跑 6.5km", "坡度跑 6.5km", "基础跑 3.2km", "休息日", "坡度跑 16km", "恢复跑 4.8km",// 第三周

            "休息日", "基础跑 6.5km", "间歇跑（长） 9.6km", "基础跑 4.8km", "休息日", "法特莱克跑 16km", "恢复跑 4.8km",// 第四周

            "休息日", "基础跑 8km", "坡度跑 8km", "基础跑 6.5km", "休息日", "坡度跑 20.9km", "恢复跑 3.2km",// 第5周

            "休息日", "基础跑 8km", "节奏跑 8km", "基础跑 6.5km", "休息日", "法特莱克跑 19.3km", "恢复跑 4.8km",// 第6周

            "休息日", "基础跑 6.5km", "间歇跑（短） 6.4km", "基础跑 4.8km", "休息日", "法特莱克跑 14.5km", "恢复跑 4.8km",// 第7周

            "休息日", "基础跑 6.5km", "基础跑 4.8km", "基础跑 3.2km", "休息日", "完成一个半马21.2km", "休息日",// 第8周


    };

    // 注意参数中的100 定义的是没有类型 就是基础的跑步的类型

    // 注: 其中的 第8周的第四位: 是训练项
    private static int[] reminds = {

            9, 2, 4,  2, 9,  3, 1, // 第一周
            9, 2, 6,  2, 9,  4, 1, // 第2周
            9, 2, 5,  2, 9,  5, 1, // 第3周
            9, 2, 8,  2, 9,  4, 1, // 第4周
            9, 2, 5,  2, 9,  5, 1, // 第5周
            9, 2, 6,  2, 9,  5, 1, // 第6周
            9, 2, 7,  2, 9,  5, 1, // 第7周
            9, 2, 2,  2, 9, 100, 9  // 第8周


    };


    private static double[] xinshouDistance = {
            0, 6.5, 6.5, 3.2, 0, 9.7, 3.2,// 第一周

            0, 4.8, 8, 3.2, 0, 14.5, 3.2,// 第2周

            0, 6.5, 6.5, 3.2, 0, 16, 4.8,// 第3 周

            0, 6.5, 9.6, 4.8, 0, 16, 4.8,// 第4周

            0, 8, 8, 6.5, 0, 20.9, 3.2,// 第5周

            0, 8, 8, 0, 0, 19.3, 4.8,// 第6周

            0, 6.5, 6.4, 4.8, 0, 14.5, 4.8,//  7 周

            0, 6.5, 4.8, 3.2, 0, 100, 0// 第8周


    };

    private static int[] rateStarts = {

            1, 60, 85, 60, 1, 70, 50,// 第一周

            1, 60, 85, 60, 1, 70, 50,// 第2周

            1, 60, 85, 60, 1, 85, 50,// 第3 周

            1, 60, 85, 60, 1, 70, 50,// 第4周

            1, 60, 85, 60, 1, 85, 50,// 第5周

            1, 60, 85, 60, 1, 70, 50,// 第6周

            1, 60, 85, 60, 1, 70, 50,//  7 周

            1, 60, 60, 60, 1, 0, 1 // 第8周
    };

    private static int[] rateEnds = {


            0, 70, 95, 70, 0, 85, 60,// 第一周

            0, 70, 95, 70, 0, 85, 60,// 第2周

            0, 70, 95, 70, 0, 100, 60,// 第3 周

            0, 70, 100, 70, 0, 85, 60,// 第4周

            0, 70, 95, 70, 0, 100, 60,// 第5周

            0, 70, 95, 70, 0, 85, 60,// 第6周

            0, 70, 95, 70, 0, 85, 60,//  7 周

            0, 70, 80, 70, 0, 0, 0 // 第8周

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
