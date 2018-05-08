package com.knight.mykotlinfirst.samples1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/8 on 14:08
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/8 on 14:08
 * version: v 1.0
 */
public class JavaExample1 {
    public static void testString1() {
        String str1 = "abc";
        String str2 = "line1\n" + "line2\n" + "line3";
        String js = "function myFunction()\n" + "{\n" + "document.getElementById(\"demo\").innerHTML=\"My First JavaScript Function\";\n" + "}";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(js);
    }

    public static void testString2() {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Kotlin", "C++"));
        System.out.println("First content is " + list.get(0));
    }


    public static void main(String agrs[]) {
        testString1();
        testString2();
    }
}
