package com.huadou.cn.traincenter.test;

import com.huadou.cn.traincenter.traincenterdata.RunRemind;
import com.huadou.cn.traincenter.traincenterdata.RunRemindRoot;
import com.huadou.cn.utils.JaxbUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliang on 16/11/15.
 *
 *  生成的是remind 文档的内容
 */
public class TestRunRemind {


    // 训练中心的内容
    private static  String[] trainContents = {


            "慢跑",
            "恢复跑",
            "基础跑",
            "进阶跑",
            "法特莱克跑",
            "山坡跑",
            "节奏跑",
            "间歇跑（短周期)",
           "间歇跑（长周期)",
            "",
            "",
            ""

    };


    //训练中心的文案
    private static String[] copyWrites = {
     "以慢跑800m，步行200m为周期完成。推荐心率*-*bpm",
    "以轻松的慢跑完成训练。推荐心率*-*bpm",
    "以仍能交谈的速度进行跑步训练。推荐心率*-*bpm",
    "跑到习惯的速度后再进行加速。推荐心率*-*bpm",
    "可随意切换强度的间歇跑步训练。推荐心率*-*bpm",
    "请选择在有坡度的路段训练。推荐心率*-*bpm",
    "维持均匀的速度进行跑步训练。推荐心率*-*bpm",
    "以快跑800m，步行800m为周期完成。推荐心率*-*bpm",
    "以快跑2.4km，步行800m为周期完成。推荐心率*-*bpm",
    "休息一下，今天无需进行训练。距训练开始还有*天",
    "游泳可以帮助恢复体能，完成训练后点击此处标记完成",
    "交叉训练可以提高水平和恢复精力。推荐心率*-*bpm"
    };


    public static void main(String[] args) {

        RunRemindRoot root = new RunRemindRoot();

        List<RunRemind> runRemindList = new ArrayList<RunRemind>();

        RunRemind currentRunRemind =null;
        for (int i = 0; i <12 ; i++) {
            currentRunRemind = new RunRemind();
            currentRunRemind.setId(i);
            if(i<9){
                currentRunRemind.setRunType("跑步");// 设置的是大的分类
            }else if (i==9){
                currentRunRemind.setRunType("休息");
            }else if (i==10){
                currentRunRemind.setRunType("游泳");
            }else if (i== 11){
                currentRunRemind.setRunType("骑行");
            }

            currentRunRemind.setTrainContent(trainContents[i]);
            currentRunRemind.setCopyWrite(copyWrites[i]); // 训练的内容
            runRemindList.add(currentRunRemind);

        }
        root.setList(runRemindList);
        String result = JaxbUtil.convertToXml(root);

        System.out.println("" + result);


    }
}
