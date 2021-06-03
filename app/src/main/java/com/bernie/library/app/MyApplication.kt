package com.bernie.library.app

import android.app.Application
import com.bernie.library.blibrary.log.BLogConfig
import com.bernie.library.blibrary.log.BLogManager

class MyApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        BLogManager.init(object : BLogConfig(){
            override fun enable(): Boolean {
                return true
            }

            override fun getGlobalTag(): String {
                return "bernie:"
            }
        })
    }
}