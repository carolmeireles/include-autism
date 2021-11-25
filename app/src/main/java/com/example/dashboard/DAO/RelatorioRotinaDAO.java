package com.example.dashboard.DAO;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RelatorioRotinaDAO {

    FirebaseAuth usuario = FirebaseAuth.getInstance();
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    String id;
    String Rotina[];

    public RelatorioRotinaDAO(){

    }

    public String[] recuperar(final String date, final Context context){

        id = usuario.getCurrentUser().getUid();
        DatabaseReference reference = database.getReference().child("Relatorio").child(id);


        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                Rotina[0] = dataSnapshot.child(date).child("1").getValue(String.class);
                Rotina[1] = dataSnapshot.child(date).child("2").getValue(String.class);
                Rotina[2] = dataSnapshot.child(date).child("3").getValue(String.class);
                Rotina[3] = dataSnapshot.child(date).child("4").getValue(String.class);
                Rotina[4] = dataSnapshot.child(date).child("5").getValue(String.class);
                Rotina[5] = dataSnapshot.child(date).child("6").getValue(String.class);
                Rotina[6] = dataSnapshot.child(date).child("7").getValue(String.class);
                Rotina[7] = dataSnapshot.child(date).child("8").getValue(String.class);
                Rotina[8] = dataSnapshot.child(date).child("9").getValue(String.class);
                Rotina[9] = dataSnapshot.child(date).child("10").getValue(String.class);
                Rotina[10] = dataSnapshot.child(date).child("11").getValue(String.class);
                Rotina[11] = dataSnapshot.child(date).child("12").getValue(String.class);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return Rotina;

    }

    public String[] pegaRelatorioRotina(){
        return this.Rotina;
    }
}
