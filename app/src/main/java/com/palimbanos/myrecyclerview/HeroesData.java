package com.palimbanos.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] gedungNama = {
            "AEKI",
            "Ar-Rahmah Centre Sri Melayu",
            "Gedung Serba Guna Pusri",
            "Graha 66",
            "Graha Bungong Jeumpa",
            "Graha Darusalam",
            "Graha Patria",
            "Graha Pinang Masak",
            "Graha Trisila",
            "Grand Atyasa Convention Center",
            "Rajawali Grand Ballroom"
    };

    private static int[] gedungFoto = {
            R.drawable.aeki,
            R.drawable.arrahmah,
            R.drawable.pusri,
            R.drawable.graha66,
            R.drawable.bungongjeumpa,
            R.drawable.grahadarusalam,
            R.drawable.grahapatria,
            R.drawable.pinangmasak,
            R.drawable.trisila,
            R.drawable.grandatyasa,
            R.drawable.rajawali
    };

    private static String[] gedungHarga = {
            "Rp.35jt++",
            "Rp.60jt++",
            "Rp.60jt++",
            "Rp.80jt++",
            "Rp.50jt++",
            "Rp.15jt++",
            "Rp.45jt++",
            "Rp.60jt++",
            "Rp.10,5jt++",
            "Rp.150jt++",
            "Rp.125jt++"
    };

    private static String[] gedungAlamat = {
            "Jl. Diponegoro No.2165, Talang Semut, Kec. Bukit Kecil",
            "Jl. Demang Lebar Daun No.1, 01, Lorok Pakjo, Kec. Ilir Bar. I",
            "Jl. Komp. Pusri, Sei Selayur, Kec. Kalidoni",
            "Jl. Supersemar, Pipa Jaya, Kec. Kemuning",
            "Jl. Lb. Jaya III, Sei Selayur, Kec. Kalidoni",
            "Jl. Sultan Moh. Mansyur No.400, Bukit Lama, Kec. Ilir Bar. I",
            "Jl. Sakti Wiratama, Sri Mulyo, Sematang Borang",
            "JL Mayjen, Jl. Harapan Jaya I, RT.32/RW.08, Kalidoni, Kec. Kalidoni",
            "Jalan Sultan Mahmud Badaruddin II KM. 11 No.2281, Sukodadi, Kec. Sukarami",
            "Jl. Kapten A. Anwar Arsyad No.22, Demang Lebar Daun, Kec. Ilir Bar. I",
            "Jl. Rajawali, 9 Ilir, Kec. Ilir Tim. II"
    };


    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < gedungNama.length; position++) {
            Hero hero = new Hero();
            hero.setName(gedungNama[position]);
            hero.setAlamat(gedungAlamat[position]);
            hero.setHarga(gedungHarga[position]);
            hero.setPhoto(gedungFoto[position]);
            list.add(hero);
        }
        return list;
    }
}