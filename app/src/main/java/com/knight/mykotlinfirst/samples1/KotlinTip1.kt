package com.knight.mykotlinfirst.samples1

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/8 on 16:01
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/8 on 16:01
 * version: v 1.0
 */
fun testString1() {

    val str1 = "abc"

    val str2 = """line1\n
                line2
                line3
                """
    val js = """
    function myFunction()
    {
    document.getElementById("demo").innerHTML="My First JavaScript Function";
    }
    """.trimIndent()
    println(str1)
    println(str2)
    println(js)
}

/**
 * kotlin 字符模版， 可以用$符号拼接变量和表达式
 */
fun testString2() {
    val string = arrayListOf("上海", "北京", "深圳")
    println("First content is $string")
    println("First conetnt is ${string[0]}")
    println("First content  is ${string[1]}")
}