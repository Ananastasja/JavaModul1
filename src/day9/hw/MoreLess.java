package day9.hw;

public class MoreLess {
    public static void main(String[] args) {
        moreOrLess(5, 6);// -> 6
        moreOrLess(5, 5);// -> 0
        moreOrLess(0, 100);// -> 100
        split();
        mySum(5, 6, 5); //-> 6
        mySum(5, 6, 7); //-> 18
        mySum(0, 0, 0); //-> 0
        mySum(0, -5, 5); //-> -1
        split();

    }


    private static void split() {
        System.out.println("--------------------");
    }

    private static void mySum(int a, int b, int c) {
        int d = a + b + c;
        if (a == c) {
            System.out.println(b);
        } else if (a + b + c == 0) {
            System.out.println("-1");
        } else if (a + b + c == d) {
            System.out.println(d);
        } else {
            System.out.println("No result");
        }
    }

    private static void moreOrLess(int a, int b) {
        if (a > b) {
            System.out.println(a);

        } else if (b > a) {
            System.out.println(b);

        } else if (a == b) {
            System.out.println("0");

        } else {
            System.out.println("Error");
        }
    }
}
