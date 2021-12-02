package com.example.convertidormonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertir(View view){
        EditText editText = findViewById(R.id.editText);
        String pesosString = editText.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos * 19.4;
        String dolaresString = String.format("%.2f",dolares);
        String mensaje = "MNX" + pesosString + " son USD " + dolaresString;
        Toast.makeText(this
                , mensaje, Toast.LENGTH_SHORT).show();
    }
    public void yenes(View view){
        EditText editText = findViewById(R.id.editText);
        String pesosString = editText.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos * 5.32;
        String dolaresString = String.format("%.2f",dolares);
        String mensaje = "MNX" + pesosString + " son Yenes " + dolaresString;
        Toast.makeText(this
                , mensaje, Toast.LENGTH_SHORT).show();
    }

    public void pesosChilenos(View view){
        EditText editText = findViewById(R.id.editText);
        String pesosString = editText.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos * 38.83;
        String dolaresString = String.format("%.2f",dolares);
        String mensaje = "MNX" + pesosString + " son pesos chilenos " + dolaresString;
        Toast.makeText(this
                , mensaje, Toast.LENGTH_SHORT).show();
    }

    public void librasEstarlinas(View view){
        EditText editText = findViewById(R.id.editText);
        String pesosString = editText.getText().toString();
        double pesos = Double.parseDouble(pesosString);
        double dolares = pesos * 0.035;
        String dolaresString = String.format("%.2f",dolares);
        String mensaje = "MNX" + pesosString + " son libras estarlinas " + dolaresString;
        Toast.makeText(this
                , mensaje, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}