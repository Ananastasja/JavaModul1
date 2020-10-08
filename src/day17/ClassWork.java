package day17;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));// →"TThhee"
        System.out.println(doubleChar("AAbb"));// →"AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// →"HHii--TThheerree"

        System.out.println(countCode("aaacodebbb"));// →1
        System.out.println(countCode("codexxcode"));// →2
        System.out.println(countCode("cozexxcope"));// →2

        System.out.println(bobThere("abcbob"));// →true
        System.out.println(bobThere("b9b")); //→true
        System.out.println(bobThere("bac"));// →false

        System.out.println(repeatEnd("Hello", 3));// →"llollollo"
        System.out.println(repeatEnd("Hello", 2));// →"lolo"
        System.out.println(repeatEnd("Hello", 1));//→"o"
    }

    private static String repeatEnd(String word, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + word.substring(word.length() - n);

        }
        return output;

    }

    private static boolean bobThere(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    private static int countCode(String input) {
        int output = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'o' && input.charAt(i + 3) == 'e') {
                output++;
            }
        }
        return output;
    }

    private static String doubleChar(String word) {
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            output = output + word.charAt(i) + word.charAt(i);

        }
        return output;
    }
}
