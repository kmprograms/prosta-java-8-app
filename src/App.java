import java.util.Random;

public class App {

    /*
        Napisz program, w którym losujesz liczbę całkowitą z przedziału <10,99>, a następnie sprawdzisz, czy ta liczba
        dzieli się przez każdy z dzielników, które podasz jako kolejny argument w postaci tablicy elementów typu int.
    */

    static int drawIntNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Draw range is not correct");
        }
        return new Random().nextInt(min, max + 1);
    }

    static boolean isDividedBy(int[] divisors, int number) {
        if (divisors == null || divisors.length == 0) {
            throw new IllegalArgumentException("Divisors array is null or empty");
        }

        for (var divisor : divisors) {
            if (divisor == 0 || number % divisor != 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        final var MIN = 10;
        final var MAX = 99;
        var number = drawIntNumber(MIN, MAX);
        var divisors = new int[] {2, 3, 0};
        System.out.printf("Number: %d Result: %s", number, isDividedBy(divisors, number));
    }
}
