package day4;

public class HomeworkDay4_03 {
    public static void main(String[] args) {
        System.out.println(nameUser("Anastasiya"));
        System.out.println(surnameUser("Staravoitava"));
        System.out.println(streetName("Nollendorfstraße"));
        System.out.println(houseNumber("21"));
    }

    private static String houseNumber(String s4) {
        String result = "Номер дома: " + s4;
        return result;
    }

    private static String streetName(String s3) {
        String result = "Улица: " + s3;
        return result;
    }

    private static String surnameUser(String s2) {
        String result = "Фамилия пользователя: " + s2;
        return result;
    }

    private static String nameUser(String s1) {
        String result = "Имя пользователя: " + s1;
        return result;
    }
}
