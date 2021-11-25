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

import com.example.dashboard.R;

public class RotinaActivity extends AppCompatActivity {

    private Button segunda, terca, quarta, quinta, sexta, sabado, domingo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rotina_activity);

        segunda = (Button) findViewById(R.id.bt_segunda);
        terca = (Button) findViewById(R.id.bt_terca);
        quarta = (Button) findViewById(R.id.bt_quarta);
        quinta = (Button) findViewById(R.id.bt_quinta);
        sexta = (Button) findViewById(R.id.bt_sexta);
        sabado = (Button) findViewById(R.id.bt_sabado);
        domingo = (Button) findViewById(R.id.bt_domingo);

        segunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RotinaActivity.this, SegUsuario.class);
                startActivity(intent);
            }
        });

       terca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RotinaActivity.this, TerUsuario.class);
                startActivity(intent);
            }
        });

       quarta.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(RotinaActivity.this, QuaUsuario.class);
               startActivity(intent);
           }
       });

       quinta.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(RotinaActivity.this, QuiUsuario.class);
               startActivity(intent);
           }
       });

       sexta.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(RotinaActivity.this, SexUsuario.class);
               startActivity(intent);
           }
       });

       sabado.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(RotinaActivity.this, SabUsuario.class);
               startActivity(intent);
           }
       });

       domingo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(RotinaActivity.this, DomUsuario.class);
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
                Intent intent = new Intent(RotinaActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }




}