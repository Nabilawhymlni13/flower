package com.example.flower;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.flower.Model.Bunga;

public class DaftarBungaActivity extends AppCompatActivity {
    public final static String BUNGA_TERPILIH ="bunga_obj_key";
    List<Bunga> bungas;
    ListView listView;
    String jenisBunga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_bunga);
        Intent intent = getIntent();
        jenisBunga = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR BERBAGAI Bunga "+jenisBunga.toUpperCase());
        bungas = DataProvider.getBungasByTipe(this,jenisBunga);
        setupListView();
    }

    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_bunga);
        DaftarBungaAdapter adapter = new DaftarBungaAdapter(this,bungas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Bunga terpilih = bungas.get(position);
            bukaProfileBunga(terpilih);
        }
    };

    private void bukaProfileBunga(Bunga bungaTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfileBunga.class);
        intent.putExtra(BUNGA_TERPILIH, bungaTerpilih);
        startActivity(intent);
    }


}