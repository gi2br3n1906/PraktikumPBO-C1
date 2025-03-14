class Lingkaran {
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}
}

public class Asersi2 {
	public static void main(String[] args) {
		double jariJari = 0;
		assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";
		/* Kode yang dibuat diatas tidak sesuai dengan bagaimana asersi ini digunakan, asersi akan
		   dieksekusi ketika kondisi pada kondisional assert tidak tercapai, sehingga untuk kondisional
		   berupa jariJari > 0 harus memiliki error kode "Jari-jari harus lebih besar dari nol" */
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = " + kelilingLingkaran);
	}
}
