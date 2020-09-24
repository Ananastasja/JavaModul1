package day12;

public class HomeWork12 {
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
        System.out.println(cityWeather(saratov));
        exerciseWithString();
    }



    private static void exerciseWithString() {
        String example = "Hello, my name is";
        System.out.println(example.contains("w"));// это метод, который возвращает true or false, в завизимости от того
        //содержится ли указанный в contains() символ в String или нет. В данном случае "w" нет - ответ false
        System.out.println(example.contains("a"));// true т.к.содержит

        System.out.println(example.endsWith("a")); // метод возвращает false, если String не заканчивается на указанный символ
        System.out.println(example.endsWith("s")); // метод возвращает true, если String заканчивается на указанный символ

        System.out.println(example.equals("a"));// метод возвращает false, если весь String не равен (не идентичен) указанному в скобках символу
        //можно сравнить с a == b (где а == 5, b == 4)
        System.out.println(example.equals("Hello, my name is"));// метод возвращает true, если весь String равен (идентичен) указанному в скобках символу
        //можно сравнить с a == b (где а == 5, b == 5)

        System.out.println(example.startsWith("a"));//метод возвращает false, если String не начинается на указанный символ
        System.out.println(example.startsWith("H"));//метод возвращает true, если String начинается на указанный символ

        System.out.println(example.substring(0,4));//метод возвращает указанный индекс символа (начинается с 0)
        //0 - начать с нуля; 4 - до четвертого индекса НЕ включительно
        System.out.println(example.substring(4));// если указано одно число, вернуть все индексы, НАЧИНАЯ с четвертого индекса включительно
        System.out.println(example.substring(example.length()-1));// применяется, чтобы возвращать индексы с конца

        System.out.println(example.toLowerCase()); //метод делает все буквы строчными.
        System.out.println(example.toUpperCase()); //метод делает все буквы заглавными

        System.out.println(example.substring(0,5).toUpperCase());
        System.out.println(example.substring(0,5).toLowerCase());
        // можем использовать данный метод, если для заглавных и/или строчных букв нам нужны не все, а определенные

        String example2 = "       Today is a beautiful day    ";
        System.out.println(example2.trim());//метод отрезает пробелы в начале и конце стринга, если есть, и возвращает результат без них
    }


    private static int cityWeather(int city) {
        return city + 6;
    }


}
