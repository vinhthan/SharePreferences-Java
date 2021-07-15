package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (!DataLocalManager.getFirstInstall()) {
            Toast.makeText(this, "First install app", Toast.LENGTH_SHORT).show();
            DataLocalManager.setFirstInstall(true);

        }
        String name = "name";

        DataLocalManager.setStringValue(name);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        });
    }
}