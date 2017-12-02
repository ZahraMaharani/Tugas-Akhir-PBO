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
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class SignupController implements Initializable {

    @FXML
    private JFXTextField name;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField alamat;
    @FXML
    private JFXButton signup;
    @FXML
    private Button login;
    @FXML
    private JFXPasswordField pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signup(ActionEvent event) throws IOException {
   
 if(name.getText().equals("")||pass.getText().equals("")||email.getText().equals("")||alamat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Lengkapi data anda terlebih dahulu");
    }else{
    try{
       String sql= "INSERT INTO signup VALUES('"+name.getText()+"', '"+pass.getText()+"', '"+email.getText()+"', "
               + "'"+alamat.getText()+"')";
       java.sql.Connection conn=(Connection)config.configDB();
       java.sql.PreparedStatement pst=conn.prepareStatement(sql);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Data anda sukses disimpan");
       
       ((Node) (event.getSource())).getScene().getWindow().hide();
       
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 600,477);
       
       Stage stage = new Stage();
       stage.setResizable(false);
       stage.setScene(scene);
       stage.setTitle("The Summiters");
       stage.show();
    }
    catch (HeadlessException | SQLException e){
      JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }
    }
    @FXML
    private void login(ActionEvent event) throws IOException {
        
        ((Node) (event.getSource())).getScene().getWindow().hide();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 477);
        
        Stage stage = new Stage();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Data Catcher");
        stage.show();
    }
    
}
