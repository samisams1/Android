package com.example.roseantevd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.roseantevd.models.User
import com.example.roseantevd.services.DestinationService
import com.example.roseantevd.services.ServiceBuilder
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.register_layout.*
import kotlinx.android.synthetic.main.register_layout.edt_email
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_layout)


        addUser.setOnClickListener {
            val newUser = User()
            newUser.email = edt_email.text.toString()
            newUser.unique_id= 522
            newUser.username= username.text.toString()
            newUser.password = edt_password_conf.text.toString()
            newUser.password_conf = edt_password_conf.text.toString()

            val destinationService: DestinationService = ServiceBuilder.buildService((DestinationService::class.java))

            val requestCall: Call<User> = destinationService.addUser(newUser)

            requestCall.enqueue(object : Callback<User> {


                override fun onResponse(call: Call<User>, response: Response<User>) {
                    if(response.isSuccessful){
                        Toast.makeText(this@RegisterActivity,"connect", Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    Toast.makeText(this@RegisterActivity,"fails", Toast.LENGTH_SHORT).show()
                }


            })
        }
    }
}