package com.example.emenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void menu(View view){
        Intent i = new Intent(MainActivity.this, MainMenu.class);
        startActivity(i);
    }

}