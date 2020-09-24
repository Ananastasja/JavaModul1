package day7;

public class NegatHello {
    public static void main(String[] args) {
        boolean redButton = false;
        System.out.println(machine(redButton));
    }

    private static boolean machine(boolean stopSignal) {
        return !stopSignal;
    }
}
