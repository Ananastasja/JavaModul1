package day7;

public class Test7 {
    public static void main(String[] args) {
        System.out.println(smartDepositBox(true, false));// -> true
        System.out.println(smartDepositBox(false, true));// -> true
        System.out.println(smartDepositBox(false, false));// -> false
        split();
        System.out.println(smartDepositBoxVersionTwo(true, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, true));// -> false
        System.out.println(smartDepositBoxVersionTwo(false, false));// -> false
        System.out.println(smartDepositBoxVersionTwo(true, true));// -> true
        split();
        System.out.println(verySmartDepositBoxVersionThree(false, true, false));
        split();
        System.out.println(bigBadaBoom(true, true));// -> true
        System.out.println(bigBadaBoom(false, false));// -> false
        System.out.println(bigBadaBoom(true, false));// -> false
        split();
        System.out.println(doorbell(true, true));// -> false
        System.out.println(doorbell(false, false));// -> false
        System.out.println(doorbell(true, false));// -> true
        split();
        System.out.println(smartDoorCheckKey(true, true));
        split();
        System.out.println(love6(6, 4));// → true
        System.out.println(love6(4, 5));// → false
        System.out.println(love6(1, 5));// → true
    }

    private static boolean love6(int a, int b) {
        //return a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6;
        return (a == 6) || (b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
    }

    private static boolean smartDoorCheckKey(boolean internet, boolean electricity) {
        //boolean c = !internet && electricity;//нельзя открыть только при присутствии и того и того
        boolean c = !internet || electricity; //можно открыть только при отсутствии и того и того
        return c;
    }

    private static boolean doorbell(boolean b1, boolean b2) {
        //return b1 ^ b2;
        boolean b3 = b1 != b2;
        return b3;
    }

    private static boolean bigBadaBoom(boolean b1, boolean b2) {
        return b1 && b2;
    }

    private static boolean verySmartDepositBoxVersionThree(boolean mama, boolean papa, boolean oma) {
        //return mama && papa || oma;
        return oma || smartDepositBoxVersionTwo(mama, papa);
    }

    private static boolean smartDepositBoxVersionTwo(boolean mama, boolean papa) {
        return mama && papa;
    }


    private static void split() {
        System.out.println("----------------");
    }

    private static boolean smartDepositBox(boolean mama, boolean papa) {
        return mama || papa;
    }
}
