package co.edu.sena.apirestaurantedc.data

import com.squareup.moshi.Json

data class productos(
    val id:Int,
    val nombre:String,
    val descripcion:String,
    val precio:Int,
    @Json(name="img_url") val img_url:String
)
