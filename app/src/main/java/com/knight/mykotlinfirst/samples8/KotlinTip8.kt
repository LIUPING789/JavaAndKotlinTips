package com.knight.mykotlinfirst.samples8

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 18:01
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 18:01
 * version: v 1.0
 */
/**
 * Kotlin 会为类的参数自动实现 get set 方法
 */
open class User(val name: String, val age: Int, val gender: Int, var address: String)

/**
 * 用 data 关键字来声明一个数据类，除了会自动实现 get/set ,还会自动生存equals hashcode tostring
 */
 class User2(val name: String ,val age: Int, val gender: Int, val address: String)

