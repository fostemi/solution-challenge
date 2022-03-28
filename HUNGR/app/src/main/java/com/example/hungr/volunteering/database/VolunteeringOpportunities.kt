package com.example.hungr.volunteering.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Time

@Entity(tableName = "volunteering_opportunities")
data class VolunteeringOpportunities(
    @PrimaryKey(autoGenerate = true)
    val volunteerId: Long = 0L,
    @ColumnInfo(name = "name")
    val name: String = "",
    @ColumnInfo(name = "description")
    val description: String = "",
    @ColumnInfo(name = "startTime")
    val startTime: Time = Time.valueOf("12:00:00"),
    @ColumnInfo(name = "endTime")
    val endTime: Time = Time.valueOf("12:00:00"),
    @ColumnInfo(name = "responsibilities")
    val responsibilities: String = ""
) {
    fun findById(id: Int): VolunteeringOpportunities {
        //TODO: query database
        return VolunteeringOpportunities()
    }
    //TODO:add location
}
