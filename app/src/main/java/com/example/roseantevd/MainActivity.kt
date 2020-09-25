package com.example.roseantevd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_signup.*
//import kotlinx.android.synthetic.main.signup_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        loginBtn.setOnClickListener {

            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        forgot_password.setOnClickListener {

            val intent = Intent(this,forgotpasswordActivity::class.java)
            startActivity(intent)
        }
        createAccount.setOnClickListener {

            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
        }



    }




}