package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    //private EditText outputUser;
    //private EditText outputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //String outputUser = getIntent().getExtras().getString("username");
        //String outputPass = getIntent().getExtras().getString("password");
    }

    public void click(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.lupa:
                intent = new Intent(LoginActivity.this, PulihkanActivity.class);
                break;
            case R.id.loginlogin:
                intent = new Intent(LoginActivity.this, ProfilePicActivity.class);
                break;
            case R.id.belum:
                intent = new Intent(LoginActivity.this, RegisterActivity.class);
                break;
        }
        startActivity(intent);
    }
}