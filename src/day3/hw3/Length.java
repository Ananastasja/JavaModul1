package day3.hw3;

public class Length {
    public static void main(String[] args) {
        int r = 5;
        findCircumference(r);
        findCircumference(7);
        findCircumference(10);
        int findRadius = 100;
        findCircumference(findRadius);

        findLength(3.14, 20);
        double dollarsum = 200;
        double ratio = 1.1;
        findEuro(dollarsum, ratio);
        belarusToUkraine(603.549, 207.600);
        moscowToBerlin(2511, 891.8);
        double moneyInEuro = 1000;
        currencyConverter(moneyInEuro, 1.1);
    }

    private static void currencyConverter(double euro, double course) {
        System.out.println(euro * course);
    }

    private static void findCircumference(int radius) {
        // L = 2PI * R
        double l = 2 * Math.PI * radius;
        System.out.println(l + " - это длина окружности с " + radius);
    }

    //Найти, во сколько раз площадь Москвы больше площади Берлина
    private static void moscowToBerlin(double moscow, double berlin) {
        System.out.println("Москва больше Берлина в " + moscow / berlin + " раз");
    }

    //Найти соотношение площади Беларуси к площади Украины.
    private static void belarusToUkraine(double ukraine, double belarus) {
        System.out.println("Площадь Беларуси меньше площади Украины в " + ukraine / belarus + " раз");
    }

    //Написать формулу вычисления стоимости Евро, если курс Евро к Доллару 1,1.
    private static void findEuro(double dollar, double ratio) {
        System.out.println("Евро = " + dollar / ratio);
    }

    //Найти длину окружности.
    //C = π * d
    private static void findLength(double pi, double diameter) {
        System.out.println("Длина окружности - " + pi * diameter);

        //Найти длину окружности.

    }


}
