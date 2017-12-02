/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class Daftar2Controller implements Initializable {

    @FXML
    private JFXCheckBox satu;

    @FXML
    private JFXCheckBox dua;

    @FXML
    private JFXCheckBox tiga;

    @FXML
    private JFXCheckBox empat;

    @FXML
    private JFXCheckBox lima;

    @FXML
    private JFXCheckBox enam;

    @FXML
    private JFXCheckBox tujuh;

    @FXML
    private JFXTextField carrier;
    String car;

    @FXML
    private JFXTextField trash;
    String tr;

    @FXML
    private JFXTextField butana;
    String bu;

    @FXML
    private JFXTextField makanan;
    String ma;

    @FXML
    private JFXTextField nesting;
    String nes;

    @FXML
    private JFXTextField tenda;
    String ten;

    @FXML
    private JFXTextField lamp;
    String la;

    @FXML
    private Button next;

    @FXML
    private Button exit;

    @FXML
    private Button back1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void next(ActionEvent event) throws IOException {
        if(carrier.getText().equals("")||trash.getText().equals("")||butana.getText().equals("")
                ||makanan.getText().equals("")||nesting.getText().equals("")||tenda.getText().equals("")
                ||lamp.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Lengkapi data anda terlebih dahulu");
    }else{
    try{
       String sql= "INSERT INTO perlengkapan VALUES('"+carrier.getText()+"', '"+trash.getText()+"', '"+butana.getText()+
               "', '"+makanan.getText()+"', '"+nesting.getText()+"', '"+tenda.getText()+"', '"+lamp.getText()+"')";
       java.sql.Connection conn=(Connection)config.configDB();
       java.sql.PreparedStatement pst=conn.prepareStatement(sql);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Data anda sukses disimpan");
       
       ((Node) (event.getSource())).getScene().getWindow().hide();
       
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("daftar1.fxml"));
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
    private void exit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
       
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("home.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 600,477);
       
       Stage stage = new Stage();
       stage.setResizable(false);
       stage.setScene(scene);
       stage.setTitle("The Summiters");
       stage.show();
    }
    
}
