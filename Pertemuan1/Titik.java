/*Nama File : Titik.java 
 *Deskripsi : berisi atribut dan method dalam class Titik
 *Pembuat   : Gibran Ahmad Maulana/24060123130112
 *Tanggal   : 19 Februari 2025
 */

 public class Titik {
     	/************ATRIBUT*************/
     	double absis;
     	double ordinat;
		static int counterTitik = 0;

    /***********METHOD***************/
    //konstruktor untuik membuat titik (0,0)
    Titik(){
		this(0,0);
		counterTitik++;
	}

	Titik(double x, double y){
		this.absis = x;
		this.ordinat = y;
		counterTitik++;
	}

	//mengembalikan nilai absis
	double getAbsis() {
		return absis;
	}

	//mengembalikan nilai ordinat
	double getOrdinat() {
		return ordinat; 
	}

	//mengeset absis titik dengan nilai baru x
	void setAbsis(double x){
		absis = x;
	}

	//mengeset ordinat titik dengan nilai baru y
	void setOrdinat(double y){
		ordinat = y;
	}
	
	//menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
	void geser(double x, double y){
		absis = absis + x;
		ordinat = ordinat + y;
	}

	//mencetak koordinat titik
	void printTitik(){
		System.out.println("Titik (" + absis + "," + ordinat + ")");
	}

	static int getCounterTitik(){
		return counterTitik;
	}

	void printCounterTitik(){
		System.out.println(this.counterTitik);
	}

	int getKuadran(){
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

	double getJarakPusat(){
		return Math.sqrt(Math.pow(absis,2) + Math.pow(ordinat,2));
	}

	double getJarak(Titik T){
		return Math.sqrt(Math.pow(absis - T.absis, 2) + Math.pow(ordinat - T.ordinat, 2));
	}

	void refleksiX() {
		ordinat = ordinat * -1;
	}

	void refleksiY() {
		absis = absis * -1;
	}

	Titik getRefleksiX() {
		return new Titik(absis, ordinat * -1);
	}

	Titik getRefleksiY() {
		return new Titik(absis * -1, ordinat);
	}

}
