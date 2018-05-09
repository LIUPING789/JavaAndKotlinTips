package com.knight.mykotlinfirst.samples4

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 16:38
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 16:38
 * version: v 1.0
 */

open class A

class B : A()

fun A.foo(): String = "a"

fun B.foo(): String = "b"

/*
* https://kotlinlang.org/docs/reference/extensions.html
* Extensions do not actually modify classes they extend. By defining an extension, you do not insert new members into a class,
* but merely make new functions callable with the dot-notation on variables of this type. Extension functions are
* dispatched statically.
*扩展实际上并不修改它们扩展的类。 通过定义扩展，您不会将新成员插入到类中，
*但仅仅使用这种类型的变量的点符号可以调用新的函数。 扩展功能是
*静态调度。
* */

fun printlnFoo(a: A) {
    println(a.foo())
}

fun testStatically(){
    printlnFoo(A())
    printlnFoo(B())
}