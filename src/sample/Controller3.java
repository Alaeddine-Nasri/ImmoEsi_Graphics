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
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
                /************************************************** Declarations ***************************************************/

                Button b = new Button();
                StackPane r = new StackPane();
                AnchorPane screen = new AnchorPane();
                AnchorPane banchor = new AnchorPane();
                ScrollPane scrollPane = new ScrollPane();
                Pane details = new Pane();
                Text title = new Text(); Text bienName = new Text(); Text bienAdresse = new Text(); Text bienProp = new Text();
                Text bienTypet = new Text(); Text bienTypeb = new Text(); Text bienPrix = new Text(); Text bienSurface = new Text();

                /************************************************** Biens Button ***************************************************/

                b.setMnemonicParsing(false);
                b.setPrefHeight(167.0);
                b.setPrefWidth(610.0);
                b.setId("bienbtn");
                b.setStyle("-fx-background-color: #CDCDCD;");
                b.setOnMouseEntered(e -> b.setStyle(HOVERED_BUTTON_STYLE));
                b.setOnMouseExited(e -> b.setStyle(IDLE_BUTTON_STYLE));

                /************************************************** Listes des biens Pane ***************************************************/

                screen.setMinWidth(900);
                screen.setMinHeight(500);

                /************************************************** More details Pane ***************************************************/

                details.setStyle("-fx-background-color: #7F59B0;");
                details.setMaxWidth(290);
                details.setMinHeight(500);
                details.setMinHeight(500);
                details.setMinWidth(290);
                details.setLayoutX(0);
                details.setLayoutY(0);

                /************************************************** Title ***************************************************/

                title.setText("Liste des biens : ");
                title.setLayoutX(320);
                title.setLayoutY(27);
                title.setFont(Font.font("System", FontWeight.BOLD, 20));

                /************************************************** ScrollPane ***************************************************/

                scrollPane.setLayoutX(270.0);
                scrollPane.setLayoutY(47.0);
                scrollPane.setMaxWidth(630.0);
                scrollPane.setMinWidth(630.0);
                scrollPane.setMaxHeight(453.0);
                scrollPane.setMinHeight(453.0);

                /************************************************** Button Text ***************************************************/

                bienName.setText("Bien1 :");
                bienName.setFill(Paint.valueOf("#000000"));
                bienName.setFont(Font.font("System", FontWeight.BOLD, 23));
                bienName.setLayoutX(40);
                bienName.setLayoutY(30);

                bienAdresse.setText("Adresse :");
                bienAdresse.setLayoutX(55);
                bienAdresse.setLayoutY(60);
                bienAdresse.setFill(Paint.valueOf("#000000"));
                bienAdresse.setFont(Font.font("System", FontWeight.BOLD, 15));

                bienTypeb.setText("Type de Bien :");
                bienTypeb.setLayoutX(55);
                bienTypeb.setLayoutY(85);
                bienTypeb.setFill(Paint.valueOf("#000000"));
                bienTypeb.setFont(Font.font("System", FontWeight.BOLD, 15));

                bienTypet.setText("Type de transaction :");
                bienTypet.setLayoutX(55);
                bienTypet.setLayoutY(110);
                bienTypet.setFill(Paint.valueOf("#000000"));
                bienTypet.setFont(Font.font("System", FontWeight.BOLD, 15));

                bienProp.setText("Propritére :");
                bienProp.setLayoutX(55);
                bienProp.setLayoutY(135);
                bienProp.setFill(Paint.valueOf("#000000"));
                bienProp.setFont(Font.font("System", FontWeight.BOLD, 15));

                bienSurface.setText("Surface :");
                bienSurface.setLayoutX(55);
                bienSurface.setLayoutY(160);
                bienSurface.setFill(Paint.valueOf("#000000"));
                bienSurface.setFont(Font.font("System", FontWeight.BOLD, 15));

                bienPrix.setText("Prix :");
                bienPrix.setLayoutX(485);
                bienPrix.setLayoutY(185);
                bienPrix.setFill(Paint.valueOf("#000000"));
                bienPrix.setFont(Font.font("System", FontWeight.BOLD, 23));

                /************************************************** Button AnchorPane ***************************************************/

                banchor.setMinHeight(200);
                banchor.setMinWidth(200);
                //banchor.setStyle("-fx-background-color: #7F59B0;");


                /************************************************** Affectation ***************************************************/

                b.setGraphic(banchor);
                banchor.getChildren().add(bienName);
                banchor.getChildren().add(bienAdresse);
                banchor.getChildren().add(bienTypeb);
                banchor.getChildren().add(bienTypet);
                banchor.getChildren().add(bienProp);
                banchor.getChildren().add(bienSurface);
                banchor.getChildren().add(bienPrix);
                //banchor.setOnMouseClicked(e -> banchor.setStyle(HOVERED_BUTTON_STYLE));
                bienbox.getChildren().add(b);
                r.getChildren().add(bienbox);
                scrollPane.setContent(r);
                screen.getChildren().add(scrollPane);
                screen.getChildren().add(title);
                screen.getChildren().add(details);
           //   scrollPane.setContent(details);

                Scene sc = new Scene(screen,900,500);
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
