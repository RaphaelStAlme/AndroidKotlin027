package fr.wololo.roomwithjunitthegoodproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import fr.wololo.roomwithjunitthegoodproject.dao.InjectionDependance
import fr.wololo.roomwithjunitthegoodproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var db = ActivityMainBinding.inflate(layoutInflater)

        var vm = ViewModelProvider(this,InjectionDependance(this)).get(MainActivityViewModel::class.java)

        db.model = vm

        setContentView(db.root)
    }
}