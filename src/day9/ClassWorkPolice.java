package day9;

public class ClassWorkPolice {
    public static void main(String[] args) {
        int speed = 100;
        System.out.println("Washa skorostj bila " + speed + " km/h");
        if (speed <= 50) {
            System.out.println("Net narushenij");
        } else if (speed > 50 && speed <= 65) { //speed <=65
            System.out.println("5 minut lekcija");
        } else if (speed > 65 && speed <= 100) { // speed <=100
            System.out.println("Straf 40 Euro");
        } else if (speed > 100 && speed <= 130) { // speed <=130
            System.out.println("Straf 500 Euro");
        } else {
            System.out.println("Vam straf i net prav");
        }
    }
}
