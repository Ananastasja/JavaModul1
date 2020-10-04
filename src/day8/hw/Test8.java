package day8.hw;

public class Test8 {
    public static void main(String[] args) {
        int custAge = 17;
        System.out.println(customerAge(custAge));
    }

    private static String customerAge(int age) {
        String output = "";
        switch (age) {
            case 10:
                output = "No alco";
                break;
            case 17:
                output = "Slaboalcohol";
                break;
            case 18:
                output = "Can sell";
                break;
            case 20:
                output = "Can sell";
                break;
            case 30:
                output = "Can sell";
                break;
            default:
                output = "No age mentioned";
        }
        return output;
    }
}
