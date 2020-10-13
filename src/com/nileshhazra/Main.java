package com.nileshhazra;
import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Mortgage Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float Rate = scanner.nextFloat();
        System.out.print("Period(Years): ");
        int periodInYears = scanner.nextInt();

        double monthlyInterestRate = (Rate/12)/100;
        int numberOfPayments = periodInYears*12;
        double mortgage = principal*((monthlyInterestRate*(Math.pow(1+monthlyInterestRate, numberOfPayments)))/(Math.pow(1+ monthlyInterestRate, numberOfPayments)-1));
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + formattedMortgage);
    }
}
