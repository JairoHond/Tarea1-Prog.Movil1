package com.example.tarea1_progmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtNum1;
    private EditText Num2;
    private TextView txtResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        Num2 = findViewById(R.id.Num2);
        txtResul= findViewById(R.id.txtResul);
    }
    public void sumar (View view)
    {
        int valor1= Integer.parseInt(txtNum1.getText().toString());
        int valor2= Integer.parseInt(Num2.getText().toString());

        txtResul.setText(String.valueOf(valor1 + valor2));
    }

    public void rest (View view)
    {
        int valor1= Integer.parseInt(txtNum1.getText().toString());
        int valor2= Integer.parseInt(Num2.getText().toString());

        txtResul.setText(String.valueOf(valor1 - valor2));
    }

    public void mult (View view)
    {
        int valor1= Integer.parseInt(txtNum1.getText().toString());
        int valor2= Integer.parseInt(Num2.getText().toString());

        txtResul.setText(String.valueOf(valor1 * valor2));
    }

    public void div (View view)
    {
        int valor1= Integer.parseInt(txtNum1.getText().toString());
        int valor2= Integer.parseInt(Num2.getText().toString());

        txtResul.setText(String.valueOf(valor1 / valor2));
    }
}