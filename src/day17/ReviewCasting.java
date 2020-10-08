package day17;

public class ReviewCasting {
    public static void main(String[] args) {
        //intToChar();
        //charToInt();
        //stringToChar();
        //stringToInt();
        //intToString();
        //charToString();
        magicNumber();
    }

    private static void magicNumber() {
        char c1 = 'я';
        System.out.println(c1); // я
        System.out.println(c1 + ""); // я
        System.out.println("" + c1);  // я
        System.out.println(c1 + c1 + ""); // яя  сложение
        System.out.println(c1 + 10); // 1103 + 10
        System.out.println(c1 + "" + c1); //яя
        System.out.println("" + c1 + c1); // яя  сложение
        System.out.println('я' + 'я');
        System.out.println("я" + "я");
        System.out.println("" + c1 * c1);
        String temp = "" + c1 * c1;
        System.out.println(c1 + 0);
        System.out.println(temp);
    }

    private static void charToString() {
        char c1 = 125;
        String s1 = String.valueOf(c1);
        String s2 = "" + c1;
        String s3 = "";
        s3 += c1;
        s3 = s3 + c1;
        System.out.println(s1);
        System.out.println(s2);
    }

    private static void intToString() {
        int x = 25;
        String x25 = String.valueOf(x);
        System.out.println(x25);
    }

    private static void stringToInt() {
        String hm = "Василий";
        String database = "1975";
        int newDatabase = Integer.parseInt(database);
        System.out.println(newDatabase);
    }

    private static void stringToChar() {
        String symbol = "$";
        char symbol2 = '€';
        String hm = "Василий";
        char c1 = hm.charAt(0);
        System.out.println(c1);
    }
    


    private static void charToInt() {
        char c1 = 'ж';
        char c2 = '\u039A';
        char c3 = 100;
        int x = c1;
        short s = (short) c2;
        byte b = (byte) c3;
        double d = c1;
        System.out.println(x);
    }

    private static void intToChar() {
        int x = 90;
        char c = (char) x;
        System.out.println(c);
    }
}
