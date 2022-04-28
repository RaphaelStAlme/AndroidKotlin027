package fr.wololo.color_me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.wololo.color_me.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vb =  FragmentBlankBinding.inflate(layoutInflater)

        vb.btnOk.setOnClickListener {
            var valeur = vb.etNom.text.hashCode()/1_000_000

            if(valeur > 665)
            {
                Navigation.findNavController(it).navigate(R.id.action_blankFragment_to_redFragment)
            }else{
                Navigation.findNavController(it).navigate(R.id.action_blankFragment_to_pinkFragment)
            }
        }

        return vb.root
    }

}