package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PulihkanActivity extends AppCompatActivity {
private ImageButton back;
private TextView submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulihkan);
        back = findViewById(R.id.backpulihkan);
        submit = findViewById(R.id.submitpulihkan);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(PulihkanActivity.this,
                        LoginActivity.class);
                startActivity(back);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submit = new Intent(PulihkanActivity.this, CekEmailActivity.class);
                startActivity(submit);
            }
        });
    }
}