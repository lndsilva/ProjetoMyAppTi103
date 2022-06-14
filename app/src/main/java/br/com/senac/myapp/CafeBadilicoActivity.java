package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CafeBadilicoActivity extends AppCompatActivity implements View.OnClickListener {
    //declarando a variavel global
    Button btnReservar, btnPriHora, btnSecHora, btnTerHora, btnQuaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_badilico_layout);
        //apresentar a variavel java para o xml
        btnReservar = findViewById(R.id.idReservar);
        btnPriHora = findViewById(R.id.btnPriHora);
        btnSecHora = findViewById(R.id.btnSegHora);
        btnTerHora = findViewById(R.id.btnTerHora);
        btnQuaHora = findViewById(R.id.btnQuaHora);

        btnPriHora.setOnClickListener(this);
        btnSecHora.setOnClickListener(this);
        btnTerHora.setOnClickListener(this);
        btnQuaHora.setOnClickListener(this);

        //Criar ação de clique para o botão reservar
        btnReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei em reservar!!!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnPriHora:
                Toast.makeText(getApplicationContext(),
                        "Cliquei na primeira hora!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSegHora:
                Toast.makeText(getApplicationContext(),
                        "Cliquei na segunda hora!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnTerHora:
                Toast.makeText(getApplicationContext(),
                        "Cliquei na terceira hora!!!",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnQuaHora:
                Toast.makeText(getApplicationContext(),
                        "Cliquei na quarta hora!!!",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }

}