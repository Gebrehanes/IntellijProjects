package WidowBuilders;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



import javafx.scene.control.Label;

/**
 * Created by gebre on 6/6/2017.
 */
public class LoginConfirmiruionPage{
    public static void logInconfirmMethod(String confirm){

    Stage window;
    Button confirmButton;

   // public void start(Stage primaryStage) throws Exception {
        window= new Stage();
        window.setTitle(confirm);
        window.setMinWidth(500);
        window.setMinHeight(500);
        Label fName = new Label("\t Congratulations !!\n \nyou have successfully signed in!");
        confirmButton= new Button();
        confirmButton.setText("Log Out");
        GridPane firstPage = new GridPane();
        firstPage.setPadding(new Insets(25, 25, 25, 25));
        firstPage.setVgap(50);
        firstPage.setHgap(50);
        GridPane.setConstraints(fName, 0, 0);
        GridPane.setConstraints(confirmButton, 0, 3);
        firstPage.getChildren().addAll(fName, confirmButton);
        Scene scene = new Scene(firstPage);
        window.setScene(scene);
        window.show();

    }

    }




