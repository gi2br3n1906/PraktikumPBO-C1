public class Lingkaran extends BangunDatar{
	private double jari;
	
	public Lingkaran(){
		jari = 0;
	}

	public Lingkaran(double diameter, String warna, String border){
		super(0, warna, border);
		jari = diameter/2;
	}

	public double getJari(){
		return jari;
	}

	public void setJari(double jari){
		this.jari = jari;
	}

	public double getLuas(){
		return Math.PI * jari * jari;
	}

	public double getKeliling(){
		return Math.PI * 2 * jari;
	}
	
	@override
	public void printInfo(){ 
                System.out.println("Jumlah sisi: " + getJmlSisi());
                System.out.println("Warna: " + getWarna());
                System.out.println("Border: " + getBorder());
                System.out.println("Jari : " + jari);
	}
}
