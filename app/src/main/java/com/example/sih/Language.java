package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
    }
    public void hindi(View v){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("lan",1);
        startActivity(intent);
    }
    public void english(View v){
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("lan",2);
        startActivity(intent);
    }
}
