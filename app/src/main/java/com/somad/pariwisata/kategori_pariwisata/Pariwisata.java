package com.somad.pariwisata.kategori_pariwisata;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.somad.pariwisata.R;

import java.util.ArrayList;
import java.util.List;

public class Pariwisata extends AppCompatActivity implements WisataAdapter.OnWisataClickListener {
    public RecyclerView rv;
    public WisataAdapter wisataAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<Wisata> listWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pariwisata);

        rv = findViewById(R.id.rvWisata);

        listWisata.add(new Wisata("Air Terjun Irenggolo",
                "Dusun Besuki, Desa Jugo, Kecamatan Mojo, Hutan, Blimbing, Kediri, Jawa Timur 64162", "https://i.ytimg.com/vi/j-gMlnstDZM/maxresdefault.jpg"));
        listWisata.add(new Wisata("Simpang Lima Gumul",
                "Tugurejo, Kec. Ngasem, Kediri, Jawa Timur 64182",
                "https://s.kaskus.id/images/2018/03/14/9860749_20180314091837.jpg"));

        listWisata.add(new Wisata("Taman Brantas",
                "Pocanan, Kec. Kota Kediri, Kediri, Jawa Timur 64129",
                "https://www.cariinfoyuk.com/wp-content/uploads/2018/12/taman-brantas-1024x768.jpg"));

        listWisata.add(new Wisata("Taman Bunga Matahari",
                "Jl. Selomangleng No.143, Pojok, Kec. Mojoroto, Kota Kediri, Jawa Timur 64115",
                "https://sumatratimes.com/wp-content/uploads/2019/06/sunflower.-f-net.jpg"));
        listWisata.add(new Wisata("Gumul Paradise Island",
                "Kompleks Simpang Lima Gumul, Sumberejo, Dadapan, Sumberejo, Kec. Ngasem, Kediri, Jawa Timur 64182",
                "https://wisatalengkap.com/wp-content/uploads/2017/03/Gumul-Paradise-Island.jpg"));

        listWisata.add(new Wisata("Hutan Joyoboyo",
                "Banjaran, Kec. Kota Kediri, Kediri, Jawa Timur 64129",
                "https://bosniatravel.net/wp-content/uploads/2019/01/Taman-wisata-kediri-hutan-joyoboyo.jpg"));

        wisataAdapter = new WisataAdapter(listWisata);
        wisataAdapter.setListener((WisataAdapter.OnWisataClickListener) this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(wisataAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position){
        Wisata wisata = listWisata.get(position);
        Toast.makeText(this, wisata.getName(), Toast.LENGTH_LONG).show();
    }
}
