package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.Model.PlayMidiaModel;
import com.example.dashboard.R;

public class InteracaoActivity extends AppCompatActivity {

    private Button btfome, btsede, btlavarmaos, btbanheiro, btbanho, btdentes, btvertv,
            btbrincar, btestudar, btsono, btfeliz, bttriste,
    btvolume, btdor;

    final PlayMidiaModel play = new PlayMidiaModel();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interacao);

        btfome = (Button) findViewById(R.id.btfome);
        btfome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.fome);

            }

        });

        btsede = (Button) findViewById(R.id.btsede);
        btsede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.agua);

            }

        });

        btlavarmaos = (Button) findViewById(R.id.btlavarmaos);
        btlavarmaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.lavarmaos);

            }

        });

        btbanheiro = (Button) findViewById(R.id.btbanheiro);
        btbanheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.banheiro);

            }

        });

        btbanho = (Button) findViewById(R.id.btbanho);
        btbanho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.banho);

            }

        });

        btdentes = (Button) findViewById(R.id.btdentes);
        btdentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.dentes);

            }

        });

        btvertv = (Button) findViewById(R.id.btvertv);
        btvertv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.tv);

            }

        });

        btbrincar = (Button) findViewById(R.id.btbrincar);
        btbrincar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.brincar);

            }

        });

        btestudar = (Button) findViewById(R.id.btestudar);
        btestudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.estudar);

            }

        });

        btsono = (Button) findViewById(R.id.btsono);
        btsono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.sono);

            }

        });

        btfeliz = (Button) findViewById(R.id.btfeliz);
        btfeliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.feliz);

            }

        });

        bttriste = (Button) findViewById(R.id.bttriste);
        bttriste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.triste);

            }

        });

        btvolume = (Button) findViewById(R.id.btvolume);
        btvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.volume);

            }

        });

        btdor = (Button) findViewById(R.id.btdor);
        btdor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play.playMidia(getApplicationContext(), R.raw.dor);

            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menudash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuInicial:{
                Intent intent = new Intent(InteracaoActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}

