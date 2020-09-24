package day9;

public class ClassWorkTriangle {
    public static void main(String[] args) {
        //"Нарисуйте" (выведите на консоль) треугольник из звёздочек, используя только одну звёздочку и то, что только что
        //изучили:
        int lines = 10;
        //triangle(lines);
        //simpleString();
        System.out.println("Itogo" + sum(2, 4));
        System.out.println("Itogo" + sum(0, 10));
    }

    private static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
            System.out.println("Vyvod iz cycla " + result);
        }


        return result;
    }

    private static void simpleString() {
        String text = "One word";
        text = text + "two";
        System.out.println(text);
    }

    private static void triangle(int number) {
        String star = "*";
        String line = "";
        for (int i = 0; i < number; i++) {
            //line = line + star;
            line += star;
            System.out.println(line);
        }
    }
}
