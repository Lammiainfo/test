package com.lamia.mekid.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            val email = edt_email.text.toString()
            val password = edt_password.text.toString()
            if (email.isEmpty()) {
                edt_email.error = "email Required"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                edt_password.error = "password Required"
                return@setOnClickListener
            }

        //    Toast.makeText(this, "$email | $password", Toast.LENGTH_SHORT).show()

            startActivity(            Intent(this, Instagram::class.java)
            )


        }

    }
}