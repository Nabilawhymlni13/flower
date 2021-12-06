package com.example.flower;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.flower.Model.Bunga;

public class ProfileBunga extends AppCompatActivity {

    Bunga bunga;
    TextView txJudul,txJenis,txAsal,txDeskripsi;
    ImageView ivFotoBunga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_bentuk);
        Intent intent = getIntent();
        bunga = (Bunga) intent.getSerializableExtra(DaftarBungaActivity.BUNGA_TERPILIH);
        inisialisasiView();
        tampilkanProfil(bunga);
    }

    private void inisialisasiView() {
        txJudul = findViewById(R.id.txJudul);
        txJenis = findViewById(R.id.txJenis);
        txAsal = findViewById(R.id.txAsal);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoBunga = findViewById(R.id.gambarBunga);
    }


    private void tampilkanProfil(Bunga bunga) {
        Log.d("Profil","Menampilkan "+bunga.getJenis());
        txJudul.setText(bunga.getJenis());
        txJenis.setText(bunga.getNama());
        txAsal.setText(bunga.getAsal());
        txDeskripsi.setText(bunga.getDeskripsi());
        ivFotoBunga.setImageDrawable(this.getDrawable(bunga.getDrawableRes()));
    }




}