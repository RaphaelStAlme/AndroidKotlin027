package fr.wololo.compteurdevoitureblanche

import androidx.lifecycle.ViewModel

class CompteurViewModel: ViewModel() {

    var compteur = 0

    fun clickPlusUn()
    {
        compteur++
    }
}