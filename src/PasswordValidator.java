public class PasswordValidator implements Validator {
    @Override
    public boolean isValid(String input) {
        if (input.length() >= 8) {
            System.out.println("1");
            return true;

        } else
            System.out.println("0");
            return false;
    }
}
