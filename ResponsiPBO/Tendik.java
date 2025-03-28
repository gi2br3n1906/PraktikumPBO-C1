/*Nama File : Tendik.java 
 *Deskripsi : berisi atribut dan method dalam class Tendik
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 28 Maret 2025
 */

public class Tendik extends Karyawan{
    private static int jumlahTendik = 0;

    // Konstruktor
    public Tendik() {
        super();
        jumlahTendik ++;
    }

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        jumlahTendik ++;
    }

    // Getter
    public static int getJumlahTendik() {
        return jumlahTendik;
    }

    @Override
    public double hitungGaji(){
        return 4000000 + (0.1 * getMasaKerja() * 4000000); // Gaji pokok Rp1.000.000 per tahun
    }

    @Override
    public void printInfo() {
        System.out.println("================================");
        System.out.println("        Informasi Tendik        ");
        System.out.println("================================");
        super.printInfo();
        System.out.printf("Gaji        : Rp%,.2f%n", hitungGaji());
        System.out.println("================================");
    }

}
