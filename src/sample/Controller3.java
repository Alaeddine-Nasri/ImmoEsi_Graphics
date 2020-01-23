package sample;

import Noyaux.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.TreeSet;

public class Controller3 {
    private TreeSet<Bien> biens =new TreeSet<Bien>();
    ImmoESI agence= new ImmoESI();
    private VBox bien1;
    @FXML
    public void gotouslesbien() throws Exception {
        biens = agence.getListe_des_biens();
        Stage stage = Main.getPrimaryStage();
      //  AnchorPane r = new AnchorPane();
       // Scene sc = new Scene(r,900,500);

          //  int cpt=1;
            for(int i = 1; i <10;i++){
             //   System.out.println("NUMERO DU BIEN : "+cpt);
              //  ele.afficher();
               System.out.println("---------------------------------------");
              //  cpt++;

                Button b = new Button("wow");
                b.setMnemonicParsing(false);
                b.setPrefHeight(167.0);
                b.setPrefWidth(623.0);
                b.setStyle("-fx-background-color: #FCB326;");
               // r.getChildren().add(b);
                bien1.getChildren().add(b);
                //stage.setScene(sc);
              //  stage.setScene(new Scene(r, 900, 500));
                Parent root = FXMLLoader.load(getClass().getResource("tous_les_bien.fxml"));
                stage.setTitle("ImmoEsi");
                stage.setScene(new Scene(root, 900, 500));
                stage.show();

            }

        //    this.secondstage= stage;
    }


}
