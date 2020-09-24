package day6;

public class HelloString2 {
    public static void main(String[] args) {
        String poema = "Я памятник воздвиг себе нерукотворный";
        int dlina = poema.length();
        System.out.println(dlina);
        String preview = poema.substring(0, 10);//show symbols till 10(not included)
        System.out.println(preview);
        String end = poema.substring(dlina - 10);//10 symbols from the end
        System.out.println(end);
        char test = poema.charAt(0);
        System.out.println(test);
        char test2 = poema.charAt(dlina -1);
        System.out.println(test2);
    }
}
