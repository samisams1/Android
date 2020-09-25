package com.example.roseantevd

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roseantevd.models.Pin
import kotlinx.android.synthetic.main.list_item.view.*

class PinAdapter(private val pins: List<Pin>)  :RecyclerView.Adapter<PinAdapter.MyViewHolder>(){


   inner  class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

     var txvDestination:TextView = itemView.findViewById(R.id.txvTitle)
       var destinatin:Pin?=null
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
      return pins.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.destinatin = pins[position]
        holder.txvDestination.text = pins[position].status

    }

}


