package com.knight.mykotlinfirst.samples2;

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 10:52
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 10:52
 * version: v 1.0
 */
public class JavaExample2 {
    /**
     * Java 中 if 是语句 ，没有值 。  必须显示return
     *
     * @param x
     * @param y
     * @return
     */
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    /**
     * Java 中的三元运算符，Kotlin 中if 完全可以做到 ，故kotlin中已经没有三元运算符了
     *
     * @param x
     * @param y
     * @return
     */
    public static int max2(int x, int y) {
        return x > y ? x : y;
    }

    /**
     * Java 中的 switch
     *
     * @param grde
     * @return
     */
    public static String getPoint(char grde) {
        switch (grde) {
            case 'A':
                return "GOOD";
            case 'B':
            case 'C':
                return "MONEY";
            case 'D':
                return "ABC";
            default:
                return "UN_KONW";
        }
    }

    /**
     * Java  中的  if else
     * @param point
     * @return
     */
    public static String getPoint2(Integer point) {
        if (point > 100) {
            return "GOOD";
        } else if (point > 60) {
            return "OK";
        } else if (point.hashCode() == 0x1100) {
            return "STH";
        } else {
            return "UN_KONW";
        }
    }

    public static void main(String args[]) {
        System.out.println("最大值是 =" + max(100, 4));
        System.out.println("最大值是 =" + max2(40, 90));
        System.out.println("getPoint =" + getPoint('B'));
        System.out.println("getPoint =" + getPoint2(1000));
    }
}
