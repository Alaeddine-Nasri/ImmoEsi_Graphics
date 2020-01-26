package sample;
import Noyaux.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;

public class Controller2 {
    public Stage secondstage;
    @FXML
    private TextField username,password;
    @FXML
    public void goAdminstration() throws Exception {
        Stage stage = Main.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("Adminstration.fxml"));
        stage.setTitle("ImmoEsi");
        stage.setScene(new Scene(root, 900, 500));
        stage.show();
    //    this.secondstage= stage;
    }
    public void goadmin_in() throws Exception {
        if(username.getText().equals( "admin") && password.getText().equals( "admin") ){
        Stage stage = Main.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("admin_in.fxml"));
        stage.setTitle("ImmoEsi");
        stage.setScene(new Scene(root, 900, 500));
        stage.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("Look, an Error Dialog");
            alert.setContentText("Ooops, there was an error!");
            alert.showAndWait();
        }

     //   this.secondstage= stage;
    }


}
