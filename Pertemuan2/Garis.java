/*Nama File : Garis.java 
 *Deskripsi : berisi atribut dan method dalam class Garis
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 19 Februari 2025
 */

public class Garis {
    // Atribut
    private Titik awal;
    private Titik akhir;
    private static int counterGaris = 0;

    // Konstruktor default yang menginisialisasi garis dengan titik default (0,0) dan (1,1).
    public Garis() {
        this.awal = new Titik(0,0);
        this.akhir = new Titik(1,1);
        counterGaris++;
    }

    // Konstruktor yang menginisialisasi garis dengan titik yang diberikan.
    public Garis(Titik Awal, Titik Akhir) {
        this.awal = Awal;
        this.akhir = Akhir;
        counterGaris++;
    }

    // Mendapatkan titik awal dari garis.
    public Titik getAwal() {
        return this.awal;
    }

    // Mendapatkan titik akhir dari garis.
    public Titik getAkhir() {
        return this.akhir;
    }

    // Mengatur titik awal dari garis.
    public void setAwal(Titik Awal) {
        this.awal = Awal;
    }

    // Mengatur titik akhir dari garis.
    public void setAkhir(Titik Akhir) {
        this.akhir = Akhir;
    }

    // Mendapatkan jumlah total objek Garis yang dibuat.
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis.
    public double getPanjang() {
        return Math.sqrt(Math.pow(getAwal().getAbsis() - getAkhir().getAbsis(), 2) + Math.pow(getAwal().getOrdinat() - getAkhir().getOrdinat(), 2));
    }

    // Menghitung gradien (kemiringan) garis.
    public double getGradien() {
        return ((getAkhir().getOrdinat() - getAwal().getOrdinat())/(getAkhir().getAbsis() - getAwal().getAbsis()));
    }

    // Menghitung titik tengah dari garis.
    public Titik TitikTengah() {
        return new Titik(((getAwal().getAbsis() + getAkhir().getAbsis())/2),((getAwal().getOrdinat() + getAkhir().getOrdinat())/2));
    }

    // Memeriksa apakah garis saat ini sejajar dengan garis lain.
    public boolean isSejajar(Garis L) {
        return this.getGradien() == L.getGradien();
    }

    // Memeriksa apakah garis saat ini tegak lurus dengan garis lain.
    public boolean isTegakLurus(Garis L) {
        return this.getGradien() * L.getGradien() == -1;
    }

    // Mencetak detail dari garis.
    public void printGaris() {
        System.out.print("Garis dari ");
        this.awal.printTitik();
        System.out.print(" ke ");
        this.akhir.printTitik();
        System.out.println();
    } 

    // Mencetak persamaan garis dalam bentuk y = mx + c.
    public void getPersamaan() {
        System.out.println("y = " + getGradien() + "x + " + (getAwal().getOrdinat() - getGradien() * getAwal().getAbsis()));
    }
}

