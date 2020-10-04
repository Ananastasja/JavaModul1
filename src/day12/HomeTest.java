package day12;

public class HomeTest {
    public static void main(String[] args) {
        System.out.println(sundayWeather("Минск"));

    }

    private static int sundayWeather(String MyCity) {
        int temperature = mondayWeather(MyCity);
        return temperature + 6;
    }

    public static int mondayWeather(String myCity) {
        int output = 0;
        switch (myCity) {
            case "Минск":
                output = 18;
                break;
            case "Москва":
                output = 19;
                break;
            case "Лиссабон":
                output = 25;
                break;
            case "Берлин":
                output = 20;
                break;
            case "Саратов":
                output = 15;
                break;
            case "Париж":
                output = 23;
                break;
            case "Лондон":
                output = 17;
                break;
            default:
                output = -100;
                break;
        }
        return output;
    }
}
