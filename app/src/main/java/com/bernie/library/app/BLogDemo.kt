package com.bernie.library.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.bernie.library.blibrary.log.BLog

class BLogDemo : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_log_demo)

        findViewById<Button>(R.id.blog_button).setOnClickListener{
            BLog.d("test")
        }
    }


}