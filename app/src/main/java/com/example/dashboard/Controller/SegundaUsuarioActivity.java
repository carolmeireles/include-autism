package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.DAO.RotinaDAO;
import com.example.dashboard.R;
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SegundaUsuarioActivity extends AppCompatActivity {


    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
            img11, img12;

    RotinaDAO rotinaDAO = new RotinaDAO();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundausuario);


        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);

        rotinaDAO.recuperarRotina("SegundaFeira");
        String [] Imagem = rotinaDAO.pegaImagemRecuperaRotina();



        Picasso.get().load(Imagem[0]).into(img1);
        Picasso.get().load(Imagem[1]).into(img2);
        Picasso.get().load(Imagem[2]).into(img3);
        Picasso.get().load(Imagem[3]).into(img4);
        Picasso.get().load(Imagem[4]).into(img5);
        Picasso.get().load(Imagem[5]).into(img6);
        Picasso.get().load(Imagem[6]).into(img7);
        Picasso.get().load(Imagem[7]).into(img8);
        Picasso.get().load(Imagem[8]).into(img9);
        Picasso.get().load(Imagem[9]).into(img10);
        Picasso.get().load(Imagem[10]).into(img11);
        Picasso.get().load(Imagem[11]).into(img12);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        final String dataFormatada = dateFormat.format(dataAtual);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"0","SegundaFeira", "1");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","0");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"1","SegundaFeira", "2");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","1");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"2","SegundaFeira", "3");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","2");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"3","SegundaFeira", "4");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","3");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"4","SegundaFeira", "5");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","4");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"5","SegundaFeira", "6");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","5");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"6","SegundaFeira", "7");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","6");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"7","SegundaFeira", "8");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","7");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"8","SegundaFeira", "9");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","8");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"9","SegundaFeira", "10");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","9");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"10","SegundaFeira", "11");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","10");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"11","SegundaFeira", "12");
                rotinaDAO.removeRotinaRealizada("SegundaFeira","11");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SegundaUsuarioActivity.this, SegundaUsuarioActivity.class);
                startActivity(intent);

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
                Intent intent = new Intent(SegundaUsuarioActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
