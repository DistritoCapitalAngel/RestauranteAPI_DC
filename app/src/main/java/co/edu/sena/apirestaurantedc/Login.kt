package co.edu.sena.apirestaurantedc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import co.edu.sena.apirestaurantedc.data.DB

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val name = findViewById<EditText>(R.id.Lname)
        val clave = findViewById<EditText>(R.id.Lclave)

        val btnL = findViewById<Button>(R.id.btnLogin)

        btnL.setOnClickListener{
            /*
            Toast.makeText(this, "${name.text.toString()} ${clave.text.toString()}", Toast.LENGTH_SHORT).show()

            val i = DB(this)
            val db = i.writableDatabase
            val consultar = db.rawQuery("select id from Usuario where nombre = ${name.text.toString()}",null,null)
            while (consultar.moveToNext()){
                clave.text = consultar.getString(1).toString()
            }
            */

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