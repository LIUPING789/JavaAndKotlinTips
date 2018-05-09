package com.knight.mykotlinfirst.samples6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.knight.mykotlinfirst.R
import com.knight.mykotlinfirst.samples4.addFragmentToActivity

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 17:19
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 17:19
 * version: v 1.0
 */
class Tip6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_container)
        var fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as Tip6Fragment?
        if (fragment == null)
            fragment = Tip6Fragment()
        addFragmentToActivity(fragment, R.id.fragmentContainer)
    }
}