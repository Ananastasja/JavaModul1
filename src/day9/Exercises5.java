package day9;

public class Exercises5 {
    public static void main(String[] args) {
        //happyPelmen();
        //moduloThree();
        //myLine(100);
        mySecondLine(1000);
    }

    private static void mySecondLine(int i) {
        //1 2 4 8 16 32 64 128 256 512
        for (int j = 1; j < i; j = j * 2) {
            System.out.println(j);

        }
    }

    private static void myLine(int i) {
        for (int j = 7; j < i; j = j + 7) {
            System.out.print(" " + j);

        }
    }

    private static void moduloThree() {
        int testDigit = 3;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            }

        }
    }

    private static void happyPelmen() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Happy Pelmen!");
                break;
            }
            System.out.println("Shag cycla " + i);
        }
    }
}
