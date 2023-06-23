package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class basket extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

       // getSupportActionBar().hide();

    }

    public void go_to_map(View view) {
        Intent intent = new Intent(this, map.class);
        startActivity(intent);
    }
}