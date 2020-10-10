package day17.hw;

public class TernarAndWhile {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5));// →15
        System.out.println(getMeMax(4, 16));// →16
        System.out.println(getMeMax(20, 100));// →100

        System.out.println(getMeMin(15, 45));// →15
        System.out.println(getMeMin(44, 16));// →16
        System.out.println(getMeMin(200, 100));// →100

        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// →"Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// →"Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// →"Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// →"Могилёв"

        System.out.println(bAtimes());
        System.out.println(fromAToB(5, 17));
        fromAtoB2(5, 17);
    }

    private static int fromAtoB2(int a, int b) {
        do {
            System.out.println(a);
            a++;
        } while (a <= b);
        return a;
    }

    private static String fromAToB(int a, int b) { //не выводит 5. Не совсем удачный метод
        String result = "";
        while (a < b) {
            result = result + a + " ";
            a++;
        }
        return result;

    }

    private static String bAtimes() {
        String result = "";
        int a = 2;
        int b = 5;
        while (b > 0) {
            b--;
            result = result + a + " ";

        }
        return result;

    }

    private static String myFirstCompareTo(String city1, String city2) {
        return city1.compareTo(city2) < 0 ? city1 : city2;
    }

    private static int getMeMin(int a, int b) {
        return a < b ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return a > b ? a : b;
    }
}

