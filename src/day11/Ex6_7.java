package day11;

public class Ex6_7 {
    public static void main(String[] args) {
//        System.out.println(twoAsOne(1, 2, 3)); //→ true
//        System.out.println(twoAsOne(3, 1, 2)); //→ true
//        System.out.println(twoAsOne(3, 2, 2)); //→ false

        System.out.println(lastDigit(23, 19, 13)); //→ true
        System.out.println(lastDigit(23, 19, 12)); //→ false
        System.out.println(lastDigit(23, 19, 3)); //→ true
        System.out.println(lastDigit(47, 23, 17)); //→ true


    }

    private static boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10) {
            return true;
        }
            return false;
    }

    private static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
}
