package day11;

public class NestedLoopsIntro {
    public static void main(String[] args) {
        rectangle(5, 7);
    }

    private static void rectangle(int a, int b) {
        for (int i = 0; i < a; i++) {//колово строк
            for (int j = 0; j < b; j++) {//печатает колво здездочек
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
