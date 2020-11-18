/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Properties;
import javax.swing.*;


/**
 *
 * @author ASUS
 */
public class MainMenu implements ActionListener {
    JFrame frame = new JFrame("MyITHB");
    JLabel judul;
    JButton menu1,menu2,menu3,menu4;
    
    public MainMenu() {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        judul = new JLabel("Main Menu ITHB");
        judul.setFont(new Font("Arial", Font.PLAIN, 32));
        judul.setBounds(600,20,500,100);
        
        menu1 = new JButton("Insert Data Jurusan Baru");
        menu1.setBounds(550, 120, 400, 30);
        menu1.addActionListener(this);
     
        menu2 = new JButton("Lihat Data Semua Jurusan");
        menu2.setBounds(525, 180, 400, 30);
        menu2.setEnabled(true);
        menu2.addActionListener(this);
        
        menu3 = new JButton("Insert Data Mahasiswa Baru");
        menu3.setBounds(480, 240, 400, 30);
        menu3.setEnabled(true);
        menu3.addActionListener(this);
        
        menu4 = new JButton("Lihat Data Mahasiswa Per Jurusan");
        menu4.setBounds(525, 300, 250, 30);
        menu4.setEnabled(true);
        menu4.addActionListener(this);
        
        frame.add(judul);
        frame.add(menu1);
        frame.add(menu2);
        frame.add(menu3);
        frame.add(menu4);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Insert Data Jurusan Baru")){
            new InsertJurusan();
            frame.dispose();
        } else if(e.getActionCommand().equals("Lihat Data Semua Jurusan")){
            new LihatJurusan();
            frame.dispose();
        } else if(e.getActionCommand().equals("Insert Data Mahasiswa Baru")){
            new InsertMahasiswa();
            frame.dispose();
        } else if(e.getActionCommand().equals("Lihat Data Mahasiswa Per Jurusan")){
            new LihatMahasiswa();
            frame.dispose();
        }
        
    }
    
}
