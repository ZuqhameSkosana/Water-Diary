package com.example.skszuq001.assingment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;


public class capture_data extends AppCompatActivity {

    TextView txV;
    TextView txVi;
    TextView txVii;
    TextView txViii;
    TextView txViv;
    TextView txVv;
    TextView txVvi;
    TextView txVvii;



    EditText first_no;
    EditText second_no;
    EditText third_no;
    EditText forth_no;
    EditText fifth_no;
    EditText sixth_no;
    EditText seventh_no;
    EditText eight_no;
    double sum=0;
    TextView total;

    Button btnAdd;

    double num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8;

    //String store_date="";

   DataBaseHelper_Class mydb;
   homeScreen home;



    Calendar calendar=Calendar.getInstance();
    String store_date= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());



    //TextView txtDate=findViewById(R.id.txtdate);

       // txtDate.setText("       "+currentDAte);

  //  stoooooore=txtDate.getText()+"";


/*
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putDouble("dishes", num_1);
        savedInstanceState.putDouble("Laundry", num_2);

        savedInstanceState.putDouble("cooking", num_3);
        savedInstanceState.putDouble("cleaning", num_4);
        savedInstanceState.putDouble("Hygiene", num_5);
        savedInstanceState.putDouble("shower", num_6);
        savedInstanceState.putDouble("drinking", num_7);
        savedInstanceState.putDouble("Toilet", num_8);

       // savedInstanceState.putInt("MyInt", 1);
        //savedInstanceState.putString("MyString", "Welcome back to Android");
        // etc.
    }
*/
/*

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        int myInt=savedInstanceState.getInt("dishes");
        int myInt2=savedInstanceState.getInt("Laundry");
        int myInt3=savedInstanceState.getInt("cooking");
        int myInt4=savedInstanceState.getInt("cleaning");
        int myInt5=savedInstanceState.getInt("Hygiene");
        int myInt6=savedInstanceState.getInt("shower");
        int myInt7=savedInstanceState.getInt("drinking");
        int myInt8=savedInstanceState.getInt("Toilet");

        //boolean myBoolean = savedInstanceState.getBoolean("MyBoolean");
       // double myDouble = savedInstanceState.getDouble("myDouble");
       // int myInt = savedInstanceState.getInt("MyInt");
       // String myString = savedInstanceState.getString("MyString");
    }


*/





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_data);









        first_no=(EditText)findViewById(R.id.tx_dishes);




        second_no=(EditText)findViewById(R.id.editText12);
        third_no=(EditText)findViewById(R.id.tx_cooking);
        forth_no=(EditText)findViewById(R.id.tx_clean);
        fifth_no=(EditText)findViewById(R.id.tx_hygien);
        sixth_no=(EditText)findViewById(R.id.tx_shower);
        seventh_no=(EditText)findViewById(R.id.tx_drink);
        eight_no=(EditText)findViewById(R.id.tx_dishes);



        total=(TextView)findViewById(R.id.tx_total);
        btnAdd=(Button)findViewById(R.id.btn_add);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num_1=Double.parseDouble(first_no.getText()+"");
                num_2=Double.parseDouble(second_no.getText()+"");
                num_3=Double.parseDouble(third_no.getText()+"");
                num_4=Double.parseDouble(forth_no.getText()+"");
                num_5=Double.parseDouble(fifth_no.getText()+"");
                num_6=Double.parseDouble(sixth_no.getText()+"");
                num_7=Double.parseDouble(seventh_no.getText()+"");
                num_8=Double.parseDouble(eight_no.getText()+"");

                sum= num_1 + num_2 + num_3 + num_4+ num_5 + num_6 + num_7 + num_8;

                total.setText(Double.toString(sum)+" "+"L");


                AddData();


            }
        });

        //database ----------------------------------------------------------------------



        mydb =new DataBaseHelper_Class(this);



        txV=(TextView)findViewById(R.id.txtV1);
        txVi=(TextView)findViewById(R.id.txtV2);
        txVii=(TextView)findViewById(R.id.txtV_cooking);
        txViii=(TextView)findViewById(R.id.txt_cleaning);
        txViv=(TextView)findViewById(R.id.txtV_Hygien);
        txVv=(TextView)findViewById(R.id.txtV_shower);
        txVvi=(TextView)findViewById(R.id.txtV_Drinking);
        txVvii=(TextView)findViewById(R.id.txt_toilet10);



        /*
        first_no=(EditText)findViewById(R.id.tx_dishes);
        second_no=(EditText)findViewById(R.id.editText12);
        third_no=(EditText)findViewById(R.id.tx_cooking);
        forth_no=(EditText)findViewById(R.id.tx_clean);
        fifth_no=(EditText)findViewById(R.id.tx_hygien);
        sixth_no=(EditText)findViewById(R.id.tx_shower);
        seventh_no=(EditText)findViewById(R.id.tx_drink);
        eight_no=(EditText)findViewById(R.id.tx_dishes);

        btnAdd=(Button)findViewById(R.id.btn_add);

        store_date=home.stoooooore;

        */


       // AddData();



        //----------------------------------------------------------------------------------------
       // AddData();

/*
        if(savedInstanceState !=null){
            num_1=savedInstanceState.getInt("dishes");
            num_2=savedInstanceState.getInt("Laundry");
            num_3=savedInstanceState.getInt("cooking");
            num_4=savedInstanceState.getInt("cleaning");
            num_5=savedInstanceState.getInt("Hygiene");
            num_6=savedInstanceState.getInt("shower");
            num_7=savedInstanceState.getInt("drinking");
            num_8=savedInstanceState.getInt("Toilet");

        }else{
            num_1=1;
            num_2=0;
            num_3=0;
            num_4=0;
            num_5=0;
            num_6=0;
            num_7=0;
            num_8=0;



        }
*/

    }


    public void AddData(){
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // mydb.insertData(store_date,txV.getText().toString(),first_no.getText().toString());
                boolean k=mydb.insertData(store_date,txV.getText().toString(),first_no.getText().toString());

                if(k){

                    Toast.makeText(capture_data.this,"Data inserted",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(capture_data.this,"Data not inserted",Toast.LENGTH_SHORT).show();

                }

                mydb.insertData(store_date,txVi.getText().toString(),second_no.getText().toString());
                mydb.insertData(store_date,txVii.getText().toString(),third_no.getText().toString());
                mydb.insertData(store_date,txViii.getText().toString(),forth_no.getText().toString());
                mydb.insertData(store_date,txViv.getText().toString(),fifth_no.getText().toString());
                mydb.insertData(store_date,txVv.getText().toString(),sixth_no.getText().toString());
                mydb.insertData(store_date,txVvi.getText().toString(),seventh_no.getText().toString());
                mydb.insertData(store_date,txVvii.getText().toString(),eight_no.getText().toString());



            }
        });
    }




    public void sendMessage(View view)
    {
        Intent intent = new Intent(capture_data.this, mainMenu.class);
        startActivity(intent);
    }
}
