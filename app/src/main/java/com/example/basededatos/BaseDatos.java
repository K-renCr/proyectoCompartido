package com.example.basededatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatos extends SQLiteOpenHelper {
    public static final String bd="pasteleria";
    public static final  int version=1;
    String tablaReceta="CREATE TABLE Receta(id INTEGER PRIMARY KEY, nombre TEXT,ingredientes TEXT,descripcion TEXT,notas TEXT,costoreceta REAL)";
    String tablaProductos="CREATE TABLE Productos(id INTEGER PRIMARY KEY, nombre TEXT,marca TEXT,tienda TEXT,cantidad REAL,umedida TEXT,precio REAL,fechaingreso TEXT)";

    public BaseDatos(Context context) {
        super(context,bd, null, version);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(tablaReceta);
        db.execSQL(tablaProductos);
        onCreate(db);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tablaReceta);
        db.execSQL(tablaProductos);
    }


}
