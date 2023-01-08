package com.example.proyekakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView txt1, txt2,txt3,txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 =findViewById(R.id.hasilnama);
        txt2 =findViewById(R.id.hasilalamat);
        txt3 =findViewById(R.id.hasilburger);
        txt4 =findViewById(R.id.hasilrasa);

        String nama = getIntent().getExtras().getString("nama");
        String alamat = getIntent().getExtras().getString("alamat");
        String namaburger = getIntent().getExtras().getString("namaburger");
        String pedastidak = getIntent().getExtras().getString("pedastidak");


        txt1.setText("Nama      : " +nama);
        txt2.setText("Alamat    : " +alamat);
        txt3.setText("Pesanan   : " +namaburger);
        txt4.setText("Rasa      : " +pedastidak);



    }
}