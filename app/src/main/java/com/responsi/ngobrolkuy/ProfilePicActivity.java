package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilePicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
    }

    public void click(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.lanjut:
                intent = new Intent(ProfilePicActivity.this, ChatActivity.class);
                break;
            case R.id.lewati:
                intent = new Intent(ProfilePicActivity.this, ChatActivity.class);
                break;
        }
        startActivity(intent);
    }
}