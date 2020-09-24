package day8.hw;

public class SeasonOfTheYear {
    public static void main(String[] args) {
        int monthSeason = 5;
        System.out.println(giveMeSeason(monthSeason));
    }

    private static String giveMeSeason(int season) {
        String nameOfSeason = "";
        switch (season) {
            case 1:
                nameOfSeason = "Зима";
                break;

            case 2:
                nameOfSeason = "Зима";
                break;

            case 3:
                nameOfSeason = "Весна";
                break;

            case 4:
                nameOfSeason = "Весна";
                break;

            case 5:
                nameOfSeason = "Весна";
                break;

            case 6:
                nameOfSeason = "Лето";
                break;

            case 7:
                nameOfSeason = "Лето";
                break;

            case 8:
                nameOfSeason = "Лето";
                break;

            case 9:
                nameOfSeason = "Осень";
                break;

            case 10:
                nameOfSeason = "Осень";
                break;

            case 11:
                nameOfSeason = "Осень";
                break;

            case 12:
                nameOfSeason = "Зима";
                break;

            default:
                nameOfSeason = "Такого месяца не существует";

        }
        return "Сезон этого месяца - " + nameOfSeason;

    }
}
