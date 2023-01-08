package com.example.proyekakhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class order extends AppCompatActivity  {
    EditText etnm;
    EditText etem;
    EditText etps;
    RadioGroup rb;
    RadioButton rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        etnm = findViewById(R.id.etnm);
        etem = findViewById(R.id.etem);
        etps = findViewById(R.id.etps);
        rb = findViewById(R.id.rb);
    }

    public void kirimdata(View view) {
        int idRadio = rb.getCheckedRadioButtonId();
        rb2 = findViewById(idRadio);

        Intent i1 = new Intent(this, HasilActivity.class);
        i1.putExtra("nama", etnm.getText().toString());
        i1.putExtra("alamat", etem.getText().toString());
        i1.putExtra("namaburger", etps.getText().toString());
        i1.putExtra("pedastidak", rb2.getText().toString());
        startActivity(i1);
    }
}