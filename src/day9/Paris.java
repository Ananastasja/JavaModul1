package day9;

public class Paris {
    public static void main(String[] args) {
        System.out.println(paris(11, 15));
        System.out.println(paris(11, 5));

    }

    private static boolean paris(int a, int b) {
        return a + b <= 25;
    }
}
