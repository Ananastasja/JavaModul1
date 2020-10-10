package day21;

public class ClassWork {
    public static void main(String[] args) {
        int[] arr = createEvenArray(1,10);
    }

    private static int[] createEvenArray(int a, int b) {
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                size++;
            }
        }
        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                output[count] = i;
                count++;
            }
        }
        return output;
    }
}
