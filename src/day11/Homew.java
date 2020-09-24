package day11;

public class Homew {
    public static void main(String[] args) {
        System.out.println(myNodNumber(100));
    }

    private static String myNodNumber(int c) {
        String num = "";
        for (int i = 11; i < c; i++) {
            if (i % 11 == 0) {
                num = num + i + " ";
            }
        }
        return num;
    }
}