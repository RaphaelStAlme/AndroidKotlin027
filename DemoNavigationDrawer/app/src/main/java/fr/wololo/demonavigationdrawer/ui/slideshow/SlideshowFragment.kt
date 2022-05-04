package fr.wololo.demonavigationdrawer.ui.slideshow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import fr.wololo.demonavigationdrawer.AirQuality
import fr.wololo.demonavigationdrawer.databinding.FragmentSlideshowBinding
import fr.wololo.demonavigationdrawer.ui.ConfigDependance

class ItemListener(val clickListener: (id: Int) -> Unit)
{
    fun onClick(item: AirQuality) = clickListener(item.id)
}

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this,ConfigDependance(this.requireContext())).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val adapter = AirQualityListAdapter(ItemListener {
                id -> Toast.makeText(context, " Air Quality id : $id", Toast.LENGTH_LONG).show()
        })

        _binding!!.rvAirQuality.adapter = adapter

        slideshowViewModel.listes.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })

        return root
    }
}