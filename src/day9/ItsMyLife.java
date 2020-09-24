package day9;

public class ItsMyLife {
    public static void main(String[] args) {
        //loop();
        //forIntro1();
        forIntro2();
    }

    private static void forIntro2() {
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println("Shagi" + i);
        }
    }

    private static void forIntro1() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        System.out.println(a);
    }

    private static void loop() {
        int workWeekDays = 5;
        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("------------");
            System.out.println("Nov denj");
            System.out.println("Vstaju 6 utra");
            System.out.println("Na zavod v 8");
            System.out.println("Doma v 18");
            System.out.println("Smotru 2 ch Netflix");
            System.out.println("Siga s sosedom");
            System.out.println("Denj okonchen");
            System.out.println("Idu spatj");
            System.out.println("------------");
        }
    }
}
