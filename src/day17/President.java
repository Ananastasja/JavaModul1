package day17;

import java.util.Scanner;

public class President {
    public static void main(String[] args) {
        myPresident();
    }

    private static void myPresident() {
        int vote1;
        int vote2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vote number for 1 candidate");
        vote1 = input.nextInt();
        System.out.println("Enter vote number for 2 candidate");
        vote2 = input.nextInt();
        if (vote1 > vote2 && vote1 > 50) {
            System.out.println("Candidate 1 wins");
        } else if (vote2 > vote1 && vote2 > 50) {
            System.out.println("Candidate 2 wins");
        } else {
            System.out.println("New wahl");
        }

    }
}
