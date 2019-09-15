package com.somad.pariwisata.kategori_tari;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.somad.pariwisata.R;
import com.somad.pariwisata.kategori_budaya.BudayaAdapter;

import java.util.ArrayList;
import java.util.List;

public class Tari extends AppCompatActivity implements TariAdapter.OnTariClickListener {
    public RecyclerView rv;
    public TariAdapter tariAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<ModelTari> listTari = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari);

        rv = findViewById(R.id.rvTari);

        listTari.add(new ModelTari("Tari Kethek Ogleng",
                "Kisah percintaan Panji Asmorobangun dengan Dewi Sekartaji dalam Cerita Panji. Kera atau kethek yang ditampilkan pada cerita tersebut adalah jelmaan dari Panji Asmorobangun.",
                "https://gpswisataindonesia.info/wp-content/uploads/2019/06/Tari-Kethek-Ogleng.jpg"));

        listTari.add(new ModelTari("Tari Dewi Songgo Langit",
                "Untuk menentukan siapa pemenang dari lamaran tersebut, Dewi Songgo Langit menggelar sayembara. Siapa pangeran yang dapat menghadirkan kesenian khas dan unik yang mampu memikat masyarakat",
                "https://gpswisataindonesia.info/wp-content/uploads/2019/06/Tari-Dewi-Songgo-Langit.jpg"));

        listTari.add(new ModelTari("Tari Ledhek",
                "Menggambarkan seorang penari Tayub perempuan yang kerap dilecehkan. Namun sang Ledhek tetap teguh pada pendirian",
                "https://gpswisataindonesia.info/wp-content/uploads/2019/06/tari-tayub-ledhek-kota-kediri-di-tmii-jakarta.jpg"));

        listTari.add(new ModelTari("Tari Barong",
                "Tari barong sendiri merupakan bagian dari tarian khas Kediri, yakni jaranan. Kesenian jaranan sudah lama menjadi kekayaan seni masyarakat Kediri. ",
                "http://kabarone.com/wp-content/uploads/2017/07/barong.jpg"));

        listTari.add(new ModelTari("Tari Langen Putri Gandasari",
                "Tarian yang menggambarkan upacara sesaji sebagai rasa syukur kepada Tuhan. Putri Raja pewaris takhta Kahuripan, Kerajaan Airlangga, Dewi Kilisuci, dalam cerita ini, sekaligus menggambarkan Raja dan Keraton adalah simbol puncak peradaban pada masa itu.",
                "https://gpswisataindonesia.info/wp-content/uploads/2019/06/15langen.jpg"));

        listTari.add(new ModelTari("Tari Topeng Panji Gagahan Alus",
                "Sebagai filosofi tentang kegagahan seorang Panji kesatrian yang diidolakan oleh masyarakat pada masa itu, dimana kesatria Panji mempunyai prinsip sederhana dan arif serta bijaksana dalam menghadapi tempaan lelakon urip nerimo dan sabar.",
                "https://gpswisataindonesia.info/wp-content/uploads/2019/06/Tari-Topeng-Panji-Gagahan-Alus.jpeg"));

        tariAdapter = new TariAdapter(listTari);
        tariAdapter.setListener((TariAdapter.OnTariClickListener) this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(tariAdapter);
        rv.setLayoutManager(layoutManager);
    }

    @Override
    public void onClick(View view, int position) {
        ModelTari tariAdapter = listTari.get(position);
        Toast.makeText(this, tariAdapter.getName(), Toast.LENGTH_LONG).show();
    }
}
