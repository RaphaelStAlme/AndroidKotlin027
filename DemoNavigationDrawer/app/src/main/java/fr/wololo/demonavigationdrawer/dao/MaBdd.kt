package fr.wololo.demonavigationdrawer.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import fr.wololo.demonavigationdrawer.AirQuality

@Database(entities = arrayOf(AirQuality::class), version = 1)
abstract class MaBdd : RoomDatabase() {

    abstract fun getAirQualityDao(): AirQualityDao

    companion object {
        @Volatile
        private var INSTANCE: MaBdd? = null

        fun getInstance(context: Context): MaBdd {
            synchronized(this) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        MaBdd::class.java,
                        "la_base_de_donnees"
                    )
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE as MaBdd
            }
        }
    }
}