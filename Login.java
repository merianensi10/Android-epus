package com.yenny.epus;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity implements View.OnClickListener{
    private Button btnLogin;
    private TextView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
        signup = (TextView) findViewById(R.id.signup);
        signup.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnLogin:
                Intent moveIntentlogin = new Intent(Login.this, MainActivity.class);
                startActivity(moveIntentlogin);
                break;
            case R.id.signup:
                Intent moveIntentsignup = new Intent(Login.this, Signup.class);
                startActivity(moveIntentsignup);
                break;
        }
    }
}