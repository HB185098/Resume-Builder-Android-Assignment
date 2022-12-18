package com.example.employeedata;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView name_v,date_v,gender,address_v;
    EditText e_name,e_date,e_address;
    RadioButton male,female;
    RadioGroup radioGroup;
    Button b11,b22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actb=getSupportActionBar();
        actb.setTitle("Personal Data ");

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#DF82D324"));

        // Set BackgroundDrawable
        actb.setBackgroundDrawable(colorDrawable);

         name_v = findViewById(R.id.t2);
         e_name = findViewById(R.id.t1);

         date_v = findViewById(R.id.t3);
         e_date = findViewById(R.id.t4);

         radioGroup = findViewById(R.id.rag);

         gender = findViewById(R.id.t5);
         male = findViewById(R.id.r1);
         female = findViewById(R.id.r2);

         address_v = findViewById(R.id.t6);
         e_address = findViewById(R.id.t7);

         b11 = findViewById(R.id.b1);
         b22 = findViewById(R.id.b2);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e_name.getText().toString();
                String dob = e_date.getText().toString();
                String gender1 = (male.isChecked())?"Male":"Female";
                String address = e_address.getText().toString();

                Intent intent = new Intent( MainActivity.this,Educational_Details.class);

                intent.putExtra("data","Name      : "+name+"\nDob         : "+dob+"\nGender    : "+gender1+"\n" +"Address   : "+address);
                startActivity(intent);
            }
        });

    }

    public void next(View view)
    {
        startActivity(new Intent(MainActivity.this,Educational_Details.class));

    }


}