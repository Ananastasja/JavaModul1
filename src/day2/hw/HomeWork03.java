package day2.hw;

public class HomeWork03 {
    public static void main(String[] args) {
        int cubeSide = 10;
        square(cubeSide);
        perimeter(cubeSide);
    }
    public static void square (int a) {
        System.out.println("Площадь куба равна - " + 6 * (a * a));
    }
    public static void perimeter (int a) {
        System.out.println("Периметр куба равен - " + 12 * a);
    }
}
