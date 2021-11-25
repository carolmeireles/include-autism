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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class QuintaUsuarioActivity extends AppCompatActivity {

        private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
                img11, img12;

        RotinaDAO rotinaDAO = new RotinaDAO();


        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quintausuario);


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

        rotinaDAO.recuperarRotina("QuintaFeira",img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12);
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
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"0","QuintaFeira", "1");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","0");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"1","QuintaFeira", "2");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","1");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"2","QuintaFeira", "3");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","2");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"3","QuintaFeira", "4");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","3");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"4","QuintaFeira", "5");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","4");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"5","QuintaFeira", "6");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","5");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"6","QuintaFeira", "7");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","6");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"7","QuintaFeira", "8");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","7");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"8","QuintaFeira", "9");
                rotinaDAO.removeRotinaRealizada("TQuintaFeira","8");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"9","QuintaFeira", "10");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","9");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"10","QuintaFeira", "11");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","10");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"11","QuintaFeira", "12");
                rotinaDAO.removeRotinaRealizada("QuintaFeira","11");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(QuintaUsuarioActivity.this, QuintaUsuarioActivity.class);
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
                Intent intent = new Intent(QuintaUsuarioActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
    }
