package day11;

public class HomeWork12_14 {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21
        split();
        System.out.println(in1To10(5, false));// → true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
        split();
        System.out.println(old35(3));// → true
        System.out.println(old35(10)); //→ true
        System.out.println(old35(15)); //→ false
        split();
//        int a = 1900;
//        int b = 2020;
//        System.out.println(leepYearReturn(a, b));
        System.out.println(leepYear(2013));
        split();

    }

   /* private static String leepYearReturn(int first, int second) {
        String year = "";
        for (int i = first; i <= second; i++) {
            if (i % 4 == 0) {
                year = year + " " + i;
            }

        }
        return year;
    }*/

    private static boolean leepYear(int year) {
        if (year == 1900) {
            return false;
        }
        if (year % 4 == 0 || year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        }
        return false;
    }

    private static void split() {
        System.out.println("-------------");
    }

    private static boolean old35(int a) {
        return a % 3 == 0 ^ a % 5 == 0;
    }

    private static boolean in1To10(int n, boolean outsideMode) {
        if (n <= 1 || n >= 10 && outsideMode) {
            return true;
        }
        return n <= 10;
    }

    private static int sortaSum(int a, int b) {
        if (a + b >= 10 && a + b <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }
}
