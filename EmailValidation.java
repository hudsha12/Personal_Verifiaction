import java.util.Scanner;
import java.util.regex.*;
class EmailValidation{
    Scanner sc=new Scanner(System.in);
     // Validate Email 
    public boolean checkEmail() {
        System.out.print("Enter email: ");
        String email=sc.next();//"whis@gmail.com";
        String emailRegex = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern p = Pattern.compile(emailRegex);
        return p.matcher(email).matches();
    }
}