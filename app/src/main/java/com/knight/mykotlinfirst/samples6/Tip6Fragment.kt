package com.knight.mykotlinfirst.samples6

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.knight.mykotlinfirst.R
import kotlinx.android.synthetic.main.fragment_tip6.*

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/9 on 17:22
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/9 on 17:22
 * version: v 1.0
 */
class Tip6Fragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_tip6, container, false)
        /*
        * 这时候不能在onCreateView方法里用view，需要在onViewCreate里，原理是插件用了getView来findViewById
        * */
        return view
    }

      /*
       * 需要在onViewCreate里，原理是插件用了getView来findViewById
       * */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tip6Tv.text = "test"
    }
}