package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class final_f3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_f3);
    }
    public void navigate(View v){
        startActivity(new Intent(final_f3.this,maps.class));
    }
}
