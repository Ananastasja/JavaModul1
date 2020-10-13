package day26;

public class ClassWork26 {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1XY", "XY"));// → "11"
        //1. Find the place in the first String where we find our word
        //2. Обращаемся к элементам до и после
        //3. Конкатин нужные элементы
    }

    private static String wordEnds(String str, String word) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == word.charAt(0) && str.charAt(i + 1) == word.charAt(1)) {
                if (i > 0) {
                    output = output + str.charAt(i - 1);
                }
                if (i < str.length() - 3) {
                    output = output + str.charAt(i + 2);
                }
            }

        }
        return output;
    }
}
