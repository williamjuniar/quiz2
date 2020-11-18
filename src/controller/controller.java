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
public class controller {
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<jurusan> getAllJurusan() {
        ArrayList<jurusan> jurusan3 = new ArrayList<>();
        conn.Connect();
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                jurusan jurusan2 = new jurusan();
                jurusan2.setKode(rs.getString("kodeJurusan"));
                jurusan2.setNama(rs.getString("namaJurusan"));
                jurusan3.add(jurusan2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (jurusan3);
    }
       
    public static ArrayList<jurusan> getKode() {
        ArrayList<jurusan> jurusan3 = new ArrayList<>();
        conn.Connect();
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                jurusan jurusan2 = new jurusan();
                jurusan2.setKode(rs.getString("kodeJurusan"));
                jurusan3.add(jurusan2);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (jurusan3);
    }
   
    public static boolean insertJurusan(String kode, String nama) {
        conn.Connect();
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
