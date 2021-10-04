package baseline;

import java.util.Scanner;

import static java.lang.Math.ceil;

public final class PaymentCalculator {
    // Sonar Lint asked for this
    // wanted to have new private constructor
    private PaymentCalculator(){
        throw new IllegalStateException("Utility Class");
    }

   private static final Scanner in = new Scanner(System.in);

    // requirements asking for program to pay off credit card
    // how many months will it take to pay off
    // prompt asking for balance
    // prompt asking for APR
    // prompt asking for the monthly payment
    // return int number of months needed with ciel
     static int calculateMonthsUntilPaidOff() {
        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        in.nextLine();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = in.nextDouble();
        in.nextLine();
        System.out.print("What is the monthly payment you can make? ");
        double payment = in.nextDouble();
        in.nextLine();

        double dailyRate = apr / 365.0 / 100.0;
        // Formula provided by constraints
        return (int) ceil((-1.0 / 30.0) * Math.log(1.0 + (balance / payment * (1.0 - Math.pow(1.0 + dailyRate, 30.0)))) / Math.log(1.0 + dailyRate));
    }
}
