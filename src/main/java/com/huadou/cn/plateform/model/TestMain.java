package com.huadou.cn.plateform.model;

import java.io.UnsupportedEncodingException;

/**
 * Created by jinliang on 16-10-19.
 */
public class TestMain {
     public static void main(String args[]) {
         String str = "\u202D\u202C";
         try {
           System.out.println("size:"+ str.getBytes("UTF-8").length);
         } catch (UnsupportedEncodingException e) {
             e.printStackTrace();
         }
         System.out.println("huhu:"+str);
     }
}
