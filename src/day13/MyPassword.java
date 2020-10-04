package day13;

public class MyPassword {
    public static void main(String[] args) {
        String password = "hgfuzffjdghhh";
        generate(20);
        generate(7);
        generate(12);
    }

    private static void generate(int userInput) {
        String result = "";
        for (int i = 0; i < userInput; i++) {
            int min = 65;
            int max = 90;
            char c = (char) ((Math.random() * (max - min) + 1) + min);
            result = result + c;

        }
        System.out.println(result);
    }
}
