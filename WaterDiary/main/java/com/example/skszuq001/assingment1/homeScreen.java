package com.example.skszuq001.assingment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.view.View.inflate;


public class homeScreen extends AppCompatActivity {

    String c_date;

    String stoooooore;

    //TextView txDate;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //c_date =new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());

        //set date in txt
     // txDate.setText("   "+ c_date);


        Calendar calendar=Calendar.getInstance();
        String currentDAte= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView txtDate=findViewById(R.id.txtdate);

        txtDate.setText("       "+currentDAte);

        stoooooore=txtDate.getText()+"";





    }

//move from home page to another page
    public void sendMessage(View view)
    {
        Intent intent = new Intent(homeScreen.this, mainMenu.class);
        startActivity(intent);
    }


}
