package com.yenny.epus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signup extends AppCompatActivity implements View.OnClickListener{
    private TextView sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        sign_in = (TextView) findViewById(R.id.sign_in);
        sign_in.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.sign_in:
                Intent moveIntentlogin = new Intent(Signup.this, Login.class);
                startActivity(moveIntentlogin);
                break;
        }
    }
}
