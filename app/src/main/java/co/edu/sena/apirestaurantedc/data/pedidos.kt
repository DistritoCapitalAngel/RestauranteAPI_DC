package co.edu.sena.apirestaurantedc.data

import com.squareup.moshi.Json

data class pedidos(
    val id:Int,
    val id_cliente:Int,
    @Json(name="json_pedido")val json_pedido: Int,
    val total:Float,
)
