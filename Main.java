public class Main {
    public static void main(String[] args) {
    
        NamesValidation  nameverify=new NamesValidation();
        EmailValidation emailverify=new EmailValidation();
        MobileValidation mobileverify=new MobileValidation();
        PasswordValidation passwordverify=new PasswordValidation();
        boolean validinput=false;
        while(!validinput){
            while (true){
                if(!nameverify.checkFirstName()){
                    System.out.println("Status: 'Error', Message: 'Invalid'");
                    continue;
                }
                break;
            }
            while(true){
                if(!nameverify.checkLastName()){
                    System.out.println("Status: 'Error', Message: 'Invalid'");
                    continue;
                }
                break;
            }
            while(true){
                if(!mobileverify.checkMobileNumber()){
                    System.out.println("Status: 'Error, Message: 'Invalid'");
                    continue;
                }
                break;
            }
            while(true){
                if(!emailverify.checkEmail()){
                    System.out.println("Status: 'Error'  Message: 'Invalid'");
                    continue;
                }
                break;
            }
            while(true){
                if(passwordverify.checkPassword()){
                    System.out.println("Status: 'Error'  Message: 'Invalid' ");
                    continue;
                }
                break;
            }
            validinput=true;
        }

        if(validinput==true){
            System.out.println("Verification Success");
        }
    }
}