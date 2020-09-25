package com.example.roseantevd

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.roseantevd.models.Pin
import com.example.roseantevd.models.User
import com.example.roseantevd.services.DestinationService
import com.example.roseantevd.services.ServiceBuilder


//import kotlinx.android.synthetic.main.activity_destiny_create.*
import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_main.edt_email
import kotlinx.android.synthetic.main.activity_pin.*
import kotlinx.android.synthetic.main.register_layout.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_layout)


        val context = this

        // Show the Up button in the action bar.
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        addUser.setOnClickListener {
            val newUser = User()
            newUser.email = edt_email.text.toString()
            newUser.password = edt_password_conf.text.toString()
            newUser.password_conf = edt_password_conf.text.toString()

            val destinationService:DestinationService = ServiceBuilder.buildService((DestinationService::class.java))

            val requestCall:Call<User>  = destinationService.addUser(newUser)

            requestCall.enqueue(object : Callback<User> {
                override fun onFailure(call: Call<User>, t: Throwable) {
                    Toast.makeText(this@Register,"fails", Toast.LENGTH_SHORT)
                }

                override fun onResponse(call: Call<User>, response: Response<User>) {
                   if(response.isSuccessful){
                       Toast.makeText(this@Register,"connect", Toast.LENGTH_SHORT)
                   }
                }


            })
        }
    }
}

