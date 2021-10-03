package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jonah Fernandez
 */

// Going to have to w
import java.text.MessageFormat;
import java.util.Arrays;

import java.util.Scanner;

public class Solution24 {
    // Scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Method to get Anagrams
        // Method to compare strings of the anagrams
        // Use a boolean method to compare strings possibly in an array?
        // an array sort method possibly
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String str1 = in.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = in.nextLine();
        // regex to remove all whitespace
        str1 = str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

         if(isAnagram(str1,str2))
             System.out.println(MessageFormat.format("\"{0}\" and \"{1}\" are anagrams.",str1,str2));
    }

    // Method using boolean true false to check
    // comparing length of both strings
    // if strings arent equal return false.
    // if strings have the same contents return true
    // using arrays to compare elements inside of arrays with .sort java function
        private static boolean isAnagram(String str1, String str2){
            if(str1.length() != str2.length())
                return false;
            else
            {
                char[] str1Array = str1.toCharArray();
                char[] str2Array = str2.toCharArray();

                Arrays.sort(str1Array);
                Arrays.sort(str2Array);

                return Arrays.equals(str1Array,str2Array);
            }

        }


}
