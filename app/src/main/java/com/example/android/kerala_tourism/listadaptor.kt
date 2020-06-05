package com.example.android.kerala_tourism

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class listadaptor(val locList: ArrayList<Model>): RecyclerView.Adapter<listadaptor.ViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.list_item,
                parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int= locList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = locList[position]
        val res = holder.itemView.context.resources
        holder.details.setText(item.detail)
        holder.image.setImageResource(item.Image)
        holder.title.setText(item.title)

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image: ImageView = itemView.findViewById(R.id.image)
        val details:TextView=itemView.findViewById(R.id.details)
        val title:TextView=itemView.findViewById(R.id.title)

    }
}