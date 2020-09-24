package day4;

public class HomeworkDay4 {
    public static void main(String[] args) {
        String name = "Anastasiya";
        String profession = "Translator";
        char symbol = '\u0022';
        myProfession(name, profession, symbol);

        String myName = "Anastasiya";
        String mySurname = "Staravoitava";
        String myStreet = "Nollendorfstraße";
        String myHouseNumber = "21";
        aboutMe(myName, mySurname, myStreet, myHouseNumber);


}

    private static void aboutMe(String s1, String s2, String s3, String s4) {
        System.out.println("Имя пользователя: " + s1);
        System.out.println("Фамилия пользователя: " + s2);
        System.out.println("Улица: " + s3);
        System.out.println("Номер дома: " + s4);
    }

    private static void myProfession(String s1, String s2, char mySymbol) {
        System.out.println(s1 + " " + mySymbol + s2 + mySymbol);
    }
}


