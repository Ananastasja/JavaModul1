package day16;

public class ReviewFor_2 {
    public static void main(String[] args) {
        String word1 = "Я люблю Ярославль!";
        String word2 = "Я люблю Берлин!";
        countYa(word1);
        //чтобы их объединить, можно создать переменную String all = word1+word2. Чтобы было общее число. А не отдельно.
    }

    private static void countYa(String myWord) {
        myWord = myWord.toLowerCase();
        char output = 'я';
        int count = 0;
        for (int i = 0; i < myWord.length(); i++) {
            if (myWord.charAt(i) == output){
                count++;
            }

        }System.out.println(count);

    }
}
