package co.edu.sena.apirestaurantedc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class especialidad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_especialidad)
    }

    fun continuar(view: android.view.View) {
        val home = Intent(this, categorias::class.java)
        startActivity(home)


    }
}