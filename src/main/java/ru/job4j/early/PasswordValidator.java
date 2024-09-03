package ru.job4j.early;

public class PasswordValidator {

    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};
    private static final String CORRECT_UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String CORRECT_LOWCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String CORRECT_DIGIT_CHARS = "0123456789";
    private static final String CORRECT_SPECIAL_CHARS = "$!\"#%&\'()*+-/,.:;><=?@[]^_{}|~";

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw  new IllegalArgumentException("Password should be length [8, 32]");
        }
        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            if (CORRECT_UPPERCASE_CHARS.contains(String.valueOf(password.charAt(i)))) {
                hasUpCase = true;
            }
            if (CORRECT_LOWCASE_CHARS.contains(String.valueOf(password.charAt(i)))) {
                hasLowCase = true;
            }
            if (CORRECT_DIGIT_CHARS.contains(String.valueOf(password.charAt(i)))) {
                hasDigit = true;
            }
            if (CORRECT_SPECIAL_CHARS.contains(String.valueOf(password.charAt(i)))) {
                hasSpecial = true;
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!hasDigit) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String s : FORBIDDEN) {
            if (password.toLowerCase().contains(s)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}
