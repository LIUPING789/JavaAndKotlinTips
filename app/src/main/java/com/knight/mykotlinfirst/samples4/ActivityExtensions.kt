package com.knight.mykotlinfirst.samples4

import android.app.Activity
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 16:00
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 16:00
 * version: v 1.0
 */
fun AppCompatActivity.addFragmentToActivity(fragment: Fragment, framId: Int) {
    val transaction = supportFragmentManager.beginTransaction()
    transaction.add(framId, fragment)
    transaction.commit()
}

fun Activity.invokeActivity(cls: Class<*>){
    startActivity(Intent(this,cls))
}