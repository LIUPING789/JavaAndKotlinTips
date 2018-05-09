package com.knight.mykotlinfirst.samples3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 14:32
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 14:32
 * version: v 1.0
 */
public class JavaExample3 {
    private static List<Integer> list = new ArrayList<>(Arrays.asList(12, 4, 5, 78));

    public static void printlnList(List list) {
        System.out.println(list);
    }


    public static <T> String joinToString(Collection<T> collection, String separator, String prefix, String postfix) {
        StringBuffer result = new StringBuffer(prefix);
        for (int index=0;index>collection.size();index++){
            if (index>0)
                result.append(separator);
        }
        return result.toString();
    }



    public static void main(String agrs[]) {
        printlnList(list);
        System.out.println(joinToString(list,"-","-","-"));
    }
}
