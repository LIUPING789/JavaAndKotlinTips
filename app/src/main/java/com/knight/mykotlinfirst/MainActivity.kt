package com.knight.mykotlinfirst

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/8 on 09:32
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/8 on 09:32
 * version: v 1.0
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Welcome Kotlin！！！"
    }
}