package Soal1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<ApkBuku> entitas = new ArrayList<>();

        entitas.add(new ApkBuku(" 978-01, ","Week Hero, ","Razen, ","2019, ",150000,9));
        entitas.add(new ApkBuku(" 978-02, ","Eleceed, ","ZHENA, ","2019, ",200000,9));
        entitas.add(new ApkBuku(" 978-03, ","The G.O.H, ","Park, ","2014, ",100000,8));

        entitas.get(2).setJudulBuku("The God of High School, ");
        entitas.get(2).setPengarang("Yongje Park, ");
        entitas.get(2).setTahunTerbit("2015, ");
        entitas.get(2).setHarga(120000);

        entitas.get(2).setRating(9);

        System.out.println(" Menampilkan semua Buku :");
        System.out.println(entitas.get(0));
        System.out.println(entitas.get(1));
        System.out.println(entitas.get(2));

        System.out.println("\n Menampilkan salah satu buku dari Isbn :");
        for (ApkBuku apkBuku:entitas){
            apkBuku.searchIsbn(" 978-02, ");
        }

        entitas.remove(0);
        System.out.println("\n Tampilan data buku setelah dihapus : ");
        for (ApkBuku apkBuku:entitas){
            System.out.println(apkBuku);
        }
    }
}