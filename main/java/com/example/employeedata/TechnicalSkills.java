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
import android.widget.TextView;

public class TechnicalSkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_skills);
        ActionBar actb=getSupportActionBar();
        actb.setTitle("Technical Skills ");

        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#DF82D324"));

        // Set BackgroundDrawable
        actb.setBackgroundDrawable(colorDrawable);

        TextView skills_v = findViewById(R.id.t1);
        EditText e_skills = findViewById(R.id.t2);

        CheckBox java = findViewById(R.id.c1);
        CheckBox csharp = findViewById(R.id.c2);
        CheckBox sql = findViewById(R.id.c5);
        CheckBox react = findViewById(R.id.c3);
        CheckBox dotnet = findViewById(R.id.c4);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        String data = getIntent().getStringExtra("data");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String skills = e_skills.getText().toString();

                String[] arr = new String[5];
                if(java.isChecked())arr[0]="Java";
                if(csharp.isChecked())arr[1]="C#";
                if(sql.isChecked())arr[2]="SQL";
                if(react.isChecked())arr[3]="React";
                if(dotnet.isChecked())arr[4]=".net";
                String skill="";

                for(int i=0;i<5;i++)
                {
                    if(arr[i] != null && skill.equals(""))skill=arr[i];
                    else if(arr[i] != null)skill+=", "+arr[i];
                }

                Intent intent = new Intent( TechnicalSkills.this,DataForm.class);
                intent.putExtra("data",data+"\nTechnical skills :"+skill+", "+skills);
                startActivity(intent);
            }
        });

    }
    public void previous(View view)
    {
        startActivity(new Intent(TechnicalSkills.this,Educational_Details.class));

    }
    public void next(View view)
    {
        startActivity(new Intent(TechnicalSkills.this,DataForm.class));

    }


}