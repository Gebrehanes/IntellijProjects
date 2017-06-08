package WidowBuilders;

import MyProject.HelperClasses.MessangerClass;
import MyProject.MyData.DataCenter;
import MyProject.User;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.util.ArrayList;
import javafx.geometry.Insets;

/**
 * Created by gebre on 6/3/2017.
 */


public class SigninPage{

    public static void signIn(String title) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        window.setMinHeight(500);
        GridPane toSignIn = new GridPane();
        toSignIn.setPadding(new Insets(25, 25, 25, 25));

        toSignIn.setHgap(15);
        toSignIn.setVgap(15);

        // Label nameLabel= new Label("UserName or Email");

        Button signInButton = new Button();
        signInButton.setText("SignIn");
        Label nameLabel = new Label();
        nameLabel.setText("User name or Email");
        GridPane.setConstraints(nameLabel, 0, 0);
        //
        //TextField nameField= new TextField("Gebre");
        TextField nameField = new TextField();
        GridPane.setConstraints(nameField, 1, 0);
        //
        Label passsLabel = new Label("Password");
        GridPane.setConstraints(passsLabel, 0, 1);
        //
        Label error= new Label();
        error.setText("");
        GridPane.setConstraints(error,2,2);

        TextField passField = new TextField();
        passField.setPromptText("Password");
        GridPane.setConstraints(passField, 1, 1);

        signInButton.setOnAction(new EventHandler<ActionEvent>(){
            boolean userNam=false,pass=false;
            boolean result= true;//= UserNameAndPassword(nameField.getText(), passField.getText());
            @Override
            public void handle(ActionEvent event) {

            String message="";
            String signinMessage="";

            //
                userNam= SignUpClass.textFieldValidator(nameField);
                if (!userNam) {
                    message+= MessangerClass.USERNAME_ERROR;
                }
                if(userNam){

                    if(!result){
                       message+=MessangerClass.USER_PASSWORD_;
                    }

                }
                pass= SignUpClass.textFieldValidator(passField);
                if (!pass) {
                    message+=MessangerClass.PASSWORD_ERROR;
                }
                if(pass){

                    if(!result){
                        message+=MessangerClass.USER_PASSWORD_;
                    }

                }
                if(userNam&&pass){
                    if(!result){
                        message+=MessangerClass.USER_PASSWORD_;
                    }
                }

                if(userNam&&pass&result){

                    LoginConfirmiruionPage.logInconfirmMethod("Log in Confirmiton Page");
                }
                else{
                    error.setText(message);
                    error.setVisible(true);
                }

                }

        } );

        //Button signInButton= new Button();
        // signInButton.setText("SignIn");
        GridPane.setConstraints(signInButton, 1, 3);
        toSignIn.getChildren().addAll(nameLabel, nameField, passsLabel, passField, signInButton,error);

        Scene signInScene = new Scene(toSignIn);
        window.setScene(signInScene);
        window.show();


    }
    private static boolean UserNameAndPassword(String message ,String passValue){
        String userNameEnterd=message;
        String passwordEnterd=passValue;
        boolean match=false;
        ArrayList<User> list;
        list= DataCenter.mathodToBeCalledWhenSignIn();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getUserName().equals(userNameEnterd)&& list.get(i).getPassword().equals(passwordEnterd)){

                match=true;
            }
        }
        return match;
    }


}
