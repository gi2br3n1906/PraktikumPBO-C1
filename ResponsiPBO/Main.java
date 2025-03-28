public class Main {
    public static void main(String[] args) {
        Fakultas teknik = new Fakultas("Teknik", 7000000, 8000000);
        Fakultas fmipa = new Fakultas("FMIPA", 6500000, 7500000);

        Mahasiswa mhs1 = new Mahasiswa("Asep Surasep", "asep@mail.com", "24060122130192", 3, teknik);
        Mahasiswa mhs2 = new Mahasiswa("Dadang Suradang", "bob@mail.com", "24060123130024", 1, fmipa);
        
        Dosen dosen1 = new Dosen("Rinaldi Munir", "munir@staff.com", "198501012015041001", 8, teknik);
        Dosen dosen2 = new Dosen("Aleams Barra", "barra@staff.com", "197001012010041002", 13, fmipa);
        
        Tendik tendik1 = new Tendik("Kian", "kian@staff.com", "198601012016041001", 7);
        Tendik tendik2 = new Tendik("Ujang", "ujang@staff.com", "199001012018041001", 5);
        
        System.out.println("\n=== Informasi Fakultas ===");
        System.out.println("\nFakultas Teknik:");
        teknik.printInfo();
        System.out.println("\nFakultas MIPA:");
        fmipa.printInfo();
        
        System.out.println("\n=== Informasi Mahasiswa ===");
        System.out.println("\nMahasiswa 1:");
        mhs1.printInfo();
        System.out.println("\nMahasiswa 2:");
        mhs2.printInfo();
        
        System.out.println("\n=== Informasi Dosen ===");
        System.out.println("\nDosen 1:");
        dosen1.printInfo();
        System.out.println("\nDosen 2:");
        dosen2.printInfo();
        
        System.out.println("\n=== Informasi Tendik ===");
        System.out.println("\nTendik 1:");
        tendik1.printInfo();
        System.out.println("\nTendik 2:");
        tendik2.printInfo();
        
        System.out.println("\n=== Statistik Civitas Akademika ===");
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getJumlahMahasiswa());
        System.out.println("Jumlah Dosen: " + Dosen.getJumlahDosen());
        System.out.println("Jumlah Tendik: " + Tendik.getJumlahTendik());
    }
}
