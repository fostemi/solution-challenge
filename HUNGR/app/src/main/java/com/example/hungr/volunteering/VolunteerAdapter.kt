package com.example.hungr.volunteering

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.hungr.R
import com.example.hungr.volunteering.database.VolunteeringOpportunities

class VolunteerAdapter(
    private val context: Volunteering,
    private val dataset: List<VolunteeringOpportunities>
    ) : RecyclerView.Adapter<VolunteerAdapter.VolunteerViewHolder>() {
        class VolunteerViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
            val textView: TextView = view.findViewById(R.id.item_title)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VolunteerViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_opportunity, parent, false)
        return VolunteerViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: VolunteerViewHolder, position: Int) {
        val opportunity = dataset[position]
        holder.textView.text = opportunity.name
    }

    override fun getItemCount() = dataset.size
}
