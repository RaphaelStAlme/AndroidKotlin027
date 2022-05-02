package fr.wololo.roomwithjunitthegoodproject.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Film(@PrimaryKey(autoGenerate = true) var id:Int=0, var titre:String="", var duree:Int=0, var nationalite:String="")