package Sesi7;

import java.util.ArrayList;

public class ContohArrayList {

    public static void main(String[] args) {
 
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Muhammad");
        nama.add("Harist");
        nama.add("Naufal");

        System.out.println("Isi ArrayList: " + nama);

        nama.remove("Naufal");

        boolean adaHarist = nama.contains("Harist");

        System.out.println("Apakah ada Purnarahayu? " + adaHarist);

        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}