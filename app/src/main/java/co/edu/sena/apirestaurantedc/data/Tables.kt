package co.edu.sena.apirestaurantedc.data

class Tables {
    object db {
        const val dbName = "restaurante.db"
        const val version = 1
    }

    object tables {
        const val usuario = "Create TABLE Usuario(" +
                "correo TEXT PRIMARY KEY UNIQUE ," +
                "nombre TEXT ," +
                "ciudad TEXT ," +
                "contraseña TEXT " +
                ")"
        const val categoria ="CREATE TABLE categoria(" +
                "nombre TEXT" +
                "descripcion TEXT" +
                "imagen TEXT" +
                ")"

        const val producto = "CREATE TABLE producto(" +
                "nombre TEXT" +
                "descripcion TEXT" +
                "precio REAL" +
                "imagen TEXT" +
                ")"
    }

    object  drop {
        const val usuario = "DROP TABLE IF EXISTS Usuario"
    }

}