package br.com.senac.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre_layout);
    }

    //insere o menu na barra de aplicativo
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Realizar o clique nos itens de menu
        switch (item.getItemId()) {
            case R.id.menuCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Cadastrar!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Alterar!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Excluir!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Pesquisar!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuSair:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no Sair!!!",
                        Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}