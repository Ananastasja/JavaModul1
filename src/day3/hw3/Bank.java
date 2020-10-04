package day3.hw3;

public class Bank {
    public static void main(String[] args) {
        int customerYear = 15;
        bankAccount(500, customerYear, 3.5);
        System.out.println("Сумма через 7 лет: " + bankAcc(1000, 7, 3.5) + " евро");
    }

    private static double bankAcc(double money, int year, double interest) {
        return money * year * interest / 100 + money;
    }

    private static void bankAccount(double money, int year, double interest) {
        double result = interest * year * money / 100 + money;
        System.out.println("Сумма в конце вклада " + result);
    }
}
