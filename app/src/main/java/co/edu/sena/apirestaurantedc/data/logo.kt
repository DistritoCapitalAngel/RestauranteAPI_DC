package co.edu.sena.apirestaurantedc.data

import com.squareup.moshi.Json


data class logo (
    val respuesta : String,
    @Json(name ="img_src") val imgUrl:String
)