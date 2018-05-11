package com.knight.mykotlinfirst.samples12

import android.content.Context
import android.widget.ImageView
import android.widget.TextView
import com.knight.mykotlinfirst.samples8.JavaExample8

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/11 on 09:55
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/11 on 09:55
 * version: v 1.0
 */

/*
* 用apply语句简化代码，在apply的大括号里可以访问类的公有属性和方法
* */
fun alphabet5() = StringBuilder().apply {
    append("START\n")
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nEND")
}.toString()


/**
 *用apply语句简化类的初始人，在类实例的时候，就可以通过apply把需要初始化的步骤全部实现，非常简洁
 */
fun testApply(context: Context) {
    var imageView = ImageView(context).apply {
        setBackgroundColor(0)
        setImageBitmap(null)
    }
    var textView = TextView(context).apply {
        text = "content"
        setPadding(10, 0, 0, 0)
    }
    var user = JavaExample8.User().apply {
        age = 15
        name = "Jack"
        val a = address
        address = "bbb"
    }
}