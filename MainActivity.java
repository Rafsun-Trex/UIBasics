package com.example.ui3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox chkhot, chkcold, chknrml;
    public int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkhot = findViewById(R.id.hot);
        chkcold = findViewById(R.id.cold);
        chknrml = findViewById(R.id.nrml);
        n = 0;
        chkhot.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    n++;
                    Toast.makeText(MainActivity.this, "You selected Hot", Toast.LENGTH_SHORT).show();
                }
                else {
                    n--;
                    Toast.makeText(MainActivity.this, "Continue...", Toast.LENGTH_SHORT).show();
                }
            }

        });
        chkcold.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    n++;
                    Toast.makeText(MainActivity.this, "You selected Cold", Toast.LENGTH_SHORT).show();
                }
                else {
                    n--;
                    Toast.makeText(MainActivity.this, "Continue...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        chknrml.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    n++;
                    Toast.makeText(MainActivity.this, "You selected Normal", Toast.LENGTH_SHORT).show();
                }
                else {
                    n--;
                    Toast.makeText(MainActivity.this, "Continue...", Toast.LENGTH_SHORT).show();
                }
            }
        });
        if (n==3)
            Toast.makeText(MainActivity.this, "You Selected All", Toast.LENGTH_SHORT).show();
    }

}