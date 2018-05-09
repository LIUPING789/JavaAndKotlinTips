package com.knight.mykotlinfirst.samples4

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 15:35
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 15:35
 * version: v 1.0
 */

/**
 * 扩展函数
 */
fun String.lastChar(): Char = this.get(this.length - 2)

fun testFunExtension() {
    val str = "test extenstion fun"
    println(str.lastChar())
}

/**
 * 用扩展函数改造Tip3中列表打印内容函数
 */
fun <T> Collection<T>.joinToString3(separator: String = ",",
                                    prefix: String = "",
                                    postfix: String = ""): String {
    val result = StringBuffer(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun printlnList4() {
    val list = listOf(2, 678, 0, 6.09)
    println(list.joinToString3("/"))
}

/**
 * 扩展属性，lastChat获取String的最后一个字符
 */
val String.lastChar: Char
    get() = get(length - 1)

/**
 * 扩展属性，lastChar获取StringBuilder的最后一个字符
 */
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        setCharAt(length - 1, value)
    }

fun texstExtension(){
    val  s ="Knight"
    println(s.lastChar)
    val sb = StringBuilder("Knight")
    println(sb.lastChar)
}