package day6;

public class HelloCase {
    public static void main(String[] args) {
        String phrase1 = "london is the capital of Great Britain";
        System.out.println(phrase1);
        String phrase2 = phrase1.toUpperCase();
        System.out.println(phrase2);
        String phrase3 = phrase1.substring(0,1).toUpperCase() + phrase1.substring(1).toLowerCase();
        System.out.println(phrase3);
    }
}
