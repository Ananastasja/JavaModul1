package day2;

public class DayTwo {
    public static void main(String[] args) {
        getMeCoffee();
    }
    public static void getMeCoffee () {
        System.out.println("Рецепт создания кофе:");
        getWaterToCoffee();
        getMeCoffeetoCoffee();
    }
    public static void getMeCoffeetoCoffee () {
        System.out.println("Насыпь 5 грамм кофе в стаканчик.");
    }
    public static void getWaterToCoffee () {
        System.out.println("Налей кипяток в стаканчик.");
    }
}
