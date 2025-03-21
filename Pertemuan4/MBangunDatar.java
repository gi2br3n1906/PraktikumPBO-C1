public class MBangunDatar {
	public static void main(String[] args){
		Persegi persegi = new Persegi(6, "Hijau", "Kuning");
		System.out.println("Luas: " + persegi.getLuas());
		System.out.println("Keliling: " + persegi.getKeliling());
		System.out.println("Diagonal: " + persegi.getDiagonal());

		Lingkaran lingkaran = new Lingkaran(7, "Hijau", "Merah");
		lingkaran.printInfo();
		System.out.println("Jari-jari: " + lingkaran.getJari());
		System.out.println("Luas: " + lingkaran.getLuas());
		System.out.println("Keliling: " + lingkaran.getKeliling());
	}
}
