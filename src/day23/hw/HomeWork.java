package day23.hw;

import static day6.ClassWork2.split;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));// →"WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// →"ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// →"This"
        split();
        int[] swap1 = new int[]{1, 2, 3, 4};//[4, 2, 3, 1]
        int[] swap2 = new int[]{1, 2, 3};//[3, 2, 1]
        int[] swap3 = new int[]{8, 6, 7, 9, 5};//[5, 6, 7, 9, 8]
        print(swapEnds(swap1));
        print(swapEnds(swap2));
        print(swapEnds(swap3));
        split();
        int[] piece1 = new int[]{1, 2, 3};//[1, 2]
        int[] piece2 = new int[]{1, 2};//[1, 2]
        int[] piece3 = new int[]{1};//[1]
        print(frontPiece(piece1));
        print(frontPiece(piece2));
        print(frontPiece(piece3));
        split();
        int[] front1 = new int[]{1, 2, 3};
        int[] front2 = new int[]{7, 9, 8};//[1, 7]
        int[] front3 = new int[]{1};
        int[] front4 = new int[]{2};//1,2
        int[] front5 = new int[]{1, 7};//1
        int[] front6 = new int[]{};
        print(front11(front1, front2));
        print(front11(front3, front4));
        print(front11(front5, front6));

    }

    private static int[] front11(int[] first, int[] second) {
        int[] output;
        if (first.length == 0) {
            output = new int[]{second[0]};
        } else if (second.length == 0) {
            output = new int[]{first[0]};//верни первое значение другого
        } else {
            output = new int[]{first[0], second[0]};
        }
        return output;
    }

    private static int[] frontPiece(int[] piece) {
        if (piece.length <= 1) {
            return piece;
        }
        int[] output = new int[2];
        output[0] = piece[0];
        output[1] = piece[1];
        return output;
    }

    private static void print(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    private static int[] swapEnds(int[] swap) {
        int temp = 0;
        temp = swap[swap.length - 1];
        swap[swap.length - 1] = swap[0];
        swap[0] = temp;
        return swap;
    }

    private static String repeatSeparator(String str, String word, int sep) {
        String output = str;
        for (int i = 1; i < sep; i++) {
            output = output + word + str;

        }
        return output;
    }

}
