package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Jonah Fernandez
 */


import java.text.MessageFormat;
// Main Class driving our application
// Print statement with months returned
public class Solution26 {
    public static void main(String[] args) {

        int months = PaymentCalculator.calculateMonthsUntilPaidOff();
        System.out.println(MessageFormat.format("It will take you {0} months to pay off this card", months));

    }
    // declare separate method to do calculations
    // use formula: n = -(1/30) * log(1 +b/p * (1 - (1 + i)^30)) / log(1 +i)
    // n is number of months
    // i is daily rate APR/365
    // p is the monthly payment
}
