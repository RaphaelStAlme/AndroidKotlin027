package fr.wololo.roomwithjunitthegoodproject

import androidx.lifecycle.ViewModel
import fr.wololo.roomwithjunitthegoodproject.dao.FilmDao
import fr.wololo.roomwithjunitthegoodproject.entities.Film

class MainActivityViewModel(val dao:FilmDao) : ViewModel() {
    var film: Film = Film()
    var duree:String = ""

    var listeFilms = dao.get()

    fun save() {
        film.duree = this.duree.toInt()
        dao.insert(film)
    }
}