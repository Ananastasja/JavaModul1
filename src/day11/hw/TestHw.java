package day11.hw;

public class TestHw {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21

        System.out.println(in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true

        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
    }

    private static boolean old35(int number) {
        if (number % 3 == 0 ^ number % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        if (n >= 1 && n <= 10 || outsideMode) {
            return true;
        } else {
            return false;
        }
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }
}
