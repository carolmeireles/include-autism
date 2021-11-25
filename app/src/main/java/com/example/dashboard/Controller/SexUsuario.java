package com.example.dashboard.Controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

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
import com.squareup.picasso.Picasso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SexUsuario extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private ValueEventListener valueEventListener;
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10,
            img11, img12;
    String titulo1, titulo2, titulo3, titulo4, titulo5, titulo6, titulo7, titulo8,
    titulo9, titulo10, titulo11, titulo12,
    imagem1, imagem2, imagem3, imagem4, imagem5, imagem6, imagem7, imagem8,
            imagem9, imagem10, imagem11, imagem12;
    FirebaseAuth usuario = FirebaseAuth.getInstance();
    String id = usuario.getCurrentUser().getUid();




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sexusuario);


        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);

        recuperar();


    }

    @Override
    protected void onStart() {
        super.onStart();

        Date dataAtual = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        final String dataFormatada = dateFormat.format(dataAtual);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("1").setValue(titulo1);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("0").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("2").setValue(titulo2);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("1").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("3").setValue(titulo3);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("2").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("4").setValue(titulo4);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("3").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("5").setValue(titulo5);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("4").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("6").setValue(titulo6);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("5").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("7").setValue(titulo7);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("6").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("8").setValue(titulo8);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("7").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("9").setValue(titulo9);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("8").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("10").setValue(titulo10);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("9").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("11").setValue(titulo11);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("10").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                referencia.child("Relatorio").child(id).child(dataFormatada).child("12").setValue(titulo12);
                referencia.child("InserirRotina").child("SextaFeira").child(id)
                        .child("11").removeValue();
                Toast.makeText(getApplicationContext(), "Rotina realizada com sucesso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SexUsuario.this, SexUsuario.class);
                startActivity(intent);

            }
        });

    }

    public void recuperar(){
        DatabaseReference reference = database.getReference().child("InserirRotina").child("SextaFeira")
                .child(id);

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                imagem1 = dataSnapshot.child("0").child("Imagem").getValue(String.class);
                titulo1 = dataSnapshot.child("0").child("Titulo").getValue(String.class);
                imagem2 = dataSnapshot.child("1").child("Imagem").getValue(String.class);
                titulo2 = dataSnapshot.child("1").child("Titulo").getValue(String.class);
                imagem3 = dataSnapshot.child("2").child("Imagem").getValue(String.class);
                titulo3 = dataSnapshot.child("2").child("Titulo").getValue(String.class);
                imagem4 = dataSnapshot.child("3").child("Imagem").getValue(String.class);
                titulo4 = dataSnapshot.child("3").child("Titulo").getValue(String.class);
                imagem5 = dataSnapshot.child("4").child("Imagem").getValue(String.class);
                titulo5 = dataSnapshot.child("4").child("Titulo").getValue(String.class);
                imagem6 = dataSnapshot.child("5").child("Imagem").getValue(String.class);
                titulo6 = dataSnapshot.child("5").child("Titulo").getValue(String.class);
                imagem7 = dataSnapshot.child("6").child("Imagem").getValue(String.class);
                titulo7 = dataSnapshot.child("6").child("Titulo").getValue(String.class);
                imagem8 = dataSnapshot.child("7").child("Imagem").getValue(String.class);
                titulo8 = dataSnapshot.child("7").child("Titulo").getValue(String.class);
                imagem9 = dataSnapshot.child("8").child("Imagem").getValue(String.class);
                titulo9 = dataSnapshot.child("8").child("Titulo").getValue(String.class);
                imagem10 = dataSnapshot.child("9").child("Imagem").getValue(String.class);
                titulo10 = dataSnapshot.child("9").child("Titulo").getValue(String.class);
                imagem11 = dataSnapshot.child("10").child("Imagem").getValue(String.class);
                titulo11 = dataSnapshot.child("10").child("Titulo").getValue(String.class);
                imagem12 = dataSnapshot.child("11").child("Imagem").getValue(String.class);
                titulo12 = dataSnapshot.child("11").child("Titulo").getValue(String.class);


                Picasso.get().load(imagem1).into(img1);
                Picasso.get().load(imagem2).into(img2);
                Picasso.get().load(imagem3).into(img3);
                Picasso.get().load(imagem4).into(img4);
                Picasso.get().load(imagem5).into(img5);
                Picasso.get().load(imagem6).into(img6);
                Picasso.get().load(imagem7).into(img7);
                Picasso.get().load(imagem8).into(img8);
                Picasso.get().load(imagem9).into(img9);
                Picasso.get().load(imagem10).into(img10);
                Picasso.get().load(imagem11).into(img11);
                Picasso.get().load(imagem12).into(img12);

                System.out.println(imagem1);
                System.out.println(titulo1);

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
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuInicial:{
                Intent intent = new Intent(SexUsuario.this, DashboardActivity.class);
                startActivity(intent);
                return true;

            }

        }
        return super.onOptionsItemSelected(item);

    }
}
