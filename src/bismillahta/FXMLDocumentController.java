/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private JFXTextField name;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private JFXButton login;
    @FXML
    private JFXButton signup;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event) throws IOException {
      Connection con;
      Statement stat;
      ResultSet rs;
      String sql;
      
      Koneksi DB = new Koneksi();
      DB.config();
      con = DB.con;
      stat = (Statement) DB.stm;
      
      if(name.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan username anda");
      }
      else if(pass.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Masukkan password anda");
      }
      else{
      try{
       sql = "SELECT * FROM signup WHERE name='"+name.getText()+"' AND pass='"+pass.getText()+"'";
       rs = stat.executeQuery(sql);
       if(rs.next()){
       if(name.getText().equals(rs.getString("name")) && pass.getText().equals(rs.getString("pass"))){
         JOptionPane.showMessageDialog(null, "Berhasil Login");
         
         ((Node) (event.getSource())).getScene().getWindow().hide();
         
         FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("Home.fxml"));
         Scene scene = new Scene(fxmlLoader.load(), 382, 480);
         
         Stage stage = new Stage();
         stage.setResizable(false);
         stage.setScene(scene);
         stage.setTitle("The Summiters");
         stage.show();
       }
      }else{
          JOptionPane.showMessageDialog(null, "Username dan Password anda salah");
       }
      }catch (HeadlessException | SQLException e){
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
      }
    }

    @FXML
    private void signup(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("signup.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 477);
        
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("The Summiters");
        stage.show();
    }
    
}
