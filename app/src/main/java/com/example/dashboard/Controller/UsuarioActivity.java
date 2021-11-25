package com.example.dashboard.Controller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;


import com.example.dashboard.Model.UsuarioModel;
import com.example.dashboard.R;
import com.google.firebase.database.core.view.View;


public class UsuarioActivity extends AppCompatActivity {

    private Button bt_signin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        bt_signin = (Button) findViewById(R.id.signInButton);

        UsuarioModel login = new UsuarioModel();

        bt_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = view.getId();
                if (i == R.id.signInButton){
                    signIn();
                }

            }
        });


    }
}
