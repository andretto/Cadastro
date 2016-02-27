package br.com.tranning.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView textViewNome;
    TextView textViewIdade;
    TextView textViewTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String idade = intent.getStringExtra("idade");
        String telefone = intent.getStringExtra("telefone");

        textViewNome = (TextView) findViewById(R.id.textViewNome);
        textViewIdade = (TextView) findViewById(R.id.textViewIdade);
        textViewTelefone = (TextView) findViewById(R.id.textViewTelefone);

        textViewNome.setText(nome);
        textViewIdade.setText(idade);
        textViewTelefone.setText(telefone);



    }

}

