public class EmailValidator implements Validator {


    @Override
    public boolean isValid(String input) {
        int atIndex = input.indexOf('@');
        int dotIndex = input.lastIndexOf('.');
        System.out.println(dotIndex+atIndex);
        return atIndex > 0 && dotIndex > atIndex;

    }

}
