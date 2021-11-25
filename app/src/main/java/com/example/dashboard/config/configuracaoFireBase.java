package com.example.dashboard.config;

import com.google.firebase.auth.FirebaseAuth;

public class configuracaoFireBase {

    private static FirebaseAuth autenticacao;

    //retorna a instancia do FirebaseAuth

    public static FirebaseAuth getFirebaseAutenticacao(){
        if(autenticacao == null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

    }
}
