import java.util.Scanner;
import java.util.regex.*;
class PasswordValidation{
    Scanner sc=new Scanner(System.in);
     //Validate Password
    public boolean checkPassword(){
        System.out.print("Enter password:");
        String password=sc.next();//"hudsha@12";
        String passwordregex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,20}$";
        Pattern p=Pattern.compile(passwordregex);
        return p.matcher(password).matches();
    }
}