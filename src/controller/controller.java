/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.jurusan;
import model.mahasiswa;

/**
 *
 * @author ASUS
 */
public class Controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<Jurusan> getAllJurusan() {
       
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Jurusan jurusan = new Jurusan();
                jurusan.setKode(rs.getString("kodeJurusan"));
                jurusan.setNama(rs.getString("namaJurusan"));
                jurusan2.add(jurusan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (jurusan2);
    }
       
    public static ArrayList<Jurusan> getKode() {
        ArrayList<Jurusan> jurusan2 = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Jurusan jurusan = new Jurusan();
                jurusan.setKode(rs.getString("kodeJurusan"));
                jurusan2.add(jurusan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (jurusan2);
    }
    
    public static ArrayList<Mahasiswa> getMahasiswa(String kode) {
        ArrayList<Mahasiswa> mhss = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM mahasiswa WHERE kodeJurusan='" + kode + "'";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setAngkatan(rs.getInt("angkatan"));
                mhs.setKode_jurusan(rs.getString("kodeJurusan"));
                mhss.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (mhss);
    }
    
    public static boolean insertJurusan(String kode, String nama) {
        conn.connect();
        String query = "INSERT INTO jurusan VALUES(?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, kode);
            stmt.setString(2, nama);
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
}
