package com.knight.mykotlinfirst.samples2

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 13:44
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 13:44
 * version: v 1.0
 */

/**
 * kotlin 中的  if 是表达式， 不是语句  类似于 java中 三元运算符  x > y ? x :y
 */
fun max(x: Int, y: Int) {
    return System.out.println("最大值是 = ${if (x > y) x else y}")
}

/**
 * Kotlin 简化版的  if else    if(x>y) x esle y
 */
fun max2(x: Int, y: Int) = System.out.println("最大值是 = ${if (x > y) x else y}")

/**
 *  Kotlin 中  when 是表达式，可以取代Java中 的 switch when 的每个分支的最后个行为当前分支的值
 */
fun curruntPiont(grade: Char) = when (grade) {
    'A' -> "GOOD"
    'B', 'C' -> {
        println("Test when")
        "OK"
    }
    'D' -> "BAD"
    else -> "UN_KNOW"
}

/**
 *  kotlin中，when是表达式，可以取代java的if/else，when的每个分支的最后一行为当前分支的值
 */
fun curruntPiont2(grade: Int) = System.out.println("选值的值是 = ${when { grade > 90 -> "GOOD"
    grade > 60 -> "OK"
    grade.hashCode() == 0x100 -> "STH"
    else -> "UN_KNOW"
    }
}")
