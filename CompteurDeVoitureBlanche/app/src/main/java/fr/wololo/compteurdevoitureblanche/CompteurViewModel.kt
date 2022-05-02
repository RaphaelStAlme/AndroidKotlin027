package fr.wololo.compteurdevoitureblanche

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CompteurViewModel: ViewModel() {

    var compteur:MutableLiveData<Int> = MutableLiveData(0);

    fun clickPlusUn()
    {
        compteur.value = compteur.value?.plus(1)
    }
}