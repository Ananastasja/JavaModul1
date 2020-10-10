package day20.hw;

public class HomeWork20 {
    public static void main(String[] args) {
        /*int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Найти минимальное, среднее, максимальное значения и сумму элементов массива.
        int max;
        int min;
        int middle;
        int sum;*/
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = findMax(arr);
        System.out.println("Max value: " + max);
        int min = findMin(arr);
        System.out.println("Min value: " + min);
        int sum = findSum(arr);
        System.out.println("Sum value: " + sum);
        double middle = findMiddle(arr);
        System.out.println("Middle value: " + middle);
    }

    private static double findMiddle(int[] number) {
        double middle = findSum(number)/number.length;
        return middle;
    }

    private static int findSum(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            count = count + number[i];

        }

        return count;
    }

    private static int findMin(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            max = Math.min(max, number[i]);

        }
        return max;
    }

    private static int findMax(int[] number) {
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            max = Math.max(max, number[i]);

        }
        return max;
    }
}
