package com.knight.mykotlinfirst.samples14

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/11 on 13:41
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/11 on 13:41
 * version: v 1.0
 */
/**
 * 运符符重载
 */
class Point(val x: Int, val y: Int) {
    /**
     * plus 涵数重载对Piont 对象的加法运算符
     */
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    /**
     * minus 函数 重载对Point 对象的减法运算符
     */
    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    override fun toString(): String {
        return "[x:$x,y:$y]"
    }
}

fun testOperator() {
    val point1 = Point(10, 10)
    val point2 = Point(4, 4)
    val point3 = point1 + point2
    println(point3)
    println(point1-point2)
}