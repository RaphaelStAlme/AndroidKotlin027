package fr.wololo.demonavigationdrawer.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import fr.wololo.demonavigationdrawer.dao.MaBdd
import fr.wololo.demonavigationdrawer.ui.home.HomeViewModel
import fr.wololo.demonavigationdrawer.ui.slideshow.SlideshowViewModel
import java.security.Provider

class ConfigDependance(val ctx:Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T
    {
        if(modelClass.isAssignableFrom(HomeViewModel::class.java))
        {
            val dao = MaBdd.getInstance(ctx).getAirQualityDao()
            return HomeViewModel(dao) as T
        }
        if(modelClass.isAssignableFrom(SlideshowViewModel::class.java))
        {
            val dao = MaBdd.getInstance(ctx).getAirQualityDao()
            return SlideshowViewModel(dao) as T
        }
        throw Exception("uppppep ce vm n'existe pas")
    }
}