package fr.wololo.color_me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.wololo.color_me.databinding.FragmentBlankBinding
import fr.wololo.color_me.databinding.FragmentPinkBinding

class PinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vb =  FragmentPinkBinding.inflate(layoutInflater)

        vb.btnOk.setOnClickListener {


            val resutat = (vb.etNom.text.toString().hashCode()-vb.etAnnee.text.toString().toInt())

            if(resutat>0) {
                Navigation.findNavController(it).navigate(R.id.action_pinkFragment_to_yellowFragment)
            }else{
                Navigation.findNavController(it).navigate(R.id.action_pinkFragment_to_greenFragment)
            }

        }

        return vb.root
    }

}