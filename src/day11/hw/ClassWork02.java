package day11.hw;

public class ClassWork02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        findEvenNumber(a, b);
        split();
        System.out.println(findEvenNumberVersionTwo(a, b));
        split();
        findOddNumber(a, b);
        findModuloNumber(a, b);
        System.out.println(checkLeepYear(2020));

    }



    private static void findModuloNumber(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 11 == 0) {
                System.out.println(i + " ");
            }

        }
    }

    private static void findOddNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }

    private static void split() {
        System.out.println("\n");
    }

    private static void findEvenNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static boolean checkLeepYear(int year) {
        return year % 4 == 0;
    }

    private static String findEvenNumberVersionTwo(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + " " + i;
            }

        }
        return result;
    }
}