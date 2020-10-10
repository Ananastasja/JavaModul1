package day17.hw;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        Scanner eingabe = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int number = (int) (Math.random() * (max - min) + 1) + min;
        int tryCount = 1;
        System.out.println("Enter your number");
        int guessNumber = eingabe.nextInt();
        while (guessNumber!=number){
            if (guessNumber<number){
                System.out.println("My number is more");
            }else {
                System.out.println("My number is less");
            }
            System.out.println("Enter new number");
            guessNumber=eingabe.nextInt();
            tryCount++;
        }
        if (guessNumber==number){
            System.out.println("You win");
            System.out.println("Your attempts " + tryCount);
            System.out.println("My number " + number);
        }
    }
}
