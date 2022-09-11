package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FragmentDetail (val listdaftar: ArrayList<LinkAlpabeth> ) : RecyclerView.Adapter<FragmentDetail.ViewHolder>(){

    var onClick : ((LinkAlpabeth)-> Unit)? = null

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var huruf = view.findViewById<TextView>(R.id.textrv)
        var card = view.findViewById<CardView>(R.id.cardlist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.huruf.text = listdaftar[position].data1
        holder.card.setOnClickListener{
            onClick?.invoke(listdaftar[position])
        }
    }

    override fun getItemCount(): Int {
        return listdaftar.size
    }


}