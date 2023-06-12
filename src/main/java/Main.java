import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the input string as a command-line argument.");
            return;
        }

        String input = args[0];

        boolean isMatch = validatePassword(input);
        System.out.println("Match: " + isMatch);
    }

    public static boolean validatePassword(String password) {
        // Maximum 8 characters long
        // At least one uppercase, one lowercase, one digit, one special character
        // No whitespace
        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{1,8}$";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(password);
        return matcher.matches();
    }
}
