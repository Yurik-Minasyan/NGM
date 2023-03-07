package com.example.emenu2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Boxoqner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boxoqner);
    }
    EditText ed = findViewById(R.id.editName);
    TextView tv = findViewById(R.id.text);
    public void boxoq(View view){
        String tx = String.valueOf(ed.getText());
        tv.setText(tx);
    }
}