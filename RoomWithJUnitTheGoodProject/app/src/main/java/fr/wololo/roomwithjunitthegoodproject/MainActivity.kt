package fr.wololo.roomwithjunitthegoodproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import fr.wololo.roomwithjunitthegoodproject.dao.InjectionDependance
import fr.wololo.roomwithjunitthegoodproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var db = ActivityMainBinding.inflate(layoutInflater)

        var vm = ViewModelProvider(this,InjectionDependance(this)).get(MainActivityViewModel::class.java)

        db.model = vm

        vm.listeFilms.observe(this, Observer {
            for(item in it)
            {
                Log.i("ACOS","Film : $item")
            }
        })

        db.btnAfficherFilm.setOnClickListener {
            var intent = Intent(this,FilmsActivity::class.java)
            startActivity(intent)
        }


        setContentView(db.root)
    }
}