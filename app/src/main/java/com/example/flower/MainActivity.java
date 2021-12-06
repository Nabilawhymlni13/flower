package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnMawar,btnMelati,btnMatahari;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnMawar = findViewById(R.id.btn_buka_bentuk_mawar);
        btnMelati = findViewById(R.id.btn_buka_bentuk_melati);
        btnMatahari = findViewById(R.id.btn_buka_bentuk_matahari);
        btnMawar.setOnClickListener(view -> bukaGaleri("Mawar"));
        btnMelati.setOnClickListener(view -> bukaGaleri("Melati"));
        btnMatahari.setOnClickListener(view -> bukaGaleri("Matahari"));
    }

    private void bukaGaleri(String jenisBunga) {
        Log.d("MAIN","Buka activity Mawar");
        Intent intent = new Intent(this, DaftarBungaActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisBunga);
        startActivity(intent);
    }

    public void bukaBiodata(View view) {
        Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
        startActivity(intent);
    }

}