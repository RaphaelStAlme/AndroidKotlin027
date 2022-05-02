package fr.wololo.cycledevie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("ACOS","ACT 2 onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun onStart() {
        Log.i("ACOS","ACT 2 onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.i("ACOS","ACT 2 onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.i("ACOS","ACT 2 onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.i("ACOS","ACT 2 onStop")
        super.onStop()
    }

    override fun onRestart() {
        Log.i("ACOS","ACT 2 onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.i("ACOS","ACT 2 onDestroy")
        super.onDestroy()
    }
}