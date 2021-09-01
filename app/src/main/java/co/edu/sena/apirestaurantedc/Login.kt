package co.edu.sena.apirestaurantedc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import co.edu.sena.apirestaurantedc.data.DB

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

        /*
        if(Ccorreo != "" && Cclave != ""){
            val especialidad = Intent(this, especialidad::class.java).apply {
                putExtra("nombre", name.text.toString())
                putExtra("session", "activo")
            }
            startActivity(especialidad)
        }
        */


        btnL.setOnClickListener{

            /*
            if(check.isChecked){
                Ccorreo = name.text.toString()
                Cclave = clave.text.toString()

            }else{
            */
                val i = DB(this)
                val db = i.writableDatabase

                val consultar = db?.query(
                    "Usuario", arrayOf("correo", "nombre", "ciudad", "contraseña"),"correo = ? AND contraseña = ?",
                    arrayOf(name.text.toString(), clave.text.toString()),null, null,null
                )

                /*
                if (consultar != null) {

                    while (consultar.moveToNext()) {

                    }
                }
                 */

                //Toast.makeText(this, "${name.text.toString()} ${clave.text.toString()}", Toast.LENGTH_SHORT).show()
                if (consultar != null) {
                    if (consultar.moveToNext()) {

                        val especialidad = Intent(this, especialidad::class.java).apply {
                            putExtra("nombre", name.text.toString())
                            putExtra("session", "activo")
                        }
                        startActivity(especialidad)

                        //Toast.makeText(this, "Bienvenido ${consultar.getString(1)}", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "Correo o Contraseña Incorrectos", Toast.LENGTH_SHORT).show()
                    }
                }
            //}
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