package day23;

import static day6.ClassWork2.split;

public class Exercise18 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        middleWay(arr1, arr2);// → [2, 5]
        myPrint(middleWay(arr1, arr2));
        int[] arr3 = new int[]{7, 7, 7};
        int[] arr4 = new int[]{3, 8, 0};
        middleWay(arr3, arr4);// → [7, 8]
        myPrint(middleWay(arr3, arr4));

        int[] arr5 = new int[]{5, 2, 9};
        int[] arr6 = new int[]{1, 4, 5};
        middleWay(arr5, arr6);// → [2, 4]
        myPrint(middleWay(arr5, arr6));
        split();
        int[] arrOne = new int[]{4, 5};
        int[] arrTwo = new int[]{4, 2};
        int[] arrThree = new int[]{3, 5};

        System.out.println(no23(arrOne));// → true
        System.out.println(no23(arrTwo));// → false
        System.out.println(no23(arrThree));// → false
        split();
        int[] ar1 = new int[]{1, 2, 3};
        int[] ar2 = new int[]{2, 3, 5};
        int[] ar3 = new int[]{1, 2, 1};
        myPrint(fix23(ar1));
        myPrint(fix23(ar2));
        myPrint(fix23(ar3));


    }

    private static int[] fix23(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3 && arr[i - 1] == 2) {
                arr[i] = 0;
            }

        }
        return arr;
    }

    private static boolean no23(int[] arr) {
        if (!(arr[0] == 2 || arr[0] == 3 || arr[1] == 2 || arr[1] == 3)) {
            return true;
        }
        return false;

    }

    private static void myPrint(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    private static int[] middleWay(int[] arr1, int[] arr2) {
        int[] output = new int[2];
        output[0] = arr1[1];
        output[1] = arr2[1];

        return output;
    }
}
