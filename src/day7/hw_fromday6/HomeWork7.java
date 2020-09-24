package day7.hw_fromday6;

public class HomeWork7 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4)); // → true
        System.out.println(love6(4, 5)); //→ false
        System.out.println(love6(1, 5)); //→ true
    }

    private static boolean love6(int a, int b) {
        int sum = a + b;
        int difference = Math.abs(a - b);
        return a == 6 || b == 6 || sum == 6 || difference == 6;

    }
}
