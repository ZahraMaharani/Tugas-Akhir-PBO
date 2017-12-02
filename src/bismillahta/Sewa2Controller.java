/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
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
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javax.swing.JOptionPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class Sewa2Controller implements Initializable {

    @FXML
    private JFXTextArea hasil;
    @FXML
    private RadioButton transfer;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton cash;
    @FXML
    private ToggleGroup pilihan1;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton home;
    @FXML
    private JFXButton submit;
    @FXML
    private JFXTextArea jaminan;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    public void myFunction(String hri, int harga){
        hasil.setText("Anda menyewa barang selama "+hri+"hari \nDengan jumlah biaya "+harga);
     }

    @FXML
    private void exit(ActionEvent event) {
        Platform.exit();
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
    private void submit(ActionEvent event) {
        if(transfer.isSelected()||jaminan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Pilih cara pembayaran terlebih dan masukkan jaminan terlebih dahulu");
    }
    else{
    JOptionPane.showMessageDialog(null,"Tersimpan!");
    }
    
}
}
