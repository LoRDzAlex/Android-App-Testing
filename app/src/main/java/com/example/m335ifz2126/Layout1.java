package com.example.m335ifz2126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);


    }
    public void switchLayout2 (View v){
        startActivity(new Intent(Layout1.this, Layout2.class));
    }

    public void closeActivity(View v){
        finish();
    }
}