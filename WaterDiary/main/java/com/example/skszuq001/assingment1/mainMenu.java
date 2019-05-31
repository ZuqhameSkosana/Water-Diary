package com.example.skszuq001.assingment1;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

public class mainMenu extends AppCompatActivity {

    Button btnC, btnB;
    static mainMenu instances;

    GridLayout mainGrid;
    //int k;
    int j;
    int p;
    int fin;

    int count2;

    //db
    DataBaseHelper_Class mydb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        instances = new mainMenu();


        setContentView(R.layout.activity_main_menu);

        btnB = (Button) findViewById(R.id.btnBack);
        btnC = (Button) findViewById(R.id.btnCalc);

        mainGrid = (GridLayout) findViewById(R.id.main_Grid);

        setSingleEvent(mainGrid);


        //database
        mydb = new DataBaseHelper_Class(this);


    }

    private void setSingleEvent(GridLayout mainGrid) {

        for (int i = 0; i < mainGrid.getChildCount(); i++) {

            CardView c_view = (CardView) mainGrid.getChildAt(i);
            count2++;

            final int finalI = i;
            j = i;
            c_view.setOnClickListener(new View.OnClickListener() {
                @Override

                //write code to go to another screen here and display information in that screen;
                public void onClick(View view) {
                    //onClick
                    //replace Toast with start new activity code
                    fin = finalI;
                    //
                    Toast.makeText(mainMenu.this, "Clicked " + fin, Toast.LENGTH_SHORT).show();
                    //public void sendMessage View view)
                    // {
                    //Intent intent = new Intent(mainMenu.this, display_screen.class);
                    //startActivity(intent);

                    //code to display infromation depending on index selected


                    if (finalI == 0) {
                        p = finalI;

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.putExtra("var_name", 0);
                        startActivity(intent);


                        //Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        //remove below
                        // intent.putExtra("MY_KEY", 15);

                        //remove above
                        //Intent intent = new Intent(this, MainActivity.class);

                        //startActivity(intent);


                        //startActivity(i);



                        /*

                        Cursor r =mydb.getAll();

                        if(r.getCount()==0){
                            //show message

                            showMessage("Error ", "No data Found");

                            return;

                        }

                        StringBuffer buffer=new StringBuffer();

                        while (r.moveToNext()){
                            buffer.append("ID :"+ r.getString(0));
                            buffer.append("Date :"+ r.getString(1));
                            buffer.append("Category :"+ r.getString(2));
                            buffer.append("Litres :"+ r.getString(3));

                        }

                        //show all data
                        showMessage("Data", buffer.toString());










                      */


                    } else if (finalI == 1) {
                        p = finalI;

                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        //mydb.getCooking();

                    } else if (finalI == 2) {
                        p = finalI;
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        //mydb.getDishes();


                    } else if (finalI == 3) {
                        p = finalI;
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        // mydb.getDrinking();


                    } else if (finalI == 4) {
                        p = finalI;
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        //mydb.getHygiene();


                    } else if (finalI == 5) {
                        p = finalI;
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        //mydb.getLaundry();


                    } else if (finalI == 6) {
                        p = finalI;
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        //mydb.getShower();


                    } else if (finalI == 7) {
                        p = finalI;
                        Intent intent = new Intent(mainMenu.this, MainActivity.class);
                        startActivity(intent);
                        //mydb.getToilet();


                    }


                    // }
                    // fin=finalI;

                }
            });

            //fin=p;
        }


    }


    public void showMessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }


    public void sendMessage(View view) {
        //Intent intent = new Intent(mainMenu.this, homeScreen.class);
        //startActivity(intent);

        if (view.getId() == R.id.btnBack) {

            Intent intent = new Intent(mainMenu.this, homeScreen.class);
            startActivity(intent);

        } else if (view.getId() == R.id.btnCalc) {

            Intent intent = new Intent(mainMenu.this, capture_data.class);
            startActivity(intent);

        }

    }
}




