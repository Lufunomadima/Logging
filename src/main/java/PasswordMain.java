
import javax.swing.*;

public class PasswordMain {
    public static void main(String[] args) throws InvalidPasswordException {
        PasswordValidator pass = new PasswordValidator();
//        System.out.println("Enter Password");
//        Scanner sc = new Scanner(System.in);
//        String myPassword = sc.nextLine();


        String myPassword = JOptionPane.showInputDialog("Please enter Password");
         boolean isValid = false;
        System.out.println("Is Password "
                + myPassword + " valid?");

         isValid = pass.passwordIsOk(myPassword);

        System.out.println(isValid);


    }

}
