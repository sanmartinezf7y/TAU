package JavaProgramming.chap6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        chap6.Rectangle kitchen = calculator.getRoom();
        chap6.Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen,bathroom);

        System.out.println("total area = " + area);
        calculator.scanner.close();
    }

    public chap6.Rectangle getRoom(){

        System.out.println("Input room length:");
        double length = scanner.nextDouble();
        System.out.println("Input room width: ");
        double width = scanner.nextDouble();


        return new chap6.Rectangle(length,width);
    }

    public double calculateTotalArea(chap6.Rectangle rectangle1, chap6.Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }


}
