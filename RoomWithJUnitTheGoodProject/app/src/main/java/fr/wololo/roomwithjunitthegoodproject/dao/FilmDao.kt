package fr.wololo.roomwithjunitthegoodproject.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import fr.wololo.roomwithjunitthegoodproject.entities.Film

@Dao
interface FilmDao
{
    @Insert
    fun insert(film:Film)

    @Query("SELECT * FROM Film Order by titre")
    fun get():List<Film>

    @Query("SELECT * FROM Film WHERE id = :wololoid")
    fun get(wololoid:Int):Film
}