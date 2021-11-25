package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.DAO.ResponsavelDAO;
import com.example.dashboard.R;


public class RecuperarSenhaActivity extends AppCompatActivity {

    private Button bt_salvar;
    private TextView tvsenhaTemp, tvsenhaNova;
    private String senhaAtual, senhaT;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recuperarsenha);

        bt_salvar = (Button) findViewById(R.id.bt_salvarSenha);
        tvsenhaTemp = (TextView) findViewById(R.id.et_senhaTemp);
        tvsenhaNova = (TextView) findViewById(R.id.et_senhaNova);
        final ResponsavelDAO recuperarSenha = new ResponsavelDAO();


        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                senhaAtual = tvsenhaNova.getText().toString();
                senhaT = tvsenhaTemp.getText().toString();


                if(senhaAtual.length() < 8){

                    Toast.makeText(getApplicationContext(), "Digite uma senha com pelo menos 8 caracteres!", Toast.LENGTH_LONG).show();

                } else {
                    recuperarSenha.alterarSenha(senhaAtual, senhaT, getApplicationContext());

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
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuInicial:{
                Intent intent = new Intent(RecuperarSenhaActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
