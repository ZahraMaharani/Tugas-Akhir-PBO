/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
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
public class Daftar1Controller implements Initializable {
    int hitung;
    @FXML
    private JFXButton back;
    @FXML
    private JFXButton next;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXTextField nama;
    String nm;
    @FXML
    private JFXTextField ttl;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField alamat;
    @FXML
    private JFXTextField tujuan;
    @FXML
    private JFXDatePicker berangkat;
    @FXML
    private JFXDatePicker turun;
    @FXML
    private JFXTextField tim;
    String ti;
    @FXML
    private JFXTextField hari;
    String hr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
       
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("daftar2.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 366,501);
       
       Stage stage = new Stage();
       stage.setResizable(false);
       stage.setScene(scene);
       stage.setTitle("The Summiters");
       stage.show();
    }

    @FXML
    private void next(ActionEvent event) throws IOException {
        
        int harga=0;
         if(hari.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Harap memasukkan jumlah hari");
            }else{
            String hr = hari.getText();
            hitung = Integer.parseInt(hari.getText());
            harga = hitung*10000;
            }
        
        if(nama.getText().equals("")||ttl.getText().equals("")||id.getText().equals("")||alamat.getText().equals("")||
                tujuan.getText().equals("")||tim.getText().equals("")||hari.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Lengkapi data anda terlebih dahulu");
    }else{
    try{
       String sql= "INSERT INTO data (`nama`,`ttl`,`id`,`alamat`,`tujuan`,`berangkat`,`turun`,`hari`,`tim`) VALUES('"+
               nama.getText()+"', '"+ttl.getText()+"', '"+id.getText()+"', '"+alamat.getText()+"', '"+tujuan.getText()+"', "
               + "'"+berangkat.getValue()+"', '"+turun.getValue()+"', '"+tim.getText()+"', '"+hari.getText()+"')";
       java.sql.Connection conn=(Connection)config.configDB();
       java.sql.PreparedStatement pst=conn.prepareStatement(sql);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Data anda sukses disimpan");
       
       ((Node) (event.getSource())).getScene().getWindow().hide();
       
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("daftar3.fxml"));
       Scene scene = new Scene(fxmlLoader.load(), 496,615);
       
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
           
            FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar3.fxml"));
            Parent root = (Parent) loader.load();
            Daftar3Controller fxml2Controller = loader.getController();
            fxml2Controller.myFunction(nama.getText(), tim.getText(), hari.getText(), harga);
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();   
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
}
    }

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
    }
    
}
