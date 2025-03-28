/*Nama File : Fakultas.java 
 *Deskripsi : berisi atribut dan method dalam class Fakultas
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 28 Maret 2025
 */

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    // Constructor
    public Fakultas() {
        this.nama = "";
        this.tarifUKT = 0;
        this.gajiPokok = 0;
    }

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void printInfo() {
        System.out.println("=================================");
        System.out.println("        Informasi Fakultas       ");
        System.out.println("=================================");
        System.out.println("Nama Fakultas: " + nama);
        System.out.printf("Tarif UKT     : Rp%,.2f%n", tarifUKT);
        System.out.printf("Gaji Pokok    : Rp%,.2f%n", gajiPokok);
        System.out.println("=================================");
    }

}