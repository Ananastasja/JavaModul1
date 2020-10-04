package day2.hw;

public class HomeWorkNew {
    public static void main(String[] args) {
        int firstSide = 5;
        int secondSide = 10;
        System.out.println(squareRectangle(firstSide, secondSide));
        System.out.println(perimeterRectangle(firstSide, secondSide));
        System.out.println(squareCube(firstSide));
        System.out.println(perimeterCube(firstSide));
    }

    private static int perimeterCube(int a) {
        return 12 * a;
    }

    private static int squareCube(int a) {
        return 6 * (a * a);
    }

    private static int perimeterRectangle(int a, int b) {
        return (a + b) * 2;
    }

    private static int squareRectangle(int a, int b) {
        return a * b;
    }
}
