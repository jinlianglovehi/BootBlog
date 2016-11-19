package com.huadou.cn;

import com.huadou.cn.traincenter.traincenterdata.TrainPlan;

import java.lang.reflect.Field;

/**
 * Created by jinliang on 16/11/10.
 */
public class TestTransPlan {

    public static void main(String[] args) {

        TrainPlan trainPlan = new TrainPlan(1,"新手",1,1);
        try {
            Object object = Class.forName(trainPlan.getClass().getName()).newInstance();

            Field[] fields = object.getClass().getDeclaredFields();
            for (Field f:fields) {
                //设置权限
                f.setAccessible(true);
                // 获取字段的名称
                String field = f.toString().substring(f.toString().lastIndexOf(".")+1);         //取出属性名称
                System.out.println("p1."+field+" --> "+f.get(trainPlan));


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
