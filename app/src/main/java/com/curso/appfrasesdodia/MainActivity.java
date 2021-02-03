package com.curso.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view){

        String[] frases = {"Bom dia!", "Boa tarde!", "Boa noite!", "Tudo bem?"};

        int n = new Random().nextInt(4); // gerando 4 numeros aleatorios

        TextView frase = findViewById(R.id.textResultado);
        frase.setText(frases[n]);
    }

}
