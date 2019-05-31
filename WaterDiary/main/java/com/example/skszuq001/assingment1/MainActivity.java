package com.example.skszuq001.assingment1;

import android.app.Application;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    DataBaseHelper_Class helper;
    mainMenu main_menu;

   // int value=0;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper=new DataBaseHelper_Class(this);

        main_menu=new mainMenu();




    }

    public void SaveData(View view){



       Cursor cs=helper.getAll();

        if(cs.getCount()==0){
            showMessage("Error", "Data not found");
            return;

        }


        StringBuffer buffer=new StringBuffer();
       // EditText edit=findViewById(R.id.ml_T);
           //edit.setText("   number"+"\n");


           //edit.setText("Date                 "+" "+"Category"+"   "+"Litres");
  /*
        while (cs.moveToNext()){

            String Date=cs.getString(1)+"  |";
            String Categ=cs.getString(2)+"  |";
            String Lit=cs.getString(3)+" L  \n\n";

           edit.append(Date+Categ+Lit);

        }

*/





        while (cs.moveToNext()){
           // buffer.append("ID :"+cs.getString(0)+"\n");
            buffer.append("Date :"+cs.getString(1)+"\n");
            buffer.append("Category :"+cs.getString(2)+"\n");
            buffer.append("Litres :"+cs.getString(3)+"\n\n");

        }
        showMessage(" Water usage Display ", buffer.toString());





    }



    public void showMessage(String title, String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }



}
