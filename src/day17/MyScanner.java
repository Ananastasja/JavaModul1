package day17;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        myScanner();
        myScanner2();
    }

    private static void myScanner2() {
        Scanner input = new Scanner(System.in);
        int x;
        String s;
        System.out.println("Enter number");
        x = input.nextInt();
        System.out.println("Enter letter");
        s = input.next();

        System.out.println("You entered");
        System.out.println(x);
        System.out.println(s);
    }

    private static void myScanner() {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = input.nextInt();
        if (age < 18) {
            System.out.println("No entry");
        } else {
            System.out.println("Welcome");
        }
        input.close();
    }
}
