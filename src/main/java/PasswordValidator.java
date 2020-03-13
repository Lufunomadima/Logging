import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PasswordValidator {

    // Create a Logger
    private static final Logger myLog = LogManager.getLogger(PasswordValidator.class.getName());

    //  to check whether a password is valid or not
    public static boolean passwordIsValid(String password) throws InvalidPasswordException {

        try {
            boolean upperCase = false;
            boolean lowerCase = false;
            boolean digit = false;
            boolean specialChar = false;
            int count = 0;

            // for checking if password Exist
            if (password.length() > 0) {
                count++;
            } else { throw new InvalidPasswordException(1);

            }
            // for checking if password has at least 8 characters
            if (((password.length() >= 8)) && password.length() > 0) {
                count++;
            } else{ throw  new InvalidPasswordException(2);
            }

            // for checking if password has at least one lowercase letter
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase((password.charAt(i)))) {
                    lowerCase = true;
                    count++;
                    break;
                }
            }
            // for checking if password has at least one uppercase letter
            for (int i = 0; i < password.length(); i++) {
                char alpha = password.charAt(i);
                if (Character.isUpperCase(alpha)) {
                    upperCase = true;
                    count++;
                    break;
                }
            }
            // for checking if password has at least one digit
            for (int i = 0; i < password.length(); i++) {
                char number = password.charAt(i);
                if (Character.isDigit(number)) {
                    digit = true;
                    count++;
                    break;
                }
            }
            //for checking if password has at least one special character
            for (int i = 0; i < password.length(); i++) {
                char special = password.charAt(i);
                if (!Character.isLetterOrDigit(special)) {
                    specialChar = true;
                    count++;
                    break;
                }
            }
            if (!lowerCase) {
//                myLog.error("password should have at least one lowercase letter");
                throw new InvalidPasswordException(3);
            }
            if (!upperCase) {
//                myLog.error("password should have at least one uppercase letter");
                throw new InvalidPasswordException(4);
            }
            if (!digit) {
//                myLog.error("password should at least have one digit");
                throw new InvalidPasswordException(5);
            }
            if (!specialChar) {
//                myLog.error("password should have at least one special character");
                throw new InvalidPasswordException(6);
            }

            if (count >= 3) {
                myLog.debug("valid");
            return true;
}
        } catch (InvalidPasswordException e) {
            myLog.error(e.getMessage());
            myLog.error( e.printMessage());
        }
        return false;
    }

        public static boolean passwordIsOk(String password) throws InvalidPasswordException {
        boolean result = passwordIsValid(password);

        if(result) {
        myLog.debug("User Password is Ok");
        return true;
    }
        myLog.error(" User Password is not ok");
        return false;
     }

            }
