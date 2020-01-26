package sample;

import Noyaux.Bien;
import Noyaux.ImmoESI;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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

public class CtrlSupprimerBien {

    private TreeSet<Bien> biens =new TreeSet<Bien>();
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: #FCB326;";
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: #CDCDCD;";
    ImmoESI agence= new ImmoESI();
    @FXML
    private VBox bienbox= new VBox();
    //private VBox bien1 = new VBox();

}
