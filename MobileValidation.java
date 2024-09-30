import java.util.Scanner;
class MobileValidation{
    Scanner sc=new Scanner(System.in);
   
    public boolean checkMobileNumber() {
        System.out.print("Mobile Number:");
        String mobileNumber= sc.next();//"7550386695";
         // Validate Mobile Number 
        return mobileNumber.matches("(0|91)?[789]\\d{9}");
    }

}