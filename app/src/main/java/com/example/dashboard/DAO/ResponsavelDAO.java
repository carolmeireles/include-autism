package com.example.dashboard.DAO;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.mindrot.jbcrypt.BCrypt;

public class ResponsavelDAO {
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    FirebaseAuth usuario = FirebaseAuth.getInstance();
    String id = usuario.getCurrentUser().getUid();
    String senhaAtual, caminho, senhaTemp;

    public ResponsavelDAO(){

    }

    public void inserirSenha(String senha){
        listarDados();
        if (senhaAtual == null)
        referencia.child("Responsavel").child(id).setValue(BCrypt.hashpw(senha, BCrypt.gensalt()));

    }

    public void alterarSenha(String senha, String senhaT, Context context){
        listarDados();
        if(senhaTemp.equals(senhaT)){
            referencia.child("Responsavel").child(id).setValue(BCrypt.hashpw(senha, BCrypt.gensalt()));
            Toast.makeText(context, "Senha atualizada com sucesso!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "Senha temporária não confere!", Toast.LENGTH_LONG).show();
        }

    }

    public void listarDados(){
        referencia.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if (id != null) {
                    senhaAtual = dataSnapshot.child("Responsavel")
                            .child(id).getValue(String.class);
                    caminho = dataSnapshot.child("Responsavel").getKey();
                    senhaTemp = dataSnapshot.child("ResetSenha").child(id).getValue(String.class);

                }
            }



            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {}

        });
    }

    public void acessar(String senha, Context context){
        listarDados();
        if(BCrypt.checkpw(senha, senhaAtual)){

        } else {
            Toast.makeText(context, "Senha não confere!", Toast.LENGTH_LONG).show();
        }
    }
    }
