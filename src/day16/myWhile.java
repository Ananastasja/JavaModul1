package day16;

public class myWhile {
    public static void main(String[] args) {
        whileLoop();
        myDoWhile();
    }

    private static void myDoWhile() {
        int a = 10;
        do {
            System.out.println(a);
            a++;
        } while (a < 9);
    }

    private static void whileLoop() {
        int a = 10;
        while (a < 20) {
            System.out.println(a);
            a++;
        }
    }
}
