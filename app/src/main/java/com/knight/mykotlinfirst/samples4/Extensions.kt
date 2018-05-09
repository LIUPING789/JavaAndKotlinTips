package com.knight.mykotlinfirst.samples4

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 16:06
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 16:06
 * version: v 1.0
 */

/**
 *  show toast in activity
 */
fun Activity.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

val Context.inputMethodManager: InputMethodManager? get() = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

/**
 * hide soft input
 */
fun Context.hideSoftInput(view: View) {
    inputMethodManager?.hideSoftInputFromWindow(view.windowToken, 0)
}

/**
 * screen width in pixels
 */
val Context.screenWidth
    get() = resources.displayMetrics.widthPixels
/**
 * screen height in pixels
 */
val Context.screenHeight
    get() = resources.displayMetrics.heightPixels

/**
 * returns dip(dp) dimension value in pixels
 */
fun Context.dip2px(value: Int): Int = (value * resources.displayMetrics.density).toInt()