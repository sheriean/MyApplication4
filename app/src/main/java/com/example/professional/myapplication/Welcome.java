package com.example.professional.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
     i=getIntent();
    String incom_pass= i.getStringExtra("password").toString();
    String incom_user= i.getStringExtra("username").toString();
     TextView final_user_name =(TextView)findViewById(R.id.final_user_txt);
     TextView final_password =(TextView)findViewById(R.id.final_pass_txt);
     final_user_name.setText(incom_user);
     final_password.setText(incom_pass);


    }
}
