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

public class AlfabetoActivity extends AppCompatActivity {

    private Button btA, btB, btC, btD, btE, btF, btG, btH, btI, btJ, btK, btL,
            btM, btN, btO, btP, btQ, btR, btS, btT, btU, btV, btW, btX, btY, btZ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alfabeto);



       final PlayMidiaModel play = new PlayMidiaModel();

        btA = (Button) findViewById(R.id.btA);
        btB = (Button) findViewById(R.id.btB);
        btC = (Button) findViewById(R.id.btC);
        btD = (Button) findViewById(R.id.btD);
        btE = (Button) findViewById(R.id.btE);
        btF = (Button) findViewById(R.id.btF);
        btG = (Button) findViewById(R.id.btG);
        btH = (Button) findViewById(R.id.btH);
        btI = (Button) findViewById(R.id.btI);
        btJ = (Button) findViewById(R.id.btJ);
        btK = (Button) findViewById(R.id.btK);
        btL = (Button) findViewById(R.id.btL);
        btM = (Button) findViewById(R.id.btM);
        btN = (Button) findViewById(R.id.btN);
        btO = (Button) findViewById(R.id.btO);
        btP = (Button) findViewById(R.id.btP);
        btQ = (Button) findViewById(R.id.btQ);
        btR = (Button) findViewById(R.id.btR);
        btS = (Button) findViewById(R.id.btS);
        btT = (Button) findViewById(R.id.btT);
        btU = (Button) findViewById(R.id.btU);
        btV = (Button) findViewById(R.id.btV);
        btW = (Button) findViewById(R.id.btW);
        btX = (Button) findViewById(R.id.btX);
        btY = (Button) findViewById(R.id.btY);
        btZ = (Button) findViewById(R.id.btZ);



        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               play.playMidia(getApplicationContext(), R.raw.alfabetoa);

            }

        });

        btB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetob);

            }

        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoc);

            }

        });

        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetod);

            }

        });

        btE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoe);

            }

        });

        btF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetof);

            }

        });

        btG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetog);

            }

        });

        btH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoh);

            }

        });

        btI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoi);

            }

        });

        btJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoj);

            }

        });

        btL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetol);

            }

        });

        btM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetom);

            }

        });

        btN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabeton);

            }

        });

        btO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoo);

            }

        });

        btP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetop);

            }

        });

        btQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoq);

            }

        });

        btR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetor);

            }

        });

        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetos);

            }

        });

        btT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetot);

            }

        });

        btU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetou);

            }

        });

        btV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetov);

            }

        });

        btW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetow);

            }

        });

        btX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetox);

            }

        });

        btY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoy);

            }

        });

        btZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                play.playMidia(getApplicationContext(), R.raw.alfabetoz);

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
