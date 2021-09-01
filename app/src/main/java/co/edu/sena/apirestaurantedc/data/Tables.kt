package co.edu.sena.apirestaurantedc.data

class Tables {
    object db {
        const val dbName = "restaurante.db"
        const val version = 1
    }

    object tables {
        const val usuario = "Create TABLE Usuario(" +
                "nombre TEXT ," +
                "ciudad TEXT ," +
                "correo TEXT ," +
                "contraseña TEXT " +
                ")"
    }

    object  drop {
        const val usuario = "DROP TABLE IF EXISTS Usuario"
    }

}