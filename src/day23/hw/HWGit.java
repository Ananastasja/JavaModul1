/*
package day23.hw;

public class HWGit {
    public static void main(String[] args) {
            System.out.println(getSandwich("breadjambread"));// → "jam"
            System.out.println(getSandwich("xxbreadjambreadyy")); //→ "jam"
            System.out.println(getSandwich("xxbreadyy"));// → ""

            System.out.println(zipZap("zipXzap"));// →"zpXzp"
            System.out.println(zipZap("zopzop"));// →"zpzp"
            System.out.println(zipZap("zzzopzop"));// →"zzzpzp"
        }

        private static String zipZap(String input) {
            String output = "";
            output = input.replaceAll("z.p", "zp");
            return output;
        }

        private static String getSandwich(String input) {
            String word = "bread";
            int a = input.indexOf(word);
            int b = input.lastIndexOf(word);
            if (a < 0 || b < 0) {
                return "";
            }
            if (a == b) {
                return "";
            }
            return input.substring(a + word.length(), b);
        }
}
*/
