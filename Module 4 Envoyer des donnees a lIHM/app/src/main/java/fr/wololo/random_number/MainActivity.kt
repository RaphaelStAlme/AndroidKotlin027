package fr.wololo.random_number

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_minimum = findViewById<EditText>(R.id.et_minimum)
        val et_maximum = findViewById<EditText>(R.id.et_maximum)

        val bouton = findViewById<Button>(R.id.btn_generate)

        val tv = findViewById<TextView>(R.id.tv_rendu_resultat)

        bouton.setOnClickListener {

            val minimum = et_minimum.text.toString().toInt(0)
            val maximum = et_maximum.text.toString().toInt(0)

            val aleatoire = (minimum..maximum).random()
            tv.text = aleatoire.toString()
        }
    }
}