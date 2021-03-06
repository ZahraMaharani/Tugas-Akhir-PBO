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
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class AboutController implements Initializable {

    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton home;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    
}
