public class Lingkaran extends BangunDatar implements IResize{
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

	@Override
	public double getLuas(){
		return Math.PI * jari * jari;
	}

	@Override
	public double getKeliling(){
		return Math.PI * 2 * jari;
	}
	
	@Override
	public void zoomIn(){
		jari = jari * 1.1;
	}

	@Override
	public void zoomOut(){
		jari = jari * 0.9;
	}

	@Override
	public void zoom(int percent){
		jari = jari * percent/100;
	}
	@Override
	public void printInfo(){ 
                System.out.println("Jumlah sisi: " + getJmlSisi());
                System.out.println("Warna: " + getWarna());
                System.out.println("Border: " + getBorder());
                System.out.println("Jari : " + jari);
	}
}
