package fr.wololo.roomwithjunitthegoodproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import fr.wololo.roomwithjunitthegoodproject.dao.InjectionDependance
import fr.wololo.roomwithjunitthegoodproject.databinding.ActivityFilmsBinding

class FilmsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var vm = ViewModelProvider(this, InjectionDependance(this)).get(FilmsActivityViewModel::class.java)

        var db = ActivityFilmsBinding.inflate(layoutInflater)

        var adapter = AdapterFilms()
        db.rvFilms.adapter = adapter


        vm.listeFilms.observe(this, Observer {
            adapter.submitList(it)
        })

        setContentView(db.root)
    }
}