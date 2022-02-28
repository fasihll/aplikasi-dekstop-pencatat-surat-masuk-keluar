/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package surat_km;

/**
 *
 * @author Fasih
 */
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
   
 

    Connection con;
    Statement stm;
    
    public void Connection(){
        try {     
            
           con=DriverManager.getConnection("jdbc:mysql://localhost/surat", "root", "");
            stm = con.createStatement();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}

