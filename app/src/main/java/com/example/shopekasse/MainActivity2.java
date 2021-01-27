package com.example.shopekasse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.t1);
        tv2=findViewById(R.id.t2);
    }
    public void Nclicked(View v){
        startActivity(new Intent(MainActivity2.this,MainActivity3.class));
        finish();
    }
    public void Sclicked(View v){
        startActivity(new Intent(MainActivity2.this,MainActivity4.class));
        finish();
    }
}