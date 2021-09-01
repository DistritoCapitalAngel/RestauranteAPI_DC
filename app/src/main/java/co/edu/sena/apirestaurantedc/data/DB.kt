package co.edu.sena.apirestaurantedc.data

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.os.Parcel
import android.os.Parcelable
import android.database.sqlite.SQLiteOpenHelper

class DB(context: Context) : SQLiteOpenHelper(
    context, Tables.db.dbName, null,Tables.db.version
) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(Tables.tables.usuario)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL(Tables.drop.usuario)
        onCreate(db)
    }

}