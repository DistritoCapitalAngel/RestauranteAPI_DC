package co.edu.sena.apirestaurantedc.data

import com.squareup.moshi.Json

data class especialidad(
    val nombre:String,
    val descripcion:String,
    val precio:Float,
    @Json(name="img_url")val img_url:String
)
