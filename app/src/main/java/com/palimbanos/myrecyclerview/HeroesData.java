package com.palimbanos.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Kost Amanah",
            "Asrama OKI",
            "Pondokan Putri Balqis",
            "Beta Kost",
            "Kos-kosan Gg. Buntu",
            "Pondok Mahasiswa Citra",
            "Kost Jasmine",
            "Wisma Oza",
            "Rumah Kost Pegagan",
            "Kost Prioritas (Cindo)",
            "Penginapan Yarits Harian/Bulanan/Tahunan"
    };

    private static int[] heroesImages = {
            R.drawable.amanah,
            R.drawable.asramaoki,
            R.drawable.balqis,
            R.drawable.beta,
            R.drawable.buntu,
            R.drawable.citra,
            R.drawable.jasmin,
            R.drawable.oza,
            R.drawable.pegagan,
            R.drawable.prioritas,
            R.drawable.yarits
    };

    private static String[] kostHarga = {
            "Rp.8.000.000",
            "Rp.6.000.000",
            "Rp.6.250.000",
            "Rp.7.000.000",
            "Rp.7.500.000",
            "Rp.7.000.000",
            "Rp.7.000.000",
            "Rp.6.500.000",
            "Rp.10.100.000",
            "Rp.8.500.000",
            "Rp.6.500.000"
    };

    private static String[] kostAlamat = {
            "Jl. Lintas Palembang-Indralaya KM.32 (Samping Unsri)",
            "Jl. Lintas Palembang-Indralaya KM.32 Gg. Lampung 2",
            "Jalan Nusantara Gg. Buntu Lrg. Kenari No.23 Ogan Ilir",
            "Jalan Nusantara Gg. Buntu Lrg. Kenari No.24 Ogan Ilir",
            "Jalan Nusantara Gg. Buntu No.1 Ogan Ilir",
            "Jl. Lintas Palembang-Indralaya KM.36 (Arah Tol Palembang-Indralaya)",
            "Jl. Lintas Indralaya KM.31 Timbangan, Indralaya",
            "Jalan Nusantara Gg. Buntu Lrg. Bunga",
            "Jalan Lintas Palembang-Indralaya No.411 Timbangan, Indralaya",
            "Gg. Lampung No.12 Indralaya",
            "Gg. Buntu Samping Universitas Sriwijaya Indralaya"
    };


    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setAlamat(kostAlamat[position]);
            hero.setHarga(kostHarga[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}