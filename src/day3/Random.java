package day3;

public class Random {
    public static void main(String[] args) {
       /* double myRandom = Math.random();
        System.out.println(myRandom);
        double newResult = myRandom * 100;
        System.out.println(newResult);
        int result = (int) newResult;
        System.out.println(result);*/
        int min = 50;
        int max = 60;
        int mydigit = (int) (Math.random() * (max - min) + 1) + min;
        System.out.println(mydigit); //numbers from 30 to 100 function
    }
}
