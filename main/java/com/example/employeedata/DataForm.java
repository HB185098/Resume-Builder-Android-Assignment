package com.example.employeedata;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DataForm extends AppCompatActivity {
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_form);

        ActionBar actb=getSupportActionBar();
        actb.setTitle("RESUME ");

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#DF82D324"));

        // Set BackgroundDrawable
        actb.setBackgroundDrawable(colorDrawable);

//        Intent intent = getIntent();
//        String name = intent.getStringExtra("NAME : ");
//        String dob = intent.getStringExtra("DOB : ");
//        String gender = intent.getStringExtra("GENDER : ");
//        String add = intent.getStringExtra("ADDRESS : ");
//
//        String qual = intent.getStringExtra("Qualification : ");
//        String perc = intent.getStringExtra("Percentage : ");
//        String clg = intent.getStringExtra("College : ");
//
//        String skills = intent.getStringExtra("Technical skills : ");

//        res.setText("Name    : " +name+"\nDob       : "+dob+"\nGender  : "+gender+"\n" +
//        "Address : "+add+"\nQualification    : " +qual+"\nPercentage(%)       : "+perc+"\nCollege  : "+clg+"\nTechnical skills : "+skills);

        res = findViewById(R.id.display);
        String data = getIntent().getStringExtra("data");
res.setText(data);

    }
//    public void previous(View view)
//    {
//        startActivity(new Intent(DataForm.this,TechnicalSkills.class));
//
//    }
}