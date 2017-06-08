package WidowBuilders;

import MyProject.HelperClasses.MessangerClass;
import MyProject.MyData.DataCenter;
import MyProject.User;
import MyProject.ValidationRoom.InputValidation;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Collections;

/**
 * Created by gebre on 6/3/2017.
 */
public class SignUpClass {//{implements {//EventHandler<ActionEvent> {
    public static void signUp(String title){


        Stage window= new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(800);
        window.setMinWidth(800);

        //Now lets create the Grid

        GridPane tosignUp= new GridPane();
        tosignUp.setPadding(new Insets(50,50,50,50));
        tosignUp.setHgap(10);
        tosignUp.setVgap(10);

        //First Name
        Label fName = new Label();
        fName.setText("First Name *");
        GridPane.setConstraints(fName,0,0);
        TextField fNameField= new TextField();
        fNameField.setPromptText("first name");
        GridPane.setConstraints(fNameField,1,0);
        //LastName
        Label lName= new Label();
        lName.setText("LastName *");
        GridPane.setConstraints(lName,0,1);
        TextField lNameField= new TextField();
        lNameField.setPromptText("Last Name");
        GridPane.setConstraints(lNameField,1,1);
        // SSN
        Label ssLabel= new Label();
        ssLabel.setText(" SSN ");
        GridPane.setConstraints(ssLabel,0,2);
        TextField SSNTextField= new TextField();
        SSNTextField.setPromptText("Social security number");
        GridPane.setConstraints(SSNTextField,1,2);
        //date of Birth
        Label dobLabel= new Label();
        dobLabel.setText("date of Birth *");
        GridPane.setConstraints(dobLabel,0,3);
        TextField dobTextField= new TextField();
        dobTextField.setPromptText("MM/DD/YYYY");
        GridPane.setConstraints(dobTextField,1,3);
        // gender
        Label genderLabel= new Label();
        genderLabel.setText("Gendr *");
        GridPane.setConstraints(genderLabel,0,4);
        ChoiceBox genderchoice= new ChoiceBox();
        genderchoice.getItems().addAll("Male","Female");
        genderchoice.setValue("Male");
        GridPane.setConstraints(genderchoice,1,4);
       // Username
        Label userNameLabel= new Label();
        userNameLabel.setText("user Name *");
        GridPane.setConstraints(userNameLabel,0,5);
        TextField UserNameTextField= new TextField();
        UserNameTextField.setPromptText("user name");
        GridPane.setConstraints(UserNameTextField,1,5);
        //
        //email
         Label emailLabel= new Label();
         emailLabel.setText("Email *");
         GridPane.setConstraints(emailLabel,0,6);
         TextField emailTextField=new TextField();
         emailTextField.setPromptText("email");
         GridPane.setConstraints(emailTextField,1,6);
         //Phone Number
        Label phoneNLabel= new Label();
        phoneNLabel.setText("Phone Number");
        GridPane.setConstraints(phoneNLabel,0,7);
        TextField phoneTextFiled= new TextField();
        phoneTextFiled.setPromptText("CC AC --- ----");
        GridPane.setConstraints(phoneTextFiled,1,7);
        //Password
        Label passLabel= new Label();
        passLabel.setText("Password *");
        GridPane.setConstraints(passLabel,0,8);
        TextField passwordField= new TextField();
        passwordField.setPromptText("Password");
        GridPane.setConstraints(passwordField,1,8);
        // Confirm Password
        Label passConfirmationLabel= new Label();
        passConfirmationLabel.setText("confirm Password *");
        GridPane.setConstraints(passConfirmationLabel,0,9);
        TextField passwordConfirmationField= new TextField();
        passwordConfirmationField.setPromptText("confirm Password");
        GridPane.setConstraints(passwordConfirmationField,1,9);
        //Photo gosse here
        Label photoLabel= new Label();
        photoLabel.setText("Insert Photo");
        GridPane.setConstraints(photoLabel,0,10);
        TextField photoField= new TextField();
        photoField.setPromptText("Photo gosse her");
        GridPane.setConstraints(photoField,1,10);
        //Photo browse button
        Button browse= new Button();
        browse.setText("browse");
        GridPane.setConstraints(browse,3,10);
        Label error= new Label();
        GridPane.setConstraints(error,3,12);
        // Signup button
        Button RegisterButton= new Button();
        RegisterButton.setText("Register");
        RegisterButton.setOnAction(new EventHandler<ActionEvent>() {

            boolean fn=false,ln=false,dob=false,gr=false,un=false,pass=false,cpass=false,ss=false;

            @Override
            public void handle(ActionEvent event) {

                String messageFormat = "";
                String empityMessage = "";
               // boolean Format = true;
               // boolean blank = false;



                //
                fn = SignUpClass.textFieldValidator(fNameField);
                if(fn){
                    if (!InputValidation.validateFName(fNameField.getText())) {
                        messageFormat += messageFormat + "Invalid->first name\n";
                    }
                }
                else if (!fn) {
                    messageFormat += MessangerClass.FIRSTNAME_ERROR;
                }
                //

                ln=SignUpClass.textFieldValidator(lNameField);
                if(ln){
                    if (!InputValidation.validateLName(lNameField.getText())) {
                        messageFormat += messageFormat + "Invalid->Last Name\n";
                    }
                }
                else if (!ln) {
                    messageFormat += MessangerClass.LASTNAME_ERROR;
                }
                //
                ss= SignUpClass.textFieldValidator(SSNTextField);
               // if(!ss){

                if (!InputValidation.validateSSN(SSNTextField.getText())!=true) {
                    messageFormat  += messageFormat + "Invalid->SSN \n";
                }
               // }}
                //
                dob = SignUpClass.textFieldValidator(dobTextField);
                if(dob){
                    if (InputValidation.validateDOb(dobTextField.getText()) != true) {
                        messageFormat += messageFormat + "Invalid->Date of Birth\n";

                    }

                }
                else{
                    messageFormat += MessangerClass.DATEOFBIRTH_ERROR;

                }


                un = SignUpClass.textFieldValidator(UserNameTextField);
                if(!un){
                    //if (InputValidation.validateUserName(UserNameTextField.getText())!=true) {
                        messageFormat += MessangerClass.USERNAME_ERROR;

                   // }
                }
               else {
                    if (InputValidation.validateUserName(UserNameTextField.getText())!=true) {
                        messageFormat+=messageFormat+"Invalied User Name";

                    }


                   // empityMessage += MessangerClass.USERNAME_ERROR;

                }

              boolean email= SignUpClass.textFieldValidator(emailTextField);
                if(!email) {
                    if (InputValidation.validateEmail(emailTextField.getText()) != true) {
                        messageFormat = messageFormat + "Invalid->Email\n";
                    }
                }
                if(email){
                    if (InputValidation.validateEmail(emailTextField.getText()) != true) {
                         messageFormat = messageFormat + "Invalid->Email\n";
                    }

                }
                boolean phone= SignUpClass.textFieldValidator(phoneTextFiled);
               if(!phone){
                if (InputValidation.validatePhoneNumber(phoneTextFiled.getText())!=true) {
                    //messageFormat = messageFormat + "Invalid-> phone Number\n";

                }}
                else
               {
                   if (InputValidation.validatePhoneNumber(phoneTextFiled.getText())!=true) {
                       //messageFormat = messageFormat + "Invalid-> phone Number\n";

                   }

               }


                pass = SignUpClass.textFieldValidator(passwordField);
                if(pass){
                    if (InputValidation.validatePassword(passwordField.getText())!=true) {
                        messageFormat = messageFormat + "Invalid->Password\n";

                    }
                }
                else {
                    messageFormat += MessangerClass.PASSWORD_ERROR;

                }
                cpass=SignUpClass.textFieldValidator(passwordConfirmationField);
                if(cpass){
                    if (passwordConfirmationField.getText().equals(passwordField.getText())!=true) {
                        messageFormat += "Password does not mach!";

                    }
                }
                else {
                    messageFormat+=MessangerClass.CONFIRMPASSWORD_;
                }
                if(fn&&ln&&dob&&un&&pass&&cpass){
                    User person1 = new User(fNameField.getText(),lNameField.getText(),SSNTextField.getText(),dobTextField.getText(),genderchoice.getValue().toString(),
                            UserNameTextField.getText(),emailTextField.getText(),phoneTextFiled.getText(),
                            passwordField.getText());
                    DataCenter.MetodToBeCalledWhenSignUP(person1);
                    SignUpConfirmitionPage.signUPconfirmMethod("Sign Up Confirmation Page");
                    //LoginConfirmiruionPage.logInconfirmMethod("Login Confirmation Page");

                }
                else{
                    error.setText(messageFormat);
                    error.setVisible(true);

                }

            }
    } );

        GridPane.setConstraints(RegisterButton,1,11);

        //building the window to display
        tosignUp.getChildren().addAll(fName,lName,fNameField,lNameField,ssLabel,SSNTextField,dobLabel,dobTextField,genderLabel,genderchoice,
                userNameLabel,UserNameTextField,emailLabel,emailTextField,phoneNLabel,phoneTextFiled,passLabel,passwordField,
                passConfirmationLabel,photoLabel,photoField,
                passwordConfirmationField,browse,RegisterButton,error);
        Scene signUpScene= new Scene(tosignUp);
        window.setScene(signUpScene);
        window.show();


    }
    public static boolean textFieldValidator(TextField text){
        boolean status= false;
        ObservableList<String> styleClass= text.getStyleClass();
        if(text.getText().trim().length()==0){
            if(!styleClass.contains("etrror")){
                styleClass.add("error");
            }
        }
        else
        {
            styleClass.removeAll(Collections.singleton("error"));
            status=true;
        }
        return status;
    }

}





