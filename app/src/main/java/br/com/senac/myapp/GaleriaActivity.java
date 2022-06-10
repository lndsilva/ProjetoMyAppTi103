package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GaleriaActivity extends AppCompatActivity {
    //Declarar a variavel global com o mesmo tipo do componente no xml
    FloatingActionButton fabGaleria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeria_layout);
        //a variavel do java recebendo a variavel do xml
        fabGaleria = findViewById(R.id.fabGaleria);

        //Criando o evento de clique no FAB
        fabGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no botão FAB",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}