package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution25 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // driver code in main asking for password prompt
        // password strength will be int used to return test case number
        System.out.print("Password:");
        int passwordStrength = passwordValidator(in.nextLine());

        String output = outputCases(in.nextLine(), passwordStrength);

        System.out.println(output);
    }
    // boolean method passwordValidator to return
    // true or false, regex will be used to detect symbols
    // chars and other things within the code that will give strength

    public static int passwordValidator(String password) {
        // Boolean values to hold cases that will be
        // returned and iterated through if tree
        // strong password will have the top case with
        // all && conditionals met to give a very strong password
        boolean hasLetter = hasLetter(password);
        boolean hasNumber = hasNumber(password);
        boolean has8 = has8(password);
        boolean hasSymbol = hasSymbol(password);

        // Tree to determine strength of password
        // Returns cases for singular output
        // Very strong password meets all requirements
        // if else regarded as better used for boolean conditions
        // switch statements used better for fixed data
        if (hasSymbol && has8 && hasLetter && hasNumber){
            return 4;
        // Strong password meets all but 1 requirement
        } else if (hasNumber && hasLetter && has8) {
            return 3;
        // Weak password only contains letters less than 8 chars
        } else if (hasLetter) {
            return 2;
        // Very Weak password only has numbers and less than 8 chars
        } else if (hasNumber) {
              return 1;
            }
         else return 0;
    }
    // Matcher method invoked
    // The find method scans the input sequence
    // looking for the next subsequence that matches the pattern
    // returns boolean success or failure for hasLetter pattern for password
    public static boolean hasLetter(String password){
        Pattern regex = Pattern.compile(".[a-z]");
        Matcher matcher = regex.matcher(password);
        return matcher.find();
    }
    // Matcher method invoked
    // The find method scans the input sequence
    // looking for the next subsequence that matches the pattern
    // returns boolean success or failure for hasNumber pattern for password
    public static boolean hasNumber(String password){
        Pattern regex = Pattern.compile(".[0-9]");
        Matcher matcher = regex.matcher(password);
        return matcher.find();
    }
    // Method returns success or failure if
    // password is greater than or equal to 8
    // operates independently
    public static boolean has8(String password){
        return password.length() >= 8;
    }
    // Matcher method invoked
    // The find method scans the input sequence
    // looking for the next subsequence that matches the pattern
    // returns boolean success or failure for hasSymbol pattern for password
    public static boolean hasSymbol(String password){
        Pattern regex = Pattern.compile(".[^a-z0-9]");
        Matcher matcher = regex.matcher(password);
        return matcher.find();
    }
    // Method to generate singular output while meeting the constraints
    // Taking in testPassword to test, also taking in int case
    // switch replaces the if else here as they're taken in as fixed data values
    public static String outputCases(String testPassword, int passwordStrength) {
        return switch (passwordStrength) {
            case 4 -> String.format("The password '%s' is a very strong password." ,testPassword);
            case 3 -> String.format("The password '%s' is a strong password." ,testPassword);
            case 2 -> String.format("The password '%s' is a weak password.", testPassword);
            case 1 -> String.format("The password '%s' is a very weak password.",testPassword);
            default -> String.format("The password '%s' is of unknown strength.",testPassword);
        };

    }
}

