import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
    public static int calculatePasswordStrength(String password) {
        // Initialize the strength score
        int strength = 0;

        // Check the length of the password
        if (password.length() >= 8) {
            strength += 5;
        }

        // Check if the password contains both uppercase and lowercase letters
        if (containsUppercase(password) && containsLowercase(password)) {
            strength += 10;
        }

        // Check if the password contains digits
        if (containsDigits(password)) {
            strength += 10;
        }

        // Check if the password contains special characters
        if (containsSpecialCharacters(password)) {
            strength += 10;
        }

        // Check if the password avoids common patterns (e.g., "password", "123456", etc.)
        if (!isCommonPattern(password)) {
            strength += 10;
        }

        return strength;
    }

    private static boolean containsUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    private static boolean containsLowercase(String password) {
        return password.matches(".*[a-z].*");
    }

    private static boolean containsDigits(String password) {
        return password.matches(".*\\d.*");
    }

    private static boolean containsSpecialCharacters(String password) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]+");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean isCommonPattern(String password) {
        String[] commonPatterns = {
            "password", "123456", "qwerty", "admin", "welcome"
        };

        for (String pattern : commonPatterns) {
            if (password.equalsIgnoreCase(pattern)) {
                return true;
            }
        }

        return false;
    }
}
