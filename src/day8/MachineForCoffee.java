package day8;

public class MachineForCoffee {
    public static void latte() {
        System.out.println("-----------");
        System.out.println("We are created latte for you");
        System.out.println("------------");
        milk(40);
        coffee(30);
        water(70);
    }

    public static void cappuccino() {
        System.out.println("-----------");
        System.out.println("We are created cappuccino for you");
        System.out.println("------------");
        milk(30);
        coffee(40);
        water(20);
    }

    public static void americano() {
        System.out.println("-----------");
        System.out.println("We are created americano for you");
        System.out.println("------------");
        //milk(40);
        coffee(40);
        water(10);
    }

    public static void water(int ml) {
        System.out.printf("Added %d ml of water \n", ml);

    }

    private static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n", ml);

    }

    private static void coffee(int ml) {
        System.out.printf("Added %d ml of coffee \n", ml);

    }
}
