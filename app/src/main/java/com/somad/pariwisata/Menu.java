package com.somad.pariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.somad.pariwisata.kategori_budaya.Budaya;
import com.somad.pariwisata.kategori_pariwisata.Pariwisata;
import com.somad.pariwisata.kategori_tari.Tari;

public class Menu extends AppCompatActivity {

    private Button btn_pariwisata, btn_budaya, btn_tarian, btn_kerajinan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_pariwisata = findViewById(R.id.btn_pariwisata);
        btn_budaya = findViewById(R.id.btn_budaya);
        btn_tarian = findViewById(R.id.btn_tarian);
        btn_kerajinan = findViewById(R.id.btn_kerajinan);

        btn_pariwisata.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Intent i = new Intent(getApplicationContext(), Pariwisata.class);
                startActivity(i);
            }
        });

        btn_budaya.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Intent i = new Intent(getApplicationContext(), Budaya.class);
                startActivity(i);
            }
        });

        btn_tarian.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Intent i = new Intent(getApplicationContext(), Tari.class);
                startActivity(i);
            }
        });

        btn_kerajinan.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){
                Intent i = new Intent(getApplicationContext(), Pariwisata.class);
                startActivity(i);
            }
        });
    }
}
