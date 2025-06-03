/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Mahasiswa;
import utilities.MysqlUtility;

/**
 *
 * @author User
 */


public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        return new Mahasiswa(id, nama);
    }
    
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Mahasiswa getById(int id) {
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        Mahasiswa mhs = null;
        try {
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();   
        }
        return mhs;
    }

    public List<Mahasiswa> getAll() {
        String sql = "SELECT * FROM mahasiswa";
        List<Mahasiswa> listMhs = new ArrayList<>();
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listMhs.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
    public void resetIdSequence() {
    try {
        // Get all current data with names only
        List<Mahasiswa> allData = getAll();
        List<String> names = new ArrayList<>();
        for (Mahasiswa mhs : allData) {
            names.add(mhs.getNama());
        }
        
        // Truncate the table to clear all data and reset auto-increment
        Statement stmt = koneksi.createStatement();
        stmt.executeUpdate("TRUNCATE TABLE mahasiswa");
        
        // Re-insert the data with new sequential IDs
        for (String name : names) {
            Mahasiswa newMhs = new Mahasiswa();
            newMhs.setNama(name);
            add(newMhs);
        }
        
        System.out.println("ID sequence reset successfully");
    } catch (SQLException e) {
        System.out.println("Failed to reset ID sequence: " + e.getMessage());
        e.printStackTrace();
    }
}
}
