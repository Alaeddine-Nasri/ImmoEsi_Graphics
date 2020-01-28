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
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Controller3 {
    private TreeSet<Bien> biens =new TreeSet<Bien>();
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FCB326;";
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: #CDCDCD;";
    private static final String HOVERED_2BUTTON_STYLE = "-fx-background-color: #E84C89;";



    /*****************************************************************************************************************/

   ImmoESI agence= new ImmoESI();





 public void maini() throws SuperficieHabitableException, BienExistantException {

  TreeSet<Proprietaire> proprietaires = new TreeSet<Proprietaire>();

  /*CREATION D'ADMINISTRATEUR*/
  Administrateur admin = new Administrateur("admin1", "motdepasse1");
  Administrateur admin2 = new Administrateur("admine2", "motdepasse2");
  agence.administrateurs.add(admin);
  agence.administrateurs.add(admin2);
  /*CREATION D'ADMINISTRATEUR*/


  /*CREATION DES PROPRIETAIRES*/
  Proprietaire prop1 = new Proprietaire("AMMALI", "+213*********", "Mouna", "im_ammali@esi.dz", "Lido Mohammadia");
  Proprietaire prop2 = new Proprietaire("NASRI", "+213*********", "Ala Edine", "ia_nasri@esi.dz", "Batna");
  Proprietaire prop3 = new Proprietaire("DJEFFAL", "+213*********", "Belkis", "ib_djeffal@esi.dz", "El Bordj");
  Proprietaire prop4 = new Proprietaire("BELGUENBOUR", "+213*********", "Walid", "iw_belguenbour@esi.dz", "Dely Brahim");
  proprietaires.add(prop1);
  proprietaires.add(prop2);
  proprietaires.add(prop3);
  proprietaires.add(prop4);
  agence.setProprietaires(proprietaires);
  /*CREATION DES PROPRIETAIRES*/

  /*CREATION DES BIENS*/
  Date date = new Date();
  Date date1 = new Date("2019/2/2");
  Date date2 = new Date("2018/5/2");
  Date date3 = new Date("2007/9/1");
  Date date4 = new Date("2006/1/11");
  Date date5 = new Date("2005/3/13");
  Date date6 = new Date("2004/2/12");
  Date date7 = new Date("1990/2/2");
  Wilaya wilaya2 = Enum.valueOf(Wilaya.class, "wilaya2");
  Wilaya wilaya3 = Enum.valueOf(Wilaya.class, "wilaya3");
  Wilaya wilaya1 = Enum.valueOf(Wilaya.class, "wilaya1");

  TypeDeTransaction vente = Enum.valueOf(TypeDeTransaction.class, "vente");
  TypeDeTransaction location = Enum.valueOf(TypeDeTransaction.class, "location");
  TypeDeTransaction echange = Enum.valueOf(TypeDeTransaction.class, "echange");

  Bien bien1 = new Appartement("Lido Mohammadia", wilaya2, 120, prop2, vente, 4000000, false, "", date, "", 4, false, 1, false);
  Bien bien2 = new Maison("Birkhadem ", wilaya3, 200, prop1, vente, 10000000, false, "", date1, "", 0, false, true, true, 200);
  Bien bien3 = new Terrain("Cheraga", wilaya1, 500, prop1, vente, 20000000, false, "", date2, "", 3, "");
  Bien bien4 = new Appartement("Bab ezzouar", wilaya3, 100, prop2, location, 40000, false, "", date7, "", 3, false, 1, false);
  Bien bien5 = new Maison("Belfort", wilaya2, 160, prop3, location, 150000, false, "", date3, "", 0, false, false, true, 160);
  Bien bien6 = new Appartement("Dely Brahim", wilaya3, 50, prop2, location, 600000, false, "", date4, "", 1, false, 6, false, false, true);
  Bien bien7 = new Terrain("Kharoubier", wilaya1, 650, prop1, echange, 18000000, false, "", date5, "", 1, "");
  Bien bien8 = new Maison("Belf", wilaya2, 200, prop2, echange, 14000000, false, "", date6, "", 0, false, 0, true, false, false, 200);
  agence.ajouterBien(admin, bien1);
  agence.ajouterBien(admin, bien2);
  agence.ajouterBien(admin, bien3);
  agence.ajouterBien(admin, bien4);
  agence.ajouterBien(admin, bien5);
  agence.ajouterBien(admin, bien6);
  agence.ajouterBien(admin, bien7);
  agence.ajouterBien(admin, bien8);
  /*CREATION DES BIENS*/

  /*GESTION DES MESSAGES*/
  agence.envoyerMessage("Je suis interessé par ce bien","user1@gmail.com","nom1");
  agence.envoyerMessage("Pouvons nous visiter ce bien","user1@gmail.com","nom3");
  agence.envoyerMessage( "Ce bien est il encore disponible ? ","user1@gmail.com","nom12");
  agence.envoyerMessage("Ce bien est il negociable ? ","user1@gmail.com","nom3");
  agence.envoyerMessage("Pouvons nous passer en agence pour ce bien ! ","user1@gmail.com","nom4");
  /*GESTION DES MESSAGES*/
  System.out.println("--------------------------------------------------------------------------------------------\n");
  System.out.println("                        Ecole Nationale Supérieure d'Informatique               ");
  System.out.println("                                    AMMALI  -   NASRI");
  System.out.println("                                   Mouna    -   Ala Edine");
  System.out.println("                                    S B     -   G 06");
  System.out.println("--------------------------------------------------------------------------------------------\n");

  int choix = 3;
  do {
   System.out.println("    1 - Continuer en tant qu'utilisateur");
   System.out.println("    2 - se connecter en tant qu'administrateur");
   System.out.println("    3 - Quitter\n\n");
   Scanner sc = new Scanner(System.in);
   System.out.print("Veuillez introduire votre choix : ");

   //    choix = sc.nextInt();
   switch (choix) {
    case 1:
     do {
      System.out.println("    1 - affichage des biens d'un proprietaire");
      System.out.println("    2 - affichage detaille d'un bien");
      System.out.println("    3 - calcul des prix");
      System.out.println("    4 - recherche filtrée");
      System.out.println("    5 - Envoie de messages");
      System.out.println("    6 - afficher tous les biens existants");
      System.out.println("    7 - Quitter\n");
      //   choix = sc.nextInt();
      switch (choix) {
       case 1:
        System.out.println("************************    /Affichage des biens d'un proprietaire/    ************************************************\n\n\n\n");

        /*GESTION BIENS DES PROPRIETAIRES*/
        System.out.println("Biens du proprietaire /Prop1/");
        prop1.afficher_biens_proprietaires();
        System.out.println("\nBien du proprietaire /Prop2/");
        prop2.afficher_biens_proprietaires();

        break;
       case 2:
        System.out.println("************************    /Affichage detaillé d'un bien/    ************************************************\n\n\n\n");
        System.out.println("Detail du  Bien : /bien1/ ");
        bien1.afficherDetail();
        break;
       case 3:
        System.out.println("************************    /Calcul du prix/    ************************************************\n\n");
        float dd;
        dd = bien1.calculerprix();
        System.out.println("Prix du bien1 est = " + dd);
        dd = bien2.calculerprix();
        System.out.println("Prix du bien2 est = " + dd);
        dd = bien3.calculerprix();
        System.out.println("Prix du bien3 est = " + dd);
        dd = bien4.calculerprix();
        System.out.println("Prix du bien4 est = " + dd);
        dd = bien5.calculerprix();
        System.out.println("Prix du bien5 est = " + dd);
        dd = bien6.calculerprix();
        System.out.println("Prix du bien6 est = " + dd);
        dd = bien7.calculerprix();
        System.out.println("Prix du bien7 est = " + dd);
        dd = bien8.calculerprix();
        System.out.println("Prix du bien8 est = " + dd);
        break;
       case 4:
        System.out.println("************************    /Recherche filtrée/    ************************************************\n\n");
        Filtter f = new Filtter();
        int a = 0, b = 0;
        ArrayList<Bien> list1 = new ArrayList<Bien>();
        ArrayList<Bien> list2 = new ArrayList<Bien>();
        ArrayList<Bien> list3 = new ArrayList<Bien>();
        agence.rech_filltre(list1, list2, f.affichage_fillter());
        System.out.println("On a deja filtre les bien ! voulez vous filtter une autre foit ?");
        System.out.println("1/ Oui je veux filtrer une autre fois");
        System.out.println("2/ Non je veux just le affichier !");
        System.out.println("ENTRE 1 ou 2 !");
        //       a = sc.nextInt();
        if (a == 2) {
         b = 1;
         for (Bien ele : list2) {
          int cpt = 1;
          System.out.println("NUMERO DU BIEN : " + cpt);
          ele.afficher();
          System.out.println("---------------------------------------");
          cpt++;
         }
        }
        while (a == 1) {
         agence.rech_filltre(list2, list3, f.affichage_fillter());
         System.out.println("On a deja filtre les bien ! voulez vous filtter une autre foit ?");
         System.out.println("1/ Oui je veux filtrer une autre fois");
         System.out.println("2/ Non je veux just le affichier !");
         System.out.println("ENTRE 1 ou 2 !");
         //          a = sc.nextInt();
        }
        if (a == 2 && b != 1) {
         for (Bien ele : list3) {
          int cpt = 1;
          System.out.println("NUMERO DU BIEN : " + cpt);
          ele.afficher();
          System.out.println("---------------------------------------");
          cpt++;
         }
        }
        //  prop1.afficher_biens_proprietaires();

        System.out.println("***bien recherche : Appartement , à batna de prix superieur à 16000 DA et inferieur à 1000000***\n ");
        break;
       case 5:

        break;
       case 6:
        System.out.println("******************    /Biens existants/    ****************************");
        agence.afficher_liste_des_bien();
        break;
       case 7:
        break;
      }
     } while (choix != 7);
    case 2:


     sc = new Scanner(System.in);
     System.out.print("IDENTIFIANT : ");
     String identifiant = sc.nextLine();
     System.out.println("");
     System.out.println("MOT DE PASSE : ");
     String motdepasse = sc.nextLine();
     System.out.println("");
     Administrateur seconnecter = new Administrateur(identifiant, motdepasse);
     if (agence.seconnecter(seconnecter)) {
      do {
       System.out.println("    1 - Ajouter un bien");
       System.out.println("    2 - Supprimer un bien");
       System.out.println("    3 - Archiver un bien");
       System.out.println("    4 - Modification d'un bien ");
       System.out.println("    5 - Consulter les messages reçues");
       System.out.println("    6 - Quitter\n");
       //      choix = sc.nextInt();
       switch (choix) {

        case 1:
         System.out.println("************************    /Ajout d'un bien/    ************************************************\n\n\n\n");
         /* ajout d'un bien */
         try {
          agence.ajouterBien(admin);
         } catch (SurfaceNulleException e) {
          System.out.println("La surface est invalide ");
          e.printStackTrace();
         } catch (BienExistantException e) {
          System.out.println("Ce bien existe deja");
          e.printStackTrace();
         }
         System.out.println("Liste des biens après ajout");
         agence.afficher_liste_des_bien();
         break;
        case 2:
         System.out.println("************************    /Suppression d'un bien/    ************************************************\n\n\n\n");
         System.out.println("bien supprimé : bien1\n*** ");
         bien1.afficher();
         System.out.println("\n------------------------------------\n");
         agence.supprimer_bien(admin, bien1);
         /* affichage de la liste des biens apres suppression */
         System.out.println("Liste des biens après suppression\n\n");
         agence.afficher_liste_des_bien();
         System.out.println("Liste des biens des proprietaires après suppression \n\n");
         //   bien1.proprietaire.afficher_biens_proprietaires();
         break;
        case 3:
         System.out.println("************************    /Archiver un bien/    ************************************************\n\n\n\n");
         System.out.println("bien archivé: bien2 ");
         agence.archiver_bien(admin, bien2);
         System.out.println("Liste des biens après archivage");
         agence.afficher_liste_des_bien();
         System.out.println("Liste des biens archivés : \n\n");
         agence.afficher_liste_des_bien_archives();

         break;
        case 4:
         System.out.println("************************    /Modification d'un bien/    ************************************************\n\n");
         /*GESTION DES MODFICATIONS*/
         System.out.println("bien modifié : bien5 ");
         Bien bien = agence.choisirBien(5);
         agence.modifierBien(admin, bien);
         agence.afficher_liste_des_bien();
         /*GESTION DES MODFICATIONS*/
         System.out.println("************************    /Calcul du prix apres modification/    ************************************************\n\n");
         System.out.println("$$$$$$$$$$$$$$$$\t    prix final :      " + bien.calculerprix());

         break;
        case 5:
         System.out.println("********************    /Affichage des messages recues/    ******************************************\n\n");
         /*Afficher la liste des messages*/
         agence.afficherMessages(admin);
         break;
        case 6:
         break;
       }
      } while (choix != 6);

     } else {
      System.out.println("Identifiants errones,veuillez réeassayer ! ");
     }


     break;

   }
  } while ((choix != 3));
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
 public void sendmessage(){
   agence.envoyerMessage(message.getText(),email.getText(),nom.getText());
}





 @FXML
    private VBox bienbox= new VBox();
    //private VBox bien1 = new VBox();


    @FXML
    public void goafficherlesmessages() throws Exception {
        maini();
        Stage stage = Main.getPrimaryStage();


     int f=0,cpt = 1;
     Pane details = new Pane();
     for(Messages ele:agence.liste_messages){
    // for(int i =0; i <99 ; i++){
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
                Text title = new Text();


                Text bienName = new Text(); Text bienAdresse = new Text(); Text bienProp = new Text();
                Text bienTypet = new Text();

                Text bienName1 = new Text(); Text bienAdresse1 = new Text(); Text bienProp1 = new Text();
                Text bienTypet1 = new Text();

                Text bienAdresse2 = new Text();Text bienProp2 = new Text();
                Text bienTypet2 = new Text();

                Text bienAdresse3 = new Text();

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


 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/


 public void lected(Bien ele,Button b) throws Exception {
  System.out.println("here we go");
  if(ele.getSelected()==false){
   System.out.println("here we go2");
   for (Bien ele2:agence.liste_des_biens){
    if (ele2.getSelected()==true){
     System.out.println("here we go4");
     ele2.setSelected(false);
     b.setStyle(IDLE_BUTTON_STYLE);
    }
   }
   ele.setSelected(true);
   // b.setStyle(HOVERED_BUTTON_STYLE);
   gotouslesbien();
  }
 }
 @FXML
 public void gotouslesbien() throws Exception {
  maini();

  Stage stage = Main.getPrimaryStage();

  //  int cpt=1;
  //  for(int i = 1; i <10;i++){
  //

  //   System.out.println("NUMERO DU BIEN : ");
  //   System.out.println("---------------------------------------");

  // }

  //  if(agence.liste_des_biens != null){
  //  System.out.println("vide ya jdk");
  //}
  int f=0,cpt = 1;
  Pane details = new Pane();
  for(Bien ele:agence.liste_des_biens){
   // for(int i =0; i <99 ; i++){
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
   b.setOnMouseClicked(e -> {
    try {
     lected(ele,b);
    } catch (Exception ex) {
     //ex.printStackTrace();
    }
   });

   if (ele.getSelected()==true){
    details = new Pane();
    b.setStyle(HOVERED_BUTTON_STYLE);
   }

   if (f==0){
    f =1;
    ele.setSelected(true);
    b.setStyle(IDLE_BUTTON_STYLE);
   }



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
   System.out.println(numbien);
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
   System.out.println("Valur of selected is "+String.valueOf(ele.getSelected()));
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




 public void gosuppbien() throws Exception {
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

   Text bienName1 = new Text(); Text supptitle = new Text();

   Text bienAdresse2 = new Text();Text bienProp2 = new Text();
   Text bienTypet2 = new Text(); Text bienTypeb2 = new Text(); Text bienPrix2 = new Text(); Text bienSurface2 = new Text();


   ImageView im = new ImageView();
   Image image = new Image("file:C:/Users/Dell/Desktop/POO/JAVAFXSETUP/src/icons/download.png");
   im.setImage(image);

   TextField Num = new TextField();
   Button conf = new Button();

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

   /************************************************** Text Scene ****************************************************/



   bienName1.setText("Numero du bien à supprimer :");
   bienName1.setFill(Paint.valueOf("#ffffff"));
   bienName1.setFont(Font.font("System", FontWeight.BOLD, 15));
   bienName1.setLayoutX(35);
   bienName1.setLayoutY(240);

   supptitle.setText("Supprimer Bien");
   supptitle.setFill(Paint.valueOf("#ffffff"));
   supptitle.setFont(Font.font("System", FontWeight.BOLD, 25));
   supptitle.setLayoutX(55);
   supptitle.setLayoutY(40);


   /************************************************** Details Label ***************************************************/

   Num.prefHeight(65);
   Num.prefWidth(200);
   Num.setLayoutX(60);
   Num.setLayoutY(260);
   Num.setPromptText("Numero Du bien");


   conf.setMnemonicParsing(false);
   conf.setPrefHeight(40.0);
   conf.setPrefWidth(100.0);
   conf.setLayoutX(90);
   conf.setLayoutY(295);
   conf.setText("Supprimer");
   conf.setId("confbtn");
   conf.setStyle("-fx-background-color: #E84C89;");
   conf.setOnMouseEntered(e -> conf.setStyle(HOVERED_BUTTON_STYLE));
   conf.setOnMouseExited(e -> conf.setStyle(HOVERED_2BUTTON_STYLE));
   conf.setOnMouseClicked(e -> conf.setStyle(HOVERED_BUTTON_STYLE));



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
   details.getChildren().add(supptitle);
   details.getChildren().add(Num);
   details.getChildren().add(conf);



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


 public void goajouterbien() throws Exception {
  Stage stage = Main.getPrimaryStage();
  Parent root = FXMLLoader.load(getClass().getResource("AjouterBien.fxml"));
  stage.setTitle("ImmoEsi");
  stage.setScene(new Scene(root, 900, 500));
  stage.show();
  //    this.secondstage= stage;
 }


 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/
 /************************************************** Archiver Bien ***************************************************/




 public void Archiverbien() throws Exception {
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

   Text bienName1 = new Text(); Text supptitle = new Text();

   Text bienAdresse2 = new Text();Text bienProp2 = new Text();
   Text bienTypet2 = new Text(); Text bienTypeb2 = new Text(); Text bienPrix2 = new Text(); Text bienSurface2 = new Text();


   ImageView im = new ImageView();
   Image image = new Image("file:C:/Users/Dell/Desktop/POO/JAVAFXSETUP/src/icons/download.png");
   im.setImage(image);

   TextField Num = new TextField();
   Button conf = new Button();

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

   /************************************************** Text Scene ****************************************************/



   bienName1.setText("Numero du bien à archiver :");
   bienName1.setFill(Paint.valueOf("#ffffff"));
   bienName1.setFont(Font.font("System", FontWeight.BOLD, 15));
   bienName1.setLayoutX(35);
   bienName1.setLayoutY(240);

   supptitle.setText("Archiver Bien");
   supptitle.setFill(Paint.valueOf("#ffffff"));
   supptitle.setFont(Font.font("System", FontWeight.BOLD, 25));
   supptitle.setLayoutX(55);
   supptitle.setLayoutY(40);


   /************************************************** Details Label ***************************************************/

   Num.prefHeight(65);
   Num.prefWidth(200);
   Num.setLayoutX(60);
   Num.setLayoutY(260);
   Num.setPromptText("Numero Du bien");


   conf.setMnemonicParsing(false);
   conf.setPrefHeight(40.0);
   conf.setPrefWidth(100.0);
   conf.setLayoutX(90);
   conf.setLayoutY(295);
   conf.setText("Archiver");
   conf.setId("confbtn");
   conf.setStyle("-fx-background-color: #E84C89;");
   conf.setOnMouseEntered(e -> conf.setStyle(HOVERED_BUTTON_STYLE));
   conf.setOnMouseExited(e -> conf.setStyle(HOVERED_2BUTTON_STYLE));
   conf.setOnMouseClicked(e -> conf.setStyle(HOVERED_BUTTON_STYLE));



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
   details.getChildren().add(supptitle);
   details.getChildren().add(Num);
   details.getChildren().add(conf);



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

 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/
 /************************************************** Propritaire Bien  ***************************************************/


 public void propritairebien() throws Exception {
  biens = agence.getListe_des_biens();
  Stage stage = Main.getPrimaryStage();

  //  int cpt=1;
   for(Bien ele:agence.liste_des_biens){
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
 /***************************************************Bien Prop *****************************************************/
 /***************************************************Bien Prop *****************************************************/
 /***************************************************Bien Prop *****************************************************/
 /***************************************************Bien Prop *****************************************************/
 /***************************************************Bien Prop *****************************************************/
 /***************************************************Bien Prop *****************************************************/
 /***************************************************Bien Prop *****************************************************/


 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/
 /************************************************** Supprimer Bien ***************************************************/



}


