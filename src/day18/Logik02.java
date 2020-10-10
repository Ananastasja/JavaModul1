package day18;

public class Logik02 {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));// →true
        System.out.println(makeBricks(3, 1, 9));// →false
        System.out.println(makeBricks(3, 2, 10));// →true

        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2)); //→ true
        System.out.println(prefixAgain("abXYabc", 3));// → false
    }

    private static boolean prefixAgain(String str, int N) {
        return str.substring(N).contains(str.substring(0, N));
    }

    private static boolean makeBricks(int numberSmall, int numberBig, int goal) {
        int smallBricks = 1;
        int bigBricks = 5;
        return ((numberSmall * smallBricks) + (numberBig * bigBricks)) >= goal;

    }
}
