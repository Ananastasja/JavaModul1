package day20;

public class RandomArray {
    public static void main(String[] args) {
        int min = 50;
        int max = 150;//наши граничные значения
        int[] arr = createRandom(min, max);
        /*FillAndPrintIntArray.myPrintIntArray(arr);
        FillAndPrintIntArray.myPrintIntArray(arr2);
        System.out.println(arr);*/ //распечатка см.day20 github
    }

    private static int[] createRandom(int min, int max) {
        int size = (int) (Math.random() * 15);
        int[] output = new int[size];//длина массива ограничена значением size. Любая длина до size. 
        for (int i = 0; i < size; i++) { //длина до сайз
            int myRandomTemp = (int) ((max - min) * Math.random() + 1) + min; //создает рандомное число
            output[i] = myRandomTemp; //рандомное число длиною сайз

        }return output;
    }
}
