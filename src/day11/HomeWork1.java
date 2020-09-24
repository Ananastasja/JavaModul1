package day11;

public class HomeWork1 {
    public static void main(String[] args) {
        evenNumber(100);
        oddNumber(100);
        myNewNumber(100);
    }

    private static void myNewNumber(int c) {
        for (int i =11; i < 100; i++) {
            if (i % 11 == 0) {
                System.out.print(i + " ");

            }

        }


    }

    private static void oddNumber(int b) {
        for (int i = 1; i < b; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
    }

    private static void evenNumber(int a) {
        for (int i = 0; i < a; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println("\n");
    }
}
