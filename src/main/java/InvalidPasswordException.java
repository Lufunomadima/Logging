public class InvalidPasswordException extends Exception {
    int passwordConditionViolated = 0;

    public InvalidPasswordException(int conditionViolated)
    {
    super("Invalid Password: ");
        passwordConditionViolated = conditionViolated;
    }

    public String printMessage() throws InvalidPasswordException
    {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (passwordConditionViolated) {
            // Password should exist
            case 1:
                return "password should exist";
            // Password length should be at least 8 characters
            case 2:
                return "password should be longer than than 8 characters";

            // Password should contain at leas one lowercase letter(a-z)
            case 3:
                return "password should have at least one lowercase letter";

            // Password should contain at least one uppercase letter(A-Z)
            case 4:
                return "password should have at least one uppercase letter";

            // Password should contain at least one digit(0-9)
            case 5:
                return "password should at least have one digit";

           // Password should contain at least one special character ( @, #, %, &, !, $ )
            case 6:
                return "password should have at least one special character";
        }

        return ("");
    }
}

