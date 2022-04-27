package fr.wololo.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv_blabla)
        val sw = findViewById<SwitchMaterial>(R.id.reponse_ca_va)
        val et = findViewById<EditText>(R.id.et_reponse_courriel)
        val sb = findViewById<SeekBar>(R.id.sb_niveau)
        val bouton1 = findViewById<Button>(R.id.btn_1)

        bouton1.setOnClickListener {
            Toast.makeText(this,"Wololotitude",Toast.LENGTH_LONG).show();
        }

        tv.text = "Wololo"

    }


}