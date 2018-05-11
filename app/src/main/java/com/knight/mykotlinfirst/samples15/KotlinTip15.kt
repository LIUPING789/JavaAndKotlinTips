package com.knight.mykotlinfirst.samples15

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/11 on 14:09
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/11 on 14:09
 * version: v 1.0
 */

fun test01() {
    val list = listOf(2, 3, 10)
    /**
     * 传人函数来过滤
     */
    println(list.filter { it > 4 })
}

fun test02() {
    /**
     * 定义函数类型
     */
    val sum = { x: Int, y: Int -> x + y }
    val action = { println(45) }
    val sum2: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val action2: () -> Unit = { println(43) }
}

/**
 * 定义对2和3的操作函数
 */
fun twoAndThree(operator: (Int, Int) -> Int) {
    val result = operator(2, 3)
    println("result : $result")
}

fun test03() {
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
}

/**
 * 函数作为参数，实现String 类的字符过滤
 */
fun String.filter(prediction: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (prediction(element)) sb.append(element)
    }
    return sb.toString()
}

fun test04() {
    println("332432dsrdsg123as12f21".filter { it in 'a'..'f' })
}

/**
 * 函数作为返回值
 */
enum class Delivery() {
    STANDARD, EXPEDITED
}

/**
 * 根据不同的运输类型返回不同的快递方式
 */
fun getShippingCostCalculator(delivery: Delivery): (Int) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { 6 + 2.1 * it }
    }
    return { 1.3 * it }
}

fun test05() {
    val calculator1 = getShippingCostCalculator(Delivery.EXPEDITED)
    val calculator2 = getShippingCostCalculator(Delivery.STANDARD)
    println("Ex costs ${calculator1(5)}")
    println("Sx costs ${calculator2(5)}")
}