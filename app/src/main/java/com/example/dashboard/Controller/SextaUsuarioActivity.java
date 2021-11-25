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

public class SextaUsuarioActivity extends AppCompatActivity {

    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
            img11, img12;

    RotinaDAO rotinaDAO = new RotinaDAO();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sextausuario);


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

        rotinaDAO.recuperarRotina("SextaFeira",img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12);
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
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"0","SextaFeira", "1");
                rotinaDAO.removeRotinaRealizada("SextaFeira","0");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"1","SextaFeira", "2");
                rotinaDAO.removeRotinaRealizada("SextaFeira","1");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"2","SextaFeira", "3");
                rotinaDAO.removeRotinaRealizada("SextaFeira","2");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"3","SextaFeira", "4");
                rotinaDAO.removeRotinaRealizada("SextaFeira","3");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"4","SextaFeira", "5");
                rotinaDAO.removeRotinaRealizada("SextaFeira","4");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"5","TercaFeira", "6");
                rotinaDAO.removeRotinaRealizada("TercaFeira","5");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"6","SextaFeira", "7");
                rotinaDAO.removeRotinaRealizada("SextaFeira","6");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"7","SextaFeira", "8");
                rotinaDAO.removeRotinaRealizada("SextaFeira","7");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"8","SextaFeira", "9");
                rotinaDAO.removeRotinaRealizada("SextaFeira","8");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"9","SextaFeira", "10");
                rotinaDAO.removeRotinaRealizada("SextaFeira","9");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"10","SextaFeira", "11");
                rotinaDAO.removeRotinaRealizada("SextaFeira","10");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"11","SextaFeira", "12");
                rotinaDAO.removeRotinaRealizada("SextaFeira","11");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SextaUsuarioActivity.this, SextaUsuarioActivity.class);
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
                Intent intent = new Intent(SextaUsuarioActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
