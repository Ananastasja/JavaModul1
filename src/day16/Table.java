package day16;

public class Table {
    public static void main(String[] args) {
        createMT(10);
    }

        private static void createMT(int number) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    // System.out.print(myMTformat(i, j));
                    System.out.printf("%6d", i * j);
                    //String temp = i*j + "   ";
                    //System.out.print(temp.substring(0,3));
                }
                System.out.println();
            }
        }
    }

