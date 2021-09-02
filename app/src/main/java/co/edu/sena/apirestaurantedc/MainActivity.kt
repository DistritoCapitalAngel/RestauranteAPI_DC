package co.edu.sena.apirestaurantedc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import co.edu.sena.apirestaurantedc.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun login(view: android.view.View) {
        val showL = Intent(this, Login::class.java)
        startActivity(showL)
    }
}
