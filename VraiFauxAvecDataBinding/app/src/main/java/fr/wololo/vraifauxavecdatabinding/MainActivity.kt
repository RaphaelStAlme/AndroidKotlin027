package fr.wololo.vraifauxavecdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import fr.wololo.vraifauxavecdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var qr1 = QuestionReponse("Café ?",true)
    var qr2 = QuestionReponse("Creme ?",true)
    var qr3 = QuestionReponse("Sucre ?",true)
    var qr4 = QuestionReponse("Calva ?",true)
    var qr5 = QuestionReponse("Tasse ?",true)
    val liste = listOf<QuestionReponse>(qr1,qr2,qr3,qr4,qr5)

    var index = 0;
    var points = 0;

    var unPrenom = "Joe"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vb = ActivityMainBinding.inflate(layoutInflater)

        vb.qr = liste.get(index);
        vb.resultat = points.toString();
        vb.prenom = unPrenom

        vb.btnVrai.setOnClickListener {
            if(liste.get(index).reponse)
            {
                points++
                index++

                vb.qr = liste.get(index);
                vb.resultat = points.toString();
                Toast.makeText(this,"Bravo ${vb.prenom}",Toast.LENGTH_LONG).show()
            }
        }


        vb.btnFaux.setOnClickListener {
            if(!liste.get(index).reponse)
            {
                points++
                index++

                vb.qr = liste.get(index);
                vb.resultat = points.toString();
            }
        }

        setContentView(vb.root)
    }
}

data class QuestionReponse(val question: String = "Est ce vrai ?", val reponse: Boolean = false)