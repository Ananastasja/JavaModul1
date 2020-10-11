package day22;

public class HelloFibo {
    public static void main(String[] args) {
        //findFibonacciNormal(7) ;
        System.out.println(findFibonacciRecursion(7));
    }

    private static int findFibonacciRecursion(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            // предыдущее значение + значение перед ним
            return findFibonacciRecursion(number - 1)
                    + findFibonacciRecursion(number - 2);
        }
    }
}
