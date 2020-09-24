package day3.hw3;

public class Bank {
    public static void main(String[] args) {
        int customerYear = 15;
        bankAccount (500, customerYear, 3.5);
    }

    private static void bankAccount(double money, int year, double interest) {
        double result = interest * year * money / 100 + money;
        System.out.println("Сумма в конце вклада " + result);
    }
}
