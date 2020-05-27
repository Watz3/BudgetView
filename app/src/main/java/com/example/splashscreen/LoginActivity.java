package com.example.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    ImageView icone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        icone = findViewById(R.id.GoBackIcon);
    }

    public void goBack(View view) {

        Intent ico = new Intent(LoginActivity.this, InscriptionActivity.class);
        startActivity(ico);
    }

    public void gotoInscription(View view) {
        Intent dsp = new Intent(LoginActivity.this,InscriptionActivity.class);
        startActivity(dsp);
    }

    public void gotoAccueil(View view) {
        Intent acc = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(acc);
    }
}
