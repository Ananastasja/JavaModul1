package day4;

public class SquareCircle {
    public static void main(String[] args) {
        double radius = 10;
        System.out.println(findCF(radius));
    }

    private static double findCF(double myRadius) {
        return 2 * Math.PI * myRadius;
        //no description in this method
    }
}
