package com.example.hungr.volunteering

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.hungr.R

class Volunteering : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_volunteering, container, false)
    }
    /*
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myDataset = VolunteeringData().loadData()

        val recyclerView = requireView().findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = VolunteerAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)
        return inflater.inflate(R.layout.fragment_volunteering, container, false)
    }
    */
}
