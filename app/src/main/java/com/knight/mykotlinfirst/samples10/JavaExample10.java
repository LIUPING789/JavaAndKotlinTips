package com.knight.mykotlinfirst.samples10;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/10 on 09:31
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/10 on 09:31
 * version: v 1.0
 */
public class JavaExample10 {
    public void testClick(Context context){
        TextView textview=new TextView(context);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //handle click
            }
        });
    }
}
