package co.edu.sena.apirestaurantedc.data

import com.squareup.moshi.Json

data class categorias(
    val id:Int,
    val nombre:String,
    val descripcion:String,
    @Json(name="img_url") val img_url:String
)
