package sample;

import Noyaux.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Main extends Application {
    static private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("proto.fxml"));
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

        launch(args);
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
