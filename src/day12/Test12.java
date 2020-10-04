package day12;

public class Test12 {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));// → 7
        System.out.println(teenSum(10, 13));// → 19
        System.out.println(teenSum(13, 2));// → 19

        System.out.println(fizzString("fig"));// → "Fizz"
        System.out.println(fizzString("dib"));// → "Buzz"
        System.out.println(fizzString("fib"));// → "FizzBuzz"

        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// →true

        System.out.println(theEnd("Hello", true));// → "H"
        System.out.println(theEnd("Hello", false));// → "o"
        System.out.println(theEnd("oh", true));// → "o"

        System.out.println(endsLy("oddly"));// → true
        System.out.println(endsLy("y"));// → false
        System.out.println(endsLy("oddy"));// → false

        System.out.println(seeColor("redxx"));// → "red"
        System.out.println(seeColor("xxred"));// → ""
        System.out.println(seeColor("blueTimes"));// → "blue"

        System.out.println(extraFront("Hello"));// → "HeHeHe"
        System.out.println(extraFront("ab"));// → "ababab"
        System.out.println(extraFront("H"));// → "HHH"

        System.out.println(extraEnd("Hello"));// → "lololo"
        System.out.println(extraEnd("ab"));// → "ababab"
        System.out.println(extraEnd("Hi"));// → "HiHiHi"

        System.out.println(withoutEnd("Hello"));// → "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin"

        System.out.println(left2("Hello"));// → "lloHe"
        System.out.println(left2("java"));// → "vaja"
        System.out.println(left2("Hi"));// → "Hi"

        System.out.println(diff21(19));// → 2
        System.out.println(diff21(10));// → 11
        System.out.println(diff21(21));// → 0
        System.out.println(diff21(22));// → 2

        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90));// → true
        System.out.println(nearHundred(89));// → false
    }

    private static boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10;
    }

    private static int diff21(int a) {
        if (a > 21) {
            return (a - 21) * 2;
        } else {
            return 21 - a;
        }
    }

    private static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static String extraEnd(String str) {
        return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
    }

    private static String extraFront(String str) {
        if (str.length() == 1) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    private static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    private static String theEnd(String strLength, boolean front) {
        if (front) {
            return strLength.substring(0, 1);
        } else {
            return strLength.substring(strLength.length() - 1);
        }
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (c > a && bOk) {
            return true;
        } else if (b > a && c > b) {
            return true;
        }
        return false;
    }

    private static String fizzString(String str) { // startsWith endsWith
        if (str.substring(0, 1).equals("f") && str.substring(str.length() - 1).equals("b")) {
            return "FizzBuzz";
        } else if (str.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (str.substring(str.length() - 1).equals("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    private static int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return a + b;
        }
    }
}
