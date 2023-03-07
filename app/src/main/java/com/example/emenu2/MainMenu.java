package com.example.emenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void box(View view){
        Intent i = new Intent(MainMenu.this, Boxoqner.class);
        startActivity(i);
    }
    public void lang(View view){
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener) this);
        popup.inflate(R.menu.language);
        popup.show();
    }
}