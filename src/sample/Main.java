package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("proto.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 950, 560));
        primaryStage.show();
    }

    public static void showadministration() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation (Main.class.getResource("Adminstration.fxml"));
        //BorderPane administration = loader.load();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
