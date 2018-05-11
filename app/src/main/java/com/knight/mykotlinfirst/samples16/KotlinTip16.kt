package com.knight.mykotlinfirst.samples16

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/11 on 14:45
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/11 on 14:45
 * version: v 1.0
 */


/**
 * 微略实施者
 */
class Worker(private val strategy: () -> Unit) {
    fun work() {
        println("START")
        strategy.invoke()
        println("END")
    }
}


fun testStrategy() {
    val worker1 = Worker({
        println("Do A Strategy")
    })
    val bStrategy = {
        println("Do B Strategy ")
    }

    val worker2 = Worker(bStrategy)
    worker1.work()
    worker2.work()
}