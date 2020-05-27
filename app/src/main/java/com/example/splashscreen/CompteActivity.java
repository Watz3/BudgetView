package com.example.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compte);

    }

    public void goBack(View view) {
        Intent intent = new Intent(CompteActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void retour(View view) {
        Intent intent = new Intent(CompteActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}

