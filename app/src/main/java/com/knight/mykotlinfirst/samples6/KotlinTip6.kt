package com.knight.mykotlinfirst.samples6

import android.app.Activity
import android.os.Bundle
import com.knight.mykotlinfirst.R
import com.knight.mykotlinfirst.samples4.invokeActivity
import kotlinx.android.synthetic.main.activity_tip6.*

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 16:59
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 16:59
 * version: v 1.0
 */

class KotlinTip6 : Activity() {
    /**
     * 自动根据layout的ID生成对应的view
     *
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip6)
        tip6Tv.text = "Auto find view for TextView"
        tip6Img.setImageBitmap(null)
        tip6Btn.setOnClickListener {
            testActivity()
        }
    }

    private fun testActivity() {
        invokeActivity(Tip6Activity::class.java)
    }
}