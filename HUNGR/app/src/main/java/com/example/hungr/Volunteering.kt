package com.example.hungr

import android.os.Bundle
import androidx.fragment.app.Fragment

class Volunteering : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val volunteeringDataset = VolunteeringData().loadPosts()
    }
}
