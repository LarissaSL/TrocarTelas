package com.example.tarefaone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Tela4 extends AppCompatActivity {
    ConstraintLayout layoutPrincipal;
    String[] cores;
    String ultimaCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        layoutPrincipal = findViewById(R.id.fundoPrincipalTela4);
        cores = new String[]{"#FF7DC9EC", "#FFE87676", "#FF8EEC92"};
    }

    public void voltarTelaTres(View view) {
        Intent in = new Intent(Tela4.this, Tela3.class);
        startActivity(in);
    }

    public void mudarFundo(View view) {
        String cor = (String) view.getTag();
        layoutPrincipal.setBackgroundColor(Color.parseColor(cor));
    }

    public void mudarCorRandom(View view) {
        String novaCor;
        do {
            int n = new Random().nextInt(3);
            novaCor = cores[n];
        } while (novaCor.equals(ultimaCor) || novaCor.equals(layoutPrincipal.getBackground()));

        ultimaCor = novaCor;
        layoutPrincipal.setBackgroundColor(Color.parseColor(novaCor));
    }
}