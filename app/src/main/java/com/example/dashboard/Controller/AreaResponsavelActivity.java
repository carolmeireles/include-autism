package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuInflater;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dashboard.R;


public class AreaResponsavelActivity extends AppCompatActivity {

    private Button bt_adicionarRotina, bt_relatorioRotina;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arearesponsavel);

        bt_adicionarRotina = (Button) findViewById(R.id.bt_adicionarRotina);
        bt_relatorioRotina = (Button) findViewById(R.id.bt_relatorioRotinas);


        bt_adicionarRotina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AreaResponsavelActivity.this, DiasSemanaActivity.class);
                startActivity(intent);
            }
        });

        bt_relatorioRotina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AreaResponsavelActivity.this, RelatorioRotinaActivity.class);
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
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuInicial:{
                Intent intent = new Intent(AreaResponsavelActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
