/*Nama File : Mahasiswa.java 
 *Deskripsi : Berisi file class dan method untuk class Mahasiswa
 *Pembuat   : 24060123130112/Gibran Ahmad Maulana
 *Tanggal   : 26 Oktober 2025
 */

 import java.util.ArrayList;

 public class Mahasiswa {
	// Atribut	
	private String nim;
	private String nama;
	private String prodi;
	ArrayList<MataKuliah> listMatkul;
	private Dosen dosenWali;
	private Kendaraan kendaraan;

	// Method
	public Mahasiswa(){
		this.nim = "";
		this.nama = "";
		this.prodi = "";
		this.listMatkul = new Arraylist<>{};
		this.dosenWali = "";
		this.kendaraan = "";
	}

	public Mahasiswa(String nim, String nama, String prodi) {
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
	}

	public String getNim(){
		return this.nim;
	}

	public String getNama(){
		return this.nama;
	}

	public String getProdi(){
		return this.prodi;
	}

	public MataKuliah getListMatkul(){
		return this.listMatkul;
	} 

	public Dosen getDosen(){
		return this.dosen;
	}

	public Kendaraan getKendaraan(){
		return this.kendaraan;
	}

	public void setNim(String nim){
		this.nim = nim;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setProdi(String prodi){
		this.prodi = prodi;
	}
	
	public void addMatkul(MataKuliah newMatkul){
		listMatkul.add(newMatkul);
	} 

	public int getJumlahSKS(){
		int jumlah = 0;
		for (int i = 0; i < getListMatkul.size(); i++) {
			jumlah = jumlah + listMatkul.get(i).getSks();
		return jumlah;
		}
	}

	public int getJumlahMatkul() {
		return self
	}
	
}
 
