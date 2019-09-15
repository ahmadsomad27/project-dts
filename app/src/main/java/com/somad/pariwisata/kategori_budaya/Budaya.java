package com.somad.pariwisata.kategori_budaya;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.somad.pariwisata.R;

import java.util.ArrayList;
import java.util.List;

public class Budaya extends AppCompatActivity implements BudayaAdapter.OnBudayaClickListener{

    public RecyclerView rv;
    public BudayaAdapter budayaAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<ModelBudaya> listBudaya = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

        rv = findViewById(R.id.rvBudaya);

        listBudaya.add(new ModelBudaya("Larung Sesaji",
                "Ritual larung sesaji ini merupakan simbol menyatunya alam semesta dengan manusia. Sebagai sarana memuji syukur pada semua bentuk Kekuasaan Tuhan",
                "https://khabarjoss.files.wordpress.com/2011/08/jalannya-prosesi-larung-sesaji-di-telaga-ngebel-ponorogo23.jpg"));

        listBudaya.add(new ModelBudaya("Ritual Tiban",
                "Sebuah permintaan permohonan kepada yang maha kuasa berharap untuk diturunkanya hujan",
                "http://4.bp.blogspot.com/_KfIshTueS2w/TQZn_rSuYpI/AAAAAAAAAAU/Db98vsN5Ims/s1600/kesenian-tiban.jpg"));

        listBudaya.add(new ModelBudaya("Larung Kepala Sapi",
                "Larung sesaji adalah sebagai ungkapan terima kasih kepada Tuhan Yang Maha Esa atas limpahan berkah yang diberikan kepada masyarakat Kota Kediri.",
                "http://www.phrikediriraya.com/assets/Image/Larung%20sesaji%201.jpg"));

        listBudaya.add(new ModelBudaya("Ritual Sesaji Gunung Kelud",
                "Penolak bala dari kemarahan Lembu Suro, salah satu punggawa kerajaan Majapahit yang gagal mempersunting putri Raja Kadiri, Dewi Kilisuci",
                "https://cdns.klimg.com/merdeka.com/i/w/news/2014/02/14/321856/670x335/gunung-kelud-dan-ritual-suci-larung-sesaji.jpg"));

        listBudaya.add(new ModelBudaya("Pusaka Jawatimuran",
                "Mensucikan pusaka yang dimiliki semua warga",
                "http://4.bp.blogspot.com/-BKzkSWN-dUw/U_vtrXDtgKI/AAAAAAAAAxY/Er_s5Xa-Rdg/s1600/Ritual%2Bdi%2Bpamuksan%2BJoyoboyo.jpg"));

        listBudaya.add(new ModelBudaya("Upacara Ritual Ruwatan",
                "Suatu upacara atau ritual yang bertujuan untuk mengusir nasib buruk atau kesialan yang ada pada seseorang",
                "https://2.bp.blogspot.com/-BLH7_cWlFtg/WU470A1k3II/AAAAAAAABwA/3xJdlwnrwi8OuHhcnVJwPoQzqmSGk3CwACLcBGAs/s1600/45.jpg"));

        budayaAdapter = new BudayaAdapter(listBudaya);
        budayaAdapter.setListener((BudayaAdapter.OnBudayaClickListener) this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(budayaAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position){
        ModelBudaya budayaAdapter = listBudaya.get(position);
        Toast.makeText(this, budayaAdapter.getName(), Toast.LENGTH_LONG).show();
    }

}
