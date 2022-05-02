package fr.wololo.compteurdevoitureblanche

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import fr.wololo.compteurdevoitureblanche.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var db = ActivityMainBinding.inflate(layoutInflater)

        var vm = ViewModelProvider(this).get(CompteurViewModel::class.java)

        vm.compteur.observe(this, Observer {
            db.model = vm;
        })

        setContentView(db.root)
    }
}