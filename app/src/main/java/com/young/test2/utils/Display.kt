package com.young.test2.utils

import android.content.Context
import android.util.DisplayMetrics

object Display {
    lateinit var dm: DisplayMetrics
    fun initDM(context: Context) {
        dm = context.resources.displayMetrics
    }

    fun getWidth(): Int = dm.widthPixels
    fun getHeight(): Int = dm.heightPixels
}