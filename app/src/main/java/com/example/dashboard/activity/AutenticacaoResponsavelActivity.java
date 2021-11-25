package com.example.dashboard.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



import com.example.dashboard.R;
import com.example.dashboard.config.JavaMailAPI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;
import java.util.UUID;

public class AutenticacaoResponsavelActivity extends AppCompatActivity {


    private EditText et_senha;
    private Button bt_acessar, bt_cadastrar, bt_novaSenha;
    FirebaseAuth usuario = FirebaseAuth.getInstance();

    String id = usuario.getCurrentUser().getUid();




    private FirebaseDatabase dataBase = FirebaseDatabase.getInstance();
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private ValueEventListener valueEvent;


    private String idAtual, senhaAtual, senhadigitada, senhaTemp, caminho;
    ArrayList<String> responsavel = new ArrayList<String>();



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autenticacaoresponsavel_activity);

        et_senha = (EditText) findViewById(R.id.et_senha);
        bt_acessar = (Button) findViewById(R.id.bt_acessar);
        bt_cadastrar = (Button) findViewById(R.id.bt_cadastrar);
        bt_novaSenha = (Button) findViewById(R.id.bt_novaSenha);


        Ouvinte();

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Ouvinte();
                senhadigitada = et_senha.getText().toString();


                if (senhadigitada == null || senhadigitada.length() < 8) {
                    Toast.makeText(getApplicationContext(), "Digite uma senha válida", Toast.LENGTH_LONG).show();
                }
                else if(senhaAtual != null){
                        Ouvinte();
                    Toast.makeText(getApplicationContext(), "Esse usuário já está cadastrado!", Toast.LENGTH_LONG).show();

                }  else {
                    referencia.child("Responsavel").child(id).setValue(BCrypt.hashpw(senhadigitada, BCrypt.gensalt()));
                    Toast.makeText(getApplicationContext(), "Senha cadastrada com sucesso!", Toast.LENGTH_LONG).show();

                }
                Ouvinte();
            }
        });

        bt_novaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ResetSenha();
                EnviarEmail();
                Intent intent = new Intent(AutenticacaoResponsavelActivity.this, RecuperarSenha.class);
                startActivity(intent);


            }


        });



    }

    @Override
    protected void onStart() {
        super.onStart();


        bt_acessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    senhadigitada = et_senha.getText().toString();
                    Ouvinte();

                if (senhadigitada == null || caminho == null){
                    Toast.makeText(getApplicationContext(), "Digite uma senha válida!", Toast.LENGTH_LONG).show();
                }
                else if (BCrypt.checkpw(senhadigitada, senhaAtual)) {
                    Intent intent = new Intent(AutenticacaoResponsavelActivity.this, AreaResponsavelActivity.class);
                    startActivity(intent);
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Senha não confere!", Toast.LENGTH_LONG).show();

                    }
                }

        });

    }

    private void ResetSenha (){
        UUID uuid = UUID.randomUUID();
        String myRandom = uuid.toString();
        senhaTemp = myRandom.substring(0,6);
        referencia.child("ResetSenha").child(id).setValue(senhaTemp);
    }

    private void EnviarEmail(){
        String email = usuario.getCurrentUser().getEmail();
        String mensagem = "Recuperação de senha";
        String titulo = "Sua senha temporária é "+senhaTemp;

        JavaMailAPI javaMailAPI = new JavaMailAPI(this, email, mensagem, titulo);

        javaMailAPI.execute();

    }


    private void Ouvinte (){

        final DatabaseReference reference = dataBase.getReference();
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (id != null) {
                    senhaAtual = dataSnapshot.child("Responsavel")
                            .child(id).getValue(String.class);
                    caminho = dataSnapshot.child("Responsavel").getKey();

                }
            }



            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}

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
                Intent intent = new Intent(AutenticacaoResponsavelActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }

}


