package day2.hw;

public class HomeWork03_2 {
    public static void main(String[] args) {
        int firstSide = 10;
        int secondSide = 10;
        int thirdSide = 10;
        square(firstSide, secondSide, thirdSide);
        perimeter(firstSide);
    }
    public static void square (int a, int b, int c) {
        System.out.println("Площадь куба равна - " + (a * b + b * c + a * c) * 2);
    }
    public static void perimeter (int a) {
        System.out.println("Периметр куба равен - " + 12 * a);
    }
}
