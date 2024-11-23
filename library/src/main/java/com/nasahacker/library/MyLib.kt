package com.nasahacker.library

import android.content.Context
import android.widget.Toast
import androidx.annotation.Keep

object MyLib {
    @Keep
    @JvmStatic
    fun showToast(msg: String,ctx: Context){
        Toast.makeText(ctx,msg, Toast.LENGTH_SHORT).show()
    }

}