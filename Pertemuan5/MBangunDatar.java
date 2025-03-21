public class MBangunDatar {
	public static void main(String[] args){
		
		BangunDatar P1 = new Persegi(10, "Merah", "Hitam");
		Persegi P2 = new Persegi(5, "Biru", "Putih");
		BangunDatar L1 = new Lingkaran(10, "Hijau", "Kuning");
		Lingkaran L2 = new Lingkaran (5, "Ungu", "Pink");

		P1.printInfo();
		System.out.println("Luas P1 : " + P1.getLuas());
		System.out.println("Keliling P1 : " + P1.getKeliling());
		System.out.println("Luas P2 : " + P2.getLuas());
		System.out.println("Keliling P2 : " + P2.getKeliling());
		System.out.println("Luas L1 : " + L1.getLuas());
		System.out.println("Keliling L1 : " + L1.getKeliling());
		System.out.println("Luas L2 : " + L2.getLuas());
		System.out.println("Keliling L2 : " + L2.getKeliling());

		System.out.println("P1 sama dengan P2 : " + P1.isEqualLuas(P2));
		System.out.println("P1 sama dengan L1 : " + P1.isEqualLuas(L1));
		System.out.println("P1 sama dengan L2 : " + P1.isEqualLuas(L2));
		System.out.println("P2 sama dengan L1 : " + P2.isEqualLuas(L1));
		System.out.println("P2 sama dengan L2 : " + P2.isEqualLuas(L2));
		System.out.println("L1 sama dengan L2 : " + L1.isEqualLuas(L2));
		System.out.println("Jumlah Bangun Datar : " + BangunDatar.counterBangunDatar);
		System.out.println("Jumlah Bangun Datar : " + P1.counterBangunDatar);
		System.out.println("Jumlah Bangun Datar : " + L1.counterBangunDatar);
		System.out.println("Jumlah Bangun Datar : " + P2.counterBangunDatar);
		System.out.println("Jumlah Bangun Datar : " + L2.counterBangunDatar);
		((Persegi)P1).zoomIn();
		((Persegi)P1).printInfo();
		((Persegi)P1).zoomOut();
		((Persegi)P1).printInfo();
		((Persegi)P1).zoom(50);
		((Persegi)P1).printInfo();
		((Lingkaran)L1).zoomIn();
		((Lingkaran)L1).printInfo();
		((Lingkaran)L1).zoomOut();
		((Lingkaran)L1).printInfo();
		((Lingkaran)L1).zoom(50);
		((Lingkaran)L1).printInfo();
	}
}
