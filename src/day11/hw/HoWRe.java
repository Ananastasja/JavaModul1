package day11.hw;

public class HoWRe {
    public static void main(String[] args) {
        System.out.println(exercise3000(3000));
    }

    private static String exercise3000(int range) {
        String result = "";
        for (int j = 0; j < range; j++) {
            if (j % 32 == 30 && j % 58 == 44) {
                result += " " + j;
            }

        }
        return result;
    }
}
