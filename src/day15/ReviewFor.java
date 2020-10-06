package day15;

public class ReviewFor {
    public static void main(String[] args) {
        System.out.println(checkCyrillic("Василий"));
        System.out.println(checkCyrillic("Семен"));
        System.out.println(checkCyrillic("Яна"));
        System.out.println(checkCyrillic("яблоко"));

        printLeapYears(2000, 2009);
        printLeapYears(1900, 2009);
        printLeapYears(2000, 2020);
        System.out.println(checkYear(2000));
        System.out.println(checkYear(2020));
        System.out.println(checkYear(1900));
        System.out.println(checkYear(2001));

        //System.out.println(printDivisors(32));
        myNumber(32);

        printSumInRub(1, 5);

        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// ->true
        System.out.println(checkPalindrom("поп"));// ->true
        System.out.println(checkPalindrom("школа"));// ->false
    }

    private static boolean checkPalindrom(String s) {
        String input = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                input += s.charAt(i);
            }

        }

        String strReverse = "";
        input = input.toLowerCase();
        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);
        }
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)) {
                return false;
            }

        }
        return true;
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + rightWord(i));

        }
    }

    private static String rightWord(int number) {
        String output = "";


        return output;
    }

    public static void myNumber(int number) {
        int count = 0;
        for (int i = number; i >= 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
                count++;

            }

        }
        System.out.println("Total " + count);
    }

    private static void printLeapYears(int year1, int year2) {
        int count = 0;
        for (int i = year1; i <= year2; i++) {
            if (checkYear(i)) {
                count++;
            }
        }
        System.out.println("Quantity " + count);

    }


    public static boolean checkYear(int year) {
        return year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0;
    }

    private static boolean checkCyrillic(String word) {
        /*if (word.toLowerCase().contains("я")){
            return true;
        }*/
        String input = word.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'я') {
                return true;
            }
        }
        return false;
    }
}
