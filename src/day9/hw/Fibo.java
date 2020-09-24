package day9.hw;

public class Fibo {
    public static void main(String[] args) {
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo3;
        System.out.print(fibo1 + " " + fibo2 + " ");
        for (int i = 0; i < 9; i++) {
            fibo3 = fibo1 + fibo2;
            System.out.print(fibo3 + " ");
            fibo1 = fibo2;
            fibo2 = fibo3;

        }
    }
}
