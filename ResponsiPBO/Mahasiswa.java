public class Mahasiswa extends CivitasAkademika{
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int jumlahMahasiswa = 0;

    // Konstruktor
    public Mahasiswa() {
        super();
        this.nim = "";
        this.semester = 0;
        this.fakultas = new Fakultas(); 
        jumlahMahasiswa ++;
    }

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        jumlahMahasiswa ++;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }
    
    public int getSemester() {
        return semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double hitungBiayaKuliah() {
        double tarifUKT = fakultas.getTarifUKT();

        for (int i = 1; i <= semester; i++) {
            tarifUKT *= 0.95; 
        }
    
        return tarifUKT;
    }   

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void printInfo() {
        System.out.println("=================================");
        System.out.println("         Informasi Mahasiswa      ");
        System.out.println("=================================");
        System.out.printf("Nama       : %s%n", getNama());
        System.out.printf("Email      : %s%n", getEmail());
        System.out.printf("NIM        : %s%n", nim);
        System.out.printf("Semester   : %d%n", semester);
        System.out.printf("Fakultas   : %s%n", fakultas.getNama());
        System.out.printf("Biaya UKT  : Rp%,.2f%n", hitungBiayaKuliah());
        System.out.println("=================================");
    }   
    
    
}   
