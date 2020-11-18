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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class InsertJurusan implements ActionListener {
    JFrame frame = new JFrame("MyITHB");
    JLabel judul,labelKode,labelNama;
    JTextField kode,nama;
    JButton tombol,tombol2,tombol3,tombol4;
    
    public InsertJurusan() {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        judul = new JLabel("Insert Jurusan");
        judul.setFont(new Font("Arial", Font.PLAIN, 32));
        judul.setBounds(600,20,500,100);
        
        labelKode = new JLabel("Kode : ");
        labelKode.setFont(new Font("Arial", Font.PLAIN, 20));
        labelKode.setBounds(20, 160, 250, 50);
        kode = new JTextField();
        kode.setFont(new Font("Arial", Font.PLAIN, 20));
        kode.setBounds(270, 170, 150, 30);
        
        labelNama = new JLabel("Nama : ");
        labelNama.setFont(new Font("Arial", Font.PLAIN, 20));
        labelNama.setBounds(20, 210, 250, 50);
        nama = new JTextField();
        nama.setFont(new Font("Arial", Font.PLAIN, 20));
        nama.setBounds(270, 220, 150, 30);
        
        tombol = new JButton("Insert");
        tombol.setBounds(400, 360, 250, 30);
        tombol.setEnabled(true);
        tombol.addActionListener(this);
     
        tombol2 = new JButton("Main Menu");
        tombol2.setBounds(700, 360, 250, 30);
        tombol2.setEnabled(true);
        tombol2.addActionListener(this);
        
        frame.add(judul);
        frame.add(tombol);
        frame.add(tombol2);
        frame.add(labelKode);
        frame.add(kode);
        frame.add(labelNama);
        frame.add(nama);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String kode = this.kode.getText();
        String nama = this.nama.getText();
        if(e.getActionCommand().equals("Insert")){
            //if(controller.insertJurusan(kode,nama)){
                JOptionPane.showMessageDialog(null,"Data Berhasil Insert!");
                new MainMenu();
                frame.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Data Gagal Insert!");
            }
       // } else if(e.getActionCommand().equals("Main Menu")){
            new MainMenu();
            frame.dispose();
        } 
        
    }
    

