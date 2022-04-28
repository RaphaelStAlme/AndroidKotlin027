package fr.wololo.vraioufaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.wololo.vraioufaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var qr1 = QuestionReponse("Café ?",true)
    var qr2 = QuestionReponse("Creme ?",true)
    var qr3 = QuestionReponse("Sucre ?",true)
    var qr4 = QuestionReponse("Calva ?",true)
    var qr5 = QuestionReponse("Tasse ?",true)
    val liste = listOf<QuestionReponse>(qr1,qr2,qr3,qr4,qr5)

    var index = 0;
    var points = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vb = ActivityMainBinding.inflate(layoutInflater)

        vb.tvQuestion.text = liste.get(index).question;

        vb.btnVrai.setOnClickListener {
            if(liste.get(index).reponse)
            {
                points++
                vb.tvResultat.text = points.toString()
                index++
                vb.tvQuestion.text = liste.get(index).question
            }
        }


        vb.btnFaux.setOnClickListener {
            if(!liste.get(index).reponse)
            {
                points++
                vb.tvResultat.text = points.toString()
                index++
                vb.tvQuestion.text = liste.get(index).question
            }
        }


        setContentView(vb.root)
    }
}

data class QuestionReponse(val question: String = "Est ce vrai ?", val reponse: Boolean = false)