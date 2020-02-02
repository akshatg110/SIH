package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Victim_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victim_6);
    }
    public void vyes6(View view){
        startActivity(new Intent(Victim_6.this,FinalF2.class));
    }
    public void vno6(View view){
        startActivity(new Intent(Victim_6.this,FinalF2.class));
    }
}
