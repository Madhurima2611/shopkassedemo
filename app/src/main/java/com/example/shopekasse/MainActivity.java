package com.example.shopekasse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);
    }
    public void Nclicked(View v){
        startActivity(new Intent(MainActivity.this,MainActivity2.class));
        finish();
    }
    public void Sclicked(View v){
        startActivity(new Intent(MainActivity.this,MainActivity4.class));
        finish();
    }
}