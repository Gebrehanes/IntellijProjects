package MyProject.MyData;

import MyProject.Person;
import MyProject.User;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.File;


/**
 * Created by gebre on 6/5/2017.
 */
public class DataCenter {

    public static void MetodToBeCalledWhenSignUP( User misterX
    ) {

        User user = new User();
        user=misterX;
        String fileName = "UsersRecord.txt";
        PrintWriter y = DataCenter.fileWriter(fileName);
        y.println(user.getFirstName());
        y.println(user.getLastName());
        y.println(user.getSSN());
        y.println(user.getDateOfBirth());
        y.println(user.getGender());
        y.println(user.getUserName());
        y.println(user.getEmail());
        y.println(user.getPhoneNumber());
        y.println(user.getPassword());
        y.close();
    }
    public static ArrayList mathodToBeCalledWhenSignIn(){
        User user = new User();
        String fileName = "UsersRecord.txt";
        Scanner x = DataCenter.fileReader(fileName);
       // BufferedReader x= new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Person> listOfUsers= new ArrayList<>();

         while(x.hasNextLine()&& x.nextLine()!=null){
             String fname= x.nextLine();
             System.out.println("I have caught the first name"+fname);
             user.setFirstName(fname);

             //
             String lname = x.next();
             System.out.println("I have caught the last name" + lname);
             user.setLastName(lname);

            // int number= x.nextInt();
             String social=x.next();
             System.out.println("I have caught the Social number"+social);
             user.setSSN(social.toString());
             //
             String dob= x.nextLine();
             String dateOfBirth=""+dob;
             System.out.println("I have caught the dob"+dob);
             user.setDateOfBirth(dateOfBirth);
             //
             String gender= x.next();
             user.setGender(gender);
             System.out.println("I have caught gender"+gender);
             String Username= x.next();
             //
             System.out.println("I have caught gender"+Username);
             user.setUserName(Username);
             String email= x.nextLine();
             user.setEmail(email);
             //
             System.out.println("I have caught the email"+email);
             String pass= x.next();
             user.setPassword(pass);
             System.out.println("I have caught the password"+pass);
             listOfUsers.add(user);

         }
         x.close();
         return listOfUsers;
    }

    private static PrintWriter  fileWriter(String filepath){
        PrintWriter outPutStream=null;
        try{

            outPutStream =  new PrintWriter(new FileOutputStream(filepath));

        }
         catch(FileNotFoundException e) {
             System.out.println(e.getMessage());
         }
        // outPutStream.close();
         return outPutStream;

    }
    private static Scanner fileReader(String filepath){
             Scanner inputStream=null;
        try{

            inputStream= new Scanner(new File(filepath));
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
       // inputStream.close();
   return inputStream;
    }
    public String toString(){
        User user= new User();
        return user.getFirstName()+" "+user.getLastName()+" "+user.getSSN()+" "+user.getDateOfBirth()+" "+user.getGender()+" "
                +user.getUserName()+" "+user.getEmail()+user.getPhoneNumber()+" "+user.getPassword();
    }

}
