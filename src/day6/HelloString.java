package day6;

public class HelloString {
    public static void main(String[] args) {
       String student1, student2;
       student1 = "Elena Prekrasnaya";
       student2 = "Ivan Durak";
       //if final double = variable with uppercase letters
       //final double MY_PI = Math.PI;
       helloUser(student1);
       helloUser(student2);
       helloUser("Andrej");
       char c1 = 150;
       char c2 = (char) (c1 + 20);
       System.out.println("" + c1 + 10);
       System.out.println(c2 + 20);
    }

    private static void helloUser(String userName) {
        System.out.println("Hello, " + userName);
    }
}

