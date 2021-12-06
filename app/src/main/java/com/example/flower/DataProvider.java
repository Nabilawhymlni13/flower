package com.example.flower;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.flower.Model.Bunga;
import com.example.flower.Model.Mawar;
import com.example.flower.Model.Melati;
import com.example.flower.Model.Matahari;


public class DataProvider {
    private static List<Bunga> bungas = new ArrayList<>();

    private static List<Mawar> initDataMawar(Context ctx) {
        List<Mawar> mawars = new ArrayList<>();
        mawars.add(new Mawar("Alba", "Inggris",
                "Mawar putih York, adalah mawar hibrida dari keturunan yang tidak diketahui yang telah dibudidayakan di Eropa sejak zaman kuno", R.drawable.ralba));
        mawars.add(new Mawar("Canina", "Eropa",
                "Rosa canina, umumnya dikenal sebagai mawar anjing", R.drawable.rcanina));
        mawars.add(new Mawar("Chinensis", "Tiongkok",
                "Mawar Tiongkok adalah tanaman semak, terkadang disebut mawar Benggala", R.drawable.rchinensis));
        mawars.add(new Mawar("Foetida", "Georgia",
                "Memiliki bunga kuning dengan aroma yang beberapa orang merasa keberatan", R.drawable.rfoetida));
        mawars.add(new Mawar("Mister Lincoln", "California",
                "Faktor utama yang menjadi keindahan dari tanaman ini adalah karena warna bunga nya yang sangat cerah dan beraneka ragam", R.drawable.rlincolnn));
        mawars.add(new Mawar("Buff Beauty", "Inggris",
                "Rosa 'Buff Beauty' adalah kultivar mawar kembang aprikot aprikot", R.drawable.rbeautyy));
        return mawars;
    }

    private static List<Melati> initDataMelati(Context ctx) {
        List<Melati> melatis = new ArrayList<>();
        melatis.add(new Melati("Auriculatum", "India",
                "Jasminum auriculatum adalah spesies melati, dalam keluarga Oleaceae", R.drawable.jauriculatum));
        melatis.add(new Melati("Azoricum", "Portugal",
                "Jasminum azoricum, melati beraroma lemon, adalah spesies tanaman berbunga dalam keluarga zaitun", R.drawable.jazoricum));
        melatis.add(new Melati("Dichotomum", "Filiphina",
                "Bunganya cukup harum dan terbuka di malam hari, berwarna merah muda saat tunas kemudian putih ", R.drawable.jdichotomum));
        melatis.add(new Melati("Grandiflorum", "Italia",
                "Jasminum grandiflorum, juga dikenal dengan berbagai nama Melati Spanyol, Melati Kerajaan, Melati Katalan", R.drawable.jgrandiflorum));
        melatis.add(new Melati("Polyanthum", "China & Myanmar",
                "Jasminum polyanthum, melati berbunga banyak atau melati merah muda, adalah spesies tanaman berbunga dari keluarga zaitun Oleaceae", R.drawable.jpolyanthum));
        melatis.add(new Melati("Winter", "Tiongkok",
                "Puncak mekar bunga tepat setelah musim dingin, itulah sebabnya ia juga dinamai Yingchun dalam bahasa Cina, yang berarti \"bunga yang menyambut Musim Semi", R.drawable.jwinter));
        return melatis;
    }

    private static List<Matahari> initDataMatahari(Context ctx) {
        List<Matahari> mataharis = new ArrayList<>();

        mataharis.add(new Matahari("Paradoxus", "New Mexico",
                "Helianthus paradoxus, bunga matahari paradoks, bunga matahari teka-teki atau bunga matahari Pecos, adalah spesies bunga matahari yang terancam punah yang hanya ditemukan di rawa-rawa", R.drawable.sparadoxuss));
        mataharis.add(new Matahari("Bolanderi", "California & Oregon",
                "Helianthus bolanderi adalah spesies bunga matahari yang dikenal dengan nama umum bunga matahari dan bunga matahari serpentine Bolander", R.drawable.sbolanderi));
        mataharis.add(new Matahari("Debilis", "Amerika Serikat",
                "Helianthus debilis adalah spesies bunga matahari yang dikenal dengan nama umum bunga matahari timun, bunga matahari pantai, bunga matahari lemah, dan bunga matahari bukit pasir Pantai Timur ", R.drawable.sdebilis));
        mataharis.add(new Matahari("Giganteus", "Kanada",
                "Helianthus giganteus, bunga matahari raksasa atau bunga matahari tinggi", R.drawable.sgiganteus));
        mataharis.add(new Matahari("Nuttallii", "Columbia",
                "Helianthus nuttallii adalah tanaman herba tahunan yang tumbuh setinggi 50–400 cm.", R.drawable.snuttallii));
       mataharis.add(new Matahari("Occidentalis", "Amerika Serikat bagian Timur",
                "Helianthus occidentalis, bunga matahari daun sedikit atau bunga matahari barat", R.drawable.soccidentalis));
        return mataharis;
    }

    private static void initAllBungas(Context ctx) {
        bungas.addAll(initDataMawar(ctx));
        bungas.addAll(initDataMelati(ctx));
        bungas.addAll(initDataMatahari(ctx));
    }

    public static List<Bunga> getAllBunga(Context ctx) {
        if (bungas.size() == 0) {
            initAllBungas(ctx);
        }
        return  bungas;
    }

    public static List<Bunga> getBungasByTipe(Context ctx, String jenis) {
        List<Bunga> bungasByType = new ArrayList<>();
        if (bungas.size() == 0) {
            initAllBungas(ctx);
        }
        for (Bunga h : bungas) {
            if (h.getJenis().equals(jenis)) {
                bungasByType.add(h);
            }
        }
        return bungasByType;
    }

}
