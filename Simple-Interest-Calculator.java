package com.codewithme;

import java.text.NumberFormat;
import java.util.Scanner;

public class Build {
    public static void main(String[] args) {
        NumberFormat number = NumberFormat.getCurrencyInstance();
        NumberFormat secondNumber = NumberFormat.getPercentInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your principal amount: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the time duration of the amount: ");
        float time = scanner.nextFloat();
        float maineTime = time * 12;

        System.out.print("Enter rate: ");
        float rate = scanner.nextFloat();
        float mainRate = rate / 100;

        float simpleInterest =  principal * mainRate * maineTime / 100;
        String mainSimpleInterest = number.format(simpleInterest);

        System.out.println("Note that the time will be recorded in months so 2 years == 24 months " +
                "and the rate will be measured in percentage like 15% == .15 ");
        System.out.println("The simple interest is: " + mainSimpleInterest);

    }
}
