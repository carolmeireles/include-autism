package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.dashboard.DAO.RelatorioRotinaDAO;
import com.example.dashboard.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RelatorioRotinaActivity extends AppCompatActivity {

    private Button bt_consultar;
    private EditText et_date;
    private TextView txt_rotina, txt_rotina1,txt_rotina2, txt_rotina3, txt_rotina4,
            txt_rotina5, txt_rotina6, txt_rotina7, txt_rotina8, txt_rotina9,
            txt_rotina10, txt_rotina11, txt_rotina12;
    private String date;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relatoriorotina);

        bt_consultar = (Button) findViewById(R.id.btconsulta);
        et_date = (EditText) findViewById(R.id.etdate);
        txt_rotina = (TextView) findViewById(R.id.txtRotina);
        txt_rotina1 = (TextView) findViewById(R.id.txtRotina1);
        txt_rotina2 = (TextView) findViewById(R.id.txtRotina2);
        txt_rotina3 = (TextView) findViewById(R.id.txtRotina3);
        txt_rotina4 = (TextView) findViewById(R.id.txtRotina4);
        txt_rotina5 = (TextView) findViewById(R.id.txtRotina5);
        txt_rotina6 = (TextView) findViewById(R.id.txtRotina6);
        txt_rotina7 = (TextView) findViewById(R.id.txtRotina7);
        txt_rotina8 = (TextView) findViewById(R.id.txtRotina8);
        txt_rotina9 = (TextView) findViewById(R.id.txtRotina9);
        txt_rotina10 = (TextView) findViewById(R.id.txtRotina10);
        txt_rotina11 = (TextView) findViewById(R.id.txtRotina11);
        txt_rotina12 = (TextView) findViewById(R.id.txtRotina12);

        date = et_date.getText().toString();

        bt_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RelatorioRotinaDAO relatorioRotinaDAO = new RelatorioRotinaDAO();
                String Rotina[];
                relatorioRotinaDAO.recuperar(date, getApplicationContext());

                Rotina = relatorioRotinaDAO.pegaRelatorioRotina();

                if (Rotina[0] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina1.setText("   " + Rotina[0]);
                }
                if (Rotina[1] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina2.setText("   " + Rotina[1]);
                }
                if (Rotina[2] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina3.setText("   " + Rotina[2]);
                }
                if (Rotina[3] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina4.setText("   " + Rotina[3]);
                }
                if (Rotina[4] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina5.setText("   " + Rotina[4]);
                }
                if (Rotina[5] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina6.setText("   " + Rotina[5]);
                }
                if (Rotina[6] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina7.setText("   " + Rotina[6]);
                }
                if (Rotina[7] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina8.setText("   " + Rotina[7]);
                }
                if (Rotina[8] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina9.setText("   " + Rotina[9]);
                }
                if (Rotina[9]!= null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina10.setText("   " + Rotina[9]);
                }
                if (Rotina[10] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina11.setText("   " + Rotina[10]);
                }
                if (Rotina[11] != null) {
                    txt_rotina.setText("Rotinas realizadas do dia " + date);
                    txt_rotina12.setText("   " + Rotina[11]);
                }

                if (Rotina[0] == null && Rotina[1] == null && Rotina[2] == null &&
                        Rotina[3] == null && Rotina[4] == null && Rotina[5] == null &&
                        Rotina[6] == null && Rotina[7] == null && Rotina[8] == null &&
                        Rotina[9] == null && Rotina[10] == null && Rotina[11] == null){
                    Toast.makeText(RelatorioRotinaActivity.this, "Não existe registro para essa data", Toast.LENGTH_LONG).show();
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
                Intent intent = new Intent(RelatorioRotinaActivity.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
