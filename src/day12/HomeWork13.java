package day12;

public class HomeWork13 {
    public static void main(String[] args) {
        String one = "Monday";
        String two = "Tuesday";
        String three = "Wednesday";
        String four = "Thursday";
        String five = "Friday";
        String six = "Saturday";
        String seven = "Sunday";
        int minsk = 18;
        int berlin = 20;
        int london = 17;
        int lisboa = 25;
        int paris = 23;
        int moscow = 19;
        int saratov = 15;
        System.out.println(cityAndWeather(five, paris));
    }

    private static int cityAndWeather(String day, int city) {
        if (day.equals("Monday")) {
            return city;
        }else if (day.equals("Tuesday")) {
            return city + 1;
        }else if (day.equals("Wednesday")) {
            return city + 2;
        }else if (day.equals("Thursday")) {
            return city + 3;
        }else if (day.equals("Friday")) {
            return city + 4;
        }else if (day.equals("Saturday")) {
            return city + 5;
        }else if (day.equals("Sunday")) {
            return city + 6;
        }
        return 0;
    }
}
