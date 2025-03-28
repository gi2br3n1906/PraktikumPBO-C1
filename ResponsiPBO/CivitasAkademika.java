/*Nama File : CivitasAkademika.java 
 *Deskripsi : berisi atribut dan method dalam class Civitas Akademika
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 28 Maret 2025
 */

public class CivitasAkademika {
    private String nama;
    private String email;

    // Constructor
    public CivitasAkademika() {
        this.nama = "";
        this.email = "";
    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
