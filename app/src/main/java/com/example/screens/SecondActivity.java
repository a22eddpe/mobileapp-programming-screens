package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String name;

    int number;
    private TextView Textviewextra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            name = extras.getString("name");
            number = extras.getInt("number");
            Textviewextra = findViewById(R.id.textView2);
            Textviewextra.setText(name);
        }

    }
}