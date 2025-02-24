/*Nama File : 
 *Deskripsi : 
 *Pembuat   :
 *Tanggal   :
 */

 public class MTitik {
	public static void main(String[] args) {
		Titik T1 = new Titik(); // Membuat objek tiitk T1 (0,0)
		Titik T3 = new Titik(3,2);
		T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
		T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
		T1.printTitik(); // mencetak koordinat T1
		T1.geser(3,4); // menggeser T1 sejauh (3,4)
		T1.printTitik(); // menampilkan kooridnat T1 setelah digeser\

		Titik T2 = T1;
		T2.printTitik();
		T1.setAbsis(10);
		T1.setOrdinat(10);
		T2.printTitik();
		T3.printTitik();

		System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
		T1.printCounterTitik();

		System.out.println("Kuadran Titik T1 = " + T1.getKuadran());
		System.out.println("Jarak titik pusat dengan T1 adalah " + T1.getJarakPusat());
		System.out.println("Jarak titik T1 dengan T3 adalah " + T1.getJarak(T3));
		T1.refleksiX();
		T1.printTitik();
		T3.refleksiY();
		T3.printTitik();
		Titik T4 = T1.getRefleksiX();
		Titik T5 = T3.getRefleksiY();
		T4.printTitik();
		T5.printTitik();
	}
}
