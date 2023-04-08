package com.example.bismillah


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BolaAdapter constructor(private val getActivity: MainActivity,
                                  private val bolaList: List<Bola>) :
    RecyclerView.Adapter<BolaAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycleview_model,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bolaTitle.text = bolaList[position].Title
        holder.bolaImage.setImageResource(bolaList[position].Image)
        holder.cardView.setOnClickListener {
            Toast.makeText(getActivity, bolaList[position].Title, Toast.LENGTH_SHORT).show()
        }
    }


    override fun getItemCount(): Int {
        return bolaList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val bolaTitle : TextView = itemView.findViewById(R.id.itemText)
        val bolaImage : ImageView = itemView.findViewById(R.id.itemImage)
        val cardView : CardView = itemView.findViewById(R.id.cardView)

    }


}


