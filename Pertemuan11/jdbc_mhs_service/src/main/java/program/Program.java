/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

import java.util.*;
import model.Mahasiswa;
import service.MysqlMahasiswaService;

/**
 *
 * @author User
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    public static void displayAll(){
        List<Mahasiswa> listmhs = service.getAll();
        System.out.println("===list mahasiswa===");
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
    }
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        // update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("data sebelum update: " + mhsUpdate);
        mhsUpdate.setNama("Haryo Wibowo");
        service.update(mhsUpdate);
        System.out.println("berhasil update: " + mhsUpdate);
        displayAll();

        //delete
        System.out.println("===delete");
        System.out.println("data sebelum delete: " + mhsUpdate);
        service.delete(mhsUpdate.getId());
        System.out.println("berhasil delete: " + mhsUpdate);
        displayAll();
        
    }
}
