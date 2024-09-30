import java.util.*;
class NamesValidation{
    Scanner sc=new Scanner(System.in);
    // Validate First Name 
    public  boolean checkFirstName() {
        System.out.print("Enter your First Name : ");
        String firstName = sc.next();//"2443223234";

        if(firstName==null || firstName.isEmpty() || firstName=="\\S"){
            return false;
        }
        else{
            return firstName.matches("[a-zA-Z]{3,15}");
        }
    }
     //Validate Last Name
    public  boolean checkLastName() {
        System.out.print("Enter your Last Name : ");
        String lastName = sc.next();//"Whislin";
        if(lastName==null || lastName.isEmpty() || lastName=="\\S"){
            return false;
        }
        else{ 
            return lastName.matches("[a-zA-Z]{3,15}");
        }
    }


}