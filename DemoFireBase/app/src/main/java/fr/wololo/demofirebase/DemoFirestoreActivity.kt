package fr.wololo.demofirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import fr.wololo.demofirebase.databinding.ActivityDemoFirestoreBinding
import java.util.*

class DemoFirestoreActivity : AppCompatActivity() {

    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val vb = ActivityDemoFirestoreBinding.inflate(layoutInflater)

        vb.btnSave.setOnClickListener {
            // Create a new user with a first and last name
            val sandwich = hashMapOf(
                "id" to UUID.randomUUID().toString(),
                "nom" to vb.etNomSandwich.text.toString(),
                "prix" to vb.etPrixSandwich.text.toString()
            )

            // Add a new document with a generated ID
            db.collection("sandwichs")
                .add(sandwich)
                .addOnSuccessListener { documentReference ->
                    Log.d("ACOS", "DocumentSnapshot added with ID: ${documentReference.id}")
                }
                .addOnFailureListener { e ->
                    Log.w("ACOS", "Error adding document", e)
                }
        }

        vb.btnAfficher.setOnClickListener {

            db.collection("sandwichs")
                .get()
                .addOnSuccessListener { result ->
                    var resultat = ""
                    for (document in result) {
                        resultat += document.data.get("nom")
                        resultat += "\n"
                    }
                    vb.tvSandwichs.text = resultat
                }
                .addOnFailureListener { exception ->
                    Log.w("ACOS", "Error getting documents.", exception)
                }

        }

        setContentView(vb.root)
    }






}