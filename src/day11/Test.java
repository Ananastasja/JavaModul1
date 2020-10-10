package day11;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c;
        for (int i = 0; i < a; i++) {
            b = b + i;
            c = i + 1;
            System.out.println("c " + c);

        }
        System.out.println("b " + b);
    }
}
