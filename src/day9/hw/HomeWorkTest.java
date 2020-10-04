package day9.hw;

public class HomeWorkTest {
    public static void main(String[] args) {
        System.out.println(moreOrLess(5, 6));// -> 6
        System.out.println(moreOrLess(5, 5));// -> 0
        System.out.println(moreOrLess(0, 100));// -> 100
        split();
        System.out.println(mySum(5, 6, 5));// -> 6
        System.out.println(mySum(5, 6, 7));// -> 18
        System.out.println(mySum(0, 0, 0));// -> 0
        System.out.println(mySum(0, -5, 5));// -> -1
        split();
        char a = 65;
        char b = 90;
        //englishLetters(a, b);
        //englishLettersTwo(a, b);
        System.out.println(englishLettersThree(a, b));
        // 1 1 2 3 5 8 13 21 34 55 89 и т.д.
        System.out.println(sleepIn(false, false));// → true
        System.out.println(sleepIn(true, false));// → false
        System.out.println(sleepIn(false, true));// → true
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    private static String englishLettersThree(char a, char b) {
        String myLetter = "";
        for (char i = 'A'; i <= 'Z'; i++) {
            myLetter = myLetter + "\n" + i + i + i + i;

        }
        return myLetter;
    }

    private static void englishLettersTwo(char a, char b) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println("" + i + i + i + i);

        }
    }

    private static void englishLetters(char first, char last) {
        for (int i = first; i <= last; i++) {
            char temp = (char) i;
            System.out.println("" + temp + temp + temp + temp);
        }
    }

    private static int mySum(int a, int b, int c) {
        if (a == c) {
            return b;
        } else if (a + b + c == 0) {
            return -1;
        } else {
            return a + b + c;
        }//if (a == c) return b;
        //else if (a + b + c == 0) return -1;
       // else return a + b + c;
    }

    private static void split() {
        System.out.println("-----------");
    }

    private static int moreOrLess(int a, int b) {
        if (a == b) {
            return 0;
        }
        return Math.max(a, b);

    }
}
