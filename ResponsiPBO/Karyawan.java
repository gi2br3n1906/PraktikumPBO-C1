/*Nama File : Karyawan.java 
 *Deskripsi : berisi atribut dan method dalam class Karyawan
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 28 Maret 2025
 */

public abstract class Karyawan extends CivitasAkademika{
    private String nip;
    private int masaKerja;

    // Konstruktor
    public Karyawan() {
        super();
        this.nip = "";
        this.masaKerja = 0;
    }
    
    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();

    public void printInfo() {
        System.out.printf("Nama        : %s%n", getNama());
        System.out.printf("Email       : %s%n", getEmail());
        System.out.printf("NIP         : %s%n", nip);
        System.out.printf("Masa Kerja  : %d tahun%n", masaKerja);
    }
    
}
