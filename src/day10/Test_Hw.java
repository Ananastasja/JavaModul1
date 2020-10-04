package day10;

public class Test_Hw {
    public static void main(String[] args) {
        int min = 1;//нечетные; int min = 0 - четные
        int max = 100;
        findEvenNumber(min, max);
        findModulo(min, max);
        findYear(1950, 2020);
        simpleNumber();
        myModulo();
        findYearTwo();
    }

    private static void findYearTwo() {
        for (int i = 1900; i <= 2020; i++) {
            if (i % 100 == 0 && i % 400 == 0) {
                System.out.println(i);
            }
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

    }

    private static void myModulo() {
        for (int i = 0; i < 3000; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println("Chislo " + i);
            }


        }
    }

    private static void simpleNumber() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.println(i);
            }

        }
    }

    private static void findYear(int firstYear, int lastYear) {
        for (int i = firstYear; i <= lastYear; i++) {
            if (i % 4 == 0) {
                System.out.println("Високосный год " + i);
            }

        }
    }

    private static void findModulo(int first, int last) {
        for (int i = first; i <= last; i++) {
            if (i % 11 == 0) {
                System.out.println(i);
            }
        }

    }

    private static void findEvenNumber(int first, int last) {
        for (int i = first; i <= last; i += 2) {
            System.out.println(i);
        }
    }
}
