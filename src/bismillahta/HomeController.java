/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillahta;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class HomeController implements Initializable {

    @FXML
    private JFXButton sewa;
    @FXML
    private JFXButton daftar;
    @FXML
    private JFXButton about;
    @FXML
    private Button back;
    @FXML
    private Button exit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sewa(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
         
         FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("sewa1.fxml"));
         Scene scene = new Scene(fxmlLoader.load(), 621, 416);
         
         Stage stage = new Stage();
         stage.setResizable(false);
         stage.setScene(scene);
         stage.setTitle("The Summiters");
         stage.show();
    }

    @FXML
    private void daftar(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
         
         FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("daftar2.fxml"));
         Scene scene = new Scene(fxmlLoader.load(), 477, 600);
         
         Stage stage = new Stage();
         stage.setResizable(false);
         stage.setScene(scene);
         stage.setTitle("The Summiters");
         stage.show();
    }

    @FXML
    private void about(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
         
         FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("about.fxml"));
         Scene scene = new Scene(fxmlLoader.load(), 375, 599);
         
         Stage stage = new Stage();
         stage.setResizable(false);
         stage.setScene(scene);
         stage.setTitle("The Summiters");
         stage.show();
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
         
         FXMLLoader fxmlLoader = new FXMLLoader();
         fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
         Scene scene = new Scene(fxmlLoader.load(), 600, 577);
         
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
