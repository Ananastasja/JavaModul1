package day22;

public class FactorialHello {
    public static void main(String[] args) {
        System.out.println(getFactorial(7)); // 120*6*7
        System.out.println(getFactorial(5)); // ожидаю 120*/

    }


    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            // result = result * i;
            result *= i;
        }
        return result;
    }
}
