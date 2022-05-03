package fr.wololo.demonavigationdrawer.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import fr.wololo.demonavigationdrawer.AirQuality

@Dao
interface AirQualityDao {

    @Insert
    fun insert(item:AirQuality)

    @Query("SELECT * FROM AirQuality")
    fun get():LiveData<List<AirQuality>>

}