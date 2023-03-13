package com.example.m335ifz2126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Layout2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);
    }

    public void switchLayout3 (View v){
        startActivity(new Intent(Layout2.this, Layout3.class));
    }
}