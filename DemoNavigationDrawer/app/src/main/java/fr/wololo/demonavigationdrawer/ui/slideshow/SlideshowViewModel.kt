package fr.wololo.demonavigationdrawer.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import fr.wololo.demonavigationdrawer.dao.AirQualityDao

class SlideshowViewModel(val dao: AirQualityDao) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }

    val text: LiveData<String> = _text

    val listes = dao.get()


}