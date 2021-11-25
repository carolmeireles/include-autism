package com.example.dashboard.DAO;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;

public class RotinaDAO {

    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    FirebaseAuth usuario = FirebaseAuth.getInstance();
    String id, titulo;
    String[] Imagem, Titulo, Image;


    public RotinaDAO(){
    }

    public void salvarRotina(ArrayList<String> imagemRecebida, ArrayList<String> tituloRecebido) {

        id = usuario.getCurrentUser().getUid();
        for (int i = 0; i < imagemRecebida.size(); i++) {
            referencia.child("InserirRotina").child("SegundaFeira")
                    .child(id).child(Integer.toString(i)).child("Imagem").setValue(imagemRecebida.get(i));
            referencia.child("InserirRotina").child("SegundaFeira")
                    .child(id).child(Integer.toString(i)).child("Titulo").setValue(tituloRecebido.get(i));

        }
    }

    public void limparRotina(String diaSemana) {

        id = usuario.getCurrentUser().getUid();
        referencia.child("InserirRotina").child(diaSemana)
                .child(id).removeValue();

    }

    public void removeRotinaRealizada (String diaSemana, String numero){
        referencia.child("InserirRotina").child(diaSemana).child(id)
                .child(numero).removeValue();
    }


    public void inserirRelatorioRotina (String dataFormatada, final String numero, String diaSemana, final String num){
        id = usuario.getCurrentUser().getUid();


        DatabaseReference reference = referencia.child("InserirRotina").child(diaSemana);

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
             titulo = dataSnapshot.child(id).child(numero).child("Titulo").getValue(String.class);
            System.out.println(titulo);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        referencia.child("Relatorio").child(id).child(dataFormatada).child(num).setValue(titulo);
        System.out.println("t:"+titulo);
    }



    public String[] recuperarRotina(String diaSemana){


        id = usuario.getCurrentUser().getUid();
        DatabaseReference reference = referencia.child("InserirRotina").child(diaSemana)
                .child(id);

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                Imagem[0] = dataSnapshot.child("0").child("Imagem").getValue(String.class);
                Imagem[1] = dataSnapshot.child("1").child("Imagem").getValue(String.class);
                Imagem[2] = dataSnapshot.child("2").child("Imagem").getValue(String.class);
                Imagem[3] = dataSnapshot.child("3").child("Imagem").getValue(String.class);
                Imagem[4] = dataSnapshot.child("4").child("Imagem").getValue(String.class);
                Imagem[5] = dataSnapshot.child("5").child("Imagem").getValue(String.class);
                Imagem[6] = dataSnapshot.child("6").child("Imagem").getValue(String.class);
                Imagem[7] = dataSnapshot.child("7").child("Imagem").getValue(String.class);
                Imagem[8] = dataSnapshot.child("8").child("Imagem").getValue(String.class);
                Imagem[9] = dataSnapshot.child("9").child("Imagem").getValue(String.class);
                Imagem[10] = dataSnapshot.child("10").child("Imagem").getValue(String.class);
                Imagem[11] = dataSnapshot.child("11").child("Imagem").getValue(String.class);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
            return Imagem;

    }

    public String[] pegaImagemRecuperaRotina(){
        return this.Imagem;
    }



    public void listarRotinas(){

        DatabaseReference reference = referencia.child("ImagensRotina");

        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                Titulo[0] = dataSnapshot.child("01").child("Titulo").getValue(String.class);
                Image[0] = dataSnapshot.child("01").child("Imagem").getValue(String.class);
                Titulo[1] = dataSnapshot.child("02").child("Titulo").getValue(String.class);
                Image[1] = dataSnapshot.child("02").child("Imagem").getValue(String.class);
                Titulo[2] = dataSnapshot.child("03").child("Titulo").getValue(String.class);
                Image[2] = dataSnapshot.child("03").child("Imagem").getValue(String.class);
                Titulo[3] = dataSnapshot.child("04").child("Titulo").getValue(String.class);
                Image[3] = dataSnapshot.child("04").child("Imagem").getValue(String.class);
                Titulo[4] = dataSnapshot.child("05").child("Titulo").getValue(String.class);
                Image[4] = dataSnapshot.child("05").child("Imagem").getValue(String.class);
                Titulo[5] = dataSnapshot.child("06").child("Titulo").getValue(String.class);
                Image[5] = dataSnapshot.child("06").child("Imagem").getValue(String.class);
                Titulo[6] = dataSnapshot.child("07").child("Titulo").getValue(String.class);
                Image[6] = dataSnapshot.child("07").child("Imagem").getValue(String.class);
                Titulo[7] = dataSnapshot.child("08").child("Titulo").getValue(String.class);
                Image[7] = dataSnapshot.child("08").child("Imagem").getValue(String.class);
                Titulo[8] = dataSnapshot.child("09").child("Titulo").getValue(String.class);
                Image[8] = dataSnapshot.child("09").child("Imagem").getValue(String.class);
                Titulo[9] = dataSnapshot.child("10").child("Titulo").getValue(String.class);
                Image[9] = dataSnapshot.child("10").child("Imagem").getValue(String.class);
                Titulo[10] = dataSnapshot.child("11").child("Titulo").getValue(String.class);
                Image[10] = dataSnapshot.child("11").child("Imagem").getValue(String.class);
                Titulo[11] = dataSnapshot.child("12").child("Titulo").getValue(String.class);
                Image[11] = dataSnapshot.child("12").child("Imagem").getValue(String.class);
                Titulo[12] = dataSnapshot.child("13").child("Titulo").getValue(String.class);
                Image[12] = dataSnapshot.child("13").child("Imagem").getValue(String.class);
                Titulo[13] = dataSnapshot.child("14").child("Titulo").getValue(String.class);
                Image[13] = dataSnapshot.child("14").child("Imagem").getValue(String.class);
                Titulo[14] = dataSnapshot.child("15").child("Titulo").getValue(String.class);
                Image[14] = dataSnapshot.child("15").child("Imagem").getValue(String.class);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }

    public String[] pegaImageListarRotina(){
        return this.Image;
    }

    public String[] pegaTituloListarRotina(){
        return this.Titulo;
    }



}
