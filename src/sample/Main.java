package sample;

import noy.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.*;

public class Main extends Application {
    static private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("admin_in.fxml"));
        primaryStage.setTitle("ImmoEsi");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
        this.primaryStage= primaryStage;
    }

    public static void showadministration() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation (Main.class.getResource("Adminstration.fxml"));
        //BorderPane administration = loader.load();

    }
    public static void main(String[] args) throws BienExistantException, SuperficieHabitableException {
        Controller3 c = new Controller3();
        c.maini();
        ObjectInputStream in;
        ObjectOutputStream out;
        /*DESERIALISATION*/
        //Ecriture des objets

        try {
            //Récupération des objets stockés

            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Messages.dat"))));
            try {
                ImmoESI.liste_messages= ((LinkedList<Messages>)in.readObject());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            in.close();

            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Biens.dat"))));
             try {

                   ImmoESI.liste_des_biens= ((TreeSet<Bien>)in.readObject());

             } catch (ClassNotFoundException e) {
              e.printStackTrace();
              }
            in.close();

            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Administrateurs.dat"))));
            try {

                ImmoESI.administrateurs= (LinkedList<Administrateur>) in.readObject();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            in.close();

            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Archives.dat"))));
            try {

                ImmoESI.biens_archives= ((TreeSet<Bien>)in.readObject());

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            in.close();
              in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Proprietaires.dat"))));
               try {

              ImmoESI.proprietaires= (TreeSet<Proprietaire>) in.readObject();

              } catch (ClassNotFoundException e) {
               e.printStackTrace();
              }
            in.close();
        } catch (FileNotFoundException | EOFException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*DESERIALISATION*/
        launch(args);
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Messages.dat"))));


            out.writeObject(ImmoESI.liste_messages);

            out.close();
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Biens.dat"))));

            out.writeObject(ImmoESI.liste_des_biens);

            out.close();
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Archives.dat"))));

            out.writeObject(ImmoESI.biens_archives);

            out.close();
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Administrateurs.dat"))));

            out.writeObject(ImmoESI.administrateurs);

            out.close();
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Proprietaires.dat"))));

            out.writeObject(ImmoESI.proprietaires);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
