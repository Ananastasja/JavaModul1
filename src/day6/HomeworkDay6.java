package day6;

public class HomeworkDay6 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", "@"));

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));


    }

    private static String makeAbba(String s1, String s2) {
        String result = s1 + s2 + s2 + s1;
        return result;
    }

    private static String lastChars(String s1, String s2) {
        int dlina1 = s2.length();
        String result = s1.substring(0,1) + s2.substring(dlina1 -1);
        return result;
    }
}
