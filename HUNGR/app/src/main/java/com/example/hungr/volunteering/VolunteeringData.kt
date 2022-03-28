package com.example.hungr.volunteering

import com.example.hungr.volunteering.database.VolunteeringOpportunities

class VolunteeringData {
    fun loadData(): List<VolunteeringOpportunities> {
        return listOf<VolunteeringOpportunities>(
            VolunteeringOpportunities().findById(0),
            VolunteeringOpportunities().findById(1)
        )
    }
}
