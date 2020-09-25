package com.example.roseantevd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.roseantevd.models.Supplier
import kotlinx.android.synthetic.main.activity_pin.*

class PinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pin)

        val layouManager = LinearLayoutManager(this)
        layouManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layouManager

      //  val adapter = PinAdapter(this,Supplier.pins)

      //  recyclerView.adapter= adapter


    }
}