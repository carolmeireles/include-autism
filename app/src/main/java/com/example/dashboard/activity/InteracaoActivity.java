package com.example.dashboard.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.R;

public class InteracaoActivity extends AppCompatActivity {

    private Button btfome, btsede, btlavarmaos, btbanheiro, btbanho, btdentes, btvertv, btbrincar, btestudar, btsono, btfeliz, bttriste,
    btvolume, btdor;

    private void playFome() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.fome);
        mediaPlayer.start();
    }

    private void playAgua() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.agua);
        mediaPlayer.start();
    }

    private void playLavarMaos() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.lavarmaos);
        mediaPlayer.start();
    }

    private void playBanheiro() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.banheiro);
        mediaPlayer.start();
    }

    private void playBanho() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.banho);
        mediaPlayer.start();
    }

    private void playDentes() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dentes);
        mediaPlayer.start();
    }

    private void playTv() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tv);
        mediaPlayer.start();
    }

    private void playBrincar() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.brincar);
        mediaPlayer.start();
    }

    private void playEstudar() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.estudar);
        mediaPlayer.start();
    }

    private void playSono() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sono);
        mediaPlayer.start();
    }

    private void playFeliz() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.feliz);
        mediaPlayer.start();
    }

    private void playTriste() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.triste);
        mediaPlayer.start();
    }

    private void playVolume() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.volume);
        mediaPlayer.start();
    }

    private void playDor() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dor);
        mediaPlayer.start();
    }





    //////EVENTO DO CLICK

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interacao_activity);

        btfome = (Button) findViewById(R.id.btfome);
        btfome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFome();

            }

        });

        btsede = (Button) findViewById(R.id.btsede);
        btsede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgua();

            }

        });

        btlavarmaos = (Button) findViewById(R.id.btlavarmaos);
        btlavarmaos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playLavarMaos();

            }

        });

        btbanheiro = (Button) findViewById(R.id.btbanheiro);
        btbanheiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBanheiro();

            }

        });

        btbanho = (Button) findViewById(R.id.btbanho);
        btbanho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBanho();

            }

        });

        btdentes = (Button) findViewById(R.id.btdentes);
        btdentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDentes();

            }

        });

        btvertv = (Button) findViewById(R.id.btvertv);
        btvertv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playTv();

            }

        });

        btbrincar = (Button) findViewById(R.id.btbrincar);
        btbrincar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBrincar();

            }

        });

        btestudar = (Button) findViewById(R.id.btestudar);
        btestudar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playEstudar();

            }

        });

        btsono = (Button) findViewById(R.id.btsono);
        btsono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSono();

            }

        });

        btfeliz = (Button) findViewById(R.id.btfeliz);
        btfeliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playFeliz();

            }

        });

        bttriste = (Button) findViewById(R.id.bttriste);
        bttriste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playTriste();

            }

        });

        btvolume = (Button) findViewById(R.id.btvolume);
        btvolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playVolume();

            }

        });

        btdor = (Button) findViewById(R.id.btdor);
        btdor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDor();

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

