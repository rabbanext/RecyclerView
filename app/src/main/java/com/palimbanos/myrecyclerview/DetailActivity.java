package com.palimbanos.myrecyclerview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String EXTRA_ALAMAT = "extra_alamat";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_FOTO = "extra_foto";
    public static final String EXTRA_TELPON = "extra_telpon";
    public static final String EXTRA_MAPS = "extra_maps";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true); //toolbar back button

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_NAME));
        } //judul appbar


        TextView tvDetail = findViewById(R.id.tv_detail);
        String strdetail = getIntent().getStringExtra(EXTRA_DETAIL);
        tvDetail.setText(strdetail);

        TextView tvHarga = findViewById(R.id.tv_harga);
        String strharga = getIntent().getStringExtra(EXTRA_HARGA);
        tvHarga.setText(strharga);

        TextView tvAlamat = findViewById(R.id.tv_alamat);
        String stralamat = "Alamat : " + getIntent().getStringExtra(EXTRA_ALAMAT);
        tvAlamat.setText(stralamat);

        ImageView image = findViewById(R.id.img_foto);
        Integer gambar = getIntent().getIntExtra(EXTRA_FOTO,0);
        Glide.with(this)
                .asBitmap()
                .load(gambar)
                .into(image);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        Button btnWa = findViewById(R.id.btn_whatsapp);
        btnWa.setOnClickListener(this);

        Button btnMaps = findViewById(R.id.btn_maps);
        btnMaps.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_dial_number:
                String strtelpon = getIntent().getStringExtra(EXTRA_TELPON);
                //String phoneNumber = "081264046414";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + strtelpon));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_whatsapp:
                String nomorWa = getIntent().getStringExtra(EXTRA_TELPON);
                String strnamagedung = getIntent().getStringExtra(EXTRA_NAME);
                String webAddress = "https://api.whatsapp.com/send?phone=" + nomorWa + "&text=Halo, Saya mau tanya tentang *" + strnamagedung + "*\n (SewaGedung.id)";
                Intent browseWebIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(webAddress));
                startActivity(browseWebIntent);
                break;
            case R.id.btn_maps:
                String mapAddress = getIntent().getStringExtra(EXTRA_MAPS);
                Intent browseMapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapAddress));
                startActivity(browseMapIntent);
                break;


        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
