package fr.wololo.bestfinger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import fr.wololo.bestfinger.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var db = ActivityMainBinding.inflate(layoutInflater)

        var vm = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        vm.nbLance.observe(this, Observer {
            db.model = vm
        })

        setContentView(db.root)
    }
}