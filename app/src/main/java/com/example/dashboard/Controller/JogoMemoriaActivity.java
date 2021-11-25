package com.example.dashboard.Controller;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dashboard.R;

import java.util.Arrays;
import java.util.Collections;


public class JogoMemoriaActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_p1;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24;

    // array de imagens
    Integer[] cartasArray = {101, 102, 103, 104, 201, 202, 203, 204};
    // imagens atuais
    int imagem101, imagem102, imagem103, imagem104, imagem201, imagem202, imagem203, imagem204;

    int primeiraCarta, segundaCarta;
    int PrimeiroClick, segundoClick;



    int cartaNumero = 1;
    int virar = 1;
    int pontuacao = 0;
    boolean pause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogomemoria);
        alertaInicialJogo();

        tv_p1 = (TextView) findViewById(R.id.tv_p1);



        iv_11 = (ImageView) findViewById(R.id.carta1);
        iv_12 = (ImageView) findViewById(R.id.carta2);
        iv_13 = (ImageView) findViewById(R.id.carta3);
        iv_14 = (ImageView) findViewById(R.id.carta4);
        iv_21 = (ImageView) findViewById(R.id.carta5);
        iv_22 = (ImageView) findViewById(R.id.carta6);
        iv_23 = (ImageView) findViewById(R.id.carta7);
        iv_24 = (ImageView) findViewById(R.id.carta8);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");

        // Carregando as imagens
        frontOfCardsResources();

        // Embaralhando imagens
        Collections.shuffle(Arrays.asList(cartasArray));




        iv_11.setOnClickListener(this);
        iv_12.setOnClickListener(this);
        iv_13.setOnClickListener(this);
        iv_14.setOnClickListener(this);
        iv_21.setOnClickListener(this);
        iv_22.setOnClickListener(this);
        iv_23.setOnClickListener(this);
        iv_24.setOnClickListener(this);


    }

    private void alertaInicialJogo() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(JogoMemoriaActivity.this);
        alertDialogBuilder
                .setMessage("Para passar de fase você precisa ter um total de 4 acertos")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(JogoMemoriaActivity.this, "Vamos Começar !!!", Toast.LENGTH_LONG ).show();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();


    }


    @Override
    public void onClick(View view) {
        int carta;

        switch (view.getId()) {
            case R.id.carta1:
                pause = true;

                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, carta);
                break;
            case R.id.carta2:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, carta);
                break;
            case R.id.carta3:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, carta);
                break;
            case R.id.carta4:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, carta);
                break;
            case R.id.carta5:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, carta);
                break;
            case R.id.carta6:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, carta);
                break;

            case R.id.carta7:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, carta);
                break;
            case R.id.carta8:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, carta);
                break;
        }
    }

    private void doStuff(ImageView iv, int card) {



        // Definindo imagem correta
        switch (cartasArray[card]) {
            case 101:
                iv.setImageResource(imagem101);
                break;
            case 102:
                iv.setImageResource(imagem102);
                break;
            case 103:
                iv.setImageResource(imagem103);
                break;
            case 104:
                iv.setImageResource(imagem104);
                break;
            case 201:
                iv.setImageResource(imagem201);
                break;
            case 202:
                iv.setImageResource(imagem202);
                break;
            case 203:
                iv.setImageResource(imagem203);
                break;
            case 204:
                iv.setImageResource(imagem204);
                break;

        }

        // Verifica qual imagem está selecionada e salva temporariamente
        if (cartaNumero == 1) {

            primeiraCarta = cartasArray[card];
            if (primeiraCarta > 200) {
                primeiraCarta = primeiraCarta - 100;
            }
            cartaNumero = 2;
            PrimeiroClick = card;

            iv.setEnabled(false);

        } else if (cartaNumero == 2) {
            segundaCarta = cartasArray[card];
            if (segundaCarta > 200) {
                segundaCarta = segundaCarta - 100;
            }
            cartaNumero = 1;
            segundoClick = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Verifica se as imagens selecionadas são iguais
                    calculate();
                }
            }, 1000);
        }

        Handler delayHandler = new Handler();
        delayHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                // Verifica se as imagens selecionadas são iguais
                pause = false;
            }
        }, 1000);

    }

    private void calculate() {
        // se as imagens forem iguais ficam invisiveis e adiciona os pontos
        if(primeiraCarta == segundaCarta){
            if(PrimeiroClick == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }

            if(segundoClick == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 7){
                iv_24.setVisibility(View.INVISIBLE);
            }

            // adiciona pontos
            if(virar == 1){
                pontuacao++;
                tv_p1.setText("Acertos:  "+ pontuacao);
            }

        }else{
            iv_11.setImageResource(R.drawable.carta);
            iv_12.setImageResource(R.drawable.carta);
            iv_13.setImageResource(R.drawable.carta);
            iv_14.setImageResource(R.drawable.carta);
            iv_21.setImageResource(R.drawable.carta);
            iv_22.setImageResource(R.drawable.carta);
            iv_23.setImageResource(R.drawable.carta);
            iv_24.setImageResource(R.drawable.carta);



            if(virar == 1){

                tv_p1.setTextColor(Color.GRAY);

            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);


        // verifica se o jogo acabou
        checkEnd();
    }

    private void checkEnd() {
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE)
                {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(JogoMemoriaActivity.this);
            alertDialogBuilder
                    .setMessage("Fim de jogo!! \n Seu total de acertos foi: " + pontuacao)
                    .setCancelable(false)
                    .setPositiveButton("Nível 2", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), JogoNivelDoisActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();

                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
    private void frontOfCardsResources() {
        imagem101 = R.drawable.balde;
        imagem102 = R.drawable.bola;
        imagem103 = R.drawable.peao;
        imagem104 = R.drawable.foguete;
        imagem201 = R.drawable.balde;
        imagem202 = R.drawable.bola;
        imagem203 = R.drawable.peao;
        imagem204 = R.drawable.foguete;

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
                Intent intent = new Intent(JogoMemoriaActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}