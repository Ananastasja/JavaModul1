package day19;

public class HelloArray {
    public static void main(String[] args) {
        helloMyFirstArray();
        germanCities();
        intArrayGame();
    }

    private static void intArrayGame() {
        int[] field = new int[]{5, 15, 3, 67, 90};
        System.out.println(field[3]);
        System.out.println(field[3] + ", " + field[4]);
        System.out.println("[" + field[3] + ", " + field[4] + "]");
    }

    private static void germanCities() {
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Leipzig", "Hamburg", "Frankfurt"};
        int size = germanCity.length;
        int letterCount = 0;
        for (int i = 0; i < size; i++) {
            letterCount = letterCount + germanCity[i].length();

        }
        System.out.println(letterCount);
    }

    private static void helloMyFirstArray() {
        int[] myFirstArray;
        myFirstArray = new int[10];

        String[] fourSeasons = new String[]{"Vivaldi", "Tchaikovski", "Astor Piazzolla", "Stephen Edwin King"};


        //datatype + [] + name
    }
}
