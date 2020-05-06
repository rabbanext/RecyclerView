package com.palimbanos.myrecyclerview;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_ALAMAT = "extra_alamat";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_FOTO = "extra_foto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("New Titlsse");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true); //toolbar back button

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_NAME));
        } //judul appbar

        TextView tvNama = findViewById(R.id.tv_nama);
        String strnama = "Nama: " + getIntent().getStringExtra(EXTRA_NAME);
        tvNama.setText(strnama);
        TextView tvHarga = findViewById(R.id.tv_harga);
        String strharga = "Harga: " + getIntent().getStringExtra(EXTRA_HARGA);
        tvHarga.setText(strharga);
        TextView tvDataDapat = findViewById(R.id.tv_alamat);
        String stralamat = "Alamat : " + getIntent().getStringExtra(EXTRA_ALAMAT);
        tvDataDapat.setText(stralamat);
        ImageView image = findViewById(R.id.img_foto);
        Integer gambar = getIntent().getIntExtra(EXTRA_FOTO,0);
        Glide.with(this)
                .asBitmap()
                .load(gambar)
                .into(image);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
