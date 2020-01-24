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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.TreeSet;

public class Controller3 {
    private TreeSet<Bien> biens =new TreeSet<Bien>();
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FCB326;";
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: #CDCDCD;";
    ImmoESI agence= new ImmoESI();
    @FXML
    private VBox bienbox= new VBox();
    //private VBox bien1 = new VBox();
    @FXML
    public void gotouslesbien() throws Exception {
        biens = agence.getListe_des_biens();
        Stage stage = Main.getPrimaryStage();

          //  int cpt=1;
            for(int i = 1; i <10;i++){
             //   System.out.println("NUMERO DU BIEN : "+cpt);
              //  ele.afficher();
               System.out.println("---------------------------------------");
              //  cpt++;
/*****************************************/
                Button b = new Button("wow");
                b.setMnemonicParsing(false);
                b.setPrefHeight(167.0);
                b.setPrefWidth(623.0);
                b.setId("bienbtn");
                b.setStyle("-fx-background-color: #CDCDCD;");
                b.setOnMouseEntered(e -> b.setStyle(HOVERED_BUTTON_STYLE));
                b.setOnMouseExited(e -> b.setStyle(IDLE_BUTTON_STYLE));
/*****************************************/
                StackPane r = new StackPane();
                AnchorPane screen = new AnchorPane();
                screen.setMinWidth(900);
                screen.setMinHeight(500);
                Pane details = new Pane();
                details.setStyle("-fx-background-color: #E84C89;");
                details.setMaxWidth(270);
                details.setMinHeight(500);
                details.setMinHeight(500);
                details.setMinWidth(270);
                details.setLayoutX(0);
                details.setLayoutY(0);
                ScrollPane scrollPane = new ScrollPane();
                Scene sc = new Scene(screen,900,500);
                bienbox.getChildren().add(b);
                r.getChildren().add(bienbox);
                scrollPane.setLayoutX(270.0);
                scrollPane.setLayoutY(47.0);
                scrollPane.setMaxWidth(630.0);
                scrollPane.setMinWidth(630.0);
                scrollPane.setMaxHeight(453.0);
                scrollPane.setMinHeight(453.0);
                scrollPane.setContent(r);
                screen.getChildren().add(scrollPane);
                screen.getChildren().add(details);
           //   scrollPane.setContent(details);


                stage.setScene(sc);
             //   stage.setScene(new Scene(r, 900, 500));
             //   Parent root = FXMLLoader.load(getClass().getResource("tous_les_bien.fxml"));
                stage.setTitle("ImmoEsi");
              // stage.setScene(new Scene(root, 900, 500));
                stage.show();

           }

        //    this.secondstage= stage;
    }


}
