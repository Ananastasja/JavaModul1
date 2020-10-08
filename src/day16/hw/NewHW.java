package day16.hw;

public class NewHW {
    public static void main(String[] args) {
        System.out.println
                (enigmaCaesar("Съешь же ещё этих мягких " +
                        "французских булок, да выпей чаю."));
        //System.out.println(enigmaCaesar("мама не разрешила"));
    }

    private static String enigmaCaesar(String input) {
        input = input.toLowerCase();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            output += getMeLetter(input.charAt(i));
        }
        return output;
    }

    private static char getMeLetter(char inputChar) {
        char result = 0;
        String inputString = " .,абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String outpuString = " .,гдеёжзийклмнопрстуфхцчшщъыьэюяабв";
        //int index = inputString.codePointAt(inputChar);
        int index = inputString.indexOf(inputChar);
        result = outpuString.charAt(index);
        return result;
    }

}
