package fr.wololo.roomwithjunitthegoodproject

import android.util.Log
import androidx.lifecycle.ViewModel
import fr.wololo.roomwithjunitthegoodproject.dao.FilmDao
import fr.wololo.roomwithjunitthegoodproject.dao.MaBaseDeDonnees
import fr.wololo.roomwithjunitthegoodproject.entities.Film

class MainActivityViewModel(val dao:FilmDao) : ViewModel() {

    var film: Film = Film()

    var duree:String = ""

    fun save()
    {
        film.duree = this.duree.toInt()

        dao.insert(film)
    }


}