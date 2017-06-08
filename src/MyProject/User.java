package MyProject;

import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by gebre on 6/2/2017.
 */
public class User extends Person{
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;
    private String photo;

    ArrayList<Person> user= new ArrayList<>();

    public User(){
        super();
    }

    public  User(String Fn, String ln, String ss, String dob, String gender,String userName, String email, String phoneNumber, String password) {
        super(Fn,ln,ss,dob,gender);
        this.userName = userName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User(String userName) {
        this.userName = userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoto() {
        return photo;
    }


}



