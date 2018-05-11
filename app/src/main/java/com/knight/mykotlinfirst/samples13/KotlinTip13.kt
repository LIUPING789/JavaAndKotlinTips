package com.knight.mykotlinfirst.samples13

import com.knight.mykotlinfirst.samples8.JavaExample8

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/11 on 10:15
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/11 on 10:15
 * version: v 1.0
 */
fun testNullType() {
    val a: String = "aa"
    /**
     * a 是非空类型，下面的给a赋值为null将会编译不通过
     */
//    a=null
    a.length
    /**
     *  ?声明是可空类型，可以赋值为 null
     */
    var b: String? = "bb"
//    b = null
    /**
     * b 是可空类型，直接访问可空类型将编译不通过，需要通过 ?. 或者  !!. 来访
     */
    b?.length
    b!!.length
    /**
     * 不推荐这样的写法：链式的连续用 !!.
     */
    val user = JavaExample8.User()
    user.name = "23432432432"
    user!!.name.subSequence(0, 5)!!.length

}

fun testNullType2() {
    val user: JavaExample8.User = JavaExample8.User()
    /**
     * 每次访问都用用 ?.判断
     */
    user?.name
    user?.age
    user?.toString()
    /**
     *或者提前判断是否为空，如果不为空在这个分支里会自动转化为非空类型就可以直接访问了
     */
    if (user != null) {
        user.name
        user.age
        user.toString()
    }
    /**
     * 还可以通过let语句，在 ?.let 之后 ，如果为空不会有任何操作，
     */
    user?.let {
        it.name
        it.age
        it.toString()
    }
    fun testElvis(input: String?, user: JavaExample8.User) {
        val a: Int?
        if (input == null) {
            a = -1
        } else {
            a = input.length
        }
        if (user == null) {
            var newOne = JavaExample8.User()
            newOne.save()
        } else {
            user.save()
        }
    }
}

fun JavaExample8.User.save() {
    //save user
}

fun testElvis2(input: String?, user: JavaExample8.User) {
    val b = input?.length ?: -1
    user?.save()?:JavaExample8.User().save()
}