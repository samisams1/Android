package com.example.roseantevd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
//import com.example.roseantevd.models.Destination
import com.example.roseantevd.models.Pin
import com.example.roseantevd.services.DestinationService
import com.example.roseantevd.services.ServiceBuilder
import kotlinx.android.synthetic.main.activity_pin.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PinListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)




    }

    override fun onResume() {
        super.onResume()

        loadDestinations()
    }

    private  fun loadDestinations(){
        val destinationService:DestinationService = ServiceBuilder.buildService(DestinationService::class.java)
        val requestCall:Call<List<Pin>>  =  destinationService.getPinList()

        requestCall.enqueue(object :Callback<List<Pin>>{
            override fun onResponse(call: Call<List<Pin>>,
                response: Response<List<Pin>>
            ) {
               if(response.isSuccessful){


                   val destinationList:List<Pin> = response.body()!!
             recyclerView.adapter = PinAdapter(destinationList)

              //     Log.wtf(TAG, "onCreate method running")
                   Log.d("EA","connect")


               }
               if(response.code() == 401){
                   Toast.makeText(this@PinListActivity,"fails",Toast.LENGTH_SHORT).show()
               }
               else{
                   Toast.makeText(this@PinListActivity,"fails",Toast.LENGTH_SHORT).show()
               }
            }

            override fun onFailure(call: Call<List<Pin>>, t: Throwable) {
                Toast.makeText(this@PinListActivity,"fails",Toast.LENGTH_SHORT).show()
            }
        })
    }

}