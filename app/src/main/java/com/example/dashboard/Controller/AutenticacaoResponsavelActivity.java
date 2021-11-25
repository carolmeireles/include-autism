package com.example.dashboard.Controller;


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


import com.example.dashboard.DAO.ResponsavelDAO;
import com.example.dashboard.Model.RecuperarSenhaModel;
import com.example.dashboard.R;
import com.google.firebase.database.ValueEventListener;

public class AutenticacaoResponsavelActivity extends AppCompatActivity {


    private EditText et_senha;
    private Button bt_acessar, bt_cadastrar, bt_novaSenha;

    private ValueEventListener valueEvent;


    private String idAtual, senhaAtual, senhadigitada, senhaTemp, caminho;

    final ResponsavelDAO responsavelDAO = new ResponsavelDAO();
    final RecuperarSenhaModel recuperarSenha = new RecuperarSenhaModel();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autenticacaoresponsavel);

        et_senha = (EditText) findViewById(R.id.et_senha);
        bt_acessar = (Button) findViewById(R.id.bt_acessar);
        bt_cadastrar = (Button) findViewById(R.id.bt_cadastrar);
        bt_novaSenha = (Button) findViewById(R.id.bt_novaSenha);


        responsavelDAO.listarDados();

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                senhadigitada = et_senha.getText().toString();
                responsavelDAO.listarDados();

                if (senhadigitada == null || senhadigitada.length() < 8) {
                    Toast.makeText(getApplicationContext(), "Digite uma senha válida", Toast.LENGTH_LONG).show();
                }
                else if(senhaAtual != null){

                    Toast.makeText(getApplicationContext(), "Esse usuário já está cadastrado!", Toast.LENGTH_LONG).show();

                }  else {

                    responsavelDAO.inserirSenha(senhadigitada);

                    Toast.makeText(getApplicationContext(), "Senha cadastrada com sucesso!", Toast.LENGTH_LONG).show();

                }
                responsavelDAO.listarDados();
            }
        });

        bt_novaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                recuperarSenha.resetSenha();
                recuperarSenha.EnviarEmail(getApplicationContext());
                Intent intent = new Intent(AutenticacaoResponsavelActivity.this, RecuperarSenhaActivity.class);
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
                    responsavelDAO.listarDados();

                if (senhadigitada == null || caminho == null){
                    Toast.makeText(getApplicationContext(), "Digite uma senha válida!", Toast.LENGTH_LONG).show();
                }
                else {
                    responsavelDAO.acessar(senhadigitada, getApplicationContext());
                }
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
                Intent intent = new Intent(AutenticacaoResponsavelActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }

}


