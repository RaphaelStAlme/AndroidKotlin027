package fr.wololo.roomwithjunitthegoodproject

import androidx.lifecycle.ViewModel
import fr.wololo.roomwithjunitthegoodproject.dao.FilmDao

class FilmsActivityViewModel(val dao:FilmDao) : ViewModel()
{
    var listeFilms = dao.get()
}