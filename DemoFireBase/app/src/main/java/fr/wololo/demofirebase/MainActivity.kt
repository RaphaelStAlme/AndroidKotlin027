package fr.wololo.demofirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.wololo.demofirebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val vb = ActivityMainBinding.inflate(layoutInflater)

        vb.btnAuthentification.setOnClickListener {
            startActivity(Intent(this,DemoAuthentificationActivity::class.java))
        }

        vb.btnFirestore.setOnClickListener {
            startActivity(Intent(this,DemoFirestoreActivity::class.java))
        }

        vb.btnRealtime.setOnClickListener {
            startActivity(Intent(this,DemoRealtimeDatabaseActivity::class.java))
        }

        vb.btnStorage.setOnClickListener {
            startActivity(Intent(this,DemoStorageActivity::class.java))
        }


        setContentView(vb.root)






    }
}