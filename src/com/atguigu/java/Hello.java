package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @auther qfl
 * @create 2020/7/14-16:33
 */
public class Hello {

    //模板六:prsf:private static final
    private static final Customer cust = new Customer();

    //psf:public static final
    public static final int NUM=1;

    public static final int NUM6 = 6;
    

    //psfi
    public static final int NUM2 = 2;

    //psfs
    public static final String NAME = "dongshan";


    //自定义:test 测试
    public void testUpdate(){
        //测试方法模板

    }
    //模板一：psvm
    public static void main(String[] args) {

        //模板二:sout
        System.out.println("hello");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");  //soutp
        System.out.println("Hello.main");  //soutm

        int num3=10;
        int num2=3;
        System.out.println("num2 = " + num2);  //soutv

        System.out.println(num3);  //num3.sout

        //模板三:fori
        String[] arr = new String[]{"Tom","Jerry","Hanmei","Dinglei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //变形：iter  增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(236);

        for (Object o : list) {
            
        }

        //变形:list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }

        //变形:list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(236);

        //模板五:ifn
        if (list == null) {
            
        }
        //变形:inn
        if (list != null) {
            
        }
        //变形:xxx.nn /xxx.null
        if (list != null) {   //list.nn

        }
        if (list == null) {  //list.null

        }
    }
}
