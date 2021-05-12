package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txt_valorEuro;
    Button btn_kz, btn_$, btn_real;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_valorEuro = findViewById(R.id.txt_euro);
        btn_$ = findViewById(R.id.btn_dolar);
        btn_kz = findViewById(R.id.btn_kwanza);
        btn_real = findViewById(R.id.btn_real);
        double valorEmEuro = Double.parseDouble(txt_valorEuro.getText().toString());
        btn_kz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            double emKwannza = 796.32 * valorEmEuro;
                Toast.makeText(MainActivity.this,String.valueOf(emKwannza),Toast.LENGTH_SHORT).show();
            }
        });

        btn_$.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double emDolar = 1.22 * valorEmEuro;
                Toast.makeText(MainActivity.this,String.valueOf(emDolar),Toast.LENGTH_SHORT).show();
            }
        });

        btn_real.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double emreal = 6.36 * valorEmEuro;
                Toast.makeText(MainActivity.this,String.valueOf(emreal),Toast.LENGTH_SHORT).show();
            }
        });
    }
}