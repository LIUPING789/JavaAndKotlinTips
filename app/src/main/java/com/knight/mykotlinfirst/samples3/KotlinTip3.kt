package com.knight.mykotlinfirst.samples3

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 14:38
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 14:38
 * version: v 1.0
 */

fun printlnList() {
    val list = listOf(13, 45, 677, 80, 7)
    println(list)
}

/**
 * 拼接字符串运用
 */
fun <T> joinToString(collection: Collection<T>,
                     separator: String,
                     prefix: String,
                     postfix: String): String {
    val result = StringBuffer(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun printlnList2() {
    val list = listOf(2, 3546, 8, 90, 8)
    /**不表名参数名*/
    println(joinToString(list, " - ", "[", "]"))
    /**显示的标明参数*/
    println(joinToString(list, separator = " - ", prefix = "[", postfix = "]"))
}

fun <T> joinToString2(collection: Collection<T>,
                      separator: String = ", ",
                      prefix: String = "",
                      postfix: String = ""): String {
    val result = StringBuffer(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun printlnList3(){
    val list= listOf(234,234,567,95)
    println(joinToString2(list," - "))
}