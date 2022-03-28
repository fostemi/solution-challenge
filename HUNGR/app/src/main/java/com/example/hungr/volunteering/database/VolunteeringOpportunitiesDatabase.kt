package com.example.hungr.volunteering.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [VolunteeringOpportunities::class], version = 1, exportSchema = false)
abstract class VolunteeringOpportunitiesDatabase: RoomDatabase() {
    abstract val volunteeringOpportunitiesDatabaseDao: VolunteeringOpportunitiesDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: VolunteeringOpportunitiesDatabase? = null

        fun getInstance(context: Context): VolunteeringOpportunitiesDatabase {
            synchronized(this){
                var instance = INSTANCE
                if (instance == null){
                    instance = Room.databaseBuilder(context.applicationContext,
                                                    VolunteeringOpportunitiesDatabase::class.java,
                                                    "volunteering_opportunities")
                        .fallbackToDestructiveMigration()
                        .build()
                }
                return instance
            }
        }
    }
}