package com.example.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EspaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espace);
    }

    public void goBack(View view) {
        Intent intent = new Intent(EspaceActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void retour(View view) {
        Intent intent = new Intent(EspaceActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}
