package day13.hw;

public class PasswordNew {
    public static void main(String[] args) {
        int passLength = 8;
        System.out.println(createPassword(passLength));
        System.out.println(createPassword(12));
        System.out.println(createPassword(20));
    }

    private static String createPassword(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            int min = 30;
            int max = 100;
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            result = result + c;

        }
        return result;
    }
}
