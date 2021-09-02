package co.edu.sena.apirestaurantedc.data

import androidx.lifecycle.ViewModel
import co.edu.sena.apirestaurantedc.especialidad
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

    //URL
    private val Url = "wsc.fabricasoftware.co/api"
    //MOSHI
    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    //RETROFIT
    private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(Url)
    .build()

    interface API {

        //get logo
        @GET("logo/1")
        fun getLogo(): Call<List<logo>>

        //set costumer
        @POST("clientes?nombre={nombre}&ciudad={ciudad}&correo={correo}&contrasena={contaseña}")
        fun setInsertCliente(@Path("nombre")nombre:String, @Path("ciudad")ciudad:String,@Path("correo") correo:String, @Path("contraseña")contraseña:String):Call<clientes>

        //get costomer to login
        @GET("clientes?correo={correo}&contrasena={contraseña}")
        fun getCliente(@Path("correo") correo:String, @Path("contraseña") contraseña: String):Call<List<clientes>>

        //{categorias}
        @GET("categorias")
        fun getCategorias():Call<List<categorias>>

        //categoria - singular
        @GET("categorias/{categoria}")
        fun getCategoria(@Path("categoria") categoria:String):Call<List<categorias>>

        //Get productos
        @GET("producto/{producto}")
        fun getProducto(@Path("producto")producto:String):Call<List<productos>>

        //get pedidos
        @GET("pedidos/{pedido}")
        fun getPedidos(@Path("pedido")pedido:String):Call<List<pedidos>>

        //set pedidos
        @POST("pedidos?id_cliente={idCliente}&json_pedido=" +
                "{" +
                "id_producto={idProducto}&" +
                "cantidad={cantidad}&" +
                "precio={precio}" +
                "}" +
                "&total={total}")
        fun setInsertPedido(@Path("idCliente")idCliente:Int,
                            @Path("json_pedido")json:String,
                            @Path("idProducto")producto:String,
                            @Path("cantiad")cantidad:Int,
                            @Path("precio")precio:Float,
                            @Path("total")total:Float
                            ):Call<List<pedidos>>

        //get especialidad
        @GET("especialidad")
        fun getEspecialidad():Call<List<especialidad>>

        //get politicas
        @GET("politicas?ver")
        fun getPoliticas():Call<List<politicas>>

    }//end interface

    object APIService{
        val service:API by lazy {
            retrofit.create(API::class.java)
        }
    }

