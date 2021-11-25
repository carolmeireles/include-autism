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

public class DomingoUsuarioActivity extends AppCompatActivity {
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
            img11, img12;

    RotinaDAO rotinaDAO = new RotinaDAO();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.domingousuario);


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

        rotinaDAO.recuperarRotina("Domingo",img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12);
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
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"0","Domingo", "1");
                rotinaDAO.removeRotinaRealizada("Domingo","0");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"1","Domingo", "2");
                rotinaDAO.removeRotinaRealizada("Domingo","1");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"2","Domingo", "3");
                rotinaDAO.removeRotinaRealizada("Domingo","2");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"3","Domingo", "4");
                rotinaDAO.removeRotinaRealizada("Domingo","3");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"4","Domingo", "5");
                rotinaDAO.removeRotinaRealizada("Domingo","4");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"5","Domingo", "6");
                rotinaDAO.removeRotinaRealizada("Domingo","5");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"6","Domingo", "7");
                rotinaDAO.removeRotinaRealizada("Domingo","6");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"7","Domingo", "8");
                rotinaDAO.removeRotinaRealizada("Domingo","7");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"8","Domingo", "9");
                rotinaDAO.removeRotinaRealizada("Domingo","8");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"9","Domingo", "10");
                rotinaDAO.removeRotinaRealizada("Domingo","9");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"10","Domingo", "11");
                rotinaDAO.removeRotinaRealizada("Domingo","10");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
                startActivity(intent);

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.inserirRelatorioRotina(dataFormatada,"11","Domingo", "12");
                rotinaDAO.removeRotinaRealizada("Domingo","11");
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(DomingoUsuarioActivity.this, DomingoUsuarioActivity.class);
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
                Intent intent = new Intent(DomingoUsuarioActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}