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

import com.example.dashboard.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RelatorioRotina extends AppCompatActivity {

    private Button bt_consultar;
    private EditText et_date;
    private TextView txt_rotina, txt_rotina1,txt_rotina2, txt_rotina3, txt_rotina4,
            txt_rotina5, txt_rotina6, txt_rotina7, txt_rotina8, txt_rotina9,
            txt_rotina10, txt_rotina11, txt_rotina12;
    private String date;
    private String id;
    FirebaseAuth usuario = FirebaseAuth.getInstance();
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

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

        id = usuario.getCurrentUser().getUid();

        bt_consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                recuperar();

            }


        });
    }

    public void recuperar(){
       DatabaseReference reference = database.getReference().child("Relatorio").child(id);
        date = et_date.getText().toString();
        System.out.println(date);

       reference.addListenerForSingleValueEvent(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                   String rotina1 = dataSnapshot.child(date).child("1").getValue(String.class);
                   String rotina2 = dataSnapshot.child(date).child("2").getValue(String.class);
                   String rotina3 = dataSnapshot.child(date).child("3").getValue(String.class);
                   String rotina4 = dataSnapshot.child(date).child("4").getValue(String.class);
                   String rotina5 = dataSnapshot.child(date).child("5").getValue(String.class);
                   String rotina6 = dataSnapshot.child(date).child("6").getValue(String.class);
                   String rotina7 = dataSnapshot.child(date).child("7").getValue(String.class);
                   String rotina8 = dataSnapshot.child(date).child("8").getValue(String.class);
                   String rotina9 = dataSnapshot.child(date).child("9").getValue(String.class);
                   String rotina10 = dataSnapshot.child(date).child("10").getValue(String.class);
                   String rotina11 = dataSnapshot.child(date).child("11").getValue(String.class);
                   String rotina12 = dataSnapshot.child(date).child("12").getValue(String.class);


                   if (rotina1 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina1.setText("   " + rotina1);
                   }
                   if (rotina2 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina2.setText("   " + rotina2);
                   }
                   if (rotina3 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina3.setText("   " + rotina3);
                   }
                   if (rotina4 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina4.setText("   " + rotina4);
                   }
                   if (rotina5 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina5.setText("   " + rotina5);
                   }
                   if (rotina6 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina6.setText("   " + rotina6);
                   }
                   if (rotina7 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina7.setText("   " + rotina7);
                   }
                   if (rotina8 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina8.setText("   " + rotina8);
                   }
                   if (rotina9 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina9.setText("   " + rotina9);
                   }
                   if (rotina10 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina10.setText("   " + rotina10);
                   }
                   if (rotina11 == null) {
                       System.out.println("não faz nada");
                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina11.setText("   " + rotina11);
                   }
                   if (rotina12 == null) {

                   } else {
                       txt_rotina.setText("Rotinas realizadas do dia " + date);
                       txt_rotina12.setText("   " + rotina12);
                   }

                   if (rotina1 == null && rotina2 == null && rotina3 == null &&
                   rotina4 == null && rotina5 == null && rotina6 == null &&
                   rotina7 == null && rotina8 == null && rotina9 == null &&
                   rotina10 == null && rotina11 == null && rotina12 == null){
                       Toast.makeText(getApplicationContext(), "Não existe registro para essa data", Toast.LENGTH_LONG).show();
                   }

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
                Intent intent = new Intent(RelatorioRotina.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
