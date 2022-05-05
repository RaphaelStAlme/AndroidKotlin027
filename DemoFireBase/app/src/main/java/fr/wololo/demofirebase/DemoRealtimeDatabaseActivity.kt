package fr.wololo.demofirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import fr.wololo.demofirebase.databinding.ActivityDemoRealtimeDatabaseBinding

class DemoRealtimeDatabaseActivity : AppCompatActivity() {

    val database = Firebase.database
    val myRef = database.getReference("wololo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vb = ActivityDemoRealtimeDatabaseBinding.inflate(layoutInflater)

        vb.btnSave.setOnClickListener {
            myRef.setValue(vb.etSaisieValeurWololo.text.toString())
        }

        myRef.addValueEventListener(object: ValueEventListener {

            override fun onDataChange(snapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = snapshot.getValue<String>()

                vb.valeurWololo.text = value

            //Log.d("ACOS", "Value is: " + value)
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("ACOS", "Failed to read value.", error.toException())
            }

        })

        setContentView(vb.root)
    }
}