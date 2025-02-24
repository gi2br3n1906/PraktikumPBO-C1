/*Nama File : MGaris.java 
 *Deskripsi : main program untuk class Garis
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 19 Februari 2025
 */

public class MGaris {    
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik t1 = new Titik(2, 3);
        Titik t2 = new Titik(5, 7);

        // Membuat objek Garis dengan titik yang diberikan
        Garis garis1 = new Garis(t1, t2);

        // Menampilkan titik awal dan akhir dari garis
        garis1.printGaris();

        // Menghitung dan menampilkan panjang garis
        System.out.println("Panjang garis: " + garis1.getPanjang());

        // Menghitung dan menampilkan gradien garis
        System.out.println("Gradien garis: " + garis1.getGradien());

        // Menghitung dan menampilkan titik tengah garis
        Titik titikTengah = garis1.TitikTengah();
        System.out.println("Titik tengah garis: (" + titikTengah.getAbsis() + ", " + titikTengah.getOrdinat() + ")");

        // Menampilkan persamaan garis
        garis1.getPersamaan();

        // Membuat objek Garis lain untuk perbandingan
        Titik t3 = new Titik(1, 2);
        Titik t4 = new Titik(4, 6);
        Garis garis2 = new Garis(t3, t4);

        // Memeriksa apakah garis1 sejajar dengan garis2
        System.out.println("Garis1 sejajar dengan Garis2: " + garis1.isSejajar(garis2));

        // Memeriksa apakah garis1 tegak lurus dengan garis2
        System.out.println("Garis1 tegak lurus dengan Garis2: " + garis1.isTegakLurus(garis2));

        // Menampilkan jumlah total objek Garis yang dibuat
        System.out.println("Jumlah total objek Garis yang dibuat: " + Garis.getCounterGaris());

        garis1.printGaris();
        garis2.printGaris();

        // Menghitung dan menampilkan panjang garis
        System.out.println("Panjang garis: " + garis2.getPanjang());

        // Menghitung dan menampilkan gradien garis
        System.out.println("Gradien garis: " + garis2.getGradien());

        // Menghitung dan menampilkan titik tengah garis
        System.out.println("Titik tengah garis: (" + garis2.TitikTengah().getAbsis() + ", " + garis2.TitikTengah().getOrdinat() + ")");

        // Menampilkan persamaan garis
        garis2.getPersamaan();

    }
}