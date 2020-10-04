package day10;

public class Test10 {
    public static void main(String[] args) {
        multiplicationTable(3);
        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false));// → true
        System.out.println(cigarParty(70, true));// → true
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0

        System.out.println(more20(20));// → false
        System.out.println(more20(21));// → true
        System.out.println(more20(22));// → true
    }

    private static boolean more20(int number) {
        return number % 20 == 1 || number % 20 == 2;
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday == true) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            return 0;
        } else if (speed <= 80) {
            return 1;
        } else return 2;
    }

    private static boolean cigarParty(int cigars, boolean weekend) {
        if (cigars >= 40 && cigars <= 60) {
            return true;
        } else if (cigars >= 40 && weekend) { //else return cigars >= 40 && weekend;
            return true;
        } else {
            return false;
        }
    }

    private static void multiplicationTable(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "x" + i + "=" + i * a);

        }
    }
}
