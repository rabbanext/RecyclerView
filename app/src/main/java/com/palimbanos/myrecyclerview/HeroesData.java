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

    private static String[] gedungTelpon = {
            "081264046411",
            "081264046412",
            "081264046413",
            "081264046414",
            "081264046415",
            "081264046416",
            "081264046417",
            "081264046418",
            "081264046419",
            "081264046410",
            "081264046409"
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



    private static String[] gedungDetail = {
            "Gedung AEKI berada di lokasi yang sangat strategis, Lokasi gedung ini berada di tengah kota, tidak jauh dari Kambang Iwak Park. Gedung ini sering dipakai untuk acara resepsi dan pertemuan. Di sebelah gedung ini ada masjid, sehingga bagi umat muslim yang mau menunaikan ibadah shalat bisa berjalan kaki kesana.",
            "Gedung Ar-Rahmah Centre Sri Melayu merupakan salah satu gedung yang memiliki kapasitas menampung yang lumayan besar kuota gedung ini kurang lebih dapat menampung 1200 orang. Gedung serbaguna yang megah ini biasanya digunakan sebagai salah satu gedung pernikahan letaknya persis disebelah RM. Sri Melayu. di bagian dalam Gedung sangat menarik melihat penempatan meja tamu dan photobooth sangat simple sehingga tidak mengganggu jalur lalu lintas tamu yang masuk atau keluar.",
            "Gedung serbaguna milik PT.PUSRI. Tempat parkir yang luas, Ruangan terbuka, Keamanan relatif terjamin, karena terdapat pos penjagaan di gerbang depan. Tempat yang bagus untuk mengadakan acara besar terutama pernikahan. Tempatnya luas dan sejuk",
            "Salah satu gedung serbaguna yg sering digunakan untuk menggelar acara pernikahan. Graha 66 ini memiliki 2 gerbang masuk/keluar yang berada di depan dan di belakang. Gedung ini berada satu kompleks dengan gedung Tiara Puspa. Gedung Graha 66 memiliki pintu masuk dan pintu keluar sesuai dari arah kedatangan tamu. Graha 66 dapat menampung sekitar 500 tamu undangan. Gedung ini memiliki interior dengan jarak lantai dan atap yang cukup tinggi sehingga tidak mengganggu sirkulasi udara dalam gedung.",
            "Salah satu gedung yang terlewah di Daerah Kalidoni, Gedung ini berukuran yang lumayan luas, nyaman dilengkapi dengan masjid dan penginapan untuk keluarga pengantin, dekorasi dan fasilitas sangat bagus , tempat parkirnya dpt menampung banyak kendaraan. Pelayanannya juga baik dan ramah, vendor dan fasilitas gedung lengkap, salah satu gedung pernikahan terbaik di Palembang.",
            "Graha Darusalam merupakan Gedung serbaguna yang cukup luas untuk pernikahan. Area parkir luas, lingkungan yang asri dan letaknya persis bersebelahan dengan mesjid untuk beribadah. Harga sewa gedung juga terbilang murah. Lapangan parkir juga relatif luas dan mampu menampung cukup banyak kendaraan baik roda dua maupun roda empat. inilah mengapa Graha Darusalam cocok untuk beragam acara besar termasuk pernikahan. Ruangan yang luas ditambah interior simpel dan cantik.",
            "Gedung Graha Patria salah satu gedung depan kapasitas sedang, halaman parkir yang sangat luas, Gedung serbaguna untuk acara Pernikahan dan Acara, Di dalam Gedung bersih, nyaman, dingin, kapasitas tidak bisa lebih dari 1000 orang. Kalau undangan 300 s.d 500 masih nyaman. Sudah tersedia semua perangkat sound system, dibagian kiri terdapat toilet dan teras gedung yang berukuran lumayan besar, gedung ini menjadi salah satu gedung yang direkomendasikan untuk pernikahan.",
            "Graha serba guna bisa dipakai untuk berbagai macam acara salah satunya acara pernikahan, tempat luas, bersih dan kondusif, Gedung yang bagus untuk resepsi Pernikahan, dibagian dalam memang tidak terlalu luas, tetapi tertata dengan baik. Dibagian dalam gedung terlihat ruangannya cukup tinggi, Bagi yang tidak menggunakan maps tidak perlu khawatir, karena banyak petunjuk arah untuk menuju gedung graha pinang masak ini. Tersedia halaman parkir yang sangat luas, sehingga tamu yang datang tidak perlu repot-repot mencari tempat Parkir.",
            "Graha Trisila merupakan salah satu gedung yang terletak di Jalan Jalan Sultan Mahmud Badaruddin II. Memiliki kapasitas sekitar 500 Tamu undangan, gedung ini juga menyediakan halaman parkir yang luas. Tersedia juga paket pernikahan yang ekonomis. Gedung dengan yang berada di pinggir jalan raya KM 11 ini memang menjadi salah satu gedung yang sering digunakan, gedung yang ber AC, bersih dan luas mempunyai area parkir cukup luas dan rindang oleh pepohonan.",
            "Grand Atyasa Convention merupakan salah satu gedung multi fungsi yang ada dikota Palembang biasanya digunakan untuk berbagai acara seperti resepsi pernikahan, seminar, reuni dan acara2 lainnya, salah satunya difungsikan sebagai tempat resepsi Pernikahan. Pada bagian luas Gedung Grand atyasa memiliki estetika yang menarik dan sangat cocok digunakan. Tempat parkir yang memadai, terdapat basement dan ruangan utamanya yang besar dan megah. Fasilitas pendukung lainnya juga sangat lengkap dan sangat nyaman untuk dinikmati",
            "Gedung dengan desain yang mewah dan megah, terlihat dari interior dan eksterior yang digunakan, lokasi sangat strategis, yakni di jalan Rajawali. Di dekat STMIK & STIE MDP persis di depan masjid di jalan Rajawali. Untuk ballroomnya megah dan besar. "
    };


    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < gedungNama.length; position++) {
            Hero hero = new Hero();
            hero.setName(gedungNama[position]);
            hero.setAlamat(gedungAlamat[position]);
            hero.setHarga(gedungHarga[position]);
            hero.setDetail(gedungDetail[position]);
            hero.setTelpon(gedungTelpon[position]);
            hero.setPhoto(gedungFoto[position]);
            list.add(hero);
        }
        return list;
    }
}