package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //•	6 – 10 characters (inclusive);
        //•	Consists only of letters and digits;
        //•	Have at least 2 digits.
        if (isValidCountOfDigits(password) && (isValidContentOfPassword(password) && (isValidNumberOfCharacters(password)))) {
            System.out.println("Password is valid");
        }
        if (!isValidNumberOfCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isValidContentOfPassword(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isValidCountOfDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean isValidNumberOfCharacters(String text) {
        if (text.length() >= 6 && text.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValidContentOfPassword(String text) {
        for (char symbol : text.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;

    }

    private static boolean isValidCountOfDigits(String text) {
        int countOfDigits = 0;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countOfDigits++;
            }
        }
            return countOfDigits >= 2;

        }
    }

