package com.knight.mykotlinfirst.samples5

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 16:48
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 16:48
 * version: v 1.0
 */

/*
* 懒初始化api实例
* */
/*
val purchasingApi: PurchasingApi by lazy {
    val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(API_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    retrofit.create(PurchasingApi::class.java)
}*/

class User(var name: String, var age: Int)

/**
 * 懒初始化 by lazy
 */
val user1: User by lazy {
    User("Knight", 25)
}
/**
 * 延迟初始化 lateinit
 */
lateinit var user2: User

fun testLateinit() {

    user2=User("android",18)
        println(user2.toString())

}