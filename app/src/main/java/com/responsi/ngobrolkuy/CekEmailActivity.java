package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class CekEmailActivity extends AppCompatActivity {
    private ImageButton back;
    private TextView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_email);
        back = findViewById(R.id.backcekemail);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(CekEmailActivity.this, PulihkanActivity.class);
                startActivity(back);
            }
        });
        kembali = findViewById(R.id.kembalicek);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(CekEmailActivity.this, PulihkanActivity.class);
                startActivity(kembali);
            }
        });
    }
}