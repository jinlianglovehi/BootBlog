package com.huadou.cn.utils;

/**
 * Created by jinliang on 16-10-19.
 *
 *  打印工具类
 */
public class PrintUtils {

    private static final boolean DEBUG = true;


    /**
     * 打印数据
     * @param tag
     * @param method
     * @param data
     */
    public static void printData(String tag, String method,String data){
        System.out.println("--Tag:"+ tag + "-----method:"+ method + ",------data:"+ data);
    }
}
