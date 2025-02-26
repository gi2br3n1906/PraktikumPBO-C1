/*Nama File : Titik.java 
 *Deskripsi : berisi atribut dan method dalam class Titik
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 26 Februari 2025
 */

 public class Titik {
     	/************ATRIBUT*************/
     	private double absis;
     	private double ordinat;
	private static int counterTitik = 0;

    	/***********METHOD***************/
    	//konstruktor untuik membuat titik (0,0)
    	public Titik(){
		this(0,0);
		counterTitik++;
	}

	public Titik(double x, double y){
		this.absis = x;
		this.ordinat = y;
		counterTitik++;
	}

	//mengembalikan nilai absis
	public double getAbsis() {
		return absis;
	}

	//mengembalikan nilai ordinat
	public double getOrdinat() {
		return ordinat; 
	}

	//mengeset absis titik dengan nilai baru x
	public void setAbsis(double x){
		absis = x;
	}

	//mengeset ordinat titik dengan nilai baru y
	public void setOrdinat(double y){
		ordinat = y;
	}
	
	//menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
	public void geser(double x, double y){
		absis = absis + x;
		ordinat = ordinat + y;
	}

	//mencetak koordinat titik
	public void printTitik(){
		System.out.println("Titik (" + absis + "," + ordinat + ")");
	}

	public static int getCounterTitik(){
		return counterTitik;
	}

	public void printCounterTitik(){
		System.out.println(this.counterTitik);
	}

	public int getKuadran(){
		if (absis > 0 && ordinat > 0){
			return 1;
		}
		else if (absis < 0 && ordinat > 0) {
			return 2;
		}
		else if (absis < 0 && ordinat < 0){
			return 3;
		}
		else if (absis > 0 && ordinat < 0){
			return 4;
		}
		else {
			return -1;
		}
	}

	public double getJarakPusat(){
		return Math.sqrt(Math.pow(absis,2) + Math.pow(ordinat,2));
	}

	public double getJarak(Titik T){
		return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
	}

	public void refleksiX() {
		ordinat = ordinat * -1;
	}

	public void refleksiY() {
		absis = absis * -1;
	}

	public Titik getRefleksiX() {
		return new Titik(absis, ordinat * -1);
	}

	public Titik getRefleksiY() {
		return new Titik(absis * -1, ordinat);
	}

}
