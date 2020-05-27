package com.example.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goBack(View view) {
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void gotoespace(View view) {
        Intent esp = new Intent(HomeActivity.this,EspaceActivity.class);
        startActivity(esp);
    }

    public void gotoaccount(View view) {
        Intent acc = new Intent(HomeActivity.this, CompteActivity.class);
        startActivity((acc));
    }

    public void gotodecouvrir(View view) {
        Intent dec = new Intent(HomeActivity.this, DecouvrirActivity.class);
        startActivity((dec));
    }

    public void gotodepense(View view) {
        Intent dep = new Intent(HomeActivity.this, DepenseActivity.class);
        startActivity((dep));
    }

}
