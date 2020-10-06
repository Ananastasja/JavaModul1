package day16.hw;

public class NewFile {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
    }

    private static String enigmaCaesar(String str) {
        String codedText = "";
        for (int i = 0; i < str.length(); i++) {
            codedText += findLetter(str.charAt(i));
        }
        return codedText;
    }

    private static char findLetter(char strChar) {
        char codedText = 0;
        switch (strChar) {
            case 'а':
                codedText = 'г';
                break;
            case 'б':
                codedText = 'д';
                break;
            case 'в':
                codedText = 'е';
                break;
            case 'г':
                codedText = 'ё';
                break;
            case 'д':
                codedText = 'ж';
                break;
            case 'е':
                codedText = 'з';
                break;
            case 'ё':
                codedText = 'и';
                break;
            case 'ж':
                codedText = 'й';
                break;
            case 'з':
                codedText = 'к';
                break;
            case 'и':
                codedText = 'л';
                break;
            case 'й':
                codedText = 'м';
                break;
            case 'к':
                codedText = 'н';
                break;
            case 'л':
                codedText = 'о';
                break;
            case 'м':
                codedText = 'п';
                break;
            case 'н':
                codedText = 'р';
                break;
            case 'о':
                codedText = 'с';
                break;
            case 'п':
                codedText = 'т';
                break;
            case 'р':
                codedText = 'у';
                break;
            case 'с':
                codedText = 'ф';
                break;
            case 'т':
                codedText = 'х';
                break;
            case 'у':
                codedText = 'ц';
                break;
            case 'ф':
                codedText = 'ч';
                break;
            case 'х':
                codedText = 'ш';
                break;
            case 'ц':
                codedText = 'щ';
                break;
            case 'ч':
                codedText = 'ъ';
                break;
            case 'ш':
                codedText = 'ы';
                break;
            case 'щ':
                codedText = 'ь';
                break;
            case 'ъ':
                codedText = 'э';
                break;
            case 'ы':
                codedText = 'ю';
                break;
            case 'ь':
                codedText = 'я';
                break;
            case 'э':
                codedText = 'а';
                break;
            case 'ю':
                codedText = 'б';
                break;
            case 'я':
                codedText = 'в';
                break;
            case 'А':
                codedText = 'Г';
                break;
            case 'Б':
                codedText = 'Д';
                break;
            case 'В':
                codedText = 'Е';
                break;
            case 'Г':
                codedText = 'Ё';
                break;
            case 'Д':
                codedText = 'Ж';
                break;
            case 'Е':
                codedText = 'З';
                break;
            case 'Ё':
                codedText = 'И';
                break;
            case 'Ж':
                codedText = 'Й';
                break;
            case 'З':
                codedText = 'К';
                break;
            case 'И':
                codedText = 'Л';
                break;
            case 'Й':
                codedText = 'М';
                break;
            case 'К':
                codedText = 'Н';
                break;
            case 'Л':
                codedText = 'О';
                break;
            case 'М':
                codedText = 'П';
                break;
            case 'Н':
                codedText = 'Р';
                break;
            case 'О':
                codedText = 'С';
                break;
            case 'П':
                codedText = 'Т';
                break;
            case 'Р':
                codedText = 'У';
                break;
            case 'С':
                codedText = 'Ф';
                break;
            case 'Т':
                codedText = 'Х';
                break;
            case 'У':
                codedText = 'Ц';
                break;
            case 'Ф':
                codedText = 'Ч';
                break;
            case 'Х':
                codedText = 'Ш';
                break;
            case 'Ц':
                codedText = 'Щ';
                break;
            case 'Ч':
                codedText = 'Ъ';
                break;
            case 'Ш':
                codedText = 'Ы';
                break;
            case 'Щ':
                codedText = 'Ь';
                break;
            case 'Э':
                codedText = 'А';
                break;
            case 'Ю':
                codedText = 'Б';
                break;
            case 'Я':
                codedText = 'В';
                break;
            default:
                codedText = strChar;
                break;
        }
        return codedText;
    }

}
