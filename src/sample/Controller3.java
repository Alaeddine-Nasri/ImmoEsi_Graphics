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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//import javax.swing.text.html.ImageView;
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
                Text title = new Text();

                Text bienName = new Text(); Text bienAdresse = new Text(); Text bienProp = new Text();
                Text bienTypet = new Text(); Text bienTypeb = new Text(); Text bienPrix = new Text(); Text bienSurface = new Text();

                Text bienName1 = new Text(); Text bienAdresse1 = new Text(); Text bienProp1 = new Text();
                Text bienTypet1 = new Text(); Text bienTypeb1 = new Text(); Text bienPrix1 = new Text(); Text bienSurface1 = new Text();

                Text bienAdresse2 = new Text();Text bienProp2 = new Text();
                Text bienTypet2 = new Text(); Text bienTypeb2 = new Text(); Text bienPrix2 = new Text(); Text bienSurface2 = new Text();

                Text bienAdresse3 = new Text();Text bienProp3 = new Text();
                Text bienTypet3 = new Text(); Text bienTypeb3 = new Text(); Text bienPrix3 = new Text(); Text bienSurface3 = new Text();

                ImageView im = new ImageView();
                Image image = new Image("file:C:/Users/Dell/Desktop/POO/JAVAFXSETUP/src/icons/download.png");
                im.setImage(image);


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
                bienPrix.setLayoutX(425);
                bienPrix.setLayoutY(185);
                bienPrix.setFill(Paint.valueOf("#000000"));
                bienPrix.setFont(Font.font("System", FontWeight.BOLD, 23));

                /************************************************** text Button ****************************************************/


                /************************************************** Label Button ****************************************************/

                bienAdresse2.setText("Adresse");
                bienAdresse2.setLayoutX(185);
                bienAdresse2.setLayoutY(60);
                bienAdresse2.setFill(Paint.valueOf("#000000"));
                bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienTypeb2.setText("Type de Bien ");
                bienTypeb2.setLayoutX(245);
                bienTypeb2.setLayoutY(85);
                bienTypeb2.setFill(Paint.valueOf("#000000"));
                bienTypeb2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienTypet2.setText("Type de transaction");
                bienTypet2.setLayoutX(245);
                bienTypet2.setLayoutY(110);
                bienTypet2.setFill(Paint.valueOf("#000000"));
                bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienProp2.setText("Propritére");
                bienProp2.setLayoutX(185);
                bienProp2.setLayoutY(135);
                bienProp2.setFill(Paint.valueOf("#000000"));
                bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienSurface2.setText("Surface ");
                bienSurface2.setLayoutX(185);
                bienSurface2.setLayoutY(160);
                bienSurface2.setFill(Paint.valueOf("#000000"));
                bienSurface2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienPrix2.setText("149384 ");
                bienPrix2.setLayoutX(490);
                bienPrix2.setLayoutY(185);
                bienPrix2.setFill(Paint.valueOf("#000000"));
                bienPrix2.setFont(Font.font("System", FontWeight.NORMAL, 23));

                /************************************************** Label Button ****************************************************/



                /************************************************** Details Text ***************************************************/

                bienName1.setText("Bien1 :");
                bienName1.setFill(Paint.valueOf("#ffffff"));
                bienName1.setFont(Font.font("System", FontWeight.BOLD, 25));
                bienName1.setLayoutX(110);
                bienName1.setLayoutY(30);

                bienAdresse1.setText("Adresse :");
                bienAdresse1.setLayoutX(20);
                bienAdresse1.setLayoutY(260);
                bienAdresse1.setFill(Paint.valueOf("#ffffff"));
                bienAdresse1.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienTypeb1.setText("Type de Bien :");
                bienTypeb1.setLayoutX(20);
                bienTypeb1.setLayoutY(285);
                bienTypeb1.setFill(Paint.valueOf("#ffffff"));
                bienTypeb1.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienTypet1.setText("Type de transaction :");
                bienTypet1.setLayoutX(20);
                bienTypet1.setLayoutY(310);
                bienTypet1.setFill(Paint.valueOf("#ffffff"));
                bienTypet1.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienProp1.setText("Propritére :");
                bienProp1.setLayoutX(20);
                bienProp1.setLayoutY(335);
                bienProp1.setFill(Paint.valueOf("#ffffff"));
                bienProp1.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienSurface1.setText("Surface :");
                bienSurface1.setLayoutX(20);
                bienSurface1.setLayoutY(360);
                bienSurface1.setFill(Paint.valueOf("#ffffff"));
                bienSurface1.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienPrix1.setText("Prix :");
                bienPrix1.setLayoutX(10);
                bienPrix1.setLayoutY(230);
                bienPrix1.setFill(Paint.valueOf("#ffffff"));
                bienPrix1.setFont(Font.font("System", FontWeight.BOLD, 25));

                /************************************************** Details Label ***************************************************/


                bienAdresse3.setText("Adresse");
                bienAdresse3.setLayoutX(105);
                bienAdresse3.setLayoutY(260);
                bienAdresse3.setFill(Paint.valueOf("#FCB326"));
                bienAdresse3.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienTypeb3.setText("Type de Bien");
                bienTypeb3.setLayoutX(145);
                bienTypeb3.setLayoutY(285);
                bienTypeb3.setFill(Paint.valueOf("#FCB326"));
                bienTypeb3.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienTypet3.setText("transaction");
                bienTypet3.setLayoutX(145);
                bienTypet3.setLayoutY(310);
                bienTypet3.setFill(Paint.valueOf("#FCB326"));
                bienTypet3.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienProp3.setText("Propritére");
                bienProp3.setLayoutX(105);
                bienProp3.setLayoutY(335);
                bienProp3.setFill(Paint.valueOf("#FCB326"));
                bienProp3.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienSurface3.setText("Surface");
                bienSurface3.setLayoutX(105);
                bienSurface3.setLayoutY(360);
                bienSurface3.setFill(Paint.valueOf("#FCB326"));
                bienSurface3.setFont(Font.font("System", FontWeight.BOLD, 12));

                bienPrix3.setText("129809");
                bienPrix3.setLayoutX(110);
                bienPrix3.setLayoutY(230);
                bienPrix3.setFill(Paint.valueOf("#FCB326"));
                bienPrix3.setFont(Font.font("System", FontWeight.BOLD, 25));


                /************************************************** Button AnchorPane ***************************************************/

                banchor.setMinHeight(200);
                banchor.setMinWidth(200);
                //banchor.setStyle("-fx-background-color: #7F59B0;");

                /************************************************** Image ***************************************************/

             //   im.setFitHeight(150);
               // im.setFitWidth(200);
            //    im.setLayoutX(35);
            //    im.setLayoutY(60);

                /************************************************** Affectation ***************************************************/



                b.setGraphic(banchor);
                banchor.getChildren().add(bienName);
                banchor.getChildren().add(bienAdresse);
                banchor.getChildren().add(bienTypeb);
                banchor.getChildren().add(bienTypet);
                banchor.getChildren().add(bienProp);
                banchor.getChildren().add(bienSurface);
                banchor.getChildren().add(bienPrix);

                banchor.getChildren().add(bienAdresse2);
                banchor.getChildren().add(bienTypeb2);
                banchor.getChildren().add(bienTypet2);
                banchor.getChildren().add(bienProp2);
                banchor.getChildren().add(bienSurface2);
                banchor.getChildren().add(bienPrix2);

                details.getChildren().add(bienName1);
                details.getChildren().add(bienAdresse1);
                details.getChildren().add(bienTypeb1);
                details.getChildren().add(bienTypet1);
                details.getChildren().add(bienProp1);
                details.getChildren().add(bienSurface1);
                details.getChildren().add(bienPrix1);

                details.getChildren().add(bienAdresse3);
                details.getChildren().add(bienTypeb3);
                details.getChildren().add(bienTypet3);
                details.getChildren().add(bienProp3);
                details.getChildren().add(bienSurface3);
                details.getChildren().add(bienPrix3);

                details.getChildren().add(im);

                //banchor.setOnMouseClicked(e -> banchor.setStyle(HOVERED_BUTTON_STYLE));
                bienbox.getChildren().add(b);
                r.getChildren().add(bienbox);
                scrollPane.setContent(r);
                screen.getChildren().add(scrollPane);
                screen.getChildren().add(title);
                screen.getChildren().add(details);
          //   screen.getChildren().add(im);
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
