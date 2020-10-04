package day9;

public class Test9 {
    public static void main(String[] args) {
        int speed = 135;
        System.out.println(myStraf(speed));
        int lines = 10;
        triangle(lines);
        System.out.println(sum(2, 4));
        int pelmenNumber = 5;
        System.out.println("My pelmen " + pelmen(pelmenNumber));
        System.out.println(threeModulo());
        System.out.println(myLine(100));
        System.out.println(mySecondLine(1000));
        System.out.println(paris(11, 15));// -> false
        System.out.println(paris(11, 5));// -> true
    }

    private static boolean paris(int a, int b) {
        if (a + b > 25) { //return a + b <= 25;
            return false;
        } else {
            return true;
        }
    }

    private static String mySecondLine(int a) {
        String line = "";
        for (int i = 1; i <= a; i *= 2) { //можно как i=i+i
            line = line + i + " ";

        }
        return line;
    }

    private static String myLine(int a) {
        String number = "";
        for (int i = 7; i <= a; i = i + 7) {
            number = number + i + " ";

        }
        return number;
    }

    private static String threeModulo() {
        String number = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                number = number + i + "\n";
            }
        }
        return number;
    }

    private static int pelmen(int myPelmen) {
        int itog = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == myPelmen) {
                itog = itog + myPelmen;
                break;
            }
            System.out.println("Shag " + i);
        }
        return itog;
    }

    private static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
        }

        return result;
    }

    private static void triangle(int number) {
        String star = "*";
        String line = "";
        for (int i = 0; i < number; i++) {
            line = line + star;
            System.out.println(line);

        }
    }

    private static String myStraf(int mySpeed) {
        if (mySpeed < 50) {
            return "Нарушений нет";
        } else if (mySpeed <= 65) {
            return "устное порицание и лекция на 5 минут";
        } else if (mySpeed < 100) {
            return "40 евро штрафа";
        } else if (mySpeed <= 130) {
            return "штраф 500 евро";
        } else {
            return "штраф в 1000 евро, конфискация прав на 3 года и конфискация транспортного\n" +
                    "средства";
        }
    }
}
