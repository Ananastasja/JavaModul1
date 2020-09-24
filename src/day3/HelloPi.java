package day3;

public class HelloPi {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius = 5.5;
        System.out.println(pi * radius * radius);

        final double PI2 = 3.14;
        pi = pi + 1;
        System.out.println(pi);

        //PI2 = PI2 + 1; - impossible to run this action as the variable is final = constant
        System.out.println(PI2);

        double var = 1_000_000.0;
        //1,0E + 6 = 1*10^6

        double pi3 = Math.PI;
        double var2 = Math.pow(2, 3);
        System.out.println(var2);

    }
}
