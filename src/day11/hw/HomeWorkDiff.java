package day11.hw;

public class HomeWorkDiff {
    public static void main(String[] args) {
        findPrimeNumber(1, 10);
        System.out.println(checkPrime(10));
        System.out.println(checkPrime(1));
    }

    private static void findPrimeNumber(int a, int b) {
        for (int i = a; i < b; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " Not a prime number");

                }

            }

        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }


            }
        return true;
    }
}
