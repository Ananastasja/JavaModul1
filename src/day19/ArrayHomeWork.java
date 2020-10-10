package day19;

public class ArrayHomeWork {
    public static void main(String[] args) {
        System.out.println(homework18_01());
        printArray(homework18_01());
        double[] massiv = new double[]{1.0, 5.8, 2.3, 4.9};
        System.out.println(myMax(massiv));
    }

    private static double myMax(double[] any) {
        double max = any[0];
        for (int i = 0; i < any.length; i++) {
            max = Math.max(max, any[i]);

        }
        return max;
    }

    private static void printArray(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);

        }
    }

    private static double[] homework18_01() {
        double[] output;
        output = new double[10];
        output[1] = 25.85;
        return output;
    }
}
