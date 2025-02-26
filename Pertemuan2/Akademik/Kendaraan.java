/*Nama File : 
 *Deskripsi : 
 *Pembuat   :
 *Tanggal   :
 */

 public class Kendaraan {
	// Atribut
	private String noPlat;
	private String jenis;
	
	// Method
	public Kendaraan(){
		this.noPlat = "";
		this.jenis = "";
	}

	public Kendaraan(String noPlat, String jenis){
		this.noPlat = noPlat;
		this.jenis = jenis;
	}

	public String getNoPlat(){
		return this.noPlat;
	}

	public String getJenis(){
		return this.jenis;
	}

	public void setNoPlat(String noPlat){
		this.noPlat = noPlat;
	}

	public void setJenis(String jenis){
		this.jenis = jenis;
	}
}
