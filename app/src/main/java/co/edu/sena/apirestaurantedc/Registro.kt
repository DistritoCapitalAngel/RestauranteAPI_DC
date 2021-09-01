package co.edu.sena.apirestaurantedc

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import co.edu.sena.apirestaurantedc.data.DB

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

            //if(intent.getStringExtra("msg") == "true") {
                val i = DB(this)
                val db = i.writableDatabase

                val value = ContentValues().apply {
                    put("nombre", name.text.toString())
                    put("ciudad", ciudad.text.toString())
                    put("correo", correo.text.toString())
                    put("contraseña", clave.text.toString())
                }


                /*
                val value = ContentValues().apply {
                    put("nombre", intent.getStringExtra("name"))
                    put("ciudad", intent.getStringExtra("ciudad"))
                    put("correo", intent.getStringExtra("correo"))
                    put("contraseña", intent.getStringExtra("clave"))
                }
                */


                val insert = db?.insert("usuario", null, value)

                if (insert != null) {
                    if (insert.toInt() != -1) {
                        toast("Ya puedes entrar")
                    } else {
                        toast("Posiblemente el usuario existe ")
                    }
                }
                //toast("${name.text.toString()}${ciudad.text}${correo.text}${clave.text}")
                //toast("Puede Ingresar ${value.get("nombre")}" /*${insert}"*/)
        /*
            }else{//END IF
                val politica = Intent(this, politica::class.java).apply {
                    putExtra("name", name.text.toString())
                    putExtra("ciudad",ciudad.text.toString())
                    putExtra("correo",correo.text.toString())
                    putExtra("clave",clave.text.toString())
                }
                startActivity(politica)
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

    fun toast(t:String){
        Toast.makeText(this, t, Toast.LENGTH_SHORT).show()
    }



}
