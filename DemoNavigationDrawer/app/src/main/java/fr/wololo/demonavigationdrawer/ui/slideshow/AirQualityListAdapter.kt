package fr.wololo.demonavigationdrawer.ui.slideshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import fr.wololo.demonavigationdrawer.AirQuality
import fr.wololo.demonavigationdrawer.databinding.LigneAirQualityBinding

class AirQualityListAdapter(val clickListener: ItemListener): ListAdapter<AirQuality, AirQualityListAdapter.ViewHolder>(ItemDiffCallback())
{
    //Fonction appelée automatiquement pour changer le contenu d'un conteneur de ligne
    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        //On va chercher la données à afficher, c'est le système qui s'occupe de vous fournir la position
        val item = getItem(position)
        //holder représente un conteneur et on lui donne la donnée à charger
        holder.bind(item,clickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        return ViewHolder.from(parent)
    }

    //Représente un conteneur de ligne
    class ViewHolder private constructor(val binding: LigneAirQualityBinding) : RecyclerView.ViewHolder(binding.root)
    {
        //Fait le travail de chargement des données dans la ligne
        fun bind(item: AirQuality, action:ItemListener)
        {
            //On fournit à la ligne les données, le dataBinding de l'IHM fait le reste
            binding.model = item
            binding.listener = action
            binding.executePendingBindings()
        }

        //Ici c'est toujours pareil
        companion object
        {
            fun from(parent: ViewGroup): ViewHolder
            {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = LigneAirQualityBinding.inflate(layoutInflater, parent, false)
                return ViewHolder(binding)
            }
        }
    }
}

//Permet de savoir si on change ou non le contenu d'un ligne
class ItemDiffCallback : DiffUtil.ItemCallback<AirQuality>()
{
    override fun areItemsTheSame(oldItem: AirQuality, newItem: AirQuality): Boolean
    {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: AirQuality, newItem: AirQuality): Boolean
    {
        return oldItem == newItem
    }
}