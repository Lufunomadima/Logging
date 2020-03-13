import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordTest {
    @Test

   public void passTest() throws InvalidPasswordException {
        assertTrue("Madima@2020", PasswordValidator.passwordIsValid("Madima@2020"));
        assertTrue("Madima@2020", PasswordValidator.passwordIsOk("Madima@2020"));
    }

}
