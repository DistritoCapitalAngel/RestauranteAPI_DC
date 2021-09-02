package co.edu.sena.apirestaurantedc

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class Registro : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

         var name = findViewById<EditText>(R.id.nameR)
         var ciudad = findViewById<EditText>(R.id.ciudadR)
         var correo = findViewById<EditText>(R.id.emailR)
         var clave = findViewById<EditText>(R.id.claveR)



        var BtnR = findViewById<Button>(R.id.btnRegistrar)

        BtnR.setOnClickListener{

        }
    }

/*
    fun showLogin(view: android.view.View) {
        val showL = Intent(this, Login::class.java)
        startActivity(showL)
    }

    fun showRegister(view: android.view.View) {
        val showR = Intent(this, Registro::class.java)
        startActivity(showR)
    }

    fun toast(t:String){
        Toast.makeText(this, t, Toast.LENGTH_SHORT).show()
    }
*/


}
