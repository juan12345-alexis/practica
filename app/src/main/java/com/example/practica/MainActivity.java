package com.example.practica;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;
    Button btncalcular;
    TextView lblresultado;


    @SuppressLint({"WrongViewCast","MissingInflatedid"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btncalcular = findViewById(R.id.btncalcular);
        lblresultado = findViewById(R.id.lblresultado);

        btncalcular.setOnClickListener(v ->{
            int num1 = Integer.parseInt(txtnum1.getText().toString());
            int num2 = Integer.parseInt(txtnum2.getText().toString());

            lblresultado.setText("El resultado es" + String.valueOf((num1+num2)));

        });
    }
}