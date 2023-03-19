package JavaProgramming;

import java.util.Scanner;

public class PhoneBill5b {
    /*
    Calculate the final total of someone's cell Phone bill.
Allow the operator to input the plan fee and the number of overage minutes.
Charge the user 0.25 for every minute they were over their plan, and 15% tax on
the subtotal.
Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.
     */

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Input the plan fee:");
        double planFee = scanner.nextDouble();
        System.out.println("Now, input the user's overage minutes:");
        int overageMinutes = scanner.nextInt();
        scanner.close();
        double overageCost = calculateOverage(overageMinutes);
        double subtotal = planFee + overageCost;
        double tax = calculateTax(subtotal);
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage Minutes: $" + overageCost);
        System.out.println("Subtotal: $"+ subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (subtotal+tax) );

    }

    public static double calculateOverage(int overage){
        double costPerMinute = 0.25;
        double overageCost = costPerMinute*overage;
        return overageCost;
    }

    public static double calculateTax(double subtotal){
        double taxRate = 0.15;
        double tax = taxRate*subtotal;
        return tax;
    }




}
