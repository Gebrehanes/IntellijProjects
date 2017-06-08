package MyProject.ValidationRoom;

import java.util.ArrayList;

/**
 * Created by gebre on 6/3/2017.
 */
public class InputValidation {




    public static  boolean validateFName(String fname){
         boolean answer=false;
        String fN= fname, pattern= "[a-zA-Z,]+";
        if(fN.matches(pattern)){
             answer=true;
        }
        else{
            answer=false;
        }
        return answer;

    }
    public static boolean validateLName(String lname){
        boolean x=false;
        String lN= lname,pattern= "[a-zA-Z,]+";
        if(lN.matches(pattern)){
            x= true;
        }
       // else{}
        return x;
    }
    public static boolean validateSSN(String number){
        boolean y=false;
        String ssN= number, pattern= "\\d+";
         if((ssN.length()==9)&&(ssN.matches(pattern))){
             y=true;
         }
         else {
         }
         return y;
    }
    public static boolean validateDOb(String datee){
        String entered= datee;
        boolean isValid = false;
       String  pattern= "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
       if(entered.matches(pattern)){
           isValid=true;
       }


        return isValid;
    }
    public static boolean validateGender(String gender){
        boolean tt= false;
        String sex= gender;
        if(sex.equalsIgnoreCase("Male")){
            tt=true;
        }
        else{
            tt=true;
        }
        return tt;
    }
    public static boolean validateUserName(String username) {
        boolean valied= false;
        String user = username;
        String pattern=".+";
        if(user.matches(pattern)){
            valied= true;
        }
        else
        {
            //
        }
        return true;

    }
    public static boolean validateEmail(String mail){
        boolean emailll=false;
        String email= mail;
        String pattern=".+@mail\\..+";
        if(email.matches(pattern)){
            emailll=true;
            }
            else
        {

        }
        return emailll;
        }

    public static boolean validatePhoneNumber(String number){
        boolean xz= false;
        String phone= number;
        String pattern= "^((\\+[1-9]?[0-9])|0)?[7-9][0-9]{9}$";
        if(phone.matches(pattern)){
            xz=true;
        }
        else
        {
            //do something
        }
        return xz;

    }
    public static boolean validatePassword(String pass){
        boolean isvalid= false;
        String password= pass;
        String pattern= "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}";
        if(password.matches(pattern)){
            isvalid= true;
        }

        return isvalid;
    }
    //public static boolean confirmPassword(String pass){
      //  boolean confirmed= false;

         //   confirmed=true;
       // }

      // return confirmed;
   // }

}
