package day22;

public class HelloRecursion {
    public static void main(String[] args) {

        //System.out.println(getFactorialRecursion(7));
        System.out.println(getFactorialRecursion(5));
        // 100! = 99! * 100;
        // 7! = 7 * 6!
        // 6! = 6 * 5!
        // 2! = 2 * 1
    }

    private static int getFactorialRecursion(int number) {
        if (number < 1) {
            return 1;
        } else {
            return number * getFactorialRecursion(number - 1);
        }
    }
}
