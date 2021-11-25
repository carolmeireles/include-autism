package com.example.dashboard.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.mindrot.jbcrypt.BCrypt;

public class RecuperarSenha extends AppCompatActivity {

    private Button bt_salvar;
    private TextView tvsenhaTemp, tvsenhaNova;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private String id, senhaAtual, senhaT, senhaTemp;
    FirebaseAuth usuario = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperarsenha);

        bt_salvar = (Button) findViewById(R.id.bt_salvarSenha);
        tvsenhaTemp = (TextView) findViewById(R.id.et_senhaTemp);
        tvsenhaNova = (TextView) findViewById(R.id.et_senhaNova);

        id = usuario.getCurrentUser().getUid();
        RecuperarDados();



        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                senhaAtual = tvsenhaNova.getText().toString();
                senhaT = tvsenhaTemp.getText().toString();


                if(senhaAtual.length() < 8){

                    Toast.makeText(getApplicationContext(), "Digite uma senha com pelo menos 8 caracteres!", Toast.LENGTH_LONG).show();

                } else if (senhaT.equals(senhaTemp)){
                        referencia.child("Responsavel").child(id).setValue(BCrypt.hashpw(senhaAtual, BCrypt.gensalt()));
                        Toast.makeText(getApplicationContext(), "Senha atualizada com sucesso!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(RecuperarSenha.this, AutenticacaoResponsavelActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                    Toast.makeText(getApplicationContext(), "Senha temporária não confere!", Toast.LENGTH_LONG).show();
                }

            }


        });



    }

    public void RecuperarDados(){
        DatabaseReference reference = database.getReference();
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                senhaTemp = dataSnapshot.child("ResetSenha").child(id).getValue(String.class);
                System.out.println(senhaTemp);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

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
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuInicial:{
                Intent intent = new Intent(RecuperarSenha.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
