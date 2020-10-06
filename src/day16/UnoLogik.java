package day16;

public class UnoLogik {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));// → true
        System.out.println(lessBy10(1, 7, 10));// → false
        System.out.println(lessBy10(11, 1, 7));// → true

        System.out.println(redTicket(2, 2, 2));// →10
        System.out.println(redTicket(2, 2, 1));// →0
        System.out.println(redTicket(0, 0, 0));// →5
        System.out.println(redTicket(0, 1, 1));// →1

        System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43));// → false
        System.out.println(shareDigit(12, 44));// → false

        System.out.println(squirrelPlay(70, false));// →true
        System.out.println(squirrelPlay(95, false));// →false
        System.out.println(squirrelPlay(95, true));// →true

        System.out.println(alarmClock(1, false));// →"7:00"
        System.out.println(alarmClock(6, false));// →"10:00"
        System.out.println(alarmClock(4, true));// →"10:00"
        System.out.println(alarmClock(6, true));// →"off"

        System.out.println(specialEleven(22));// →true
        System.out.println(specialEleven(23));// →true
        System.out.println(specialEleven(24));// →false

        System.out.println(less20(18));// →true
        System.out.println(less20(19));// →true
        System.out.println(less20(20));// →false

        System.out.println(answerCell(false, false, false));// → true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false
    }

    private static boolean answerCell(boolean morning, boolean mama, boolean asleep) {
        if (asleep) {
            return false;
        } else if (morning && !mama) {
            return false;
        } else return true;
    }

    private static boolean less20(int i) {
        return i % 20 == 18 || i % 20 == 19;
    }

    private static boolean specialEleven(int number) {
        return number % 11 == 0 || number % 11 == 1;
    }

    private static String alarmClock(int day, boolean vacation) {
        String morning = "7:00";
        String late = "10:00";
        String noAlarm = "off";
        if (vacation && day >= 1 && day <= 5) {
            return late;
        } else if (vacation && day >= 6 && day <= 7) {
            return noAlarm;
        } else if (day >= 1 && day <= 5) {
            return morning;
        } else if (day >= 6 && day <= 7) {
            return late;
        }
        return "";
    }

    private static boolean squirrelPlay(int temp, boolean summer) {
        if (temp >= 60 && temp <= 100 && summer) {
            return true;
        } else if (temp >= 60 && temp <= 90) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean shareDigit(int one, int two) {
        int a1 = one / 10;
        int a2 = one % 10;
        int b1 = two / 10;
        int b2 = two % 10;
        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }

    private static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c && c == a) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        } else {
            return 0;
        }
    }

    private static boolean lessBy10(int a, int b, int c) {
        return a > 10 || b > 10 || c > 10;
    }
}
