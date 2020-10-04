package day8.hw;

public class Test8_1 {
    public static void main(String[] args) {
        int month = 7;
        System.out.println(giveMeSeason(month));
    }

    private static String giveMeSeason(int monthNumber) {
        String result = "";
        switch (monthNumber) {
            case 1:
                result = "Зима";
                break;
            case 2:
                result = "Зима";
                break;
            case 3: // т.к. есть одинаковые кейсы: case3: case 4: case 5: result = "Vesna"; break;
                result = "Весна";
                break;
            case 4:
                result = "Весна";
                break;
            case 5:
                result = "Весна";
                break;
            case 6:
                result = "Лето";
                break;
            case 7:
                result = "Лето";
                break;
            case 8:
                result = "Лето";
                break;
            case 9:
                result = "Осень";
                break;
            case 10:
                result = "Осень";
                break;
            case 11:
                result = "Осень";
                break;
            case 12:
                result = "Зима";
                break;
            default:
                result = "Такого месяца не существует";
                break;
        }
        return result;
    }

}
