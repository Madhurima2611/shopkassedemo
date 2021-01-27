package com.example.shopekasse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t2=findViewById(R.id.t02);
    }
    public void Gclicked(View v) {
        startActivity(new Intent(MainActivity3.this, MainActivity4.class));
        finish();
    }
}