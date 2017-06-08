package MyProject;

import WidowBuilders.SignUpClass;
import WidowBuilders.SigninPage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Person extends Application {
    private String firstName;
    private String lastName;
    private String SSN;
    private String dateOfBirth;
    private String gender;


    Button signInButton,signUPButton;
    Stage window;
    Scene  sceneFrontPage, sceneTologin,sceneToSignUp;


    public static void main(String[] args) {

        launch(args);
    }

    public Person(){}

    public Person(String firstName, String lastName, String SSN, String dateOfBirth, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;

        Label frontPageLabel = new Label("         Well Come!");
        Label newUserGuide = new Label("Have an Account");
        Label Regularcustomer = new Label("New User");
        // sign in
        signInButton = new Button();
        signInButton.setText("Sign in");
        // sign in to take action
        signInButton.setOnAction(e-> SigninPage.signIn("LogIn Please"));
        //sign up
        signUPButton = new Button();
        signUPButton.setText("Sign Up");
        signUPButton.setOnAction(e-> SignUpClass.signUp(" SignUp Page"));
        //sign up to take action

        // HBox layOut1= new HBox(100);
        // layOut1.getChildren().addAll(frontPageLabel);
        // sceneFrontPage= new Scene(layOut1,600,600);
        // VBox layout2= new VBox(20);
        // layout2.getChildren().addAll(newUserGuide, signInButton,Regularcustomer,signUPButton);
        // sceneFrontPage= new Scene(layout2,300,300);

        GridPane firstPage = new GridPane();
        firstPage.setPadding(new Insets(25, 25, 25, 25));
        firstPage.setVgap(15);
        firstPage.setHgap(15);
        GridPane.setConstraints(frontPageLabel, 1, 0);
        GridPane.setConstraints(newUserGuide, 0, 1);
        GridPane.setConstraints(Regularcustomer, 2, 1);
        GridPane.setConstraints(signInButton, 0, 2);
        GridPane.setConstraints(signUPButton, 2, 2);

        firstPage.getChildren().addAll(frontPageLabel, newUserGuide, Regularcustomer, signInButton, signUPButton);
        Scene scene = new Scene(firstPage,400,400);
        window.setTitle("Welcome to this App");
        window.setScene(scene);
        window.show();


    }}