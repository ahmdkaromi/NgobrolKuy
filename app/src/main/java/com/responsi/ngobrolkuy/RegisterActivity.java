package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    //private EditText inputUser;
    //private EditText inputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void click(View v) {
        //inputUser = findViewById(R.id.usernameRegister);
        //inputPass = findViewById(R.id.passwordRegister);
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.registerregister:
                intent = new Intent(this, LoginActivity.class);
                //intent.putExtra("username",inputUser.getText().toString());
                //intent.putExtra("password",inputPass.getText().toString());
                break;
            case R.id.sudahregister:
                intent = new Intent(this, LoginActivity.class);
                break;
        }
        startActivity(intent);
}
}