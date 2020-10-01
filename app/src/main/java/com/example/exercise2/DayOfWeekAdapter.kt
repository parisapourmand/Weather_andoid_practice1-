package com.example.exercise2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DayOfWeekAdapter(private val week: List<DayOfWeek>) : RecyclerView.Adapter<DayOfWeekAdapter.DayItemViewHolder >(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_week, parent, false)
        return DayItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return week.size
    }

    override fun onBindViewHolder(holder: DayItemViewHolder, position: Int) {
        val dayOfWeek = week[position]
        holder.txtDayName.text = dayOfWeek.name
        holder.txtTemprature.text = dayOfWeek.temperature
        holder.imgIcon.setImageDrawable(dayOfWeek.image)
    }


    class DayItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val txtDayName = itemView.findViewById<TextView>(R.id.txt_day_name)
        val txtTemprature = itemView.findViewById<TextView>(R.id.txt_temprature)
        val imgIcon = itemView.findViewById<ImageView>(R.id.img_icon)
    }
}