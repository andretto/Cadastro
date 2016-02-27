package br.com.tranning.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Variaveis Locais
    EditText editTextNome;
    EditText editTextextIdade;
    EditText editTextTElefone;
    final String TAG="MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextextIdade = (EditText) findViewById(R.id.editTextIdade);
        editTextTElefone = (EditText) findViewById(R.id.editTextTelefone);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String nome = editTextNome.getText().toString();
                String idade = editTextextIdade.getText().toString();
                String telefone = editTextTElefone.getText().toString();
                Intent intent = new Intent(MainActivity.this,Tela2Activity.class);
                intent.putExtra("nome", nome);
                intent.putExtra("idade", idade);
                intent.putExtra("telefone", telefone);
                startActivity(intent);
                finish();
            }
        });
        Log.i(TAG, "OnCreate");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"OnRestart");
    }
}
