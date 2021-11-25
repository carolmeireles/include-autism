package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.DAO.RotinaDAO;
import com.example.dashboard.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class InserirImagemActivity extends AppCompatActivity {

    private Button bt_selecionar;


    ArrayList<String> imagem = new ArrayList<String>();
    ArrayList<String> titulo = new ArrayList<String>();



    String passaImagem, passaTitulo;


     ImageView img01, img02, img03, img04, img05, img06, img07, img08,
            img09, img10, img11, img12, img13, img14, img15;
     TextView tv01, tv02, tv03, tv04, tv05, tv06, tv07, tv08, tv09,
            tv10, tv11, tv12, tv13, tv14, tv15;

    String imagem1, imagem2, imagem3, imagem4, imagem5, imagem6,
            imagem7, imagem8, imagem9, imagem10, imagem11, imagem12,
            imagem13, imagem14, imagem15, titulo1, titulo2, titulo3,
            titulo4, titulo5, titulo6, titulo7, titulo8, titulo9, titulo10,
            titulo11, titulo12, titulo13, titulo14, titulo15;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inseririmagem);

        img01 = (ImageView) findViewById(R.id.img01);
        img02 = (ImageView) findViewById(R.id.img02);
        img03 = (ImageView) findViewById(R.id.img03);
        img04 = (ImageView) findViewById(R.id.img04);
        img05 = (ImageView) findViewById(R.id.img05);
        img06 = (ImageView) findViewById(R.id.img06);
        img07 = (ImageView) findViewById(R.id.img07);
        img08 = (ImageView) findViewById(R.id.img08);
        img09 = (ImageView) findViewById(R.id.img09);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);
        img13 = (ImageView) findViewById(R.id.img13);
        img14 = (ImageView) findViewById(R.id.img14);
        img15 = (ImageView) findViewById(R.id.img15);


        tv01 = (TextView) findViewById(R.id.tv01);
        tv02 = (TextView) findViewById(R.id.tv02);
        tv03 = (TextView) findViewById(R.id.tv03);
        tv04 = (TextView) findViewById(R.id.tv04);
        tv05 = (TextView) findViewById(R.id.tv05);
        tv06 = (TextView) findViewById(R.id.tv06);
        tv07 = (TextView) findViewById(R.id.tv07);
        tv08 = (TextView) findViewById(R.id.tv08);
        tv09 = (TextView) findViewById(R.id.tv09);
        tv10 = (TextView) findViewById(R.id.tv10);
        tv11 = (TextView) findViewById(R.id.tv11);
        tv12 = (TextView) findViewById(R.id.tv12);
        tv13 = (TextView) findViewById(R.id.tv13);
        tv14 = (TextView) findViewById(R.id.tv14);
        tv15 = (TextView) findViewById(R.id.tv15);


        RotinaDAO rotinaDAO = new RotinaDAO();
        String[] Titulo = rotinaDAO.pegaTituloListarRotina();
        String[] Image = rotinaDAO.pegaImageListarRotina();

        tv01.setText(Titulo[0]);
        tv02.setText(Titulo[1]);
        tv03.setText(Titulo[2]);
        tv04.setText(Titulo[3]);
        tv05.setText(Titulo[4]);
        tv06.setText(Titulo[5]);
        tv07.setText(Titulo[6]);
        tv08.setText(Titulo[7]);
        tv09.setText(Titulo[8]);
        tv10.setText(Titulo[9]);
        tv11.setText(Titulo[10]);
        tv12.setText(Titulo[11]);
        tv13.setText(Titulo[12]);
        tv14.setText(Titulo[13]);
        tv15.setText(Titulo[14]);


        Picasso.get().load(Image[0]).into(img01);
        Picasso.get().load(Image[1]).into(img02);
        Picasso.get().load(Image[2]).into(img03);
        Picasso.get().load(Image[3]).into(img04);
        Picasso.get().load(Image[4]).into(img05);
        Picasso.get().load(Image[5]).into(img06);
        Picasso.get().load(Image[6]).into(img07);
        Picasso.get().load(Image[7]).into(img08);
        Picasso.get().load(Image[8]).into(img09);
        Picasso.get().load(Image[9]).into(img10);
        Picasso.get().load(Image[10]).into(img11);
        Picasso.get().load(Image[11]).into(img12);
        Picasso.get().load(Image[12]).into(img13);
        Picasso.get().load(Image[13]).into(img14);
        Picasso.get().load(Image[14]).into(img15);

    }

    @Override
    protected void onStart() {
        super.onStart();

        bt_selecionar = (Button) findViewById(R.id.bt_ok);


        img01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem1;
                passaTitulo = titulo1;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem2;
                passaTitulo = titulo2;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem3;
                passaTitulo = titulo3;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem4;
                passaTitulo = titulo4;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem5;
                passaTitulo = titulo5;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem6;
                passaTitulo = titulo6;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem7;
                passaTitulo = titulo7;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem8;
                passaTitulo = titulo8;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem9;
                passaTitulo = titulo9;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem10;
                passaTitulo = titulo10;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem11;
                passaTitulo = titulo11;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem12;
                passaTitulo = titulo12;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem13;
                passaTitulo = titulo13;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem14;
                passaTitulo = titulo14;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        img15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                passaImagem = imagem15;
                passaTitulo = titulo15;
                Toast.makeText(getApplicationContext(), "Imagem selecionada!", Toast.LENGTH_SHORT).show();
                imagem.add(passaImagem);
                titulo.add(passaTitulo);

            }
        });

        bt_selecionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InserirImagemActivity.this, SegundaActivity.class);
                intent.putExtra("imagem", imagem);
                intent.putExtra("titulo", titulo);
                startActivity(intent);
                finish();

            }
        });



        }


}
