package chap6;
    /*
    • Enhance the Phone Bill exercise by redoing it in an object-oriented Style.
    • A Phone bill should have an id, base cost, number of allotted minutes, and
    number of minutes used. One should also be able to calculate the overage,
    tax, and total on a Phone bill, and also be able to print an itemized bill.
    • Include the following constructors: default, id-only, all fields. No matter
    which constructor is used, all fields should be set.
    • Create a Class that instantiates a Phone bill and prints the itemized bill.
     */

import java.util.Scanner;

public class PhoneBillCalculatorOOP {
    Scanner scanner = new Scanner(System.in);

    public User newUser(){
        System.out.println("Input user ID: ");
        int id = scanner.nextInt();
        System.out.println("Input plan cost: ");
        double plan = scanner.nextDouble();
        System.out.println("Input the plan's allotted minutes: ");
        int allottedMinutes = scanner.nextInt();
        System.out.println("Input the user's used minutes: ");
        int usedMinutes = scanner.nextInt();

        return new User(id, plan, allottedMinutes, usedMinutes);
    }

    public static void main(String[] args) {
        char choice;
        PhoneBillCalculatorOOP calculator = new PhoneBillCalculatorOOP();
        do{

            User newUser = calculator.newUser();

            newUser.printBill();
            System.out.print("Print new user bill? Y/N ");
            String input = calculator.scanner.next();
            choice = input.charAt(0);

        }while (choice == 'y' || choice == 'Y');

    }


}
