package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import noy.*;

import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
import java.io.*;
//import javax.swing.text.html.ImageView;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Controller3 implements Initializable,Serializable {
    private TreeSet<Bien> biens =new TreeSet<Bien>();
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FCB326;";
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: #CDCDCD;";
    private static final String HOVERED_2BUTTON_STYLE = "-fx-background-color: #E84C89;";



    /*****************************************************************************************************************/

   ImmoESI agence= new ImmoESI();





 Administrateur adminhowdoesnothing = new Administrateur("ala","nasri");
 public static void  maini() throws SuperficieHabitableException, BienExistantException {



  TreeSet<Proprietaire> proprietaires =new TreeSet<Proprietaire>();

  /*CREATION D'ADMINISTRATEUR*/
  Administrateur admin=new Administrateur("admin1","motdepasse1");
  Administrateur admin2=new Administrateur("admine2","motdepasse2");
  ImmoESI.administrateurs.add(admin); ImmoESI.administrateurs.add(admin2);
  /*CREATION D'ADMINISTRATEUR*/


  /*CREATION DES PROPRIETAIRES*/
  Proprietaire prop1= new Proprietaire("AMMALI","+213555 23 30 21","Mouna","im_ammali@esi.dz","Lido Mohammadia");
  Proprietaire prop2= new Proprietaire("NASRI","+213781 61 14 18","Ala Edine","ia_nasri@esi.dz","Batna");
  Proprietaire prop3= new Proprietaire("DJEFFAL","+213771 75 62 60","Belkis","ib_djeffal@esi.dz","El Bordj");
  Proprietaire prop4= new Proprietaire("BELGUENBOUR","+213775 26 74 14","Walid","iw_belguenbour@esi.dz","Dely Brahim");
  proprietaires.add(prop1);
  proprietaires.add(prop2);
  proprietaires.add(prop3);
  proprietaires.add(prop4);
  ImmoESI.setProprietaires(proprietaires);

  /*CREATION DES PROPRIETAIRES*/

  /*CREATION DES BIENS*/

  LocalDate date= LocalDate.now();
  LocalDate date1 =  LocalDate.of(2019,2,2);
  LocalDate date2 = LocalDate.of(2018,5,2);
  LocalDate date3 =  LocalDate.of(2007,9,1);
  LocalDate date4 =  LocalDate.of(2006,1,11);
  LocalDate date5 =  LocalDate.of(2005,3,13);
  LocalDate date6 = LocalDate.of(2004,2,12);
  LocalDate date7 =  LocalDate.of(2000,2,2);
  Wilaya wilaya2 =Enum.valueOf(Wilaya.class, "wilaya2");
  Wilaya wilaya3 =Enum.valueOf(Wilaya.class, "wilaya3");
  Wilaya wilaya1 =Enum.valueOf(Wilaya.class, "wilaya1");

  TypeDeTransaction vente=Enum.valueOf(TypeDeTransaction.class,"vente");
  TypeDeTransaction location=Enum.valueOf(TypeDeTransaction.class,"location");
  TypeDeTransaction echange=Enum.valueOf(TypeDeTransaction.class,"echange");

  Bien bien1=new Appartement("Lido Mohammadia",wilaya2,120,prop2,vente,4000000,false,"",date,"",4,false,1,false);
  Bien bien2=new Maison("Birkhadem ",wilaya3,200,prop1,vente,10000000,false,"",date1,"",0,false,true,true,200);
  Bien bien3=new Terrain("Cheraga",wilaya1,500,prop1,vente,20000000,false,"",date2,"",3,"");
  Bien bien4=new Appartement("Bab ezzouar",wilaya3,100,prop2,location,40000,false,"",date7,"",3,false,1,false);
  Bien bien5=new Maison("Belfort",wilaya2,160,prop3,location,150000,false,"",date3,"",0,false,false,true,160);
  Bien bien6=new Appartement("Dely Brahim",wilaya3,50,prop2,location,600000,false,"",date4,"",1,false,6,false,false,true);
  Bien bien7=new Terrain("Kharoubier",wilaya1,650,prop1,echange,18000000,false,"",date5,"",1,"");
  Bien bien8=new Maison("Belf",wilaya2,200,prop2,echange,14000000,false,"",date6,"",0,false,0,true,false,false,200);
  ImmoESI.ajouterBien(admin,bien1);
  ImmoESI.ajouterBien(admin,bien2);
  ImmoESI.ajouterBien(admin,bien3);
  ImmoESI.ajouterBien(admin,bien4);
  ImmoESI.ajouterBien(admin,bien5);
  ImmoESI.ajouterBien(admin,bien6);
  ImmoESI.ajouterBien(admin,bien7);
  ImmoESI.ajouterBien(admin,bien8);
  ImmoESI.liste_rech.addAll(ImmoESI.liste_des_biens);
  ImmoESI.liste_rech2.addAll(ImmoESI.liste_des_biens);

 /* ImmoESI.envoyerMessage("Je suis interessé par ce bien","user1@gmail.com","nom1");
  ImmoESI.envoyerMessage("Pouvons nous visiter ce bien","user1@gmail.com","nom3");
  ImmoESI.envoyerMessage( "Ce bien est il encore disponible ? ","user1@gmail.com","nom12");
  ImmoESI.envoyerMessage("Ce bien est il negociable ? ","user1@gmail.com","nom3");
  ImmoESI.envoyerMessage("Pouvons nous passer en agence pour ce bien ! ","user1@gmail.com","nom4");*/
 }


 public void gosendmessage() throws Exception {
  Stage stage = Main.getPrimaryStage();
  Parent root = FXMLLoader.load(getClass().getResource("sendmsg.fxml"));
  stage.setTitle("ImmoEsi");
  stage.setScene(new Scene(root, 900, 500));
  stage.show();
  //    this.secondstage= stage;
 }

 @FXML
 private TextField nom,email,message;
 @FXML
 public void sendmessage() {
 // ObjectInputStream in;
 // ObjectOutputStream out;
   ImmoESI.envoyerMessage(message.getText(),email.getText(),nom.getText());

}





 @FXML
    private VBox bienbox= new VBox();
    //private VBox bien1 = new VBox();


    @FXML
    public void goafficherlesmessages() throws Exception {
      //  maini();
        Stage stage = Main.getPrimaryStage();

        bienbox =new VBox();
     int f=0,cpt = 1;
     Pane details = new Pane();
     for(Messages ele:ImmoESI.liste_messages){
    // for(int i =0; i <99 ; i++){
              // System.out.println("Message ? : ");
              //  ele.afficher();
               System.out.println("---------------------------------------");

              //  cpt++;
                /************************************************** Declarations ***************************************************/

                Button b = new Button();
                StackPane r = new StackPane();
                AnchorPane screen = new AnchorPane();
                AnchorPane banchor = new AnchorPane();
                ScrollPane scrollPane = new ScrollPane();
                Text title = new Text();


                Text bienName = new Text(); Text bienAdresse = new Text(); Text bienProp = new Text();
                Text bienTypet = new Text();

                Text bienName1 = new Text(); Text bienAdresse1 = new Text(); Text bienProp1 = new Text();
                Text bienTypet1 = new Text();

                Text bienAdresse2 = new Text();Text bienProp2 = new Text();
                Text bienTypet2 = new Text();


                ImageView im = new ImageView();
                Image image = new Image("file:C:/Users/Dell/Desktop/POO/JAVAFXSETUP/src/icons/download.png");
                im.setImage(image);


                /************************************************** Biens Button ***************************************************/

                b.setMnemonicParsing(false);
               b.setPrefHeight(100.0);
             //   b.setMaxHeight(130.0);
             //   b.setMinHeight(130.0);
                b.setPrefWidth(610.0);
                b.setId("bienbtn");
                b.setStyle("-fx-background-color: #CDCDCD;");
                b.setOnMouseEntered(e -> b.setStyle(HOVERED_BUTTON_STYLE));
                b.setOnMouseExited(e -> b.setStyle(IDLE_BUTTON_STYLE));






                /************************************************** Listes des biens Pane ***************************************************/

                screen.setMinWidth(900);
                screen.setMinHeight(500);

                /************************************************** More details Pane ***************************************************/


                /************************************************** Title ***************************************************/

                title.setText("Listes des biens : ");
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

                String numbien ;
                numbien = "Message numéro "+ String.valueOf(cpt)+" :";
                cpt++;
                System.out.println(numbien);
                bienName.setText(numbien);
                bienName.setFill(Paint.valueOf("#000000"));
                bienName.setFont(Font.font("System", FontWeight.BOLD, 23));
                bienName.setLayoutX(40);
                bienName.setLayoutY(30);

                bienAdresse.setText("Adresse email :");
                bienAdresse.setLayoutX(55);
                bienAdresse.setLayoutY(60);
                bienAdresse.setFill(Paint.valueOf("#000000"));
                bienAdresse.setFont(Font.font("System", FontWeight.BOLD, 15));


                bienTypet.setText("Message :");
                bienTypet.setLayoutX(55);
                bienTypet.setLayoutY(105);
                bienTypet.setFill(Paint.valueOf("#000000"));
                bienTypet.setFont(Font.font("System", FontWeight.BOLD, 15));

                bienProp.setText("Nom :");
                bienProp.setLayoutX(55);
                bienProp.setLayoutY(85);
                bienProp.setFill(Paint.valueOf("#000000"));
                bienProp.setFont(Font.font("System", FontWeight.BOLD, 15));


                /************************************************** text Button ****************************************************/


                /************************************************** Label Button ****************************************************/

                bienAdresse2.setText(ele.getEmail());
                bienAdresse2.setLayoutX(185);
                bienAdresse2.setLayoutY(60);
                bienAdresse2.setFill(Paint.valueOf("#000000"));
                bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienTypet2.setText(ele.getMessage());
                bienTypet2.setLayoutX(245);
                bienTypet2.setLayoutY(105);
                bienTypet2.setFill(Paint.valueOf("#000000"));
                bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

                bienProp2.setText(ele.getNom());
                bienProp2.setLayoutX(185);
                bienProp2.setLayoutY(85);
                bienProp2.setFill(Paint.valueOf("#000000"));
                bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));


                /************************************************** Label Button ****************************************************/



                /************************************************** Details Text ***************************************************/

                bienName1.setText("Messages et feedbacks :");
                bienName1.setFill(Paint.valueOf("#ffffff"));
                bienName1.setFont(Font.font("System", FontWeight.BOLD, 22));
                bienName1.setLayoutX(10);
                bienName1.setLayoutY(250);

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
                banchor.getChildren().add(bienTypet);
                banchor.getChildren().add(bienProp);


                banchor.getChildren().add(bienAdresse2);
                banchor.getChildren().add(bienTypet2);
                banchor.getChildren().add(bienProp2);







                 details.setStyle("-fx-background-color: #7F59B0;");
                 details.setMaxWidth(290);
                 details.setMinHeight(500);
                 details.setMinHeight(500);
                 details.setMinWidth(290);
                 details.setLayoutX(0);
                 details.setLayoutY(0);
                 details.getChildren().add(bienName1);

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


 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/
 /************************************************** Affichage des bien ***************************************************/


 public void lected(Bien ele,Button b) throws Exception {
  if(ele.getSelected()==false){
   System.out.println("here we go2");
   //b.setStyle(HOVERED_BUTTON_STYLE);
   for (Bien ele2:ImmoESI.liste_des_biens){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele2.setSelected(false);
     //b.setStyle(IDLE_BUTTON_STYLE);
    }
   }
   ele.setSelected(true);
   // b.setStyle(HOVERED_BUTTON_STYLE);
   gotouslesbien();
  }
 }

 @FXML

 public void gotouslesbien() throws Exception {
 // maini();
  Stage stage = Main.getPrimaryStage();

  int cpt = 1;
  Pane details = new Pane();
  bienbox = new VBox();
  for(Bien ele:ImmoESI.liste_des_biens){
   System.out.println("hna 3lh?");
   /************************************************** Declarations ***************************************************/

   Button b = new Button();
   StackPane r = new StackPane();
   AnchorPane screen = new AnchorPane();
   AnchorPane banchor = new AnchorPane();
   ScrollPane scrollPane = new ScrollPane();
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
 //   b.setOnMouseClicked(e -> b.setStyle(HOVERED_BUTTON_STYLE));
   b.setOnMouseClicked(e -> {
    try {
     lected(ele,b);

    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

   if (ele.getSelected()==true){
    details = new Pane();
    //banchor = new AnchorPane();
   // bienbox = new VBox();
    //screen = new AnchorPane();
    //b.setStyle(HOVERED_BUTTON_STYLE);
   }


 //  if (f==0){
  //  f =1;
  //  ele.setSelected(true);
   // b.setStyle(IDLE_BUTTON_STYLE);
   //}



   /************************************************** Listes des biens Pane ***************************************************/

   screen.setMinWidth(900);
   screen.setMinHeight(500);

   /************************************************** More details Pane ***************************************************/


   /************************************************** Title ***************************************************/

   title.setText("Listes des biens : ");
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

   String numbien ;
   numbien = "Bien"+ String.valueOf(cpt)+" :";
   cpt++;
 //  System.out.println(numbien);
   bienName.setText(numbien);
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

   bienAdresse2.setText(ele.getAdresse());
   bienAdresse2.setLayoutX(185);
   bienAdresse2.setLayoutY(60);
   bienAdresse2.setFill(Paint.valueOf("#000000"));
   bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypeb2.setText(ele.getClass().getName().substring(7));
   bienTypeb2.setLayoutX(245);
   bienTypeb2.setLayoutY(85);
   bienTypeb2.setFill(Paint.valueOf("#000000"));
   bienTypeb2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypet2.setText(ele.getTransaction().name());
   bienTypet2.setLayoutX(245);
   bienTypet2.setLayoutY(110);
   bienTypet2.setFill(Paint.valueOf("#000000"));
   bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienProp2.setText(ele.getProprietaire().getNom());
   bienProp2.setLayoutX(185);
   bienProp2.setLayoutY(135);
   bienProp2.setFill(Paint.valueOf("#000000"));
   bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienSurface2.setText(String.valueOf(ele.getSurface()));
   bienSurface2.setLayoutX(185);
   bienSurface2.setLayoutY(160);
   bienSurface2.setFill(Paint.valueOf("#000000"));
   bienSurface2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienPrix2.setText(String.valueOf(ele.calculerprix()));
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
  // System.out.println("Valur of selected is "+String.valueOf(ele.getSelected()));
   if (ele.getSelected() == true) {
    bienAdresse3.setText(ele.getAdresse());
    bienAdresse3.setLayoutX(105);
    bienAdresse3.setLayoutY(260);
    bienAdresse3.setFill(Paint.valueOf("#FCB326"));
    bienAdresse3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypeb3.setText(ele.getClass().getName().substring(7));
    bienTypeb3.setLayoutX(145);
    bienTypeb3.setLayoutY(285);
    bienTypeb3.setFill(Paint.valueOf("#FCB326"));
    bienTypeb3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypet3.setText(ele.getTransaction().name());
    bienTypet3.setLayoutX(145);
    bienTypet3.setLayoutY(310);
    bienTypet3.setFill(Paint.valueOf("#FCB326"));
    bienTypet3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienProp3.setText(ele.getProprietaire().getNom());
    bienProp3.setLayoutX(105);
    bienProp3.setLayoutY(335);
    bienProp3.setFill(Paint.valueOf("#FCB326"));
    bienProp3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienSurface3.setText(String.valueOf(ele.getSurface()));
    bienSurface3.setLayoutX(105);
    bienSurface3.setLayoutY(360);
    bienSurface3.setFill(Paint.valueOf("#FCB326"));
    bienSurface3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienPrix3.setText(String.valueOf(ele.calculerprix()));
    bienPrix3.setLayoutX(110);
    bienPrix3.setLayoutY(230);
    bienPrix3.setFill(Paint.valueOf("#FCB326"));
    bienPrix3.setFont(Font.font("System", FontWeight.BOLD, 25));
   }

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


   if (ele.getSelected() == true) {


    details.setStyle("-fx-background-color: #7F59B0;");
    details.setMaxWidth(290);
    details.setMinHeight(500);
    details.setMinHeight(500);
    details.setMinWidth(290);
    details.setLayoutX(0);
    details.setLayoutY(0);
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
   }

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



 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/


 public void affichcool(Bien ele,Button b) throws Exception {
  if(ele.getSelected()==false){
   System.out.println("here we go2");
   //b.setStyle(HOVERED_BUTTON_STYLE);
   for (Bien ele2:ImmoESI.biens_archives){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele2.setSelected(false);
     //b.setStyle(IDLE_BUTTON_STYLE);
    }
   }
   ele.setSelected(true);
   // b.setStyle(HOVERED_BUTTON_STYLE);
   bienarchive();
  }
 }

 @FXML

 public void bienarchive() throws Exception {
  // maini();
  Stage stage = Main.getPrimaryStage();

  int cpt = 1;
  Pane details = new Pane();
  bienbox = new VBox();
  for(Bien ele:ImmoESI.biens_archives){
   System.out.println("hna 3lh?");
   /************************************************** Declarations ***************************************************/

   Button b = new Button();
   StackPane r = new StackPane();
   AnchorPane screen = new AnchorPane();
   AnchorPane banchor = new AnchorPane();
   ScrollPane scrollPane = new ScrollPane();
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
   //   b.setOnMouseClicked(e -> b.setStyle(HOVERED_BUTTON_STYLE));
   b.setOnMouseClicked(e -> {
    try {
     affichcool(ele,b);

    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

   if (ele.getSelected()==true){
    details = new Pane();
    //banchor = new AnchorPane();
    // bienbox = new VBox();
    //screen = new AnchorPane();
    //b.setStyle(HOVERED_BUTTON_STYLE);
   }


   //  if (f==0){
   //  f =1;
   //  ele.setSelected(true);
   // b.setStyle(IDLE_BUTTON_STYLE);
   //}



   /************************************************** Listes des biens Pane ***************************************************/

   screen.setMinWidth(900);
   screen.setMinHeight(500);

   /************************************************** More details Pane ***************************************************/


   /************************************************** Title ***************************************************/

   title.setText("Listes des biens : ");
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

   String numbien ;
   numbien = "Bien"+ String.valueOf(cpt)+" :";
   cpt++;
   //  System.out.println(numbien);
   bienName.setText(numbien);
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

   bienAdresse2.setText(ele.getAdresse());
   bienAdresse2.setLayoutX(185);
   bienAdresse2.setLayoutY(60);
   bienAdresse2.setFill(Paint.valueOf("#000000"));
   bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypeb2.setText(ele.getClass().getName().substring(7));
   bienTypeb2.setLayoutX(245);
   bienTypeb2.setLayoutY(85);
   bienTypeb2.setFill(Paint.valueOf("#000000"));
   bienTypeb2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypet2.setText(ele.getTransaction().name());
   bienTypet2.setLayoutX(245);
   bienTypet2.setLayoutY(110);
   bienTypet2.setFill(Paint.valueOf("#000000"));
   bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienProp2.setText(ele.getProprietaire().getNom());
   bienProp2.setLayoutX(185);
   bienProp2.setLayoutY(135);
   bienProp2.setFill(Paint.valueOf("#000000"));
   bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienSurface2.setText(String.valueOf(ele.getSurface()));
   bienSurface2.setLayoutX(185);
   bienSurface2.setLayoutY(160);
   bienSurface2.setFill(Paint.valueOf("#000000"));
   bienSurface2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienPrix2.setText(String.valueOf(ele.calculerprix()));
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
   // System.out.println("Valur of selected is "+String.valueOf(ele.getSelected()));
   if (ele.getSelected() == true) {
    bienAdresse3.setText(ele.getAdresse());
    bienAdresse3.setLayoutX(105);
    bienAdresse3.setLayoutY(260);
    bienAdresse3.setFill(Paint.valueOf("#FCB326"));
    bienAdresse3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypeb3.setText(ele.getClass().getName().substring(7));
    bienTypeb3.setLayoutX(145);
    bienTypeb3.setLayoutY(285);
    bienTypeb3.setFill(Paint.valueOf("#FCB326"));
    bienTypeb3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypet3.setText(ele.getTransaction().name());
    bienTypet3.setLayoutX(145);
    bienTypet3.setLayoutY(310);
    bienTypet3.setFill(Paint.valueOf("#FCB326"));
    bienTypet3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienProp3.setText(ele.getProprietaire().getNom());
    bienProp3.setLayoutX(105);
    bienProp3.setLayoutY(335);
    bienProp3.setFill(Paint.valueOf("#FCB326"));
    bienProp3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienSurface3.setText(String.valueOf(ele.getSurface()));
    bienSurface3.setLayoutX(105);
    bienSurface3.setLayoutY(360);
    bienSurface3.setFill(Paint.valueOf("#FCB326"));
    bienSurface3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienPrix3.setText(String.valueOf(ele.calculerprix()));
    bienPrix3.setLayoutX(110);
    bienPrix3.setLayoutY(230);
    bienPrix3.setFill(Paint.valueOf("#FCB326"));
    bienPrix3.setFont(Font.font("System", FontWeight.BOLD, 25));
   }

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


   if (ele.getSelected() == true) {


    details.setStyle("-fx-background-color: #7F59B0;");
    details.setMaxWidth(290);
    details.setMinHeight(500);
    details.setMinHeight(500);
    details.setMinWidth(290);
    details.setLayoutX(0);
    details.setLayoutY(0);
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
   }

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























public void suppdetails(Bien ele,Button b) throws Exception {
  if(ele.getSelected()==false){
   System.out.println("here we go2");
   for (Bien ele2:ImmoESI.liste_des_biens){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele2.setSelected(false);
    }
   }
   ele.setSelected(true);

}
  //ImmoESI.liste_des_biens.remove(ele);
 gosuppbien();
}


 public void confsupp(Bien ele) throws Exception {


   for (Bien ele2:ImmoESI.liste_des_biens){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele = ele2;
    }
   }
   ImmoESI.supprimer_bien(adminhowdoesnothing,ele);
  //ImmoESI.liste_des_biens.remove(ele);
  try {
   gosuppbien();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 @FXML
 public void gosuppbien() throws Exception {
  // maini();
  Stage stage = Main.getPrimaryStage();

  int cpt = 1;
  Pane details = new Pane();
  bienbox = new VBox();
  for(Bien ele:ImmoESI.liste_des_biens){
   System.out.println("hna 3lh?");
   /************************************************** Declarations ***************************************************/

   Button b = new Button();
   StackPane r = new StackPane();
   AnchorPane screen = new AnchorPane();
   AnchorPane banchor = new AnchorPane();
   ScrollPane scrollPane = new ScrollPane();
   Text title = new Text();



   Text bienName = new Text(); Text bienAdresse = new Text(); Text bienProp = new Text();
   Text bienTypet = new Text(); Text bienTypeb = new Text(); Text bienPrix = new Text(); Text bienSurface = new Text();

   Text bienName1 = new Text(); Text bienAdresse1 = new Text(); Text bienProp1 = new Text();
   Text bienTypet1 = new Text(); Text bienTypeb1 = new Text(); Text bienPrix1 = new Text(); Text bienSurface1 = new Text();

   Text bienAdresse2 = new Text();Text bienProp2 = new Text();
   Text bienTypet2 = new Text(); Text bienTypeb2 = new Text(); Text bienPrix2 = new Text(); Text bienSurface2 = new Text();

   Text bienAdresse3 = new Text();Text bienProp3 = new Text();
   Text bienTypet3 = new Text(); Text bienTypeb3 = new Text(); Text bienPrix3 = new Text(); Text bienSurface3 = new Text();
   Button conf = new Button();

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
   //   b.setOnMouseClicked(e -> b.setStyle(HOVERED_BUTTON_STYLE));
   b.setOnMouseClicked(e -> {
    try {
     suppdetails(ele,b);

    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

   if (ele.getSelected()==true){
    details = new Pane();
  //  conf = new Button();
   }


   //  if (f==0){
   //  f =1;
   //  ele.setSelected(true);
   // b.setStyle(IDLE_BUTTON_STYLE);
   //}



   /************************************************** Listes des biens Pane ***************************************************/

   screen.setMinWidth(900);
   screen.setMinHeight(500);

   /************************************************** More details Pane ***************************************************/


   /************************************************** Title ***************************************************/

   title.setText("Listes des biens : ");
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

   String numbien ;
   numbien = "Bien"+ String.valueOf(cpt)+" :";
   cpt++;
   //  System.out.println(numbien);
   bienName.setText(numbien);
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

   bienAdresse2.setText(ele.getAdresse());
   bienAdresse2.setLayoutX(185);
   bienAdresse2.setLayoutY(60);
   bienAdresse2.setFill(Paint.valueOf("#000000"));
   bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypeb2.setText(ele.getClass().getName().substring(7));
   bienTypeb2.setLayoutX(245);
   bienTypeb2.setLayoutY(85);
   bienTypeb2.setFill(Paint.valueOf("#000000"));
   bienTypeb2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypet2.setText(ele.getTransaction().name());
   bienTypet2.setLayoutX(245);
   bienTypet2.setLayoutY(110);
   bienTypet2.setFill(Paint.valueOf("#000000"));
   bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienProp2.setText(ele.getProprietaire().getNom());
   bienProp2.setLayoutX(185);
   bienProp2.setLayoutY(135);
   bienProp2.setFill(Paint.valueOf("#000000"));
   bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienSurface2.setText(String.valueOf(ele.getSurface()));
   bienSurface2.setLayoutX(185);
   bienSurface2.setLayoutY(160);
   bienSurface2.setFill(Paint.valueOf("#000000"));
   bienSurface2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienPrix2.setText(String.valueOf(ele.calculerprix()));
   bienPrix2.setLayoutX(490);
   bienPrix2.setLayoutY(185);
   bienPrix2.setFill(Paint.valueOf("#000000"));
   bienPrix2.setFont(Font.font("System", FontWeight.NORMAL, 23));


   conf.setMnemonicParsing(false);
   conf.setPrefHeight(40.0);
   conf.setPrefWidth(100.0);
   conf.setLayoutX(90);
   conf.setLayoutY(395);
   conf.setText("Supprimer");
   conf.setId("confbtn");
   conf.setStyle("-fx-background-color: #FCB326;");
   conf.setOnMouseEntered(e -> conf.setStyle(HOVERED_2BUTTON_STYLE));
   conf.setOnMouseExited(e -> conf.setStyle(HOVERED_BUTTON_STYLE));
   conf.setOnMouseClicked(e -> {
    try {
     confsupp(ele);
    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

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
   // System.out.println("Valur of selected is "+String.valueOf(ele.getSelected()));
   if (ele.getSelected() == true) {
    bienAdresse3.setText(ele.getAdresse());
    bienAdresse3.setLayoutX(105);
    bienAdresse3.setLayoutY(260);
    bienAdresse3.setFill(Paint.valueOf("#FCB326"));
    bienAdresse3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypeb3.setText(ele.getClass().getName().substring(7));
    bienTypeb3.setLayoutX(145);
    bienTypeb3.setLayoutY(285);
    bienTypeb3.setFill(Paint.valueOf("#FCB326"));
    bienTypeb3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypet3.setText(ele.getTransaction().name());
    bienTypet3.setLayoutX(145);
    bienTypet3.setLayoutY(310);
    bienTypet3.setFill(Paint.valueOf("#FCB326"));
    bienTypet3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienProp3.setText(ele.getProprietaire().getNom());
    bienProp3.setLayoutX(105);
    bienProp3.setLayoutY(335);
    bienProp3.setFill(Paint.valueOf("#FCB326"));
    bienProp3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienSurface3.setText(String.valueOf(ele.getSurface()));
    bienSurface3.setLayoutX(105);
    bienSurface3.setLayoutY(360);
    bienSurface3.setFill(Paint.valueOf("#FCB326"));
    bienSurface3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienPrix3.setText(String.valueOf(ele.calculerprix()));
    bienPrix3.setLayoutX(110);
    bienPrix3.setLayoutY(230);
    bienPrix3.setFill(Paint.valueOf("#FCB326"));
    bienPrix3.setFont(Font.font("System", FontWeight.BOLD, 25));
   }

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


   if (ele.getSelected() == true) {


    details.setStyle("-fx-background-color: #7F59B0;");
    details.setMaxWidth(290);
    details.setMinHeight(500);
    details.setMinHeight(500);
    details.setMinWidth(290);
    details.setLayoutX(0);
    details.setLayoutY(0);
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
    details.getChildren().add(conf);

    details.getChildren().add(im);
   }

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
 @FXML
 private ChoiceBox<String> oussama = new ChoiceBox<>();
@FXML
 private ChoiceBox<String> chemsou = new ChoiceBox<>();



 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/





 public void archivedetails(Bien ele,Button b) throws Exception {
  if(ele.getSelected()==false){
   System.out.println("here we go2");
   for (Bien ele2:ImmoESI.liste_des_biens){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele2.setSelected(false);
    }
   }
   ele.setSelected(true);

  }
  //ImmoESI.liste_des_biens.remove(ele);
  goarchbien();
 }


 public void confarch(Bien ele) throws Exception {


  for (Bien ele2:ImmoESI.liste_des_biens){
   if (ele2.getSelected()==true){
    System.out.println("here we go4");
    ele = ele2;
   }
  }
  ImmoESI.archiver_bien(adminhowdoesnothing,ele);
  //ImmoESI.liste_des_biens.remove(ele);
  try {
   goarchbien();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 @FXML
 public void goarchbien() throws Exception {
  // maini();
  Stage stage = Main.getPrimaryStage();

  int cpt = 1;
  Pane details = new Pane();
  bienbox = new VBox();
  for(Bien ele:ImmoESI.liste_des_biens){
   System.out.println("hna 3lh?");
   /************************************************** Declarations ***************************************************/

   Button b = new Button();
   StackPane r = new StackPane();
   AnchorPane screen = new AnchorPane();
   AnchorPane banchor = new AnchorPane();
   ScrollPane scrollPane = new ScrollPane();
   Text title = new Text();



   Text bienName = new Text(); Text bienAdresse = new Text(); Text bienProp = new Text();
   Text bienTypet = new Text(); Text bienTypeb = new Text(); Text bienPrix = new Text(); Text bienSurface = new Text();

   Text bienName1 = new Text(); Text bienAdresse1 = new Text(); Text bienProp1 = new Text();
   Text bienTypet1 = new Text(); Text bienTypeb1 = new Text(); Text bienPrix1 = new Text(); Text bienSurface1 = new Text();

   Text bienAdresse2 = new Text();Text bienProp2 = new Text();
   Text bienTypet2 = new Text(); Text bienTypeb2 = new Text(); Text bienPrix2 = new Text(); Text bienSurface2 = new Text();

   Text bienAdresse3 = new Text();Text bienProp3 = new Text();
   Text bienTypet3 = new Text(); Text bienTypeb3 = new Text(); Text bienPrix3 = new Text(); Text bienSurface3 = new Text();
   Button conf = new Button();

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
   //   b.setOnMouseClicked(e -> b.setStyle(HOVERED_BUTTON_STYLE));
   b.setOnMouseClicked(e -> {
    try {
     archivedetails(ele,b);

    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

   if (ele.getSelected()==true){
    details = new Pane();
    //  conf = new Button();
   }


   //  if (f==0){
   //  f =1;
   //  ele.setSelected(true);
   // b.setStyle(IDLE_BUTTON_STYLE);
   //}



   /************************************************** Listes des biens Pane ***************************************************/

   screen.setMinWidth(900);
   screen.setMinHeight(500);

   /************************************************** More details Pane ***************************************************/


   /************************************************** Title ***************************************************/

   title.setText("Listes des biens : ");
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

   String numbien ;
   numbien = "Bien"+ String.valueOf(cpt)+" :";
   cpt++;
   //  System.out.println(numbien);
   bienName.setText(numbien);
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

   bienAdresse2.setText(ele.getAdresse());
   bienAdresse2.setLayoutX(185);
   bienAdresse2.setLayoutY(60);
   bienAdresse2.setFill(Paint.valueOf("#000000"));
   bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypeb2.setText(ele.getClass().getName().substring(7));
   bienTypeb2.setLayoutX(245);
   bienTypeb2.setLayoutY(85);
   bienTypeb2.setFill(Paint.valueOf("#000000"));
   bienTypeb2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypet2.setText(ele.getTransaction().name());
   bienTypet2.setLayoutX(245);
   bienTypet2.setLayoutY(110);
   bienTypet2.setFill(Paint.valueOf("#000000"));
   bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienProp2.setText(ele.getProprietaire().getNom());
   bienProp2.setLayoutX(185);
   bienProp2.setLayoutY(135);
   bienProp2.setFill(Paint.valueOf("#000000"));
   bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienSurface2.setText(String.valueOf(ele.getSurface()));
   bienSurface2.setLayoutX(185);
   bienSurface2.setLayoutY(160);
   bienSurface2.setFill(Paint.valueOf("#000000"));
   bienSurface2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienPrix2.setText(String.valueOf(ele.calculerprix()));
   bienPrix2.setLayoutX(490);
   bienPrix2.setLayoutY(185);
   bienPrix2.setFill(Paint.valueOf("#000000"));
   bienPrix2.setFont(Font.font("System", FontWeight.NORMAL, 23));


   conf.setMnemonicParsing(false);
   conf.setPrefHeight(40.0);
   conf.setPrefWidth(100.0);
   conf.setLayoutX(90);
   conf.setLayoutY(395);
   conf.setText("Archiver");
   conf.setId("confbtn");
   conf.setStyle("-fx-background-color: #FCB326;");
   conf.setOnMouseEntered(e -> conf.setStyle(HOVERED_2BUTTON_STYLE));
   conf.setOnMouseExited(e -> conf.setStyle(HOVERED_BUTTON_STYLE));
   conf.setOnMouseClicked(e -> {
    try {
     confarch(ele);
    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

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
   // System.out.println("Valur of selected is "+String.valueOf(ele.getSelected()));
   if (ele.getSelected() == true) {
    bienAdresse3.setText(ele.getAdresse());
    bienAdresse3.setLayoutX(105);
    bienAdresse3.setLayoutY(260);
    bienAdresse3.setFill(Paint.valueOf("#FCB326"));
    bienAdresse3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypeb3.setText(ele.getClass().getName().substring(7));
    bienTypeb3.setLayoutX(145);
    bienTypeb3.setLayoutY(285);
    bienTypeb3.setFill(Paint.valueOf("#FCB326"));
    bienTypeb3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypet3.setText(ele.getTransaction().name());
    bienTypet3.setLayoutX(145);
    bienTypet3.setLayoutY(310);
    bienTypet3.setFill(Paint.valueOf("#FCB326"));
    bienTypet3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienProp3.setText(ele.getProprietaire().getNom());
    bienProp3.setLayoutX(105);
    bienProp3.setLayoutY(335);
    bienProp3.setFill(Paint.valueOf("#FCB326"));
    bienProp3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienSurface3.setText(String.valueOf(ele.getSurface()));
    bienSurface3.setLayoutX(105);
    bienSurface3.setLayoutY(360);
    bienSurface3.setFill(Paint.valueOf("#FCB326"));
    bienSurface3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienPrix3.setText(String.valueOf(ele.calculerprix()));
    bienPrix3.setLayoutX(110);
    bienPrix3.setLayoutY(230);
    bienPrix3.setFill(Paint.valueOf("#FCB326"));
    bienPrix3.setFont(Font.font("System", FontWeight.BOLD, 25));
   }

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


   if (ele.getSelected() == true) {


    details.setStyle("-fx-background-color: #7F59B0;");
    details.setMaxWidth(290);
    details.setMinHeight(500);
    details.setMinHeight(500);
    details.setMinWidth(290);
    details.setLayoutX(0);
    details.setLayoutY(0);
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
    details.getChildren().add(conf);

    details.getChildren().add(im);
   }

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


 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/

 public void gprop() throws Exception {
  Stage stage = Main.getPrimaryStage();
  Parent root = FXMLLoader.load(getClass().getResource("choisir_un_prop.fxml"));
  stage.setTitle("ImmoEsi");
  stage.setScene(new Scene(root, 900, 500));
  stage.show();
  //    this.secondstage= stage;
 }

 public void propritairebien() throws Exception {
  biens = ImmoESI.liste_des_biens;
  Stage stage = Main.getPrimaryStage();

//  Proprietaire prop1 = new Proprietaire("Alaeddine", "+213*********", "Mouna", "im_ammali@esi.dz", "Lido Mohammadia");
 // Proprietaire prop2= new Proprietaire("NASRI","+213*********","Ala Edine","ia_nasri@esi.dz","Batna");
//  Proprietaire prop3= new Proprietaire("DJEFFAL","+213*********","Belkis","ib_djeffal@esi.dz","El Bordj");
  //Proprietaire prop4= new Proprietaire("BELGUENBOUR","+213*********","Walid","iw_belguenbour@esi.dz","Dely Brahim");
 // proprietaires.add(prop1);
  //proprietaires.add(prop2);
 // proprietaires.add(prop3);
  //proprietaires.add(prop4);
  //ImmoESI.setProprietaires(proprietaires);
  //  int cpt=1;
   for(int i =0;i<10;i++){
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

   title.setText("Listes des biens d'un Propritaire : ");
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

 @Override
 public void initialize(URL url, ResourceBundle resourceBundle) {
  oussama.getItems().add("Maison");
  oussama.getItems().add("Appartement");
  oussama.getItems().add("Terrain");
  chemsou.getItems().add("Vente");
  chemsou.getItems().add("Location");
  chemsou.getItems().add("Echange");
  wil.getItems().add("tous les wilaya");
  wil.getItems().add("wilaya1");
  wil.getItems().add("wilaya2");
  wil.getItems().add("wilaya3");
  transaction.getItems().add("vente");
  transaction.getItems().add("location");
  transaction.getItems().add("echange");
  typebien.getItems().add("maison");
  typebien.getItems().add("appartement");
  typebien.getItems().add("terrain");
  min.setText("0");
  max.setText("1000000000000000");
  surface.setText("0");
  wil.setValue("");


 }



 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
 /************************************************** Recherche Bien ***************************************************/
@FXML
TextField max = new TextField();
TextField min= new TextField();
TextField surface = new TextField();
@FXML
 private ChoiceBox<String> transaction = new ChoiceBox<>();
@FXML
 private ChoiceBox<String> wil = new ChoiceBox<>();
@FXML
 private ChoiceBox<String> typebien = new ChoiceBox<>();

 @FXML
 public void gorf() throws Exception {
  Stage stage = Main.getPrimaryStage();
  Parent root = FXMLLoader.load(getClass().getResource("Filtre_rech.fxml"));
  stage.setTitle("ImmoEsi");
  stage.setScene(new Scene(root, 900, 500));
  stage.show();
  //    this.secondstage= stage;
 }



 //Filtter f = new Filtter();
 public int wilaya;
 public Float prix;
 public float superficie;




 public ArrayList<Bien> recherche_filtre(ArrayList<Bien> list1, ArrayList<Bien> list2,int k){
  // list1.addAll(ImmoESI.liste_des_biens);
   //list2.addAll(ImmoESI.liste_des_biens);


   /***********wilaya*****************/
  if (wil.getValue()=="wilaya1"){//wilaya
   wilaya = 49;} else if(wil.getValue()=="wilaya2") {
   wilaya = 50;} else if(wil.getValue()=="wilaya3") {
   wilaya = 51;}
  if(wil.getValue()!="tous les wilaya") {
   for (Bien ele1 : list1) { // wilaya
    if (ele1.getWilaya().matricule != wilaya) {
     System.out.println("non wilaya");
     list2.remove(ele1);
    }
   }
  }

/******************* type de transaction ********************************/
  if (transaction.getValue()=="vente"){

   for (Bien ele1 : list1) {
    if (ele1.getTransaction() != TypeDeTransaction.vente) { list2.remove(ele1);}
   }
  }
  else if (transaction.getValue() == "location") {
   for (Bien ele1 : list1) {
    if (ele1.getTransaction() != TypeDeTransaction.location) { list2.remove(ele1); }
   }
  } else if (transaction.getValue() =="echange") {
   for (Bien ele1 : list1) {
    if (ele1.getTransaction() != TypeDeTransaction.echange) { list2.remove(ele1); }
   }
  }


/**************Type de bien****************/
  if (typebien.getValue() == "maison" ) {
   for (Bien ele1 : list1) {
    if ((ele1 instanceof Appartement)||(ele1 instanceof Terrain)) {
     System.out.println("zdna1");
     System.out.println(ele1.getClass().getName());
     list2.remove(ele1);}
   }
  }
  else if (typebien.getValue()=="appartement") {
   for (Bien ele1 : list1) {
    if ((ele1 instanceof Maison)||(ele1 instanceof Terrain) ) {list2.remove(ele1);}
   }
  }
  else if (typebien.getValue()=="terrain") {
   for (Bien ele1 : list1) {
    if ((ele1 instanceof Appartement)||(ele1 instanceof Maison)) {list2.remove(ele1);}
   }
  }
  /***************** walou walou ***********************/

   // prix max

     prix = Float.parseFloat(max.getText());
     for (Bien ele1 : list1) { //prix max
      if (ele1.getPrix() > prix) {
       list2.remove(ele1);
      }
     }

    //   prix min

   prix = Float.parseFloat(min.getText());
   for (Bien ele1 : list1) { //prix min
    if (ele1.getPrix() <= prix) {
     list2.remove(ele1);
    }
   }

     // surface min

  superficie = Float.valueOf(surface.getText());
   for (Bien ele1 : list1) { //surface min
    if (ele1.getSurface() < superficie) {
     list2.remove(ele1);
    }
   }
   return list2;
  }



 public void rerechrecheaff(Bien ele,Button b) throws Exception {
  if(ele.getSelected()==false){
   System.out.println("here we go2");
   //b.setStyle(HOVERED_BUTTON_STYLE);
   for (Bien ele2:ImmoESI.liste_rech2){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele2.setSelected(false);
     //b.setStyle(IDLE_BUTTON_STYLE);
    }
   }
   ele.setSelected(true);
   // b.setStyle(HOVERED_BUTTON_STYLE);
   rechercheaff();
  }
 }

 @FXML

 public void rechercheaff() throws Exception {
  // maini();
  Stage stage = Main.getPrimaryStage();

  int cpt = 1;
  Pane details = new Pane();
  bienbox = new VBox();

  //ImmoESI.liste_rech2.addAll(ImmoESI.liste_des_biens);
  for(Bien ele:recherche_filtre(ImmoESI.liste_rech,ImmoESI.liste_rech2,1)){
   System.out.println("hna 3lh?");
   /************************************************** Declarations ***************************************************/

   Button b = new Button();
   StackPane r = new StackPane();
   AnchorPane screen = new AnchorPane();
   AnchorPane banchor = new AnchorPane();
   ScrollPane scrollPane = new ScrollPane();
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
   //   b.setOnMouseClicked(e -> b.setStyle(HOVERED_BUTTON_STYLE));
   b.setOnMouseClicked(e -> {
    try {
     rerechrecheaff(ele,b);

    } catch (Exception ex) {
     ex.printStackTrace();
    }
   });

   if (ele.getSelected()==true){
    details = new Pane();
    //banchor = new AnchorPane();
    // bienbox = new VBox();
    //screen = new AnchorPane();
    //b.setStyle(HOVERED_BUTTON_STYLE);
   }


   //  if (f==0){
   //  f =1;
   //  ele.setSelected(true);
   // b.setStyle(IDLE_BUTTON_STYLE);
   //}



   /************************************************** Listes des biens Pane ***************************************************/

   screen.setMinWidth(900);
   screen.setMinHeight(500);

   /************************************************** More details Pane ***************************************************/


   /************************************************** Title ***************************************************/

   title.setText("Listes des biens : ");
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

   String numbien ;
   numbien = "Bien"+ String.valueOf(cpt)+" :";
   cpt++;
   //  System.out.println(numbien);
   bienName.setText(numbien);
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

   bienAdresse2.setText(ele.getAdresse());
   bienAdresse2.setLayoutX(185);
   bienAdresse2.setLayoutY(60);
   bienAdresse2.setFill(Paint.valueOf("#000000"));
   bienAdresse2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypeb2.setText(ele.getClass().getName().substring(4));
   bienTypeb2.setLayoutX(245);
   bienTypeb2.setLayoutY(85);
   bienTypeb2.setFill(Paint.valueOf("#000000"));
   bienTypeb2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienTypet2.setText(ele.getTransaction().name());
   bienTypet2.setLayoutX(245);
   bienTypet2.setLayoutY(110);
   bienTypet2.setFill(Paint.valueOf("#000000"));
   bienTypet2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienProp2.setText(ele.getProprietaire().getNom());
   bienProp2.setLayoutX(185);
   bienProp2.setLayoutY(135);
   bienProp2.setFill(Paint.valueOf("#000000"));
   bienProp2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienSurface2.setText(String.valueOf(ele.getSurface()));
   bienSurface2.setLayoutX(185);
   bienSurface2.setLayoutY(160);
   bienSurface2.setFill(Paint.valueOf("#000000"));
   bienSurface2.setFont(Font.font("System", FontWeight.NORMAL, 15));

   bienPrix2.setText(String.valueOf(ele.calculerprix()));
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
   // System.out.println("Valur of selected is "+String.valueOf(ele.getSelected()));
   if (ele.getSelected() == true) {
    bienAdresse3.setText(ele.getAdresse());
    bienAdresse3.setLayoutX(105);
    bienAdresse3.setLayoutY(260);
    bienAdresse3.setFill(Paint.valueOf("#FCB326"));
    bienAdresse3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypeb3.setText(ele.getClass().getName().substring(7));
    bienTypeb3.setLayoutX(145);
    bienTypeb3.setLayoutY(285);
    bienTypeb3.setFill(Paint.valueOf("#FCB326"));
    bienTypeb3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienTypet3.setText(ele.getTransaction().name());
    bienTypet3.setLayoutX(145);
    bienTypet3.setLayoutY(310);
    bienTypet3.setFill(Paint.valueOf("#FCB326"));
    bienTypet3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienProp3.setText(ele.getProprietaire().getNom());
    bienProp3.setLayoutX(105);
    bienProp3.setLayoutY(335);
    bienProp3.setFill(Paint.valueOf("#FCB326"));
    bienProp3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienSurface3.setText(String.valueOf(ele.getSurface()));
    bienSurface3.setLayoutX(105);
    bienSurface3.setLayoutY(360);
    bienSurface3.setFill(Paint.valueOf("#FCB326"));
    bienSurface3.setFont(Font.font("System", FontWeight.BOLD, 12));

    bienPrix3.setText(String.valueOf(ele.calculerprix()));
    bienPrix3.setLayoutX(110);
    bienPrix3.setLayoutY(230);
    bienPrix3.setFill(Paint.valueOf("#FCB326"));
    bienPrix3.setFont(Font.font("System", FontWeight.BOLD, 25));
   }

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


   if (ele.getSelected() == true) {


    details.setStyle("-fx-background-color: #7F59B0;");
    details.setMaxWidth(290);
    details.setMinHeight(500);
    details.setMinHeight(500);
    details.setMinWidth(290);
    details.setLayoutX(0);
    details.setLayoutY(0);
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
   }

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
/***************************************************Bien Prop *****************************************************/
/***************************************************Bien Prop *****************************************************/
/***************************************************Bien Prop *****************************************************/
/***************************************************Bien Prop *****************************************************/
/***************************************************Bien Prop *****************************************************/
/***************************************************Bien Prop *****************************************************/
/***************************************************Bien Prop *****************************************************/


@FXML
public void goajou() throws Exception {
 Stage stage = Main.getPrimaryStage();
 Parent root = FXMLLoader.load(getClass().getResource("AjouterBien.fxml"));
 stage.setTitle("ImmoEsi");
 stage.setScene(new Scene(root, 900, 500));
 stage.show();
 //    this.secondstage= stage;
}


@FXML
private TextField desc;

 @FXML
 private TextField photos;

 @FXML
 private TextField nbe;

 @FXML
 private TextField nbp;

 @FXML
 private TextField meublee;

 @FXML
 private TextField jardin;

 @FXML
 private TextField piscine;

 @FXML
 private TextField garage;

 @FXML
 private TextField adr;

 @FXML
 private TextField wila;

 @FXML
 private TextField supr;

 @FXML
 private TextField pri;

 @FXML
 private TextField negos;
 @FXML
 private TextField surh;


 public Bien AjouterMaison(Proprietaire proprietaire, TypeDeTransaction transaction) throws SuperficieHabitableException,SurfaceNulleException{
  Scanner sc=new Scanner(System.in);

   String adresse = adr.getText();

  Wilaya wilaya =Enum.valueOf(Wilaya.class, wila.getText().toLowerCase());
  //Wilaya wilaya = Wilaya.wilaya1;
  float surface=Float.parseFloat(supr.getText());
  if(surface< 0) throw  new SurfaceNulleException();
  float prix=Float.parseFloat(pri.getText());

  String nego=negos.getText();
  boolean negociable;
  negociable= nego.equalsIgnoreCase("oui");
  String descriptif=desc.getText();
  String photo=photos.getText(); //sc.nextLine();
  LocalDate date = LocalDate.now();
  int nbr_etages= Integer.parseInt(nbe.getText());
  int nbr_pieces=Integer.parseInt(nbp.getText());
  String jar=meublee.getText(); //sc.nextLine();
  boolean meuble;
  meuble= jar.equalsIgnoreCase("oui"); //sc.nextLine();
  jar= jardin.getText(); //sc.nextLine();
  boolean jardin;
  jardin= jar.equalsIgnoreCase("oui"); //sc.nextLine();
  String pis=piscine.getText();
  boolean piscine;
  piscine= jar.equalsIgnoreCase("oui");
  String gar=garage.getText();
  boolean garage;
  garage= jar.equalsIgnoreCase("oui");
  float surface_habitable=Float.parseFloat(surh.getText());
  //Creation de l'objet
  if(surface < surface_habitable) throw new SuperficieHabitableException();
  Bien nouveau= null;
  nouveau = new Maison(adresse,wilaya,surface,proprietaire,transaction,prix,negociable,descriptif,date,photo,nbr_pieces,meuble,nbr_etages,garage,jardin,piscine,surface_habitable);

  return  nouveau;
 }
 @FXML
 private TextField nomprop;

 @FXML
 private TextField proprop;

 @FXML
 private TextField adrprop;

 @FXML
 private TextField emailprop;

 @FXML
 public void goajouterbien() throws Exception {
  Stage stage = Main.getPrimaryStage();
  Parent root = FXMLLoader.load(getClass().getResource("AjouterBien.fxml"));
  stage.setTitle("ImmoEsi");
  stage.setScene(new Scene(root, 900, 500));
  stage.show();
  //    this.secondstage= stage;
 }



  public void ajouterBienn()  throws SuperficieHabitableException,SurfaceNulleException,BienExistantException{
  Scanner sc = new Scanner(System.in);
  Bien nouveau = null;


  String type_bien = oussama.getValue();

  TypeDeTransaction transaction =Enum.valueOf(TypeDeTransaction.class, chemsou.getValue().toLowerCase());

   String adresse_prop=adrprop.getText();
   String nom=nomprop.getText();
   String prenom=proprop.getText();
   String num_tel="029089283";
  String mail=emailprop.getText();
  Proprietaire proprietaire=new Proprietaire(nom,num_tel,prenom,mail,adresse_prop);

  if (oussama.getValue().equalsIgnoreCase("Maison")) {
   try {
    nouveau = AjouterMaison(proprietaire, transaction);
   }catch (SuperficieHabitableException e){
    e.printStackTrace();
    System.out.println("Superficie habitable invalide");
   }
   catch (SurfaceNulleException e) {
    e.printStackTrace();
    System.out.println("Surface invalide");
   }
   if(ImmoESI.liste_des_biens.contains(nouveau)) throw new BienExistantException();
   else{
    ImmoESI.liste_des_biens.add(nouveau); //Utiliser un TreeSet supprime la possibilité de doublons
    ImmoESI.proprietaires.add(proprietaire);
    //Ajouter le bien à la liste des biens du proprietaires
    proprietaire.liste_proprietees.add(nouveau);}
  }/* else {
  if (type_bien.equalsIgnoreCase("appartement")) {
    try {
     nouveau = AjouterAppart(proprietaire, transaction);
    } catch (SurfaceNulleException e) {
     e.printStackTrace();
     System.out.println("Surface exception");
    }
    if(liste_des_biens.contains(nouveau)) System.out.println("Ce bien existe deja");
    else{
     liste_des_biens.add(nouveau);
     proprietaires.add(proprietaire);
     //Ajouter le bien à la liste des biens du proprietaires
     proprietaire.liste_proprietees.add(nouveau);}
   } else {
    if (type_bien.equalsIgnoreCase("terrain")) {
     try {
      nouveau = AjouterTerrain(proprietaire, transaction);
     } catch (SurfaceNulleException e) {
      e.printStackTrace();
     }
     if(liste_des_biens.contains(nouveau)) System.out.println("Ce bien existe deja");
     else{
      liste_des_biens.add(nouveau);
      proprietaires.add(proprietaire);
      proprietaire.liste_proprietees.add(nouveau);}
    } else {
     System.out.println("Type de bien invalide! ");
    }
   }
  }*/
 }







@FXML
public void goajouter2() throws Exception {
 Stage stage = Main.getPrimaryStage();
 if(oussama.getValue()=="Maison"){
 Parent root = FXMLLoader.load(getClass().getResource("ajouter2.fxml"));
  stage.setTitle("ImmoEsi");
  stage.setScene(new Scene(root, 900, 500));
  stage.show();
 }

 //    this.secondstage= stage;
}




}



