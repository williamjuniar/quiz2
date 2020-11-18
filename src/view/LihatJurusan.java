/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controller;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.jurusan;

/**
 *
 * @author user
 */
public class LihatJurusan implements ActionListener {
    JFrame frame = new JFrame("MyITHB");
    JLabel judul;
    JButton tombol;
    JTable tabel;
    
    public LihatJurusan(){
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        judul = new JLabel("Lihat Jurusan");
        judul.setFont(new Font("Arial", Font.PLAIN, 32));
        judul.setBounds(600,20,500,100);
        
        
        tabel = new JTable();
        tabel.setBounds(270,150,500,300);
        DefaultTableModel model = new DefaultTableModel();
        Object[] namaKolom = new Object[2];
        namaKolom[0] = "Kode Jurusan";
        namaKolom[1] = "Nama Jurusan";
        model.setColumnIdentifiers(namaKolom);
       
        tabel.setModel(model);
        
        tombol = new JButton("Main Menu");
        tombol.setBounds(400,500, 250, 30);
        tombol.setEnabled(true);
        tombol.addActionListener(this);
        
        frame.add(tabel);
        frame.add(judul);
        frame.add(tombol);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Main Menu")){
            new MainMenu();
            frame.dispose();
        }
    }
    
}
