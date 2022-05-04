package fr.wololo.roomwithjunitthegoodproject.dao

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import fr.wololo.roomwithjunitthegoodproject.BananeActivityViewModel
import fr.wololo.roomwithjunitthegoodproject.FilmsActivityViewModel
import fr.wololo.roomwithjunitthegoodproject.MainActivityViewModel
import java.lang.Exception

class InjectionDependance(val ctxt:Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java))
        {
            val dao = MaBaseDeDonnees.getInstance(ctxt).filmDao()
            return MainActivityViewModel(dao) as T
        }
        if(modelClass.isAssignableFrom(BananeActivityViewModel::class.java))
        {
            return BananeActivityViewModel() as T
        }
        if(modelClass.isAssignableFrom(FilmsActivityViewModel::class.java))
        {
            val dao = MaBaseDeDonnees.getInstance(ctxt).filmDao()
            return FilmsActivityViewModel(dao) as T
        }
        throw Exception("ViewModel non existant")
    }
}