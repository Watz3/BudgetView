package com.example.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InscriptionActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btn = findViewById(R.id.boutoncreation);
    }

    public void gotoNext(View view) {

        Intent dsp = new Intent(InscriptionActivity.this,LoginActivity.class);
        startActivity(dsp);
    }


    public void goBack(View view) {

        Intent ico = new Intent(InscriptionActivity.this, LoginActivity.class);
        startActivity(ico);
    }
}
