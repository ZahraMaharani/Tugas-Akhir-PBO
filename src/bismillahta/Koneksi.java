/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SMK TELKOM
 */
public class Koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/summiters", "root", "");
        stm = con.createStatement();
      }catch (ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, "Koneksi gagal"+e.getMessage());
      }
    }
    
    Object connect(String query){
      throw new UnsupportedOperationException("Not Supported yet.");
    }
}
