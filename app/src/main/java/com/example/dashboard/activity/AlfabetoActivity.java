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

public class AlfabetoActivity extends AppCompatActivity {

    private Button btA, btB, btC, btD, btE, btF, btG, btH, btI, btJ, btK, btL, btM, btN, btO, btP, btQ, btR, btS, btT, btU, btV, btW, btX, btY, btZ;

    private void playA() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoa);
        mediaPlayer.start();
    }

    private void playB() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetob);
        mediaPlayer.start();
    }

    private void playC() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoc);
        mediaPlayer.start();
    }

    private void playD() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetod);
        mediaPlayer.start();
    }

    private void playE() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoe);
        mediaPlayer.start();
    }

    private void playF() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetof);
        mediaPlayer.start();
    }

    private void playG() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetog);
        mediaPlayer.start();
    }

    private void playH() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoh);
        mediaPlayer.start();
    }

    private void playI() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoi);
        mediaPlayer.start();
    }

    private void playJ() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoj);
        mediaPlayer.start();
    }

    private void playK() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetok);
        mediaPlayer.start();
    }

    private void playL() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetol);
        mediaPlayer.start();
    }

    private void playM() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetom);
        mediaPlayer.start();
    }

    private void playN() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabeton);
        mediaPlayer.start();
    }

    private void playO() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoo);
        mediaPlayer.start();
    }

    private void playP() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetop);
        mediaPlayer.start();
    }

    private void playQ() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoq);
        mediaPlayer.start();
    }

    private void playR() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetor);
        mediaPlayer.start();
    }

    private void playS() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetos);
        mediaPlayer.start();
    }

    private void playT() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetot);
        mediaPlayer.start();
    }

    private void playU() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetou);
        mediaPlayer.start();
    }

    private void playV() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetov);
        mediaPlayer.start();
    }

    private void playW() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetow);
        mediaPlayer.start();
    }

    private void playX() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetox);
        mediaPlayer.start();
    }

    private void playY() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoy);
        mediaPlayer.start();
    }

    private void playZ() {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.alfabetoz);
        mediaPlayer.start();
    }

    ///////////////////////////////EVENTO DO CLICK

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alfabeto_activity);


        btA = (Button) findViewById(R.id.btA);
        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playA();

            }

        });

       btB = (Button) findViewById(R.id.btB);
        btB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playB();

            }

        });

        btC = (Button) findViewById(R.id.btC);
        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playC();

            }

        });
        btD = (Button) findViewById(R.id.btD);
        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playD();

            }

        });
        btE = (Button) findViewById(R.id.btE);
        btE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playE();

            }

        });

        btF = (Button) findViewById(R.id.btF);
        btF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playF();

            }

        });
        btG = (Button) findViewById(R.id.btG);
        btG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playG();

            }

        });

        btH = (Button) findViewById(R.id.btH);
        btH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playH();

            }

        });

        btI = (Button) findViewById(R.id.btI);
        btI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playI();

            }

        });

        btJ = (Button) findViewById(R.id.btJ);
        btJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playJ();

            }

        });

        btK = (Button) findViewById(R.id.btK);
        btK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playK();

            }

        });

        btL = (Button) findViewById(R.id.btL);
        btL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playL();

            }

        });

        btM = (Button) findViewById(R.id.btM);
        btM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playM();

            }

        });

        btN = (Button) findViewById(R.id.btN);
        btN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playN();

            }

        });

        btO = (Button) findViewById(R.id.btO);
        btO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playO();

            }

        });

        btP = (Button) findViewById(R.id.btP);
        btP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playP();

            }

        });

        btQ = (Button) findViewById(R.id.btQ);
        btQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playQ();

            }

        });

        btR = (Button) findViewById(R.id.btR);
        btR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playR();

            }

        });

        btS = (Button) findViewById(R.id.btS);
        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playS();

            }

        });

        btT = (Button) findViewById(R.id.btT);
        btT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playT();

            }

        });

        btU = (Button) findViewById(R.id.btU);
        btU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playU();

            }

        });

        btV = (Button) findViewById(R.id.btV);
        btV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playV();

            }

        });

        btW = (Button) findViewById(R.id.btW);
        btW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playW();

            }

        });

        btX = (Button) findViewById(R.id.btX);
        btX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playX();

            }

        });


        btY = (Button) findViewById(R.id.btY);
        btY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playY();

            }

        });

        btZ = (Button) findViewById(R.id.btZ);
        btZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playZ();

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
                Intent intent = new Intent(AlfabetoActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
