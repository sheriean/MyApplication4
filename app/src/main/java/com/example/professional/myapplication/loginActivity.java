package com.example.professional.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     final   EditText  user_name = (EditText) findViewById(R.id.edit_name);
     final EditText  pasword = (EditText) findViewById(R.id.edit_pass);
        Button login = (Button) findViewById(R.id.logn_btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;

                TextView error_view = (TextView)findViewById(R.id.error);
                String u_n = user_name.getText().toString();
                String p_w = pasword.getText().toString();


                if (u_n.equals("") || p_w.equals(""))
                    error_view.setText("must in user name&password");
                else if (p_w.length() < 8)
                    error_view.setText  ("enter 8 digits password" );
                else if (p_w.length()>8)
                    error_view.setText  ("wrong  password" );
                else {
                  i = new Intent(loginActivity.this, Welcome.class);
                    i.putExtra("username", u_n);
                    i.putExtra("password",p_w);
                loginActivity.this.startActivity(i);
                }
            }

        });
    }



}
