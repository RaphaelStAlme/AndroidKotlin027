package fr.wololo.demonavigationdrawer.ui.home

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import fr.wololo.demonavigationdrawer.AirQuality
import fr.wololo.demonavigationdrawer.dao.AirQualityDao
import fr.wololo.demonavigationdrawer.dao.MaBdd

class HomeViewModel(var dao:AirQualityDao) : ViewModel() {

    var item:AirQuality = AirQuality()

    fun save()
    {
        dao.insert(item);
    }

}