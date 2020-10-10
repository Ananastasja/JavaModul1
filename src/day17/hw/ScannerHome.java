package day17.hw;

import java.util.Scanner;

public class ScannerHome {
    public static void main(String[] args) {
        Scanner31Exercise();
    }

    private static void Scanner31Exercise() {
        Scanner input = new Scanner(System.in);
        String name;
        String surname;
        int age;
        String gender;
        String email;
        System.out.println("Enter your name");
        name = input.next();
        System.out.println("Enter your surname");
        surname = input.next();
        System.out.println("Enter your age");
        age = input.nextInt();
        while (age > 100) {
            System.out.println("Incorrect age. Enter your age again");
            age = input.nextInt();
        }
        System.out.println("Enter your gender");
        gender = input.next();
        System.out.println("Enter your email");
        email = input.next();

        System.out.println("Check your data. You endered: ");
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(email);
        input.close();
    }
}
