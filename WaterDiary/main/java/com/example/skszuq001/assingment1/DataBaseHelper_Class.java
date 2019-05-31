package com.example.skszuq001.assingment1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper_Class extends SQLiteOpenHelper{

    public static final String DataBase_Name="wtr_C.db";
    public static final String TableName="water_consumption_Table";

    public static final String col1="ID";
    public static final String col2="Date";
    public static final String col3="Category";
    public static final String col4="Litres";





    public DataBaseHelper_Class(Context context) {
        super(context, DataBase_Name , null, 1);
       //
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table water_consumption_Table(ID INTEGER PRIMARY KEY AUTOINCREMENT, Date TEXT , Category TEXT, Litres INTEGER )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+ TableName);
        onCreate(db);

    }

    public boolean insertData(String datee, String categoryy, String litress){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();

        contentValues.put(col2,datee);
        contentValues.put(col3,categoryy);
        contentValues.put(col4,litress);

        long result= db.insert(TableName,null,contentValues);

        if(result==-1){
            return false;
        }else{

            return true;
        }

    }


    public Cursor getAll(){
        SQLiteDatabase db=this.getWritableDatabase();
        //Cursor result=db.rawQuery("select * from "+TableName +" where Category ='Dishes' ",null);
       return db.rawQuery("select * from "+TableName, null);


    }

    public Cursor getDishes(){
        SQLiteDatabase db=this.getWritableDatabase();
        return  db.rawQuery("select ID, Date , Category, Litres from water_consumption_Table WHERE Category ='Dishes'",null);

    }

    public Cursor getLaundry(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from "+TableName +" where Category like Laundry ",null);
        return result;
    }

    public Cursor getCooking(){
        SQLiteDatabase db=this.getWritableDatabase();
        return  db.rawQuery("select ID, Date , Category, Litres from water_consumption_Table WHERE Category ='Cooking'",null);

    }

    public Cursor getCleaning(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from "+TableName +" where Category = 'Cleaning' ",null);
        return result;
    }

    public Cursor getHygiene(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from "+TableName +" where Category like Hygiene ",null);
        return result;
    }

    public Cursor getShower(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from "+TableName +" where Category like Shower ",null);
        return result;
    }

    public Cursor getDrinking(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from "+TableName +" where Category like Drinking ",null);
        return result;
    }

    public Cursor getToilet(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor result=db.rawQuery("select * from "+TableName +" where Category like Toilet ",null);
        return result;
    }

}
