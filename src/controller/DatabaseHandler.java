/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.TimeZone;
import javax.swing.JOptionPane;

public class DatabaseHandler {
    public Connection con;
    private String driver = "com.mysql.cj.jdbc.Driver";
    //private String url = "jdbc:mysql://localhost/db_test?serverTimezone=UTC";
    private String url = "jdbc:mysql://localhost/dbquiz?serverTimezone=" + TimeZone.getDefault().getID();
    private String username = "root";
    private String password = "";
    private Connection start(){
        try{         
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e){
            
            System.out.println("SQLException : " + e.getMessage());
            System.out.println("SQLState : " + e.getLocalizedMessage());
            JOptionPane.showMessageDialog(null, "Error login" + e);
        }
        return con;
    }
    
    private void Off(){
        try{
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
    }
    
    public void Connect(){
        try{
            con = start();
        }
        catch(Exception e){
            System.out.println("Error connect to Database");
        }  
    }
    
    public void Disconnect(){
        try{
             Off();
        }
        catch(Exception e){
            System.out.println("Error connect to Database");
        }
    }
    
}
