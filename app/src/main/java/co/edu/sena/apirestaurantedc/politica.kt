package co.edu.sena.apirestaurantedc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class politica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politica)
    }

    fun rechazado(view: android.view.View) {
        val redirect = Intent(this, Registro::class.java).apply {
            putExtra("msg", "false")
        }
        startActivity(redirect)
    }

    fun aceptado(view: android.view.View) {
        val aceptado = Intent(this, Registro::class.java).apply {
            putExtra("msg", "true")
            /*
            putExtra("name", intent.getStringExtra("name"))
            putExtra("ciudad",intent.getStringExtra("ciudad"))
            putExtra("correo",intent.getStringExtra("correo"))
            putExtra("clave",intent.getStringExtra("clave"))
            */

        }
        startActivity(aceptado)
    }
}