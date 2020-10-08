package day16.hw;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю."));
        //"Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб."
    }

    private static String enigmaCaesar(String s) {
        String code = "";
        //String codeCase = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            code = code + getEnigma(s.charAt(i));
        }
        return code;
    }

    private static char getEnigma(char letter) {
        char letteCode = 0;
        switch (letter) {
            case 'а':
                letteCode = 'г';
                break;
            case 'б':
                letteCode = 'д';
                break;
            case 'в':
                letteCode = 'е';
                break;
            case 'г':
                letteCode = 'ё';
                break;
            case 'д':
                letteCode = 'ж';
                break;
            case 'е':
                letteCode = 'з';
                break;
            case 'ё':
                letteCode = 'и';
                break;
            case 'ж':
                letteCode = 'й';
                break;
            case 'з':
                letteCode = 'к';
                break;
            case 'и':
                letteCode = 'л';
                break;
            case 'й':
                letteCode = 'м';
                break;
            case 'к':
                letteCode = 'н';
                break;
            case 'л':
                letteCode = 'о';
                break;
            case 'м':
                letteCode = 'п';
                break;
            case 'н':
                letteCode = 'р';
                break;
            case 'о':
                letteCode = 'с';
                break;
            case 'п':
                letteCode = 'т';
                break;
            case 'р':
                letteCode = 'у';
                break;
            case 'с':
                letteCode = 'ф';
                break;
            case 'т':
                letteCode = 'х';
                break;
            case 'у':
                letteCode = 'ц';
                break;
            case 'ф':
                letteCode = 'ч';
                break;
            case 'х':
                letteCode = 'ш';
                break;
            case 'ц':
                letteCode = 'щ';
                break;
            case 'ч':
                letteCode = 'ъ';
                break;
            case 'ш':
                letteCode = 'ы';
                break;
            case 'щ':
                letteCode = 'ь';
                break;
            case 'ъ':
                letteCode = 'э';
                break;
            case 'ы':
                letteCode = 'ю';
                break;
            case 'ь':
                letteCode = 'я';
                break;
            case 'э':
                letteCode = 'а';
                break;
            case 'ю':
                letteCode = 'б';
                break;
            case 'я':
                letteCode = 'в';
                break;
            default:
                letteCode = letter;
                break;


        }
        return letteCode;
    }


}
