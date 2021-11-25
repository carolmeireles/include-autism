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

import com.example.dashboard.R;

import java.util.Arrays;
import java.util.Collections;


public class JogoNivelTresActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv_p1;

    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34, iv_41, iv_42, iv_43, iv_44;

    // array de imagens
    Integer[] cartasArray = {101, 102, 103, 104, 105, 106, 107, 108, 201, 202, 203, 204, 205, 206, 207, 208};
    // imagens atuais
    int imagem101, imagem102, imagem103, imagem104, imagem105, imagem106, imagem107, imagem108,
            imagem201, imagem202, imagem203, imagem204, imagem205, imagem206, imagem207, imagem208;

    int primeiraCarta, segundaCarta;
    int PrimeiroClick, segundoClick;



    int cartaNumero = 1;
    int virar = 1;
    int pontuacao = 0;
    boolean pause = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogoniveltres);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);



        iv_11 = (ImageView) findViewById(R.id.carta1);
        iv_12 = (ImageView) findViewById(R.id.carta2);
        iv_13 = (ImageView) findViewById(R.id.carta3);
        iv_14 = (ImageView) findViewById(R.id.carta4);
        iv_21 = (ImageView) findViewById(R.id.carta5);
        iv_22 = (ImageView) findViewById(R.id.carta6);
        iv_23 = (ImageView) findViewById(R.id.carta7);
        iv_24 = (ImageView) findViewById(R.id.carta8);
        iv_31 = (ImageView) findViewById(R.id.carta9);
        iv_32 = (ImageView) findViewById(R.id.carta10);
        iv_33 = (ImageView) findViewById(R.id.carta11);
        iv_34 = (ImageView) findViewById(R.id.carta12);
        iv_41 = (ImageView) findViewById(R.id.carta13);
        iv_42 = (ImageView) findViewById(R.id.carta14);
        iv_43 = (ImageView) findViewById(R.id.carta15);
        iv_44 = (ImageView) findViewById(R.id.carta16);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");
        iv_41.setTag("12");
        iv_42.setTag("13");
        iv_43.setTag("14");
        iv_44.setTag("15");
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
        iv_31.setOnClickListener(this);
        iv_32.setOnClickListener(this);
        iv_33.setOnClickListener(this);
        iv_34.setOnClickListener(this);
        iv_41.setOnClickListener(this);
        iv_42.setOnClickListener(this);
        iv_43.setOnClickListener(this);
        iv_44.setOnClickListener(this);

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
            case R.id.carta9:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, carta);
                break;
            case R.id.carta10:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, carta);
                break;

            case R.id.carta11:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, carta);
                break;

            case R.id.carta12:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_34, carta);
                break;
            case R.id.carta13:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_41, carta);
                break;
            case R.id.carta14:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_42, carta);
                break;
            case R.id.carta15:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_43, carta);
                break;
            case R.id.carta16:
                pause = true;
                carta = Integer.parseInt((String) view.getTag());
                doStuff(iv_44, carta);
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
            case 105:
                iv.setImageResource(imagem105);
                break;
            case 106:
                iv.setImageResource(imagem106);
                break;
            case 107:
                iv.setImageResource(imagem107);
                break;
            case 108:
                iv.setImageResource(imagem108);
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
            case 205:
                iv.setImageResource(imagem205);
                break;
            case 206:
                iv.setImageResource(imagem206);
                break;
            case 207:
                iv.setImageResource(imagem207);
                break;
            case 208:
                iv.setImageResource(imagem208);
                break;
        }

        // Verifica qual imagem estÃ¡ selecionada e salva temporariamente
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
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);
            iv_41.setEnabled(false);
            iv_42.setEnabled(false);
            iv_43.setEnabled(false);
            iv_44.setEnabled(false);


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    // Verifica se as imagens selecionadas sÃ£o iguais
                    calculate();
                }
            }, 1000);
        }

        Handler delayHandler = new Handler();
        delayHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                // Verifica se as imagens selecionadas sÃ£o iguais
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
            }else if (PrimeiroClick == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 12) {
                iv_41.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 13) {
                iv_42.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 14) {
                iv_43.setVisibility(View.INVISIBLE);
            }else if (PrimeiroClick == 15) {
                iv_44.setVisibility(View.INVISIBLE);
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
            }else if (segundoClick == 8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 12) {
                iv_41.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 13) {
                iv_42.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 14) {
                iv_43.setVisibility(View.INVISIBLE);
            }else if (segundoClick == 15) {
                iv_44.setVisibility(View.INVISIBLE);
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
            iv_31.setImageResource(R.drawable.carta);
            iv_32.setImageResource(R.drawable.carta);
            iv_33.setImageResource(R.drawable.carta);
            iv_34.setImageResource(R.drawable.carta);
            iv_41.setImageResource(R.drawable.carta);
            iv_42.setImageResource(R.drawable.carta);
            iv_43.setImageResource(R.drawable.carta);
            iv_44.setImageResource(R.drawable.carta);


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
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);
        iv_41.setEnabled(true);
        iv_42.setEnabled(true);
        iv_43.setEnabled(true);
        iv_44.setEnabled(true);

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
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE &&
                iv_41.getVisibility() == View.INVISIBLE &&
                iv_42.getVisibility() == View.INVISIBLE &&
                iv_43.getVisibility() == View.INVISIBLE &&
                iv_44.getVisibility() == View.INVISIBLE ){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(JogoNivelTresActivity.this);
            alertDialogBuilder
                    .setMessage("Fim de jogo!! \n Seu total de acertos foi: " + pontuacao)
                    .setCancelable(false)
                    .setPositiveButton("Novo jogo", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), JogoMemoriaActivity.class);
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
        imagem101 = R.drawable.elefante;
        imagem102 = R.drawable.macaco;
        imagem103 = R.drawable.leao;
        imagem104 = R.drawable.zebra;
        imagem105 = R.drawable.onca;
        imagem106 = R.drawable.peixe;
        imagem107 = R.drawable.girafa;
        imagem108 = R.drawable.urso;
        imagem201 = R.drawable.elefante;
        imagem202 = R.drawable.macaco;
        imagem203 = R.drawable.leao;
        imagem204 = R.drawable.zebra;
        imagem205 = R.drawable.onca;
        imagem206 = R.drawable.peixe;
        imagem207 = R.drawable.girafa;
        imagem208 = R.drawable.urso;
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
                Intent intent = new Intent(JogoNivelTresActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}