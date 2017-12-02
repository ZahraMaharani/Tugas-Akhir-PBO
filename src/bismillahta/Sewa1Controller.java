/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.jfoenix.controls.JFXButton;
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
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class Sewa1Controller implements Initializable {

    @FXML
    private JFXCheckBox c;
    @FXML
    private JFXCheckBox t;
    @FXML
    private JFXCheckBox n;
    @FXML
    private JFXCheckBox m;
    @FXML
    private JFXCheckBox sb;
    @FXML
    private JFXCheckBox sd;
    @FXML
    private JFXCheckBox sp;
    @FXML
    private JFXTextField carrier;
    @FXML
    private JFXTextField tenda;
    @FXML
    private JFXTextField nesting;
    @FXML
    private JFXTextField matras;
    @FXML
    private JFXTextField sleep;
    @FXML
    private JFXTextField sandal;
    @FXML
    private JFXTextField sepatu;
    @FXML
    private JFXButton next;
    @FXML
    private JFXButton home;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXTextField hari;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void next(ActionEvent event) throws IOException {
        
        int harga = 0;
        int harga1 = 0;
        int harga2 = 0;
        int harga3 = 0;
        int harga4 = 0;
        int harga5 = 0;
        int harga6 = 0;
        int harga7 = 0;
        if(!(c.isSelected() || t.isSelected() || n.isSelected() || m.isSelected() || sb.isSelected() || 
                sd.isSelected() || sp.isSelected() )){
           JOptionPane.showMessageDialog(null, "Centang barang yang ingin anda sewa");
        }else{
        int car = Integer.parseInt(carrier.getText());
        int ten = Integer.parseInt(tenda.getText());
        int nes = Integer.parseInt(nesting.getText());
        int ma = Integer.parseInt(matras.getText());
        int sle = Integer.parseInt(sleep.getText());
        int san = Integer.parseInt(sandal.getText());
        int sep = Integer.parseInt(sepatu.getText());
        int hr = Integer.parseInt(hari.getText());
        String har = hari.getText();
        
        if(c.isSelected()){
           harga1 = car*12500;
        }
        if(t.isSelected()){
           harga2 = ten*25000;
        }
        if(n.isSelected()){
           harga3 = nes*5000;
        }
        if(m.isSelected()){
           harga3 = ma*2000;
        }
        if(sb.isSelected()){
           harga3 = sle*5000;
        }
        if(sd.isSelected()){
           harga3 = san*5000;
        }
        if(sp.isSelected()){
           harga3 = sep*15000;
        }
        
        harga = (harga1+harga2+harga3+harga4+harga5+harga6+harga7)*hr;
        }
        
        if(carrier.getText().equals("")||tenda.getText().equals("")||nesting.getText().equals("")||
                matras.getText().equals("")||sleep.getText().equals("")||sandal.getText().equals("")||sepatu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Apakah anda tidak akan menyewa barang? silahkan kembali ke Home");
    }else{
    try{
       String sql= "INSERT INTO sewa VALUES('"+carrier.getText()+"', '"+tenda.getText()+"', '"+nesting.getText()+"', '"
               +matras.getText()+"', '"+sleep.getText()+"', '"+sandal.getText()+"', '"+sepatu.getText()+"')";
       java.sql.Connection conn=(Connection)config.configDB();
       java.sql.PreparedStatement pst=conn.prepareStatement(sql);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Data anda sukses disimpan");
       
       ((Node) (event.getSource())).getScene().getWindow().hide();
       
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("sewa2.fxml"));
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
         try {
           
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sewa2.fxml"));
            Parent root = (Parent) loader.load();
            Sewa2Controller fxml2Controller = loader.getController();
            fxml2Controller.myFunction(hari.getText(), harga);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();   
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
}
    }

    @FXML
    private void home(ActionEvent event) throws IOException {
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

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
    }
    
}
