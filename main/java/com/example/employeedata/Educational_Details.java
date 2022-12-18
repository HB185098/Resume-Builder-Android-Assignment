package com.example.employeedata;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Educational_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_details);
        ActionBar actb=getSupportActionBar();
        actb.setTitle("Education Details ");

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#DF82D324"));

        // Set BackgroundDrawable
        actb.setBackgroundDrawable(colorDrawable);

        TextView qua_v = findViewById(R.id.t1);
        CheckBox btech = findViewById(R.id.c1);
        CheckBox mtech = findViewById(R.id.c2);
        CheckBox mba = findViewById(R.id.c5);
        CheckBox bmtech = findViewById(R.id.c3);
        CheckBox bmba = findViewById(R.id.c4);

        TextView per_v = findViewById(R.id.t2);
        EditText e_per = findViewById(R.id.t3);

        TextView clg_v = findViewById(R.id.t4);
        EditText e_clg = findViewById(R.id.t5);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        String data = getIntent().getStringExtra("data");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] arr = new String[5];
                if(btech.isChecked())arr[0]="B.Tech";
                if(mtech.isChecked())arr[1]="M.Tech";
                if(mba.isChecked())arr[2]="MBA";
                if(bmtech.isChecked())arr[3]="B.Tech+M.Tech";
                if(bmba.isChecked())arr[4]="B.Tech+MBA";
                String qual="";

                for(int i=0;i<5;i++)
                {
                    if(arr[i] != null && qual.equals(""))qual=arr[i];
                    else if(arr[i] != null)qual+=", "+arr[i];
                }
                String perc = e_per.getText().toString();
                String clg = e_clg.getText().toString();

                Intent intent = new Intent( Educational_Details.this,TechnicalSkills.class);
                intent.putExtra("data",data+"\nQualification    : " +qual+"\nPercentage(%)       : "+perc+"\nCollege  : "+clg);
                startActivity(intent);
            }
        });}
        public void previous(View view)
        {
            startActivity(new Intent(Educational_Details.this,MainActivity.class));

        }
    public void next(View view)
    {
        startActivity(new Intent(Educational_Details.this,TechnicalSkills.class));

    }

}