package com.komputerkit.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
    }

    public void load() {
        tvHasil = findViewById(R.id.tvHasil);
    }

    public void buttonUp(View view) {
        count++;
        tvHasil.setText(String.format("%d", count));
    }

    public void buttonDown(View view) {
        count--;
        tvHasil.setText(String.format("%d", count));
    }
}