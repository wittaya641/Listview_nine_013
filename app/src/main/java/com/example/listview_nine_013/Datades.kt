package com.example.listview_nine_013

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.nero.*

class nero : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nero)
        setTitle("ข้อมูล")

        val title = intent.extras?.getString(MainActivity().KEY_TITLE,"")
        val result = intent.extras?.getString(MainActivity().KEY_RESULT,"")

        tv_title.setText(title)
        tv_result.setText("${result}")

        btn_back.setOnClickListener {

            finish()

        }


    }

}