package com.lamia.mekid.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_instagram.*

class Instagram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)


        button2.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}