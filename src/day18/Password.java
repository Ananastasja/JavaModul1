package day18;

public class Password {
    public static void main(String[] args) {
        System.out.println(generatePass(10));
        System.out.println(generatePass(20));
        System.out.println(generatePass(30));
    }

    private static String generatePass(int length) {
        String output = "";
        for (int i = 0; i < length; i++) {
            output = output + getMeLetter();

        }


        return output;
    }

    private static char getMeLetter() {
        String sourceC = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String digit = "0123456789";
        String symbol = "!§%&/()=?";
        String sourceL = "abcddflikgjdfoigrepoterptgp";
        String sourceAll = sourceC + digit + symbol + sourceL;
        int min = 0;
        int max = sourceAll.length() - 1;
        int result = (int) ((Math.random() * (max - min) + 1) + min);
        char output = sourceAll.charAt(result);
        return output;

    }

}

