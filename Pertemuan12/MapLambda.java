package Pertemuan12;

import java.util.HashMap;
import java.util.Map;


public class MapLambda {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        mahasiswaMap.put("24060123141254", "Budi Santoso");
        mahasiswaMap.put("24060123131024", "Ani Wijaya");
        mahasiswaMap.put("24060123142452", "Dodi Prakoso");
        mahasiswaMap.put("24060123121204", "Siti Nurhaliza");
        mahasiswaMap.put("24061034214134", "Rudi Hartono");
        
        System.out.println("Daftar Mahasiswa:");
        System.out.println("------------------------");
        System.out.println("NIM\t\t| Nama");
        System.out.println("------------------------");
        
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + "\t| " + nama));
        
    
    }
}
