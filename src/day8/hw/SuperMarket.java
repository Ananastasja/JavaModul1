package day8.hw;

public class SuperMarket {
    public static void main(String[] args) {
        int customer1 = 17;
        System.out.println(alcohol(customer1));
    }

    private static String alcohol(int age) {
        String output = "";

        switch (age) {
            case 10:
                output = "Нельзя продавать алкоголь";
                break;

            case 17:
                output = "Можно продавать слабоалкогольные напитки";
                break;

            case 18:
                output = "Можно продавать алкоголь";
                break;

            case 20:
                output = "Можно продавать алкоголь";
                break;

            case 30:
                output = "Можно продавать алкоголь";
                break;

            default:
                output = "Возраст не указан";
                break;

        }

        return output;
    }
}
