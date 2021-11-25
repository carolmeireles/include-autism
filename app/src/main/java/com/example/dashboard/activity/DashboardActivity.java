package com.example.dashboard.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.dashboard.R;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class DashboardActivity extends AppCompatActivity{


    private Button btRotina;
    private Button btInteracao;
    private Button btJogoMemoria;
    private Button btAlfabeto;
    private GoogleSignInClient mGoogleSignInClient;
    private FirebaseAuth mAuth;
    FirebaseUser usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_activity);


        btRotina = (Button) findViewById(R.id.btRotina);

        mAuth = FirebaseAuth.getInstance();
        usuario = mAuth.getCurrentUser();

        System.out.println(usuario);




            btRotina.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(DashboardActivity.this, RotinaActivity.class);
                    startActivity(intent);


                }

            });

            btJogoMemoria = (Button) findViewById(R.id.btJogoMemoria);
            btJogoMemoria.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(DashboardActivity.this, JogoMemoriaActivity.class);
                    startActivity(intent);


                }


            });

            btAlfabeto = (Button) findViewById(R.id.btAlfabeto);
            btAlfabeto.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(DashboardActivity.this, AlfabetoActivity.class);
                    startActivity(intent);
                }


            });

            btInteracao = (Button) findViewById(R.id.btInteracao);
            btInteracao.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DashboardActivity.this, InteracaoActivity.class);
                    startActivity(intent);


                }


            });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:{
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(DashboardActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
              return true;

            }
            case R.id.areaResponsavel:{
                Intent intent = new Intent(DashboardActivity.this, AutenticacaoResponsavelActivity.class);
                startActivity(intent);
                return true;
            }
        }
        return super.onOptionsItemSelected(item);

    }




}





