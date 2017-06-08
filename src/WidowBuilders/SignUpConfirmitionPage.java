package WidowBuilders;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by gebre on 6/6/2017.
 */
public class SignUpConfirmitionPage {
    public static void signUPconfirmMethod(String x){

        Stage window;
        Button signUp;

        // public void start(Stage primaryStage) throws Exception {
        window= new Stage();
        window.setTitle(x);
        window.setMinWidth(500);
        window.setMinHeight(500);
        Label fName = new Label("\t Congratulations !!\n  \nyou have successfully signed Up!");
        signUp= new Button();
        signUp.setText(" Enjoy Our Service ");
        GridPane firstPage = new GridPane();
        firstPage.setPadding(new Insets(25, 25, 25, 25));
        firstPage.setVgap(200);
        firstPage.setHgap(100);
        GridPane.setConstraints(fName, 0, 0);
        GridPane.setConstraints(signUp, 0, 1);
        firstPage.getChildren().addAll(fName, signUp);
        Scene scene = new Scene(firstPage);
        window.setScene(scene);
        window.show();
    }

}
