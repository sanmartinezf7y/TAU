package chap6;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaRoom1 = room1.calculateArea();
        double perimeterRoom1 = room1.calculatePerimeter();

        Rectangle room2 = new Rectangle(15, 30);
        double areaRoom2 = room2.calculateArea();
        double perimeterRoom2 = room2.calculatePerimeter();

        double totalArea = areaRoom2 + areaRoom1;
    }
}
