package fr.wololo.cycledevie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import fr.wololo.cycledevie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ACOS","onCreate")
        super.onCreate(savedInstanceState)

        val vb = ActivityMainBinding.inflate(layoutInflater)

        vb.btnClick.setOnClickListener {
            Log.i("ACOS","Click")
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        setContentView(vb.root)
    }

    override fun onStart() {
        Log.i("ACOS","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ACOS","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ACOS","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ACOS","onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("ACOS","onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("ACOS","onDestroy")
        super.onDestroy()
    }
}