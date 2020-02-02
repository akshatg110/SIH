package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;

import java.util.ArrayList;
import java.util.Locale;

public class fire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }
    public void yes1(View view){
        startActivity(new Intent(fire.this,Screen2f.class));
    }
    public void no1(View view){
        startActivity(new Intent(fire.this,Screen5.class));
    }
    public void speak(View v) {
        if (v.getId() == R.id.spk)
            promtSpeachInput();
    }

    public void promtSpeachInput() {
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say Something");
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                startActivityForResult(i,100);
            }
        }
        catch (ActivityNotFoundException a){

        }
    }
    public void onActivityResult(int request_code,int result_code,Intent i) {
        super.onActivityResult(request_code, result_code, i);
        switch(request_code){
            case 100: if(result_code==RESULT_OK&&i!=null){
                ArrayList<String> result =i.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                // Toast.makeText(this, ""+result.get(0), Toast.LENGTH_SHORT).show();
                if(result.get(0).equals("yes"))
                    startActivity(new Intent(fire.this, Screen2f.class));
                if(result.get(0).equals("no"))
                    startActivity(new Intent(fire.this, Screen5.class));
            }
                break;
        }
    }
}
