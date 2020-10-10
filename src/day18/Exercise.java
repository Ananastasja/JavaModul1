package day18;

public class Exercise {
    public static void main(String[] args) {
        double flaeche1 = flaecheSphere(58);
        double flaeche2 = flaecheWuerfel(40);
        double flaeche3 = flaechePyramide(30, 20);
        double flaeche4 = flaecheQuader(80, 30, 20);
        double gesamtFlaeche = flaeche1 + flaeche2 + flaeche3 + flaeche4;
        double mengeFarbe = findeFarbeMenge(gesamtFlaeche, 560);
        int anzahlDosen = countDosen(mengeFarbe);
        double price = countPrice(anzahlDosen, 17.0);
        System.out.println("Gesamtkosten" + price);

    }

    private static int countDosen(double f) {
        return (int) Math.ceil(f / 400);
    }

    private static double countPrice(double f, double price) {
        return f * price;
    }

    private static double findeFarbeMenge(double f, int ml) {
        f = f / 10000;//kv m
        return f * ml;
    }

    private static double flaecheQuader(int a, int b, int c) {
        return 2 * (a * b + b * c + a * c);
    }

    private static double flaechePyramide(int ground, int side) {
        double a = ground;
        double b = side;
        return (b * Math.sqrt(a * a - ((b * b) / 4))) / 2;
    }

    private static double flaecheWuerfel(int seite) {
        return 6 * seite * seite;
    }

    private static double flaecheSphere(int d) {
        return Math.PI * d * d;
    }
}
