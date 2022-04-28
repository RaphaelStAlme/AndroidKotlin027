package fr.wololo.color_me

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import fr.wololo.color_me.databinding.FragmentBlankBinding
import fr.wololo.color_me.databinding.FragmentRedBinding

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vb =  FragmentRedBinding.inflate(layoutInflater)

        vb.btnOk.setOnClickListener {
            val resultat = (vb.etNom.text.toString() + vb.etMotAzar.text.toString()).hashCode()

            if(resultat > 0)
            {
                Navigation.findNavController(it).navigate(R.id.action_redFragment_to_orangeFragment)
            }else{
                Navigation.findNavController(it).navigate(R.id.action_redFragment_to_blueFragment)
            }
        }

        return vb.root
    }


}