package fr.wololo.bestfinger

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel()
{
    var nbLance = MutableLiveData<Int>(0);
    var nbLanceGauche = 0;
    var nbLanceDroite = 0;
    var scoreGauche = 0;
    var scoreDroite = 0;
    var img = R.drawable.d1;

    private fun lance():Int
    {
        nbLance.value = nbLance.value?.plus(1)
        var valeur =  (1..6).random()
        img = when(valeur) {
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }
        return valeur
    }

    fun clicGauche()
    {
        nbLanceGauche++
        scoreGauche += lance()
    }

    fun clicDroite()
    {
        nbLanceDroite++
        scoreDroite += lance()
    }
}