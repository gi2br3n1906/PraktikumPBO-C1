/*Nama File : Dosen.java 
 *Deskripsi : berisi atribut dan method dalam class Dosen
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 28 Maret 2025
 */

public class Dosen extends Karyawan{
    private Fakultas fakultas;
    private static int jumlahDosen = 0;

    // Konstruktor
    public Dosen() {
        super();
        this.fakultas = new Fakultas(); 
        jumlahDosen ++;
    }

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        jumlahDosen ++;
    }

    // Getter dan Setter
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public double hitungGaji(){
        return fakultas.getGajiPokok() + (0.1 * fakultas.getGajiPokok() * getMasaKerja());
    }

    public static int getJumlahDosen() {
        return jumlahDosen;
    }

    @Override
    public void printInfo() {
        System.out.println("=================================");
        System.out.println("        Informasi Dosen         ");
        System.out.println("=================================");
        super.printInfo();
        System.out.println("Fakultas    : " + fakultas.getNama());
        System.out.printf("Total Gaji  : Rp %,.0f%n", hitungGaji());
        System.out.println("=================================");
    }

}
