package com.knight.mykotlinfirst.samples10

import android.content.Context
import android.view.View
import android.widget.TextView

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/10 on 09:33
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/10 on 09:33
 * version: v 1.0
 */
fun testL(context: Context) {
    val textView = TextView(context)

    /**
     * 传统的形势
     */
    textView.setOnClickListener(object : android.view.View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            //handle click
        }
    })
    //lambad 的形势
    textView.setOnClickListener({ v ->
        {
            //handle click
        }
    })
    //lambda 的参数如果没有使用可以省略，省略的时候用it来替代
    textView.setOnClickListener({
        //handle click
    })
    //lambda 在参数的最后一个的情况可以将之提出去
    textView.setOnClickListener() {
        //handle click
    }
    //lambda 提出去后，涵数如果没有其他参数他参数括号可以省略
    textView.setOnClickListener {
        //handle click
    }
}

interface OnClickListener {
    fun onClick()
}

class View {
    var listener: OnClickListener? = null
    /**
     * 传统方式
     */
    fun setOnClickListener(listener: OnClickListener) {
        this.listener = listener
    }

    fun doSth() {
        //some case
        listener?.onClick()
    }

    /**
     * 声明 lambda形势
     */
    fun setOnClickListener(listener: () -> Unit) {

    }
}

fun testL2() {
    val view = View()
    view.setOnClickListener(object : OnClickListener {
        override fun onClick() {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            //handle click
        }
    })
    view.setOnClickListener {
        //handle click
    }
}