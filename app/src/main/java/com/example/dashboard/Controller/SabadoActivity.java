package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.DAO.RotinaDAO;
import com.example.dashboard.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SabadoActivity extends AppCompatActivity {
    private FloatingActionButton fab;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12;
    ArrayList<String> imagemRecebida = new ArrayList<String>();
    ArrayList<String> tituloRecebido = new ArrayList<String>();
    private Button bt_salvar;
    String diaSemana;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        bt_salvar = (Button) findViewById(R.id.bt_salvarS);

        img1 = (ImageView) findViewById(R.id.imagem01);
        img2 = (ImageView) findViewById(R.id.imagem02);
        img3 = (ImageView) findViewById(R.id.imagem03);
        img4 = (ImageView) findViewById(R.id.imagem04);
        img5 = (ImageView) findViewById(R.id.imagem05);
        img6 = (ImageView) findViewById(R.id.imagem06);
        img7 = (ImageView) findViewById(R.id.imagem07);
        img8 = (ImageView) findViewById(R.id.imagem08);
        img9 = (ImageView) findViewById(R.id.imagem09);
        img10 = (ImageView) findViewById(R.id.imagem10);
        img11 = (ImageView) findViewById(R.id.imagem11);
        img12 = (ImageView) findViewById(R.id.imagem12);

        diaSemana = "Sabado";

        final RotinaDAO rotinaDAO = new RotinaDAO();


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SabadoActivity.this, InserirImagemActivity.class);
                startActivity(intent);
            }
        });

        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotinaDAO.limparRotina(diaSemana);
                rotinaDAO.salvarRotina(imagemRecebida,tituloRecebido);
                finish();
                Toast.makeText(getApplicationContext(), "Rotina salva com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SabadoActivity.this, DiasSemanaActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        imagemRecebida = intent.getStringArrayListExtra("imagem");
        tituloRecebido = intent.getStringArrayListExtra("titulo");
        System.out.println(imagemRecebida);

        if (imagemRecebida != null) {

            for (int i = 0; i < imagemRecebida.size(); i++) {

                if(i ==0) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img1);

                }
                else if(i == 1) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img2);

                }
                else if(i == 2) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img3);

                }
                else if(i == 3) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img4);

                }
                else if(i == 4) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img5);

                }
                else if(i == 5) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img6);

                }
                else if(i == 6) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img7);

                }
                else if(i == 7) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img8);

                }
                else if(i == 8) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img9);

                }
                else if(i == 9) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img10);

                }
                else if(i == 10) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img11);

                }
                else if(i == 11) {
                    Picasso.get().load(imagemRecebida.get(i)).into(img12);
                }

            }
        }


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
                Intent intent = new Intent(SabadoActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
