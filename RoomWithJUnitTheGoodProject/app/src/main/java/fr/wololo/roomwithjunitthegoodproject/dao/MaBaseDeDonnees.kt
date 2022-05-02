package fr.wololo.roomwithjunitthegoodproject.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import fr.wololo.roomwithjunitthegoodproject.entities.Film

@Database(entities = arrayOf(Film::class), version = 1)
abstract class MaBaseDeDonnees : RoomDatabase() {

    abstract fun filmDao(): FilmDao

    companion object {
        @Volatile
        private var INSTANCE: MaBaseDeDonnees? = null

        fun getInstance(context: Context): MaBaseDeDonnees {
            synchronized(this) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        MaBaseDeDonnees::class.java,
                        "la_base_de_donnees"
                    )
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build()
                }
                return INSTANCE as MaBaseDeDonnees
            }
        }
    }
}