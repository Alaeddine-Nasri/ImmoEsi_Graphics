package sample;

import Noyaux.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.TreeSet;

public class Controller3 {
    private TreeSet<Bien> biens =new TreeSet<Bien>();
    ImmoESI agence= new ImmoESI();
    private VBox bien1;

    public void gotouslesbien() throws Exception {
        biens = agence.getListe_des_biens();
        Stage stage = Main.getPrimaryStage();
        Parent root = FXMLLoader.load(getClass().getResource("tous_les_bien.fxml"));
        stage.setTitle("ImmoEsi");
        stage.setScene(new Scene(root, 900, 500));
        stage.show();
            int cpt=1;
            for(Bien ele:biens){
                System.out.println("NUMERO DU BIEN : "+cpt);
                ele.afficher();
                System.out.println("---------------------------------------");
                cpt++;
                Button b = new Button();
                b.setMnemonicParsing(false);
                b.setPrefHeight(167.0);
                b.setPrefWidth(623.0);
                b.setStyle("-fx-background-color: #FCB326;");

            }

        //    this.secondstage= stage;
    }


}
