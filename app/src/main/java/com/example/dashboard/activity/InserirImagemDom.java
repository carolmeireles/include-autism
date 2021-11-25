package com.example.dashboard.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class InserirImagemDom extends AppCompatActivity {


    private FirebaseDatabase database;
    private ValueEventListener valueEventListener;
    private Button bt_selecionar;


    ArrayList<String> imagem = new ArrayList<String>();
    ArrayList<String> titulo = new ArrayList<String>();



    String passaImagem,  passaTitulo;

    String imagem1, imagem2, imagem3, imagem4, imagem5, imagem6,
            imagem7, imagem8, imagem9, imagem10, imagem11, imagem12,
            imagem13, imagem14, imagem15, titulo1, titulo2, titulo3,
            titulo4, titulo5, titulo6, titulo7, titulo8, titulo9, titulo10,
            titulo11, titulo12, titulo13, titulo14, titulo15;

    private ImageView img01, img02, img03, img04, img05, img06, img07, img08,
            img09, img10, img11, img12, img13, img14, img15;
    private TextView tv01, tv02, tv03, tv04, tv05, tv06, tv07, tv08, tv09,
            tv10, tv11, tv12, tv13, tv14, tv15;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inseririmagemdom);

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


        database = FirebaseDatabase.getInstance();

        lerDados();

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
                Intent intent = new Intent(InserirImagemDom.this, Domingo_activity.class);
                intent.putExtra("imagem", imagem);
                intent.putExtra("titulo", titulo);
                startActivity(intent);
                finish();

            }
        });



        }


    public void lerDados(){

        DatabaseReference reference = database.getReference().child("ImagensRotina");

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                titulo1 = dataSnapshot.child("01").child("Titulo").getValue(String.class);
                imagem1 = dataSnapshot.child("01").child("Imagem").getValue(String.class);
                titulo2 = dataSnapshot.child("02").child("Titulo").getValue(String.class);
                imagem2 = dataSnapshot.child("02").child("Imagem").getValue(String.class);
                titulo3 = dataSnapshot.child("03").child("Titulo").getValue(String.class);
                imagem3 = dataSnapshot.child("03").child("Imagem").getValue(String.class);
                titulo4 = dataSnapshot.child("04").child("Titulo").getValue(String.class);
                imagem4 = dataSnapshot.child("04").child("Imagem").getValue(String.class);
                titulo5 = dataSnapshot.child("05").child("Titulo").getValue(String.class);
                imagem5 = dataSnapshot.child("05").child("Imagem").getValue(String.class);
                titulo6 = dataSnapshot.child("06").child("Titulo").getValue(String.class);
                imagem6 = dataSnapshot.child("06").child("Imagem").getValue(String.class);
                titulo7 = dataSnapshot.child("07").child("Titulo").getValue(String.class);
                imagem7 = dataSnapshot.child("07").child("Imagem").getValue(String.class);
                titulo8 = dataSnapshot.child("08").child("Titulo").getValue(String.class);
                imagem8 = dataSnapshot.child("08").child("Imagem").getValue(String.class);
                titulo9 = dataSnapshot.child("09").child("Titulo").getValue(String.class);
                imagem9 = dataSnapshot.child("09").child("Imagem").getValue(String.class);
                titulo10 = dataSnapshot.child("10").child("Titulo").getValue(String.class);
                imagem10 = dataSnapshot.child("10").child("Imagem").getValue(String.class);
                titulo11 = dataSnapshot.child("11").child("Titulo").getValue(String.class);
                imagem11 = dataSnapshot.child("11").child("Imagem").getValue(String.class);
                titulo12 = dataSnapshot.child("12").child("Titulo").getValue(String.class);
                imagem12 = dataSnapshot.child("12").child("Imagem").getValue(String.class);
                titulo13 = dataSnapshot.child("13").child("Titulo").getValue(String.class);
                imagem13 = dataSnapshot.child("13").child("Imagem").getValue(String.class);
                titulo14 = dataSnapshot.child("14").child("Titulo").getValue(String.class);
                imagem14 = dataSnapshot.child("14").child("Imagem").getValue(String.class);
                titulo15 = dataSnapshot.child("15").child("Titulo").getValue(String.class);
                imagem15 = dataSnapshot.child("15").child("Imagem").getValue(String.class);

                tv01.setText(titulo1);
                tv02.setText(titulo2);
                tv03.setText(titulo3);
                tv04.setText(titulo4);
                tv05.setText(titulo5);
                tv06.setText(titulo6);
                tv07.setText(titulo7);
                tv08.setText(titulo8);
                tv09.setText(titulo9);
                tv10.setText(titulo10);
                tv11.setText(titulo11);
                tv12.setText(titulo12);
                tv13.setText(titulo13);
                tv14.setText(titulo14);
                tv15.setText(titulo15);


                Picasso.get().load(imagem1).into(img01);
                Picasso.get().load(imagem2).into(img02);
                Picasso.get().load(imagem3).into(img03);
                Picasso.get().load(imagem4).into(img04);
                Picasso.get().load(imagem5).into(img05);
                Picasso.get().load(imagem6).into(img06);
                Picasso.get().load(imagem7).into(img07);
                Picasso.get().load(imagem8).into(img08);
                Picasso.get().load(imagem9).into(img09);
                Picasso.get().load(imagem10).into(img10);
                Picasso.get().load(imagem11).into(img11);
                Picasso.get().load(imagem12).into(img12);
                Picasso.get().load(imagem13).into(img13);
                Picasso.get().load(imagem14).into(img14);
                Picasso.get().load(imagem15).into(img15);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

}
