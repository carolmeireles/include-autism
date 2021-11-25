package com.example.dashboard.Model;

import android.content.Context;

import com.example.dashboard.Util.JavaMailAPI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class RecuperarSenhaModel {
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    FirebaseAuth usuario = FirebaseAuth.getInstance();
    String id = usuario.getCurrentUser().getUid();
    String senhaTemp;

    public RecuperarSenhaModel(){
    }

    public void resetSenha(){
        UUID uuid = UUID.randomUUID();
        String myRandom = uuid.toString();
        senhaTemp = myRandom.substring(0,6);
        referencia.child("ResetSenha").child(id).setValue(senhaTemp);
    }

    public void EnviarEmail(Context context){
        String email = usuario.getCurrentUser().getEmail();
        String mensagem = "Recuperação de senha";
        String titulo = "Sua senha temporária é "+senhaTemp;

        JavaMailAPI javaMailAPI = new JavaMailAPI(context, email, mensagem, titulo);

        javaMailAPI.execute();

    }
}
