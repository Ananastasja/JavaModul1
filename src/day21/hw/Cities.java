package day21.hw;

public class Cities {
    public static void main(String[] args) {
        String[] cities = new String[]{"Berlin", "Dresden", "Köln", "Hamburg", "Bremen"};
        printMyString(cities);
    }

    private static void printMyString(String[] myCities) {
        for (String element : myCities) {
            System.out.print(element + "; ");

        }
    }
}
