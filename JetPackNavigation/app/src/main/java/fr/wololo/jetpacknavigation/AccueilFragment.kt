package fr.wololo.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.wololo.jetpacknavigation.databinding.FragmentAccueilBinding


class AccueilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val vb = FragmentAccueilBinding.inflate(layoutInflater)

        vb.btnVersOrange.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_accueilFragment_to_orangeFragment)
        }

        vb.btnVersBleu.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_accueilFragment_to_bleuFragment)
        }

        vb.btnVersRouge.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_accueilFragment_to_rougeFragment)
        }

        return vb.root
    }


}