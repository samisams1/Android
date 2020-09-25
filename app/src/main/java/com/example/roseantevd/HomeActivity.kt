package com.example.roseantevd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        profile.setOnClickListener {

            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

        voucer_pin.setOnClickListener {

            val intent = Intent(this,PinListActivity::class.java)
            startActivity(intent)
        }
        voucer_pin_request.setOnClickListener {

            val intent = Intent(this,PinRequestActivity::class.java)
            startActivity(intent)
        }
        requests.setOnClickListener {

            val intent = Intent(this,PinRequestActivity::class.java)
            startActivity(intent)
        }
    }
}