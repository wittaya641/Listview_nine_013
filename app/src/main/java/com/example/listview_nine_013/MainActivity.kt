package com.example.listview_nine_013

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("Miku","Luka","Kaito","Rin","Ren","Aria",
        "Mayu","Meiko","Yukari","Gumi")

    val priceArr = arrayOf("โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Hatsune miku:พัฒนาโดยบริษัท:Yamaha:เปิดตัว:01/2004",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Magurine luka:พัฒนาโดยบริษัท:Yamaha:เปิดตัว:01/2004",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Kaito:พัฒนาโดยบริษัท:Crypton Future Media:เปิดตัว:02/2006",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Kagamine rin:พัฒนาโดยบริษัท:Crypton Future Media:เปิดตัว:04/2006",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Kagamine ren:พัฒนาโดยบริษัท:Crypton Future Media:เปิดตัว:04/2006",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Aria on the planet:พัฒนาโดยบริษัท:1st Place เปิดตัว:11/2012",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Mayu:พัฒนาโดยบริษัท:Music Label:เปิดตัว:05/2012",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Meiko:พัฒนาโดยบริษัท:Crypton Future Media:เปิดตัว:05/2004",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Yuzuki Yukari:พัฒนาโดยบริษัท:Vacolomakets AH-software Co.Ltd:เปิดตัว:03/2011",
                           "โปรแกรมเสียงสังเคราะห์:ชื่อคาแรคเตอร์ Gumi:พัฒนาโดยบริษัท:Internet.Co.,Ltd:เปิดตัว:11/2015")

    val context = this

    public final val KEY_TITLE = "TITLE"
    public final val KEY_RESULT = "RESULT"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("รายชื่อโปรแกรมเสียงสังเคราะห์")

        val mAdp = ArrayAdapter(context,
            android.R.layout.simple_list_item_1,
            titleArr)

        voca.adapter = mAdp

        voca.setOnItemClickListener { parent, view, position, id ->

            val goPageResult = Intent(context,nero::class.java)

            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_RESULT,priceArr[position])

            startActivity(goPageResult)


        }
    }
}