package com.example.hungr.volunteering.database;

import androidx.lifecycle.LiveData
import androidx.room.Dao;
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import java.sql.Time

@Dao
interface VolunteeringOpportunitiesDatabaseDao {
    @Insert
    fun insert(opportunity: VolunteeringOpportunities)

    @Update
    fun update(opportunity: VolunteeringOpportunities)

    @Query("SELECT * from volunteering_opportunities WHERE volunteerId = :key")
    fun get(key: Long): VolunteeringOpportunities?

    @Query("DELETE from volunteering_opportunities")
    suspend fun clear()

    @Query("SELECT * from volunteering_opportunities ORDER BY volunteerId DESC")
    fun getAllOpportunities(): LiveData<List<VolunteeringOpportunities>>

    @Query("INSERT INTO volunteering_opportunities(name, description, startTime, endTime, " +
            "responsibilities) VALUES (:name, :description, :startTime, :endTime)")
    fun addOpportunity(name: String, description: String, startTime: Time, endTime: Time)
}
