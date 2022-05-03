package fr.wololo.demonavigationdrawer

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AirQuality(@PrimaryKey(autoGenerate = true)var id:Int=0, var note:Float=0f, var ville:String="")