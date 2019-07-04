package com.tang.java;

import java.util.ArrayList;
import java.util.Date;

/**
 * idea测试
 */
public class HelloWorld {
    private static final Students cur =new Students();
    public static final int a =1;
    public static final String o="";



    public static void main(String[] args) {
        System.out.print("HELLOWORLD");
        ArrayList list = new ArrayList();
        System.out.print("aaaaa");
        Date date = new Date();
        System.out.println();
        System.out.println();
        System.out.println("HelloWorld.main");
        System.out.println("args = [" + args + "]");
        int a =10;
        System.out.println("a = " + a);
        String[] str = new String[]{"tom","jerry","a"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        for (String s : str) {
            System.out.println(s);
        }
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(1212);
        arrayList.add(22);
        System.out.println(arrayList);
        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        if (arrayList == null) {
            
        }
        if (arrayList != null) {
            
        }
        if (arrayList == null) {

        }
        if (arrayList != null) {

        }
        if (arrayList != null) {

        }





        

    }

    public void methed() {

    }


}
