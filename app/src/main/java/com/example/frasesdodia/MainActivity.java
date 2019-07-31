package com.example.frasesdodia;

import android.support.v7.app.AppCompatActivity;
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

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "É pra frente que se anda, é pra cima que se olha e é lutando que se conquista.",
                "Ciclo da vida: tentar, cair, levantar, recomeçar. Nunca desistir.",
                "Treine sua mente para ver o lado bom de qualquer situação.",
                "E tudo que atrasa, deixa a maré levar!",
                "Se jogue no que te faz sorrir.",
                "Está proibido abandonar seus sonhos, não importa quantas vezes caia, levante-se.",
                "Energia positiva é o melhor presente que a gente pode receber.",
                "Que vire rotina acordar todos os dias com o coração leve.",
                "Toda vez que você pensar em desistir, respire fundo, ore baixinho, convide a esperança, abrace a fé e vai.",
                "Ninguém, além de você, está no controle da sua felicidade.",
        };

        int numero = new Random().nextInt(frases.length);
        TextView texto = findViewById(R.id.text_resultado);
        texto.setText(frases[numero]);
    }
}
