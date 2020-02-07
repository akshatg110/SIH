package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class weight extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        et = (EditText) findViewById(R.id.weight);



    }
    public void okk(View v){
        String wt = et.getText().toString();
        int age = Integer.parseInt(wt);
        Intent intent = getIntent();

        int hr = Integer.parseInt(intent.getStringExtra("hr"));
        int rr = Integer.parseInt(intent.getStringExtra("rr"));

        if (age < 3 && hr > 180 && rr > 50) {
            startActivity(new Intent(weight.this, final_f3.class));
        }
        else if (age >=3&&age<5 && hr > 160 && rr > 40) {
            startActivity(new Intent(weight.this, final_f3.class));
        }
        else if (age >=5&&age<8 && hr > 140 && rr > 30) {
            startActivity(new Intent(weight.this, final_f3.class));
        }
        else if (age < 8&& hr > 100 && rr > 20) {
            startActivity(new Intent(weight.this, final_f3.class));
        }
        else{
            startActivity(new Intent(weight.this,FinalF2.class));
        }
    }
}
