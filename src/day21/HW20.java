package day21;

public class HW20 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = findMin(array);
    }

    private static int findMin(int[] number) {
        int min = Integer.MIN_VALUE;
        min = number[0];
        for (int i = 0; i < number.length; i++) {
            // min = Math.min(min, array[i]);
            min = (min < number[i]) ? min : number[i];
        }
        return min;
    }
}
