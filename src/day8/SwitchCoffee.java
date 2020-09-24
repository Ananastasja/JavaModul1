package day8;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button = 5;//номер кнопки в автомате
        vendingMachine(button);
    }
    public static void coffeeWithMilk () {
        System.out.println("Water is boiling");
        System.out.println("Coffee is meletsya");
        System.out.println("Sour is adding");
    }

    private static void vendingMachine(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Americano is being prepared");
                break;
            case 2:
                System.out.println("Hot water is being prepared");
                break;
            case 3:
                System.out.println("Espresso is being prepared");
                break;
            case 4:
                System.out.println("Cacao is being prepared");
                break;
            case 5:
                coffeeWithMilk();
                break;
            default:
                System.out.println("Please, repeat your choice. Drink number " + choice + " is temporary not available");
                break;


        }
        System.out.println("Программа отработана без ошибок");
    }
}
