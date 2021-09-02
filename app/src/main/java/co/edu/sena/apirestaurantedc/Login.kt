package co.edu.sena.apirestaurantedc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText


class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val Ccorreo:String
        val Cclave:String

        val name = findViewById<EditText>(R.id.Lname)
        val clave = findViewById<EditText>(R.id.Lclave)
        val check = findViewById<CheckBox>(R.id.check)

        val btnL = findViewById<Button>(R.id.btnLogin)


        btnL.setOnClickListener{


        }

    }


    fun showLogin(view: android.view.View) {
        val showL = Intent(this, Login::class.java)
        startActivity(showL)
    }

    fun showRegister(view: android.view.View) {
        val showR = Intent(this, Registro::class.java)
        startActivity(showR)
    }


}