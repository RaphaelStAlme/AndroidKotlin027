package fr.wololo.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.switchmaterial.SwitchMaterial
import fr.wololo.hello_world.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vb = ActivityMainBinding.inflate(layoutInflater)

        vb.btn1?.setOnClickListener {
            Toast.makeText(this,"Wololotitude",Toast.LENGTH_LONG).show();
        }

        setContentView(vb.root)
    }
}